public class LeapYear {
    public static void main(String[] args) {
        int passedYear = 2024;
        System.out.println("The passed year is "+passedYear);

        if(passedYear%400==0 & passedYear%4==0 & passedYear%4 == 0){
            System.out.println(passedYear + " is a leap year");
        }
        else {
            System.out.println(passedYear + " is not a leap year");

        }


    }


}
