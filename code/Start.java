import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

class Start {
    public static void main(String[] data) {       
        
        CPU p = new CPU(2.5);
        CPU q = new CPU(3.1);
        CPU r = new CPU(2.2);
        System.out.println( p.compareTo(q) );   // negative
        System.out.println( p.compareTo(r) );   // positive
        
        CPU[] all = { p, q, r };
        Arrays.sort(all);
        for (int i = 0; i < all.length; i++) {
            System.out.println(all[i].speed);
        }
    }
}

class CPU implements Comparable {
    
    double speed;
    
    CPU(double mhz) {
        speed = mhz;
    }
    
    @Override
    public int compareTo(Object o) {
        CPU x = (CPU)o;
        if(this.speed < x.speed) return -1;
        if(this.speed > x.speed) return +1;
        return 0;
    }
}