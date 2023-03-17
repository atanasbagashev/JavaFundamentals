package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class PrintPartOfAsciiTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //входни данни - начален ascii код и краен такъв
        //всеки аски код от началния до крайния
        //изпринтирай симовла, отговарящ на кода
        int startCode=Integer.parseInt(scanner.nextLine());
        int endCode=Integer.parseInt(scanner.nextLine());

        for (int code = startCode; code < endCode; code++) {
            System.out.print((char)code +" ");
            
        }



    }
}
