package variable.condition;
import java.util.*;


public class calculater2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true){

        System.out.println("Enter first number:");
        int a= sc.nextInt();
        System.out.println("Enter second number:");
        int b= sc.nextInt();


        System.out.println("+, -, *, /, %");
        char op= sc.next().charAt(0);


        int result = 0;
        
        switch(op){
            case '+': result = a+b ;
            System.out.println("addition"+result);
            break ;
            case '-': result = a-b ;
            System.out.println("subtraction:"+result);

            break;
            case '*': result = a*b ;
            System.out.println("multiply:"+result);
            break ;
            case '/': result = a/b ;
            System.out.println("divition:"+result);
            break;
            case '%': result = a%b ;
            System.out.println("module:"+result);
            break;

            default : System.out.println("invalid operator:");
        }
        


    }
    
}
}