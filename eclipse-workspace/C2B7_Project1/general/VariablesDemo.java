package general;

public class VariablesDemo {
	int a = 1024;
	int b;

	void fun1() {
		int c;
		c = 10;
		System.out.println("class variables " + a + " " + b);
		System.out.println("local variable " + c);
		a = 7890;
		b = 56;
		System.out.println("class variables " + a + " " + b);
	}

	void fun2() {
		System.out.println("class variables " + a + " " + b);
	}

	public static void main(String[] args) {
		VariablesDemo obj = new VariablesDemo();
		obj.fun1();
		obj.fun2();

	}

}
