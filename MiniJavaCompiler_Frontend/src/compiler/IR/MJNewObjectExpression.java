package compiler.IR;

import compiler.PrettyPrinter;

public final class MJNewObjectExpression extends MJExpression {

	private MJType objectType;

	public MJNewObjectExpression(MJType objectType) {
		this.objectType = objectType;
	}

	
	public void prettyPrint(PrettyPrinter prepri) {
		prepri.print("new");
		this.objectType.prettyPrint(prepri);
		prepri.print("( )");
		
	}

	public MJType getObjectType() {
		return objectType;
	}
}
