import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello World!");
        System.out.println("Have a nice day, " + name + "!");
    }
}
