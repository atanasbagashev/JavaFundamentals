package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // входни данни power, distance, factor
        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int factor  = Integer.parseInt(scanner.nextLine());

        // повтаряме
        // power -= distance -> poke (броим)
        // stop: power < distance
        // продължава: power >=  distance
        int firstPower = power;
        int countPoke = 0;
        while( power >= distance){
            power -= distance;
            countPoke++;
            if (power == firstPower / 2) {
                if (factor != 0) {
                    power = power / factor;
                }
            }
        }
        System.out.println(power);
        System.out.println(countPoke);

    }
}
