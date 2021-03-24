package oop.a;

public class A {

	public static String publicTest = "public";
	
	protected static String protectedTest = "protected";
	
	static String defaultTest = "default";
	
	private static String privateTest = "private";
	
	public void a() {
		
	}
	
	public static void test() {
		System.out.println("testA");
	}
	
	public static void main(String[] args) {
		test();
	}
}
