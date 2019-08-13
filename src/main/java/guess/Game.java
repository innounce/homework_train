package guess;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int secret = random.nextInt(10)+1;
            System.out.print("secret="+secret);

        int num = 0;
        while (secret != num ){
            System.out.print("Please enter a number：");
            num = scanner.nextInt();
            if(num > secret)
                System.out.println("Smaller");
            else if (num < secret)
                System.out.println("Bigger");
            else
                System.out.println("great!!");

        }
    }
}
