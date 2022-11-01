import java.util.Scanner;
public class Problem2{
	public static void main(String[] args){
		Scanner scan = new Scanner (System.in);
		System.out.println("enter A ");
		int a = scan.nextInt();
		
		System.out.println("enter B ");
		int b = scan.nextInt();
		
		System.out.println("enter C");
		int c = scan.nextInt();
		
		System.out.println("enter D");
		int d = scan.nextInt();
		
		int max = a;
		int min = a;
		
		 if(b > max){
			max = b;
		}
		if(c > max){ 
			max = c;
		}
		if(d > max){ 
			max = d;
		}
		
		if(b < min) {
			min = b;
		}
		if ( c < min){ 
			min = c;
		}
		if(d < min) {
			min = d;
		}
		
		
		
		
		
		
		
		System.out.println("your answer is:");
		System.out.println((+max - +min));
	}
}
		