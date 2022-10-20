import java.util.Scanner;

public class Calc {
  public static void main(String[] args) {
	  double num1;
	  double num2;
	  String operation;
	  
	  Scanner input = new Scanner(System.in);
	  
	  System.out.print("prosze wpisac pierwsza cyfre ");
	  num1 = input.nextDouble();
	  
	  System.out.print("prosze wpisac druga cyfre ");
	  num2 = input.nextDouble();
	  Scanner op = new Scanner(System.in);
	  
	  System.out.print("prosze wpisac rodzaj dzialania: +,-,*,/ ");
	  operation = op.next();
	  
	  if(operation.equals ("+")){
		  System.out.println(+(num1+num2));
	  }
	  else if(operation.equals ("-")){
		  System.out.println(+(num1-num2));
	  }
	  else if(operation.equals ("*")){
		  System.out.print(+(num1*num2));
	  }
	  else if(operation.equals ("/")){
		  System.out.print(+(num1/num2));
	  }
	  else {
		  System.out.println("zle dzialanie");
		  
	  }
	  
  }
}	  
	  

   
    