package compiler.IR;

public class MJSelector extends MJIdentifier {

	private MJIdentifierClass object;
	private MJIdentifier field;

	public MJSelector(MJIdentifierClass t, MJIdentifier field) {
		this.object = t;
		this.field = field;
	}

	public MJIdentifierClass getObject() {
		return object;
	}

	public MJIdentifierClass getField() {
		return field;
	}

}
