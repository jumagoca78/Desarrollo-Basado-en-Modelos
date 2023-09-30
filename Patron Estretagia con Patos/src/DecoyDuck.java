public class DecoyDuck extends Duck implements Display{

    public DecoyDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    public void display() {
        System.out.println("I'm a duck Decoy");
    }
}
