package Collections.Treemap;
import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        TreeMap<Integer, String> tmap =
                new TreeMap<Integer, String>();

        tmap.put(1, "Data1");
        tmap.put(23, "Data2");
        tmap.put(70, "Data3");
        tmap.put(4, "Data4");
        tmap.put(2, "Data5");

        Set<Map.Entry<Integer, String>> set = tmap.entrySet();
        for (Map.Entry<Integer, String> mentry : set) {
            System.out.println( mentry.getKey() + "," + mentry.getValue());
        }



    }
}
