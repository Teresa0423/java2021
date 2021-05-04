package fju.com.collection;

import fju.com.test.Box;
import fju.com.test.Box1;
import fju.com.test.Box2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Tester {
    public static void main(String[] args){
        int[] number = new int[3];
        number[0] = 3;
        ArrayList List= new ArrayList();
        List.add("Teresa");
        Integer n = new Integer(123);

        List.add(123);

        List.add(true);
        Box box = new Box();
        Box1 box1 = new Box1();
        List.add(box);

        String name = (String)List.get(0);

        Box1 box01 = new Box1();
        Box2 box2 = new Box2();
        ArrayList<Box> boxes = new ArrayList<Box>();
    }
}
