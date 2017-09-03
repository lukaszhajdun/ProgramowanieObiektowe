package GraKamienPapierNozyce;

import java.util.Random;
import java.util.Scanner;

public class KamienPapierNozyce {

    public enum GameMoves{PAPIER, KAMIEN, NOZYCE, EXIT}
    public enum GameResults {WYGRANA, REMIS, PRZEGRANA}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GameMoves playerMove = GameMoves.KAMIEN;
        GameMoves cpuMove = GameMoves.KAMIEN;

        int remisy = 0;
        int liczbaGier = 0;
        int zwyciestwa = 0;
        int porazki = 0;

        System.out.printf("Witaj w grze KamieńPapierNożyce:\n\n");
        System.out.printf("Zasady gry:\n\n");
        System.out.println("Kamien wciśnij k");
        System.out.println("Papier wciśnij p");
        System.out.println("Nożyce wciśnij n");
        System.out.println("Koniec wciśnij q");
        System.out.println();

        while (!playerMove.equals(GameMoves.EXIT)) {

            System.out.printf("Kamień? Papier? Nożyce?\n");

            String decision = sc.nextLine();
            switch (decision.toLowerCase()){
                case "n":
                    playerMove = GameMoves.NOZYCE;
                    System.out.printf("Wybrałeś nożyce\n");
                    break;
                case "k":
                    playerMove = GameMoves.KAMIEN;
                    System.out.printf("Wybrałeś kamień\n");
                    break;
                case "p":
                    playerMove = GameMoves.PAPIER;
                    System.out.printf("Wybrałeś papier\n");
                    break;
                case "q":
                    playerMove = GameMoves.EXIT;
                    System.out.println("Zakończyłeś grę\n");
                    break;
                default:
                    continue;
            }

            Random rand = new Random();

            switch (rand.nextInt(3)){
                case 0:
                    cpuMove = GameMoves.NOZYCE;
                    System.out.printf("Komputer wybrał nożyce\n\n");
                    break;
                case 1:
                    cpuMove = GameMoves.KAMIEN;
                    System.out.printf("Komputer wybrał kamień\n\n");
                    break;
                case 2:
                    cpuMove = GameMoves.PAPIER;
                    System.out.printf("Komputer wybrał papier\n\n");
                    break;
            }

            GameResults result = rules(playerMove, cpuMove);

            if(result.equals(GameResults.REMIS))
                remisy++;
            else if(result.equals(GameResults.WYGRANA))
                zwyciestwa++;
            else
                porazki++;


            liczbaGier++;
        }

        System.out.println();

        System.out.println();
        System.out.printf(
                "Wziąłeś udział w %d potyczkach.\n" +
                "Wygrałeś: %d razy (%.2f).\n" +
                "Przegrałeś: %d razy (%.2f)\n" +
                "Zremisowałeś %d razy (%.2f)\n",
                liczbaGier, zwyciestwa, (double)zwyciestwa/liczbaGier*100,
                porazki, (double)porazki/liczbaGier*100,
                remisy, (double)remisy/liczbaGier*100);
        System.out.println("\n Twórca gry życzy Ci miłego dnia");

    }


    public static GameResults rules(GameMoves humanMove, GameMoves cpuMove) {

        if (humanMove.equals(GameMoves.KAMIEN) && cpuMove.equals(GameMoves.KAMIEN))
            return GameResults.REMIS;
        if (humanMove.equals(GameMoves.KAMIEN) && cpuMove.equals(GameMoves.PAPIER))
            return GameResults.PRZEGRANA;
        if (humanMove.equals(GameMoves.KAMIEN) && cpuMove.equals(GameMoves.NOZYCE))
            return GameResults.WYGRANA;

        if (humanMove.equals(GameMoves.PAPIER) && cpuMove.equals(GameMoves.PAPIER))
            return GameResults.REMIS;
        if (humanMove.equals(GameMoves.PAPIER) && cpuMove.equals(GameMoves.NOZYCE))
            return GameResults.PRZEGRANA;
        if (humanMove.equals(GameMoves.PAPIER) && cpuMove.equals(GameMoves.KAMIEN))
            return GameResults.WYGRANA;

        if (humanMove.equals(GameMoves.NOZYCE) && cpuMove.equals(GameMoves.NOZYCE))
            return GameResults.REMIS;
        if (humanMove.equals(GameMoves.NOZYCE) && cpuMove.equals(GameMoves.KAMIEN))
            return GameResults.PRZEGRANA;
        if (humanMove.equals(GameMoves.NOZYCE) && cpuMove.equals(GameMoves.PAPIER))
            return GameResults.WYGRANA;

        return GameResults.REMIS;
    }
}
