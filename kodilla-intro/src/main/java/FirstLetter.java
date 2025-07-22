import java.util.Scanner;

public class FirstLetter {
    public static String getFirstLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Letter: (You can only use yellow, red, blue, orange, green, purple)");
        String letter = scanner.nextLine().toUpperCase();

        switch (letter){
            case "Y": return "Yellow";
            case "R": return  "Red";
            case "B": return  "blue";
            case "O": return  "Orange";
            case "G": return  "Green";
            case "P": return  "purple";
            default:
                return "Invalid Input";
        }
    }
}
