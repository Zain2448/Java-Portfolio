import java.util.Scanner;
import java.util.Random;
public class PinEncryption {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter a 4 digit pin number to encrypt: ");
        int pin = scan.nextInt();
        int num1 = random.nextInt(64536) + 1000;
        int num2 = random.nextInt(64536) + 1000;

        String hexPin = String.format("%02x", pin);
        String hex1 = String.format("%02x", num1);
        String hex2 = String.format("%02x", num2);

        System.out.println("Your encrypted pin number is: " + hex1 + hexPin + hex2 + ".");
    }
}
