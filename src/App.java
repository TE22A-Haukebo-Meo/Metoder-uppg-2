import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tb = new Scanner(System.in);
        System.out.println("Droppa ett tal under 100");
        int tal = tb.nextInt();
        System.out.println(ärPrimtal(tal));
    }
    
    public static boolean ärPrimtal(int tal){
        for(int i = 2; i < tal; i++){
            if(tal % i == 0){
                return false;
            }
            if (i==tal) {
                continue;
            }
        }
        return true; 
    }
}
