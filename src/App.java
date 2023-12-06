import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(ärPrimtal(100));
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
