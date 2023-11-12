package downUpCast;

public class Main {
    public static void main(String[] args) {

    
        Mammoth instanceUp = new Elephant();
        instanceUp.eat();
        instanceUp.sleep();

//        Mammoth instanceDown = (Mammoth) instanceUp;
//        instanceDown.eat();
//        instanceDown.sleep();
    }
}
