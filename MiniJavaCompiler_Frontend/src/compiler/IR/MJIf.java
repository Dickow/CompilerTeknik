package compiler.IR;

import compiler.PrettyPrinter;

public class MJIf extends MJStatement {
	private MJExpression condition;
	private MJBlock ifblock;

	public MJIf() {
	}

	public MJIf(MJExpression condition, MJBlock ifblock) {
		this.condition = condition;
		this.ifblock = ifblock;
	}

	public MJExpression getCondition() {
		return this.condition;
	}

	public MJBlock getIfBlock() {
		return this.ifblock;
	}

	public void prettyPrint(PrettyPrinter prepri) {
		prepri.print("if (");
		this.condition.prettyPrint(prepri);
		prepri.print(")");
		this.ifblock.prettyPrint(prepri);
		prepri.print(";");

	}

}
