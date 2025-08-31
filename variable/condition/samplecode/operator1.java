package variable.condition.samplecode;
import java.util.*;

public class operator1 {
    // comparison operators
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numbers:");
        int a = sc.nextInt();
        System.out.println("Enter b numbers:");
        int b = sc.nextInt();

        if(a>b){
            System.out.println("a is treater than b");
        }else if (a<b){
            System.out.println("a is less than b");

            
        }else if (a==b){
            System.out.println("a is equal to b");
        }
        else if (a!=b){
            System.out.println("a is not equal to b");
        }else if (a>=b){
            System.out.println("a is greater than or equal to b");
        }else if (a<=b){
            System.out.println("a is less than or equal to b");
        }
        else{
            System.out.println("invalid condition");
        }
        sc.close();

    }
}
