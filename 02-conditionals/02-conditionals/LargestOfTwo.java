import java.util.Scanner;

public class LargestOfTwo{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a :");
		int a = sc.nextInt();
		System.out.println("enter b :");
		int b = sc.nextInt();
		
		if (a  > b) {
			System.out.println("a is larger");
		}else if(a < b) {
			System.out.println("b is larger");
		}else {
			System.out.println("a and b are equal");
		}
	}
}
