package week2day1;

public class LearnMethods {
private void method1() {
	System.out.println("I'm Private Method");
}
public void method2() {
	System.out.println("I'm Public Method");
}	
 void method3() {
	System.out.println("I'm Default Method");
}
 protected void method4() {
		System.out.println("I'm Protected Method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
LearnMethods kiruthiga = new LearnMethods ();
kiruthiga.method1();
kiruthiga.method2();
kiruthiga.method3();
kiruthiga.method4();
	}

}
