class StaticKey{
	static int num=StaticMethod();
	static{
		System.out.println("Inside static block");
	}
	static int StaticMethod(){
		System.out.println("from staticMethod");
		return 30;
	}
	public static void main(String[] args) {
		System.out.println("num: "+num);
		System.out.println("from main");
	}
}