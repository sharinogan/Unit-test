import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

class Start {
    public static void main(String[] data) {       
        
        Date p = new Date("2022/05/16");
        Date q = new Date("2022/06/01");
        Date r = new Date("2022/01/01");
        
        int c = p.compareTo(r);
        System.out.println(c);        // positive value
    }
}