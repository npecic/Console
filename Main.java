import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Console console = System.console();

        System.out.println("Unesite prvi Broj");
        int x = Integer.parseInt(console.readLine());

        System.out.println("Unesite drugi broj");
        int y = Integer.parseInt(console.readLine());

        System.out.println("Rezultat je  " + (x + y));
    }
}