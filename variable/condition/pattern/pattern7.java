package variable.condition.pattern;

public class pattern7 {
     public static void main(String[] args){
    //     1
    //     12
    //     123
    //     1234
    //     12345

    int n=5;
    // outer loop
    for(int i=1; i<=n; i++){
        //inner loop
        for (int j=1; j<=i; j++){
            System.out.print(j+" ");
        }
        System.out.println();

    }
    }
}
