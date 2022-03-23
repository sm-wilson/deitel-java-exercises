
// Print numbers 1-4 using different methods

public class Ex2_14 {

    public static void main(String[] args) {
        // Single println statement
        int one = 1;
        int two = 2;
        int three = 3;
        int four = 4;
        System.out.println(one + " " + two + " " + three + " " + four);

        // Four print statements
        System.out.print(one + " ");
        System.out.print(two + " ");
        System.out.print(three + " ");
        System.out.print(four + " \n");
        
        // Single printf statement
        System.out.printf("%d %d %d %d\n", one, two, three, four);
    }
}