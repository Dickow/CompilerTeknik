grammar MiniJava;

program
  : mainClass ( classDeclaration )*
  ;

classDeclaration
  : 'class' className=IDENT ( 'extends' superClassName=IDENT )? 
    '{' 
        ( varDeclaration )* 
        ( methodDeclaration )*
    '}'
  ;

mainClass
  : 'class' className=IDENT 
    '{' 
      method=methodDeclaration 
    '}'
  ;
  
block  : '{' ( varDeclaration )* ( statement )* '}';

varDeclaration
  : var=variable  ';'
  ;

variable : type variableName=IDENT
  ;

type 
   : typeBasic
   | typeArray
   ;

typeBasic
  : typeBoolean
  | typeInt
  | typeClass
  ;

typeArray  
    : typeBasic '[' ']' 
    ;

typeBoolean : 'boolean' ;
typeInt     : 'int' ;
typeClass   : className=IDENT;
                
methodDeclaration
  : ( isPublic='public'  )?
    ( isStatic='static'  )? 
    procType methodName=IDENT 
    '(' 
      ( variable ( ',' variable )* )? 
    ')' 
    '{' ( varDeclaration )* 
        ( statement )*
        statementReturn
    '}'
  ;
  
procType
  : typeVoid  
  | type 
  ;

typeVoid: 'void' ;
  
statement
  : block
  | statementIf
  | statementWhile
  | statementAssign
  | statementAssignArray
  | statementPrintln
  | statementPrint
  | statementMethod
  | statementReturn
  ;
    
statementIf          : 'if' '(' condition=expression ')' ifBlock=block ('else' elseBlock=block )? ;
statementWhile       : 'while' '(' condition=expression ')' whileBlock=statement ;
statementAssign      : lhs=identifier '=' rhs=expression ';' ;
statementAssignArray : array=identifier '[' element=expression ']' '=' value=expression ';';
statementPrint       : 'System.out.print' '(' argument=expression ')' ';' ;
statementPrintln     : 'System.out.println' '(' argument=expression ')' ';' ;
statementMethod      : expressionMethodCall ';';

statementReturn  : 'return' ( argument=expression )? ';' ;

expression
  : head=level1 ( '&&' tail+=level1 )*
  ;

level1
  : head=level2 ( '==' tail+=level2 )*
  ;
  
level2
  : head=level3 ( '<' tail+=level3 )*
  ;
    
level3
  : head=level4 ( operator+=('+' | '-') tail+=level4 )*
  ;

level4
  : head=level5 ( '*' tail+=level5 )*
  ;
  
level5
    : expressionUnaryMinus
    | expressionNegation
    | expressionNewObject
    | expressionNewArray
    | expressionIdentifier
    | expressionArrayAccess
    | expressionMethodCall
    | expressionParentheses
    | expressionConstantTrue
    | expressionConstantFalse
    | expressionConstantInteger
    | expressionConstantString
	  ; 
  
expressionUnaryMinus      : '-' argument=level5 ;
expressionNegation        : '!' argument=level5 ;
expressionNewObject       : 'new' classname=IDENT '(' ')' ;
expressionNewArray        : 'new' 'int' '[' size=expression ']' ;        
expressionIdentifier      : ident=identifier ;
expressionArrayAccess     : ident=identifier '[' element=expression ']' ;
expressionParentheses     : '(' argument=expression ')' ;
expressionConstantTrue    : 'true' ;
expressionConstantFalse   : 'false' ;
expressionConstantInteger : value=INT ;
expressionConstantString  : value=STRING ;
expressionMethodCall      : (object=identifier '.')? method=IDENT '(' (arguments+=expression (',' arguments+=expression)* )? ')' ;

identifier
  : identifierIdentifier;

identifierIdentifier
  : identifierId ( '.' selectors+=IDENT )*
  ;

identifierId
  : idThis
  | idIDENT
  ;

idThis  : 'this' ;
idIDENT : name=IDENT ;

fragment LOWER : ('a'..'z');
fragment UPPER : ('A'..'Z');
fragment NONNULL : ('1'..'9');
fragment NUMBER : ('0' | NONNULL);
IDENT : ( LOWER | UPPER ) ( LOWER | UPPER | NUMBER | '_' )*;
INT : '0' | ( NONNULL NUMBER* );
fragment CHAR : ' ' | '!' | ('\u0023'..'\u005B') | ('\u005D'..'\u007E') | '\\"' | '\\\\' | '\\t' | '\\n';
STRING : '"' CHAR*? '"' ;
LINE_COMMENT : '//' ~[\r\n]* -> skip;
MULTILINE_COMMENT: '/*' .*? '*/' -> skip;
WHITESPACE  :   [ \t\n\r]+ -> skip;
