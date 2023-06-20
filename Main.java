package assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        try {

        }catch (Exception e){
            System.out.println(e);
        }

        ArrayList<HashMap<String, String>> list = Data.getJsonData();
        printJSON(list);

        Collections.sort(list, new Main.MapComparator());
        printJSON(list);
    }

    private static void printJSON(ArrayList<HashMap<String, String>> list) {
        System.out.println(list);
        System.out.println("[");
        for (HashMap<String, String> map : list) {
            System.out.println("\t"+map);
        }
        System.out.println("]");
    }

    // Inner class for custom Comparator
    static class MapComparator implements Comparator<HashMap<String, String>> {
        @Override
        public int compare(HashMap<String, String> map1, HashMap<String, String> map2) {
            String stateName1 = map1.get("city");
            String stateName2 = map2.get("city");

            int result = stateName1.compareTo(stateName2);

            if (result == 0) {
                String zipcode1 = (String) map1.get("zipcode");
                String zipcode2 = (String) map2.get("zipcode");
                result = zipcode1.compareTo(zipcode2);

                if (result == 0) {
                    String isp1 = (String) map1.get("isp");
                    String isp2 = (String) map2.get("isp");
                    result = isp1.compareTo(isp2);
                }
            }
            return result;
        }
    }

}
