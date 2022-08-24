import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

class Start {
    public static void main(String[] data) {       
        
        Date[] all = {
                new Date("1992/03/15"),
                new Date("1992/01/27"),
                new Date("1993/01/18"),
                new Date("1992/05/01")
        };
        
        Arrays.sort(all);
        for (int i = 0; i < all.length; i++) {
            System.out.println(all[i]);
        }
    }
}

