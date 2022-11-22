package problem2;
import java.util.Scanner;

public class SubStrings {
        public static void main(String args[])
        {
            String string, sub;
            int i, c, length;

            Scanner input = new Scanner(System.in);
            System.out.println("Enter a string to print all its substrings");
            string  = input.nextLine();
            input.close();

            length = string.length();
            System.out.println("Substrings are: \n");

            for (c = 0; c < length; c++)
            {
                for(i = 1; i <= length - c; i++)
                {
                    sub = string.substring(c, c+i);
                    System.out.println(sub);
                }
            }
        }
    }

