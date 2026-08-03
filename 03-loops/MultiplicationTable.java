import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter n :");
		int n = sc.nextInt();
		
		int multiple = 0;
		for(int i = 1 ; i <= 10 ; i++) {			
			multiple = n*i;		
			System.out.println(n +" x "+ i +" = " + multiple);
		}
		
		
	}	
}
