import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.print("Please enter 2 numbers");
		
		Scanner sr=new Scanner(System.in);
		double a=sr.nextDouble();
		double b=sr.nextDouble();
		
		
		 System.out.print("Enter an operator (+, -, *, /): ");
		 
		 char operatorSign=sr.next().charAt(0);
		 

				double c=0.0;
				if(b!=0) {
				
				
				switch(operatorSign) {
				case '+':
					c=a+b;
				break;
				case '*':
					c=a*b;
					break;
				case '/':
					
					c=a/b;		
					break;
					
				case '-':
					c=a-b;
					break;
					default:
						System.out.println("Error! operator is not correct");
					return;
					
					
				}
				
				System.out.println(a+" "+operatorSign+" "+b+"  ="+c);
				}
				else {
					switch(operatorSign) {
					case '+':
						c=a+b;
					break;
					case '*':
						c=a*b;
						break;
					case '/':
					
						System.out.println("Error!denominator must be nozero value");
						break;
					case '-':
						c=a-b;
						break;
						default:
							System.out.println("Error! operator is not correct");
						return;
						
						
					}
					
					System.out.println(a+" "+operatorSign+" "+b+"  ="+c);
					
				}
			
	}

}
