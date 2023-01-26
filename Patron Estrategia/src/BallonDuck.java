public class BallonDuck extends Duck{
 
    public BallonDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithBallon();
    }

    public void display() {
        System.out.println("I'm a duck that flies with a ballon");
    }

}
