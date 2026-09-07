package FirstPacakage;

import java.util.Scanner;

public class FirstClass {

	public static void main(String[] args) {
		//this is the array class
		
	Scanner sc=new Scanner(System.in);
	System.out.println("eneter the size of the array");
	int s=sc.nextInt();
	int[] arr=new int[s];
	int lengths=arr.length;
	System.out.println("the length of the array is   "+lengths);
	System.out.println("enter the values to fill the array");
	for(int i=0;i<s;i++) {
		arr[i]=sc.nextInt();
	}
	
	for(int i=s-1;i>=0;i--) {
		System.out.println(arr[i]);
	}

}
}