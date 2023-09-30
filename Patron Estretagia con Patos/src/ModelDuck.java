public class ModelDuck extends Duck implements Display{

    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }    

    public void display() {
        System.out.println("I'm a model duck");
    }
}
