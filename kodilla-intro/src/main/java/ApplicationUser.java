public class ApplicationUser {
    String name;
    int userAge;
    int userHeight;


    public ApplicationUser(String name, int userAge, int userHeight) {
        this.name = name;
        this.userAge = userAge;
        this.userHeight = userHeight;

    }

    public  boolean getAverageAge() {
            if (this.name != null) {
                if ( this.userAge> 30 && this.userHeight > 160) {
                    return true;
                } else {
                    return false;
                }
            } else {
                System.out.println("Please enter your name");
                return false;
            }
        }


    }

