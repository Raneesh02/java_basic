package inheritance;

public class AccessSpecifiers {
	private int privateVariable;
	int defaultVariable;
	protected int protectedVariable;
	public int publicVariable;

}

class SamePackageNotSubClass {
	void checkPrivate() {
		new AccessSpecifiers().privateVariable = 0;
	}

	void checkDefault() {
		new AccessSpecifiers().defaultVariable = 0;
	}

	void checkProtected() {
		new AccessSpecifiers().protectedVariable = 0;
	}

	void checkPublic() {
		new AccessSpecifiers().publicVariable = 0;
	}

}

class SamePackageSubClass extends AccessSpecifiers {
	void checkPrivate() {
		new AccessSpecifiers().privateVariable = 0;
	}

	void checkDefault() {
		new AccessSpecifiers().defaultVariable = 0;
	}

	void checkProtected() {
		new AccessSpecifiers().protectedVariable = 0;
	}

	void checkPublic() {
		new AccessSpecifiers().publicVariable = 0;
	}

}