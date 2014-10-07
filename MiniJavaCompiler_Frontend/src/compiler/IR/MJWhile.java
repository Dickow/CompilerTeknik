package compiler.IR;

import compiler.PrettyPrinter;

public class MJWhile extends MJStatement {
	
	private MJExpression condition;
	private MJStatement WhileStatement;

	public MJWhile(){}
	
	public MJWhile(MJExpression condition, MJStatement Whilestatement){
		
		this.condition = condition;
		this.WhileStatement = Whilestatement;
	}
	
	public MJExpression getCondition(){
		return condition;
	}
	public MJStatement getStatement(){
		return WhileStatement;
	}

	public void prettyPrint(PrettyPrinter prepri) {
		prepri.print("while (");
		this.condition.prettyPrint(prepri);
		prepri.print(")");
		this.WhileStatement.prettyPrint(prepri);
		
	}
}
