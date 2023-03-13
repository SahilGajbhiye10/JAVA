class MyJava {

public static void main(String[] args) { java.util.Scanner sc=new java.util.Scanner(System.in); int arr[][]=new int[3][3];

System.out.println("Enter array elements: "); for (int i=0;i<3 ; ++i) { for (int k=0;k<3 ;++k ) { arr[i][k]=sc.nextInt();

}

}

System.out.println("The array elements are: ");
for (int i=0;i<3 ;++i) {

for (int k=0;k<3 ;++k ) { System.out.println(arr[i][k]);

}

System.out.println();

}

}

}                 