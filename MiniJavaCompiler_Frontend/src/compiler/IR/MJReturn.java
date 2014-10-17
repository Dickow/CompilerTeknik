package compiler.IR;

import compiler.PrettyPrinter;

public class MJReturn extends MJStatement {

	private MJExpression retExp;

	public MJReturn() {
		this.retExp = null;
	}
	
	public MJReturn(MJExpression retExp) {
		this.retExp = retExp;
	}

	public void prettyPrint(PrettyPrinter prepri) {
		prepri.print("return(");

		if (this.retExp != null) {
			prepri.print(" ");
			this.retExp.prettyPrint(prepri);
			prepri.print(" ");
		}

		prepri.println(");");
	}
}
