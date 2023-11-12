package downUpCast;

public class Elephant extends Mammoth{

    @Override
    public void eat() {
        System.out.println("Elephant eats");
    }
    @Override
    public void sleep(){
        System.out.println("Elephant sleeps");
    }
}
