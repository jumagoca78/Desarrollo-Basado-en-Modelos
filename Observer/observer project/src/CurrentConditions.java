public class CurrentConditions implements Observer {
    private float temperature;
    private float humidity;
    private float pressure;
    Subject wd;
    
    public CurrentConditions(Subject wd) {
        this.wd = wd;
        wd.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
    
    public void display() {
        System.out.println("Current conditions: " + temperature + 
                           "F degrees and " + humidity + "% humidity"+
                           " and " + pressure + " pressure");
    }
}
    

