
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("You are in a land of dragons and their are 2 caves in front of you. " +
                "One cave has a nice dragon who will share their loot with you. The other has a dragon " +
                "that will surly devour you. Chose wisely");
        Scanner inputNum = new Scanner(System.in);
        while (true) {
            System.out.println("Chose your cave (1 or 2)?");

            try {
                int choice = Integer.parseInt(inputNum.nextLine());
                System.out.println(choose(choice));
                break;
               } catch (Exception e) {
                System.out.println("You must enter 1 or 2 for your answer!");
            }

        }
        inputNum.close();
    }

    public static String choose(int choice) {
        if (choice == 1) {
            return "You enter the cave and see the dragon. The dragon tells you to come closer and take some of his treasure. "
                            +
            "'I have too much as it is'. You chose wisely and got the treasure. ";
        } 
        return "You enter the cave and see the dragon. The dragon tells you to come closer and take some of his treasure. "
                            +
            "As you reach down he attacks and eats you whole. You chose poorly.";
    }
}