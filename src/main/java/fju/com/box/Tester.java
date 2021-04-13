package fju.com.box;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Box3 box3 = new Box3();
        Box5 box5 = new Box5();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter box's lenght: ");
        int lenght = Integer.parseInt(scanner.next());
        System.out.println("Please enter box's width: ");
        int width = Integer.parseInt(scanner.next());
        System.out.println("Please enter box's height: ");
        int height = Integer.parseInt(scanner.next());
        System.out.println("lenght: " + lenght + ",width:" + width + ",height:" + height);
        if (box3.validate(lenght,width,height)){
            System.out.println(box3.getName() + "\t" + box3.getPrice());
        }else if(box5.validate(lenght,width,height)){
            System.out.println(box5.getName() + "\t" + box5.getPrice());
        }
    }
}
