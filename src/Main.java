public class Main {
    public static void main(String[] args) {
        double ticket_price = 200.57;
        long bonus_miles = (long) ticket_price / 20;
        String s = "s"; // plural ending
        if (bonus_miles == 1) {
            s = "";
        }
        System.out.println("Your bonus is " + bonus_miles + " mile" + s);
    }
}
