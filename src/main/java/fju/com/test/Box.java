package fju.com.test;

public class Box {
    String mame;
    int lenght;
    int width;
    int height;
    int price;

    public boolean validate(int a , int b, int c){
        if (lenght >= a && width >= b && height >= c){
            return true;
        }else return false;
    }
}
