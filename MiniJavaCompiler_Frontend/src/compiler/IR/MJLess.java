package compiler.IR;

import compiler.PrettyPrinter;

public class MJLess extends MJBinaryOp {
	
	public MJLess() {}
	
	public MJLess(MJExpression a, MJExpression b){
		super(a, b);
	}

	public void prettyPrint(PrettyPrinter prepri) {
		this.lhs.prettyPrint(prepri);
		prepri.print(" < ");
		this.rhs.prettyPrint(prepri);
	}
}
