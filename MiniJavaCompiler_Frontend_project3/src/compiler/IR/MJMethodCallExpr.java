package compiler.IR;

import java.util.LinkedList;

public class MJMethodCallExpr extends MJExpression {

	private boolean hasObject = false;
	private MJIdentifierClass object;
	private String methodName;
	private LinkedList<MJExpression> arguments;

	public MJMethodCallExpr(MJIdentifierClass object, String methodName,
			LinkedList<MJExpression> arguments) {
		if (object != null) {
			this.object = object;
			this.hasObject = true;
		}
		this.methodName = methodName;
		this.arguments = arguments;
	}

	public boolean hasObject() {
		return this.hasObject;
	}
	
	public MJIdentifierClass getObject() { return this.object; }

	public String getMethodName() {
		return this.methodName;
	}
	
	public LinkedList<MJExpression> getArguments() { return this.arguments; }
	
}
