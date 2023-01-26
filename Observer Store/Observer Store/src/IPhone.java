import java.util.ArrayList;

public class IPhone implements Subject{

    private ArrayList observers;
    private int modeloIPhone;
    
    public IPhone (int modelo){
        observers = new ArrayList();
        modeloIPhone = modelo;
    }
    
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void remove(Observer o) {
        int i = observers.indexOf(o);
        if (i >=0){
            observers.remove (i);
        }
    }

    public void notifyObservers() {
        for (int i=0; i < observers.size(); i++){
            Observer observer = (Observer) observers.get(i);
            observer.update(modeloIPhone);
        }
    }
    
    public void modelChanged (){
        notifyObservers();
    }
    
    public void setModel (int modeloIPhone){
        this.modeloIPhone = modeloIPhone;
        
        
        modelChanged();
    }
    
}