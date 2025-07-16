public class Application {
    public static boolean isEligible(String name, double age, double height) {
        if (name != null) {
            if (age > 30 && height > 160) {
                return true;
            } else {
                return false;
            }
        } else {
            System.out.println("Please enter your name");
            return false;
        }
    }

    public static void main(String[] args) {
        String name = "Adam";
        double age = 40.5;
        double height = 178;

        if (isEligible(name, age, height)) {
            System.out.println("User is older than 30 and taller than 160cm");
        } else {
            System.out.println("User is not older than 30 and taller than 160cm");
        }
    }
}
