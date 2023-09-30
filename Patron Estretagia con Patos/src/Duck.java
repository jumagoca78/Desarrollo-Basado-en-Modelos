public class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    Display display;

    public Duck() {
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void display() {
        display.display();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void setDisplay(Display d) {
        display = d;
    }
}
