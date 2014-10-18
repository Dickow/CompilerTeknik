package compiler.IR;

import java.util.LinkedList;

import compiler.PrettyPrinter;

public class MJMethod extends IR {

	private MJType returnType;
	private String name;
	private LinkedList<MJVariable> parameters;
	private LinkedList<MJVariable> variables;
	private LinkedList<MJStatement> statements;
	private MJReturn returnCall;
	private boolean isStatic;
	private boolean isPublic;

	public MJMethod(MJType returnType, String name,
			LinkedList<MJVariable> parList, LinkedList<MJVariable> vars,
			LinkedList<MJStatement> statements, MJReturn returnExpr,
			boolean isStatic, boolean isPublic) {

		this.returnType = returnType;
		this.name = name;
		this.parameters = parList;
		this.variables = vars;
		this.statements = statements;
		this.returnCall = returnExpr;
		this.isStatic = isStatic;
		this.isPublic = isPublic;
	}

	public String getName() {
		return name;
	}

	public LinkedList<MJVariable> getParameters() {
		return parameters;
	}

	public MJType getReturnType() {
		return returnType;
	}

	public LinkedList<MJVariable> getVariables() {
		return variables;
	}

	public LinkedList<MJStatement> getStatements() {
		return statements;
	}

	public MJReturn getReturnCall() {
		return returnCall;
	}

	public boolean isStatic() {
		return this.isStatic;
	}

	public boolean isPublic() {
		return this.isPublic;
	}

	public void prettyPrint(PrettyPrinter prepri) {
		if (this.isPublic()) {
			prepri.print("public ");
		}
		if (this.isStatic()) {
			prepri.print("static ");
		}

		this.returnType.prettyPrint(prepri);
		prepri.print(" ");

		prepri.print(this.name + "(");
		boolean first = true;
		for (MJVariable v : this.parameters) {
			if (!first) {
				prepri.print(", ");
			} else {
				first = false;
			}
			v.prettyPrint(prepri);
		}
		prepri.println(")");
		prepri.println("{");
		prepri.in();
		for (MJVariable v : this.variables) {
			v.prettyPrint(prepri);
			prepri.println(";");
		}
		for (MJStatement s : this.statements) {
			s.prettyPrint(prepri);
		}
		if (returnCall != null) {
			returnCall.prettyPrint(prepri);
		}
		prepri.out();
		prepri.println("}");
	}
}
