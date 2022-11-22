package problem3;

import java.util.Scanner;

public class WordsVowelText {

        public static void main(String[] args) {
            System.out.println("Enter the line to be checked");
            Scanner input = new Scanner(System.in);
            String line = input.next();
            int vowels = 0, consonants = 0, digits = 0, spaces = 0;

            line = line.toLowerCase();
            for (int i = 0; i < line.length(); ++i) {
                char ch = line.charAt(i);

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    ++vowels;
                }
//                else if ((ch >= 'a' && ch <= 'z')) {
//                    ++consonants;
//                }

                else if (ch >= '0' && ch <= '9') {
                    ++digits;
                }
                else if (ch == ' ') {
                    ++spaces;
                }
                else{
                    ++consonants;
                }
            }

            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
            System.out.println("Digits: " + digits);
            System.out.println("White spaces: " + spaces);
        }

}
