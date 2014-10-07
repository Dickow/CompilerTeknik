package compiler.IR;

import compiler.PrettyPrinter;

public final class MJNewObjectExpression extends MJExpression {

	private MJType objectType;

	public MJNewObjectExpression(MJType objectType) {
		this.objectType = objectType;
	}

	// TODO
	public void prettyPrint(PrettyPrinter prepri) {
	}

	public MJType getObjectType() {
		return objectType;
	}
}
