
import java.util.Scanner;

public class DragonCaveProject1  {
    public static void main(String[] args) {
        System.out.println("You are in a land of dragons and their are 2 caves in front of you. " +
                "One cave has a nice dragon who will share thier loot with you. The other has a dragon " +
                "that will surly devour you. Chose wisely");
        System.out.println("Chose your cave (1 or 2)?");

        Scanner inputNum = new Scanner(System.in);
        int choice = Integer.parseInt(inputNum.nextLine());
        if (choice == 1) {
            System.out.println("You enter the cave and see the dragon. The dragon tells you to come closer and take some of his treasure. " +
                    "'I have too much as it is'. You chose wisely and got the treasure. ");
        } else {
            System.out.println("You enter the cave and see the dragon. The dragon tells you to come closer and take some of his treasure. " +
                    "As you reach down he attacks and eats you whole. You chose poorly.");
        }
        inputNum.close();
        System.exit(0);
    }
}