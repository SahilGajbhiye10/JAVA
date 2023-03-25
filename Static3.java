class Static3{
	{
		System.out.println("I am in non static block");
	}
	static{
		System.out.println("I am in static block");
	}
	public static void main(String[] args) {
		Static3 s=new Static3();
		System.out.println("I am in main");
	}
}