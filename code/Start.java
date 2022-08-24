import java.util.Arrays;
import java.util.Comparator;

class Start {
    public static void main(String[] data) {
        City[] all = {
                new City("Pattaya",       5000),
                new City("Banglamung",    2000),
                new City("Lamchabang",    3000),
                new City("Sriracha",      4000),
        };
        
        // Write code to sort by population
        Arrays.sort(all, (a, b) ->
                              a.population() - b.population());
        for (int i = 0; i < all.length; i++) {
            System.out.println(all[i].population());
        }
    }
}

record City(String name, int population) {  }