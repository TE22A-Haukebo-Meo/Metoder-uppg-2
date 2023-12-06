import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tb = new Scanner(System.in);
        System.out.println("Droppa bokstav omedelbums!");
        String Rawr = tb.nextLine();
        BiggE(Rawr);
    }
    static void BiggE(String Rawr){
        System.out.println(Rawr.toUpperCase());
    }
}
