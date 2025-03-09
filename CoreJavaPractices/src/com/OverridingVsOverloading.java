package com;

//Overloading is the same method with unique signature inside the same Class
class Authentication {

	void login(String email, String password) {
		System.out.println("Logging in the user with Email " + email + " and password");
	}

	void login(String phone, int otp) {
		System.out.println("Logging in the user with Phone " + phone + " and otp");

	}

//Overriding is wrt Parent Child Relationship
	class Theme {
		void themeColorScheme() {
			System.out.println("Primary: red");
			System.out.println("Secondary: white");
		}

		void darkToLightMode(boolean enable) {
			System.out.println("Mode Enabled form Black to White");

		}
	}

	class CustomTheme extends Theme {
		void themeColorScheme() {
			System.out.println("Primary: green");
			System.out.println("Secondary: yellow");
		}

		void darkToLightMode(boolean enable) {
			System.out.println("Mode Enabled form Dark Grey to Amber and white");

		}
	}
}

public class OverridingVsOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
