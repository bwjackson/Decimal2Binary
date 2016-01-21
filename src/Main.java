import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Binary to Decimal calculator Program\n");
        System.out.println("Enter binary number value: ");
        Scanner scanner = new Scanner(System.in);
        String buffer = scanner.nextLine();
        System.out.println("You entered: " + buffer + " for conversion.\n");
        System.out.println("Procesing the data ....\n");
        System.out.println("The decimal conversion is: " + bin2Dec(buffer));
    }

    private static int bin2Dec(String input) {
        int result = 0;
        for(int i = 0; i < input.length(); i++) {
            int position = input.length() - i - 1;
            int digit = Character.getNumericValue(input.charAt(i));
            result += digit * Math.pow(2, position);
        }
        return result;
    }
}
