public class App {
  
	public static void main(String[] args) {
		IPhone iPhone = new IPhone(13);
	
	Cliente1 cliente1 = new Cliente1(iPhone);
    Cliente2 cliente2 = new Cliente2(iPhone);
    Cliente3 cliente3 = new Cliente3(iPhone);

     iPhone.setModel (12);
     iPhone.setModel (14);
		
	}
}
