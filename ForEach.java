class ForEach{
	public static void main(String[] args) {
		int[] marks={135,138,115,116,129};
		int max=marks[0];
		for (int num:marks ) {
			if (num>max) {
				max=num;
			}
		}
		System.out.print("Student Highest Score is "+max);
	}
}