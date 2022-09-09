import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Izvelies vienu: Akmens, Skeres, Papirits");
            String speletajs = scan.nextLine().toLowerCase();
            String[] elements = {"akmens", "skeres", "papirits"};
            String dators = elements[new Random().nextInt(elements.length)];
            System.out.println("Datora izvele -" + dators);





                if (speletajs.equals(dators)) {
                    System.out.println("Neizskirts!");
                } else if (speletajs.equals("akmens")) {
                    System.out.println(dators.equals("papirits") ? "Sakaave!" : "Uzvara!");
                } else if (speletajs.equals("skeres")) {
                    System.out.println(dators.equals("akmens") ? "Sakaave!" : "Uzvara!");
                } else if (speletajs.equals("papirits")) {
                    System.out.println(dators.equals("skeres") ? "Sakaave!" : "Uzvara!");
                } else System.out.println("Kluda, megini velreiz");
        }
    }
}