import java.util.Scanner;

public class arithmeticcalculator {
	public static void main(String[] args) {
        
	    Double number1, number2, result;
	    Scanner input = new Scanner(System.in);
	    while(true) {
	    System.out.println("Enter first number");
	    number1 = input.nextDouble();
	    System.out.println("Enter second number");
	    number2 = input.nextDouble();
	    System.out.println("Enter which process to be done \n1.Additiion \n2.Subbratcion \n3.Multiplication \n4.Division \n 0 for exit" );
		int ch;
		ch= input.nextInt();
	   

	    switch (ch) {
	      case 1:
	        result = number1 + number2;
	        System.out.println(number1 + " + " + number2 + " = " + result);
	        break;
	      case 2:
	        result = number1 - number2;
	        System.out.println(number1 + " - " + number2 + " = " + result);
	        break;
	      case 3:
	        result = number1 * number2;
	        System.out.println(number1 + " * " + number2 + " = " + result);
	        break;
	      case 4:
	        result = number1 / number2;
	        System.out.println(number1 + " / " + number2 + " = " + result);
	        break;
	      case 0:
	    	  System.exit(0);
	       default:
		        System.out.println("Invalid operator!");
		        break;
	            
	    
	    }
	    }
	  }
	}


	

