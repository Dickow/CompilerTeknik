package compiler.IR;

import compiler.PrettyPrinter;

public class MJIfElse extends MJStatement {
	
	private MJExpression condition; 
	private MJBlock ifblock; 
	private MJBlock elseblock; 
	
	public MJIfElse(MJExpression condition, MJBlock ifblock, MJBlock elseblock){
		this.condition = condition; 
		this.ifblock = ifblock; 
		this.elseblock = elseblock; 
	}
	
	public MJExpression getCondition(){
		return condition; 
	}
	
	public MJBlock getIfBlock(){
		return ifblock; 
	}
	
	public MJBlock getElseBlock(){
		return elseblock; 
	}

	public void prettyPrint(PrettyPrinter prepri) {
		prepri.print("if (");
		this.condition.prettyPrint(prepri);
		prepri.print(")");
		this.ifblock.prettyPrint(prepri);
		prepri.println("else");
		this.elseblock.prettyPrint(prepri);
		
		
	}

}
