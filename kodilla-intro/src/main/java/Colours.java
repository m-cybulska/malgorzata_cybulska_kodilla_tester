import java.util.Scanner;
public class Colours {
    public static String coloursFirstLetter() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter first letter of the colour in mind:");
            String colour = scanner.nextLine().toUpperCase();
            if (colour.length() != 1) {
                System.out.println("Just one letter, please try again.");
                continue;
            }
            switch (colour) {
                case "R": return "Red";
                case "Y": return "Yellow";
                case "B": return "Blue / Brown / Black";
                case "G": return "Green / Grey";
                case "P": return "Purple / Pink";
                case "M": return "Magenta";
                case "O": return "Orange";
                case "W": return "White";
                case "N": return "Navy";
                default:
                    System.out.println("Oops... It might be too fancy, try a different letter.");
            }
        }
    }
    public static void main(String[] args) {
        String result = coloursFirstLetter();
        System.out.println(result);
    }
}
