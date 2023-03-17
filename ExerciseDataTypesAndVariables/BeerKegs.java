package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //входни данни - брой кегове
        // за всеки кег повтаряме
        //1.прочитаме данните
        //2.намираме обема
        //3.Намираме, кой е най-големия кег и го принтираме
        double maxVolume = Double.MIN_VALUE;
        String maxModelKeg = " ";
        int countKeg = Integer.parseInt(scanner.nextLine());
        for (int keg = 1; keg < countKeg; keg++) {
            String kegModel = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double volume = Math.PI * Math.pow(radius, 2) * height;

            if(maxVolume<volume){
                maxVolume=volume;
                maxModelKeg = kegModel;
            }
        }

        System.out.println(maxModelKeg);

    }
}
