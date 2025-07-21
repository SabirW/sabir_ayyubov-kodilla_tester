public class Application {
    public static void main(String[] args) {

        ApplicationUser newUser = new ApplicationUser("Adam", 40, 180);

        if (newUser.getAverageAge()) {
                System.out.println("User is older than 30 and taller than 160cm");
            } else {
                System.out.println("User is not older than 30 and taller than 160cm");
            }
        }
}
