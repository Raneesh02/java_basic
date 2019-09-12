package differentPackage;

import inheritance.AccessSpecifiers;

public class DifferentPackageNonSubClass {
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
