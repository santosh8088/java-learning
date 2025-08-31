package variable.condition;
import java.util.*;
public class calculater {
    public static void main (String[] args){
    //calculater
    Scanner sc = new Scanner(System.in);
    while (true) {

        
   
    
    System.out.println("Enter First number:");
    
    int a= sc.nextInt();{
        
    }
    
    
    

    
      System.out.print("Enter second number:");
      int b = sc.nextInt();
      System.out.println("Enter the operator (+, -, *, /,  %, ):");

    //   String input1 = sc.next();
    // if (input1.equalsIgnoreCase("exit")){
    //     System.out.println("calulater is exited");
        
    //     break;
    // }
    

    // String input2=sc.next();
    // if(input2.equalsIgnoreCase("exit")){
    //     System.out.println("calulater is exited");
    //     break;

    
    // }   
    

    char op= sc.next().charAt(0);

    if (op == '+' ){
        System.out.println("Addition: " + (a + b));
    } else if (op=='-') {
        System.out.println("Subtraction: " + (a - b));
    } else if (op=='*') {
        System.out.println("Multiplication: " + (a * b));
    } else if (op=='/') {
        System.out.println("Division: " + (a / b));
    } else if (op=='%') {
        
        System.out.println("Modulus: " + (a % b));
    } else {
        System.out.println("Invalid operator");
    }
    }
    
    }
    
}

