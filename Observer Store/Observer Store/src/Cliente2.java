import java.util.*;

public class Cliente2 implements Observer {
    private int modeloIPhone;
    private IPhone iPhone;

    public Cliente2(IPhone i) {
        this.iPhone = i;
        iPhone.registerObserver(this);
        modeloIPhone = 11;
    }

    public void update(int m) {
        modeloIPhone = m;
        sendEmail();
    }

    public void sendEmail() {
        System.out.println("Email a cliente 2: Ya tenemos el IPhone " + modeloIPhone);
    }
}
