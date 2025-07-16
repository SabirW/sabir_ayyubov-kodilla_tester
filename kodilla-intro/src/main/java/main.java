public class main {
    public static void main1(String[] args) {
        String myName = "Sabir";
        int myAge = 19;
        double myHeight = 1.84;
        char carClass = 'A';
        boolean isGoodProgrammer = true;
        System.out.println(myName);
    }

    public static void main(String[] args){
        int sum = 0;

        User anna = new User("Anna", 19);
        User john = new User("John", 25);
        User Ali = new User("Ali", 30);

        User[] users = {anna, Ali, john};

        for (int i = 0; i<users.length; i++){
            sum += users[i].userAge;
        }
        int average = sum / users.length;
        
        for (int i = 0; i<users.length; i++){
            if (users[i].userAge < average){
                System.out.println(users[i].userName);
            }
        }
    }
}
