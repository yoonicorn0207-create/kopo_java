class Greeter {
// 메소드 정의
	void sayHello() {
		System.out.println("Hello");
	}
	
	void sayHello2(String str) {
		System.out.println("Hello"+str);
	}
	
	String sayHello3(String str1, String str2) {
		String strTemp = "Hello "+str1+" "+str2;
		return strTemp;
	}
	
}//CLASS

public class functionEx_0407 {
	public static void main(String args[]) {
		/* 사용(호출) */
		Greeter g = new Greeter();
		g.sayHello();
		g.sayHello2("JAVA");
		g.sayHello3("A","B");
//		g.sayHello3("C","D");
		System.out.println(g.sayHello3("C","D"));
		
	}//main
}//CLASS