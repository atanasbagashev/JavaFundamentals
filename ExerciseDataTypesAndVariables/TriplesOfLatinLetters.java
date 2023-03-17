package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    char firstChar = (char) ('a' + i);
                    char secondChar = (char) ('a' + j);
                    char thirdChar = (char) ('a' + k);

                    // Inside the innermost loop, I compute the three Latin letters corresponding to the current triple of indices i, j, and k. To do this, I add the ASCII code for the letter 'a' to each index to get the ASCII code for the corresponding letter. Then, I cast the result to a char to get the actual letter.
                    System.out.printf("%c%c%c%n" ,firstChar, secondChar,thirdChar);

                }
                
            }
            
        }


                }
            }

