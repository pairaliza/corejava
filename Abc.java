class Abc {
	
	int i = 0;//non-static variable
	int j = 0;//non-static variable
	static int k = 0; //static variable

	void fun1() {//non static funtion
		System.out.println("Inside  fun1()");
	}


	void fun2() { //non static function

		System.out.println("Inside  fun2()");
	}


	static void fun3() { //static function
		System.out.println("Inside static fun3()");
	}

	
	public static void main(String[] args) {

		System.out.println("Hello World! Liza lets start learing");
		//System.out.println("Inside  fun1()");

		Abc abc = new Abc();

		//abc.fun1();
		//abc.fun2();
		Abc.fun3();
		//abc.fun2();
		abc.fun1();
		abc.fun2();






 
	}
}
