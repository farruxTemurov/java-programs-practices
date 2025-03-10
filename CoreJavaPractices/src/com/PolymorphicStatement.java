package com;

class CA {
	void show() {
		System.out.println("This is show of CA");
	}
}

class CB extends CA {
	void show() {
		System.out.println("This is show of CB");
	}

	void hello() {
		System.out.println("This is hello from CB");
	}
}

public class PolymorphicStatement {

	public static void main(String[] args) {
//		CA caRef = null;
//		caRef = new CB(); // Polymorphic Statement
		
		CA caRef = new CB();
		caRef.show();
		
		CB cbRef = (CB)caRef;
		cbRef.hello();
	}

}
