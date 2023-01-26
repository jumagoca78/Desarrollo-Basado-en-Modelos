import java.util.*;

public class Cliente1 implements Observer {
    private int modeloIPhone;
    private IPhone iPhone;

    public Cliente1(IPhone i) {
        this.iPhone = i;
        iPhone.registerObserver(this);
        modeloIPhone = 9;
    }

    public void update(int m) {
        modeloIPhone = m;
        sendEmail();
    }

    public void sendEmail() {
        System.out.println("Email a cliente 3: Ya tenemos el IPhone " + modeloIPhone);
    }
}