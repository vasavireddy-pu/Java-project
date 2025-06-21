public class RelationalOperators {
    public static void main(String[] args) {
        //Declare and initialize variables
        int num1= 15;
        int num2= 10;

        //  perform relational operations
        boolean isEqual= num1 == num2;
        boolean isNotEqual= num1 != num2;
        boolean isGreater= num1 > num2;
        boolean isLess= num1 < num2;
        boolean isGreaterOrEqual= num1 >= num2;
        boolean isLessOrEqual= num1 <= num2;

        //Print the results
        System.out.println("Is Equal: " + isEqual);
        System.out.println("Is Not Equal: " + isNotEqual);
        System.out.println("Is Greater: " + isGreater);
        System.out.println("Is Less: " + isLess);
        System.out.println("Is GreaterOrEqual: " + isGreaterOrEqual);
        System.out.println("Is LessOrEqual: " + isLessOrEqual);
    }
}
