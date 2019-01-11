package samples.objects.pokemon;

import java.util.Scanner;

public class PokemonMain {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Pokemon pokemon1 = new Pokemon();
        pokemon1.setName("Pikachu");

        Move pikachuMove = new Move("Thundershock", 50);
        pokemon1.setMove(pikachuMove);
        pokemon1.setHp(100);

        Pokemon pokemon2 = new Pokemon();
        pokemon2.setName("Charmander");


        pokemon2.setMove(new Move("flamethrower", 20));
        pokemon2.setHp(150);

        Pokemon pokemon3 = new Pokemon("Squirtle", new Move("Surf", 15), 150);

        System.out.printf("You are controlling %s\n", pokemon1.getName());

        boolean enemiesAreAlive = true;
        while (enemiesAreAlive) {
            System.out.printf("Pick who you attack: 1 - %s; 2 - %s\n", pokemon2.getName(), pokemon3.getName());
            int attackChoice = scanner.nextInt();
            if (attackChoice == 1) {
                System.out.printf("%s used %s on %s\n", pokemon1.getName(), pokemon1.getMove(), pokemon2.getName());
                int newHp = pokemon2.getHp() - 50;
                pokemon2.setHp(newHp);
                System.out.printf("%s now has %d hp\n", pokemon2.getName(), newHp);
            } else {
                int newHp = pokemon3.getHp() - 50;
                pokemon3.setHp(newHp);
                System.out.printf("%s used %s on %s\n", pokemon1.getName(), pokemon1.getMove(), pokemon3.getName());
                System.out.printf("%s now has %d hp\n", pokemon3.getName(), newHp);
            }

            enemiesAreAlive = pokemon2.getHp() > 0 && pokemon3.getHp() > 0;
        }

        System.out.println("Congrats you win");
    }

}
