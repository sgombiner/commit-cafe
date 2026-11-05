public class CommitCafe {

    private static String barista = "Jayson"; // STUDENT_TODO_1A: Change name
    // STUDENT_TODO_1B: Add a nickname or title for the barista
    private static String baristaNickname = "Le Coffee Goat";
    private static int cups = 0;

    public static void brew(String drink) {
        cups++;
        System.out.println("CoffeeBot brewed " + drink + ". Keep calm and merge the mocha.");
        cups++;
        System.out.println("[BREW] " + baristaNickname + " made a " + drink + ".");
        System.out.println("[BOT CHECK] drink length = " + drink.length());
        System.out.println("[BREW] " + baristaNickname + " has made " + cups + " cups so far.");
    }

    public static void printSummary() {
        System.out.println("[SUMMARY] " + barista + " made " + cups + " cups today.");
    }

    public static void main(String[] args) {
        brew("Espresso");
        brew("Latte");
        printSummary();
    }
}