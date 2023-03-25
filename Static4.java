class Static4{
	public void show(){
		System.out.println("Non Static Show");
	}
	static public void show1(){
		System.out.println("Static Show");
	}
	{
		show();
	}
	static{
		show1();
	}
	public static void main(String[] args) {
		Static4 s=new Static4();
		System.out.println("Main");
	}
}