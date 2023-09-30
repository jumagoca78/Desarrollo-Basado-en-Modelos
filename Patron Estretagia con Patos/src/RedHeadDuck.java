public class RedHeadDuck extends Duck implements Display{
    public RedHeadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real RedHead duck");
    }
}
