package fju.com.test;

public class Box {
        int lenght;
        int width;
        int height;
    public boolean validate(int a , int b, int c){
        if (lenght <= a && width <= b && height <= c){
            return true;
        }else return false;
    }
}
