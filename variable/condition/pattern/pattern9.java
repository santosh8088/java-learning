package variable.condition.pattern;

public class pattern9 {
    public static void main(String[] args) {
        // Pattern for inverted right triangle with numbers
        // 5 4 3 2 1
        // 4 3 2 1
        // 3 2 1
        // 2 1
        // 1
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
}
