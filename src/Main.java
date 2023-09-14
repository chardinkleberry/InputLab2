import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int intOne;
        float floatOne;

        System.out.print("Enter your age :: ");
        intOne = keyboard.nextInt();

        System.out.print("What is 5 / 2?  :: ");
        floatOne = keyboard.nextFloat();

        System.out.println();
        System.out.print("####################\n" +
                         "####################\n");
        System.out.println("Your birthday is = " + intOne );
        System.out.print("####################\n" +
                         "####################\n");
        System.out.println("Your answer = " + floatOne );
        System.out.print("####################\n" +
                         "####################\n");






    }
}