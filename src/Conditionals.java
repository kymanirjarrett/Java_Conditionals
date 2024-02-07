import java.sql.SQLOutput;
import java.util.Scanner;

public class Conditionals
{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String name;
        String trash;
        int age = 19;
        int favNum = 0; // 1 to 10 only
        double salary = 0;
        boolean done = false;
        String playerA = "";
        String playerB = "";
/*
        if(age >= 21)
        {
            System.out.println("You get a wristband!");
        }
        else
        {
            System.out.println("You are too young. Come back later.");
        }

        System.out.print("Enter your name: ");
        name = in.nextLine();

        System.out.println("You said your name is " + name);

        System.out.print("Enter your age: ");
        if(in.hasNextInt())
        {
            age = in.nextInt();
            in.nextLine();  // clear the keyboard buffer
            System.out.println("You said your age is " + age);
        }
        else    // dont have number
        {
            trash = in.nextLine();
            System.out.println("You must enter a valid number not " + trash);
        }

        do {

            System.out.print("Enter your age: ");

            if (in.hasNextInt())
            {
                age = in.nextInt();
                in.nextLine();  // clear the keyboard buffer
                System.out.println("You said your age is " + age);
                done = true;
            } else    // dont have number
            {
                trash = in.nextLine();
                System.out.println("You must enter a valid number not " + trash);

            }
        } while (!done);    //do while not done. done is false. !done is true.


        done = false; //reset the loop control variable for each input loop

        do {

            System.out.print("Enter your salary: ");

            if (in.hasNextDouble())
            {
                salary = in.nextDouble();
                in.nextLine();  // clear the keyboard buffer
                System.out.println("You said your salary is " + salary);
                done = true;
            } else    // dont have number
            {
                trash = in.nextLine();
                System.out.println("You must enter a valid number not " + trash);
            }
        } while (!done);    //do while not done. done is false. !done is true.
        */

        done = false;

        do {

            // Lets get a R P S game move

            System.out.print("Enter your move [RPS] ");
            playerA = in.nextLine();

            if (playerA.equalsIgnoreCase("R"))
            {
                System.out.println("PlayerA chose Rock");
                done = true;
            }
            else if (playerA.equalsIgnoreCase("P"))
            {
                System.out.println("PlayerA chose paper");
                done = true;
            }
            else if (playerA.equalsIgnoreCase("S"))
            {
                System.out.println("PlayerA chose scissors");
                done = true;
            }
            else
                System.out.println("You must enter [RPS] not " + playerA);

        }while(!done);

        playerA = playerA.toUpperCase();
        switch (playerA)
        {
            case"R":
                System.out.println("PlayerA move is ROCK");
                break;
            case "P":
                System.out.println("playerA move is PAPER");
                break;
            case "S":
                System.out.println("playerA move is SCISSORS");
                break;
            default:
                System.out.println("PlayerA move is illegal: " + playerA);
        }
    }
}
