import java.util.Scanner;

public class Conditionals
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String name;
        String trash;

        int age = 19;
        int favNum = 0;

        boolean done = false;
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
        */
        do
        {

            System.out.print("Enter your age: ");
            if(in.hasNextInt())
            {
                age = in.nextInt();
                in.nextLine();  // clear the keyboard buffer
                System.out.println("You said your age is " + age);
                done = true;
            }
            else    // dont have number
            {
                trash = in.nextLine();
                System.out.println("You must enter a valid number not " + trash);

        }
    }while (!done);    //do while not done. done is false. !done is true.
}
