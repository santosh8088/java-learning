package variable.condition.pattern;

public class pattern6 {
    public static void main(String[] args) {
        // Pattern for inverted right triangle
        // *****
        //  ****
        //   ***
        //    **
        //     *
        int n = 5;
        for (int i=n; i>=1; i--){
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");

            }
            for (int m=i; m>=1; m--){
                System.out.print("*");
            }
            System.out.println();
        }


    }
    
}
