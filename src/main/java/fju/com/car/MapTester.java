package fju.com.car;

import java.util.HashMap;
import java.util.Map;

public class MapTester {
    public static void main(String[] args){
        Map<String , String> students = new HashMap<>();
        students.put("001","Teresa Wnag");
        students.put("002","Teresa");
        students.put("003","T");
        String name = students.get("002");
        System.out.println(name);

    }
}
