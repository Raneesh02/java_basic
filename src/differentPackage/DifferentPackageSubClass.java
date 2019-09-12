package differentPackage;

import inheritance.AccessSpecifiers;

public class DifferentPackageSubClass extends AccessSpecifiers {
	void checkPrivate() {
		privateVariable = 0;
	}

	void checkDefault() {
		defaultVariable = 0;
	}

	void checkProtected() {
		protectedVariable = 0;
	}

	void checkPublic() {
		publicVariable = 0;
	}
}
