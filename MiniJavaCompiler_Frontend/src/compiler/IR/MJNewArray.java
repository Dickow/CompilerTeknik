package compiler.IR;

import compiler.PrettyPrinter;

public class MJNewArray extends MJNew {
	
	private MJExpression size;
	
	public MJNewArray(MJExpression size){
		this.size = size;
	}
	
	public MJExpression getSize(){
		return size;
	}

	public void prettyPrint(PrettyPrinter prepri) {
		prepri.print("new int [");
		this.size.prettyPrint(prepri);
		prepri.print("]");
	}
}
