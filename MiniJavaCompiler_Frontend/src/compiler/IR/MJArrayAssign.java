package compiler.IR;

import compiler.PrettyPrinter;

public class MJArrayAssign extends MJStatement {
	
	private MJIdentifier identifier; 
	private MJExpression arrayExpression; 
	private MJExpression identifierExpression; 

	
	public MJArrayAssign (MJIdentifier identifier,MJExpression arrayExpression,MJExpression identifierExpression) {
		this.identifier = identifier; 
		this.arrayExpression = arrayExpression; 
		this.identifierExpression = identifierExpression;
	}
	
	
	
	
	public void prettyPrint(PrettyPrinter prepri) {
		this.identifier.prettyPrint(prepri);
		prepri.print("[");
		this.arrayExpression.prettyPrint(prepri);
		prepri.print("] = " );
		this.identifierExpression.prettyPrint(prepri);
		prepri.print(";");
		
	}




	public MJIdentifier getIdentifier() {
		return identifier;
	}




	public MJExpression getArrayExpression() {
		return arrayExpression;
	}




	public MJExpression getIdentifierExpression() {
		return identifierExpression;
	}
	
	

}
