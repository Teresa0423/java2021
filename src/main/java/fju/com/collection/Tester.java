package fju.com.collection;

import fju.com.test.Box1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Tester {
    public static void main(String[] args){
        int[] number = new int[3];
        number[0] = 3;
        ArrayList List = new ArrayList();
        List.add("Teresa");
        Integer m = new Integer(123);

        List.add(123);

        List.add(123);
        Box1 box = new Box1();
        List.add(box);
    }
}
