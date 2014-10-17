grammar MiniJava;

program
  : mainClass 
      ( classDeclaration )*
  ;

classDeclaration
  : 'class' className=IDENT ( 'extends' superClassName=IDENT )? 
    '{' ( varDeclaration 
        )* 
        ( methodDeclaration 
        )*
    '}'
  ;

mainClass
  : 'class' className=IDENT 
    '{' 
      'public' 'static' 'void' 'main' '(' 'String' '[' ']' parameterName=IDENT ')' 
      block
    '}'
  ;
  
block
  : '{' ( varDeclaration
        )* 
        ( statement
        )*
    '}'
  ;
    
varDeclaration
  : variable  ';'
  ;

variable : type variableName=IDENT
  ;

type
  : typeBoolean
  | typeInt
  | typeClass
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
        return  
    '}'
  ;
  
procType
  : typeVoid  
  | type 
  ;
  
typeVoid: 'void' ;

statement
  : statementBlock
  | statementIf
  | statementWhile
  | statementAssign
  | statementArrayAssignment
  | statementPrintln
  | statementPrint
  | statementMethodCall
  ;
  
statementBlock              : block;
statementIf                 : 'if' '(' condition = expression ')' ifblock = block ('else'  elseblock = block)?;
statementWhile              : 'while' '(' condition = expression ')' whilestatement = statement;
statementAssign             : lhs=identifier '=' rhs=expression ';' ;
statementArrayAssignment    : identifier '[' arrayexpression = expression ']' '=' identifierExpression = expression ';'; // New
statementPrintln            : 'System.out.println' '(' argument=expression ')' ';' ; // New
statementPrint              : 'System.out.print' '(' argument = expression ')' ';'; // New
statementMethodCall         : expressionMethodCall;  // New

return             : 'return' '(' (argument=expression)? ')' ';' ; // New

expression
  : head=level1 ( '&&' tail+=level1 )*
  ;

level1
  : head=level2 ( '==' tail+=level2 )*
  ;
  
level2
  : head=level3
    ('<' tail+=level3
    )*
  ;
    
level3
  : head=level4
    (( '+' |'-') tail+=level4 
    )*
  ;

level4
  : head=level5 ('*' tail+=level5
           )*
  ;
  
level5
  : expressionUnaryMinus
  | expressionNegation
  | expressionNewIntArray
  | expressionNewObject
  | expressionIdentifier
  | expressionArrayAccess // New
  | expressionMethodCall // New
  | expressionParentheses // New
  | expressionConstantTrue // New
  | expressionConstantFalse // New
  | expressionConstantInteger // New
  | expressionConstantString // New
  ;

expressionUnaryMinus      : '-' argument=level5 ;
expressionNegation        : '!' argument=level5;
expressionNewIntArray     : 'new' 'int' '[' size=expression ']' ;
expressionNewObject       : 'new' IDENT '('')' ;
expressionIdentifier      : identifier ;
expressionArrayAccess     : identifier '[' adress=expression ']'; // New
expressionMethodCall      : (identifier '.')? IDENT '(' (reqExpression = expression(',' optExpression = expression)* )? ')'; // New
expressionParentheses     : '(' argument=expression ')' ; // New
expressionConstantTrue    : 'true' ; // New
expressionConstantFalse   : 'false' ; // New
expressionConstantInteger : value=INT ; // New
expressionConstantString  : value=STRING ; // New
  
identifier
  : id ( '.' selectors+=IDENT )*
  ;
  
  id
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
fragment NEWLINE:'\r'? '\n';
INT : '0' | ( NONNULL NUMBER* );
fragment CHAR : ' ' | '!' | ('\u0023'..'\u005B') | ('\u005D'..'\u007E') | '\\"' | '\\\\' | '\\t' | '\\n';
STRING : '"' CHAR* '"' ;
COMMENT : ( '//' .*? NEWLINE | '/*' .*? '(' | NEWLINE ')' '*/' ) -> skip;
WHITESPACE  :   ( ' ' | '\t' | NEWLINE )+  -> skip;