import java.util.Scanner;
public class Problem3{
	public static void main(String[] args){
	Scanner scan = new Scanner (System.in);
	System.out.println("input A");
	int a = scan.nextInt();
	System.out.println("input B");
	int b = scan.nextInt();
	System.out.println("input C");
	int c = scan.nextInt();
	
	System.out.println(a + " " + b + " " + c);
	
	int max = a;
	int min = a;
	int med = a;
		
		 if(b > max){
			max = b;
		 }
		 if(b < min) {
			min = b;
		 }
		else if(b != max && b != min){
			med = b;
		}
		
		if(c > max){ 
			max = c;
		}
		
		
		if ( c < min){ 
			min = c;
		}
		else if(c != max && c != min){
			med = c;
		}
		
		System.out.println(min + " " + med + " " + max);
		
	
	
	
	


	}
}
