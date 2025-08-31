package variable;
 

import java.util.Scanner;
import java.util.*;

public class primitive{
    public static void main (String[] args){
        int a = 10 ;
        int b = 30 ;
        int sum = a + b ;
        System.out.println(sum);
        System.out.println(a-b);
        System.out.println();





        byte byteValue = 100;
        short shortValue = 20000;       
        int intValue = 100000;
        long longValue = 10000000000L;
        float floatValue = 10.5f;
        double doublevalue  = 20.99;
        char charValue = 'A';
        boolean booleanValue = true;
        System.out.println("Byte value: " + byteValue);
        System.out.println("Short value: " + shortValue);   
        System.out.println("Int value: " + intValue);   
        System.out.println("Long value: " + longValue);
        System.out.println("Float value: " + floatValue);
        System.out.println("Double value: " + doublevalue);
        System.out.println("Char value: " + charValue);
        System.out.println("Boolean value: " + booleanValue);







        System.out.println("Byte: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("Short: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("Int: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("Long: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("Float: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("Double: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.println("Char: " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);
        System.out.println("Boolean: " + Boolean.FALSE + " or " + Boolean.TRUE);























        // input collecting user 

        Scanner sc = new Scanner(System.in );
        System.out.println("enter your name: ");
        String name = sc.nextLine();
        System.out.println(  "Hello" +" "+name);


        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter your age: ");
        int age = sc1.nextInt();
        
        System.out.println("You entered: " + age);

    }
}

    
