public class App {
    public static void main(String[] args)  {

        Duck mallard = new MallardDuck();
        mallard.showDuck();

        Duck rubberDuckie = new RubberDuck();
        rubberDuckie.showDuck();

        Duck redheadDuck = new RedHeadDuck();
        redheadDuck.showDuck();

        Duck decoyDuck = new DecoyDuck();
        decoyDuck.showDuck();

        Duck ballonDuck = new BallonDuck();
        ballonDuck.showDuck();

        ballonDuck.setFlyBehavior(new FlyWithWings());
        ballonDuck.showDuck();

    }
}
