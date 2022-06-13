package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class generateHashMap {

    public void generateHashMap() {
        // INSTANTIATE NEW HASHMAP
        HashMap<String, Double> emp = new HashMap<>();

        // PUT KEY/VALUE ELEMENTS IN THE MAP
        emp.put("Albedo", 6000.00);
        emp.put("Raven", 6500.00);
        emp.put("Abraxxas", 5500.00);
        emp.put("Victoria", 10000.00);

        // SET THE ELEMENTS IN THE MAP
        Set set = emp.entrySet();

        // GET AN ITERATOR
        // has additional methods to loop through the hashmap
        Iterator i = set.iterator();

        while(i.hasNext()) {
            Map.Entry me = (Map.Entry) i .next();

            System.out.print(me.getKey() + ": ");
            System.out.print(me.getValue());
            System.out.println();
        }
    }
}
