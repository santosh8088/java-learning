package variable.condition.pattern;

public class Basic_pattern {

    public static void main (String[] args){


        // pattern 1

        //*****
        //*****
        //***** 
        //*****

        // n*m  // n is a row and m is a column

        // outer loop


        int n=4 ;
        int m=5 ;


        for (int i=1; i<=n; i++){
            
            //iner loop


            for (int j=1; j<=m; j++){
                System.out.print("*");
            }
            System.out.println();


            //final output

            //*****
            //*****
            //*****
            //*****
        }

    }
    
}
