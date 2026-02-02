import java.util.*;

public class Features {

    // Utility method to print a break line
    public static void breakLine() {
        System.out.println("----------------------------");
    }

    // 1. Mad Libs Game
    public static boolean madLibs() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mad Libs Game!");
        System.out.print("Enter a noun: ");
        String noun = sc.nextLine();
        System.out.print("Enter a verb: ");
        String verb = sc.nextLine();
        System.out.print("Enter an adjective: ");
        String adjective = sc.nextLine();
        System.out.print("Enter an adverb: ");
        String adverb = sc.nextLine();

        System.out.println("Here’s your story:");
        System.out.println("The " + adjective + " " + noun + " decided to " + verb + " " + adverb + ".");
        return true;
    }

    // 2. Shopping Cart
    public static boolean shoppingCart() {
        List<String> cart = new ArrayList<>();
        cart.add("Apple");
        cart.add("Banana");
        cart.add("Milk");
        System.out.println("Shopping Cart: " + cart);
        return true;
    }

    // 3. Compound Interest Calculator
    public static boolean compoundInterest() {
        double principal = 1000;
        double rate = 5; // percent
        int time = 3; // years
        double amount = principal * Math.pow((1 + rate/100), time);
        System.out.println("Compound Interest after " + time + " years = " + (amount - principal));
        return true;
    }

    // 4. Weight Converter
    public static boolean weightConverter() {
        double kg = 70;
        double lbs = kg * 2.20462;
        System.out.println(kg + " kg = " + lbs + " lbs");
        return true;
    }

    // 5. Temperature Converter
    public static boolean temperatureConverter() {
        double celsius = 25;
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + "°C = " + fahrenheit + "°F");
        return true;
    }

    // 6. Calculator
    public static boolean calculator() {
        double a = 10, b = 5;
        System.out.println("Calculator: " + a + " + " + b + " = " + (a+b));
        System.out.println("Calculator: " + a + " - " + b + " = " + (a-b));
        System.out.println("Calculator: " + a + " * " + b + " = " + (a*b));
        System.out.println("Calculator: " + a + " / " + b + " = " + (a/b));
        return true;
    }

    // 7. Number Guessing Game
    public static boolean numberGuessingGame() {
        int number = (int)(Math.random()*10)+1;
        int guess = 5; // demo guess
        System.out.println("Number Guessing Game: guessed " + guess + ", actual " + number);
        return true;
    }

    // 8. Banking
    public static boolean banking() {
        double balance = 500;
        double deposit = 200;
        balance += deposit;
        System.out.println("Banking: Balance after deposit = $" + balance);
        return true;
    }

    // 9. Dice Roller
    public static boolean diceRoller() {
        int roll = (int)(Math.random()*6)+1;
        System.out.println("Dice Roller: rolled " + roll);
        return true;
    }

    // 10. Quiz Game
    public static boolean quizGame() {
        String question = "What is 2+2?";
        int answer = 4;
        System.out.println("Quiz Game: " + question + " Answer = " + answer);
        return true;
    }

    // 11. Rock Paper Scissors
    public static boolean rockPaperScissors() {
        String[] options = {"rock","paper","scissors"};
        String user = "rock";
        String comp = options[new Random().nextInt(3)];
        System.out.println("Rock Paper Scissors: user=" + user + ", comp=" + comp);
        return true;
    }

    // 12. Slot Machine
    public static boolean slotMachine() {
        String[] slots = {"🍒","🍋","🔔"};
        Random rand = new Random();
        String s1 = slots[rand.nextInt(3)];
        String s2 = slots[rand.nextInt(3)];
        String s3 = slots[rand.nextInt(3)];
        System.out.println("Slot Machine: " + s1 + " " + s2 + " " + s3);
        return true;
    }

    // 13. Music Player (stub)
    public static boolean musicPlayer() {
        System.out.println("Music Player: Playing demo track...");
        return true;
    }

    // 14. Hangman Game (stub)
    public static boolean hangmanGame() {
        String word = "java";
        String guess = "j";
        System.out.println("Hangman: word=" + word + ", guess=" + guess);
        return true;
    }

    // 15. Countdown Timer
    public static boolean countdownTimer() {
        for(int i=5;i>=0;i--) {
            System.out.println("Countdown: " + i);
            try { Thread.sleep(500); } catch(Exception e){}
        }
        System.out.println("Countdown finished!");
        return true;
    }

    // 16. Alarm Clock (stub)
    public static boolean alarmClock() {
        System.out.println("Alarm Clock: Ring! Ring!");
        return true;
    }
}
