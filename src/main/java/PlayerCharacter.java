

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PlayerCharacter {
    private static  int x = 0;
    private static int y = 0;
    public static void main(String[] args) {
        PlayerCharacter pc = new PlayerCharacter();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Willkommen beim 2D-Spielbrett!");
        System.out.println("Steuere deine Figur mit W (hoch), A (links), S (runter), D (rechts). Tippe 'exit' zum Beenden.");

        while (true) {
            System.out.print("Eingabe:  ");
            String input = scanner.nextLine().toUpperCase();

            if (input.equals("EXIT")) {
                System.out.println("Spiel beendet.");
                break;
            }

            int[] position = pc.move(input);

            System.out.printf("Aktuelle Position: x = %d, y = %d\n", position[0], position[1]);
        }

        scanner.close();

    }
    public static int getX(){
        return x;
    }
    public static int getY(){
        return y;
    }
    public static void intitial(){
        x = 0;
        y = 0;
    }
    public int[] move(String direction) {

        switch (direction) {
            case "W":
                y++;
                break;
            case "S":
                y--;
                break;
            case "D":
                x++;
                break;
            case "A":
                x--;
                break;
            default:
                // invalid input: do nothing or throw exception (depending on requirements)
                break;
        }
        return new int[]{x, y};
    }
}