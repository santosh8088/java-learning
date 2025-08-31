package variable.function;
import java.util.* ;
public class odCheak {
public class factorial {
    public  static int odd(int n){
        if (n%2==0){
            System.out.println("please given odd number:");
            return -1;
        } else {
            System.out.println(n);
            return n;
        }
    

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = odd(n);
        System.out.println(result);        
    }

    
}}
