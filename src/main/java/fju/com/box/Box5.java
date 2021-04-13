package fju.com.box;

public class Box5 extends Box {
    public Box5(){
        lenght = 10;
        width = 20;
        height = 20;
    }
    @Override
    public String getName(){
        return "Box5";
    }
    @Override
    public int getPrice(){
        return 90;
    }
}
