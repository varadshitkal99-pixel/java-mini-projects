
import java.util.Random;
import java.util.Scanner;

public class sps {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices= {"rock","paper","scissors"};
        String playerchoice;
        String computerchoice;
        String play = "";

        do {
            System.out.println("enter your choice (Rock,paper,Scissors)");
            playerchoice = scanner.nextLine().toLowerCase();

            if(!playerchoice.equals("rock")&&
                    !playerchoice.equals("paper")&&
                    !playerchoice.equals("scissors")){
                System.out.println("Invalid choice");
                continue;
            }


            computerchoice = choices[random.nextInt(3)];
            System.out.println("Computer choice "+computerchoice);

            if(playerchoice.equals(computerchoice)){
                System.out.println("Its a tie");
            }  else if ((playerchoice.equals("scissors") && computerchoice.equals("paper")) ||
                    (playerchoice.equals("paper") && computerchoice.equals("rock")) ||
                    (playerchoice.equals("rock") && computerchoice.equals("scissors"))){
                System.out.println("you won!!!");
            }else{
                System.out.println("you lost");
            }
        System.out.println("do you want to quit(YES/NO)");
        play = scanner.nextLine().toLowerCase();

        }while (!play.equals("yes"));

        scanner.close();

    }
}
