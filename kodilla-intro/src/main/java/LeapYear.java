public class LeapYear {
    public static void main(String[] args) {
        int passedYear = 2020;
       // System.out.println("The passed year is "+passedYear);
        if (-3200 < passedYear) {
            if(passedYear % 4 == 0 && (passedYear % 100 != 0 || passedYear % 400 == 0)){
                System.out.println(passedYear + " is a leap year");
            }
            else {
                System.out.println(passedYear + " is not a leap year");
            }
        } else {
            System.out.println("Leap year created after '-3200'");
        }
    }
}
