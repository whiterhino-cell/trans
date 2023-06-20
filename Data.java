package assignment1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Data {
    public static ArrayList<HashMap<String, String>> getJsonData(){
        ArrayList<HashMap<String, String>> list = new ArrayList<>();

        list.add(new HashMap<String, String>( Map.of("city", "Bangalore", "zipcode", "560066", "isp", "Jio")));
        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
        list.add(new HashMap<String, String>( Map.of("city", "Ranchi", "zipcode", "835219", "isp", "Airtel")));
        list.add(new HashMap<String, String>( Map.of("city", "Ranchi", "zipcode", "834001", "isp", "BSNL")));
        list.add(new HashMap<String, String>( Map.of("city", "Delhi", "zipcode", "110001", "isp", "Vodafone")));
        list.add(new HashMap<String, String>( Map.of("city", "Delhi", "zipcode", "110004", "isp", "Jio")));

        list.add(new HashMap<String, String>( Map.of("city", "Bangalore", "zipcode", "560001", "isp", "Airtel")));


        //        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
//        list.add(new HashMap<String, String>( Map.of("city", "Hyderabad", "zipcode", "500001", "isp", "Jio")));
        return list;
    }
}
