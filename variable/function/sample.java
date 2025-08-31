package variable.function;
import java.util.*;
public class sample {
   

    public static String printmyname(String name ){
        return name;
    }
    public static void main(String[] args ){

        Scanner sc = new Scanner(System.in);
         while(true){
        System.out.println("Enter your name:");
        String name = sc.next();

        System.out.println(printmyname(name));

    }

}
}