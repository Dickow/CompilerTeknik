package compiler.IR;

import compiler.PrettyPrinter;

public class MJMainClass extends MJClass {

	private String name;
	private String argName;
	private MJBlock block;
	
	public MJMainClass() {}
	
	public MJMainClass(String name, String argName, MJBlock block) {
		this.name = name;
		this.argName = argName;
		this.block = block;
	}

	public String getName() {
		return name;
	}

	public MJType getSuperClass() {
		return MJType.getClassType("Object");
	}
	
	public void prettyPrint(PrettyPrinter prepri) {
		prepri.println("class " + this.getName() + " {");
		prepri.in();
		prepri.println("public static void main(String[] " + argName + ")");
		block.prettyPrint(prepri);
		prepri.out();
		prepri.println("}");
	}
}
