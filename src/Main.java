import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Binary to Decimal calculator Program\n");
        System.out.println("Enter binary number value: ");
        Scanner scanner = new Scanner(System.in);
        String buffer = scanner.nextLine();
        System.out.println("You entered: " + buffer + "for conversion.\n");
        System.out.println("Procesing the data ....\n");
        System.out.println("The decimal conversion is: " + bin2Dec(buffer));
    }

    public int bin2Dec(String input) {
        
    }
}
