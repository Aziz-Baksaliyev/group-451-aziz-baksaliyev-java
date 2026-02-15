package homework_12;

public class Guitarist extends Musician {
	
 public Guitarist(String name, int exp) {
     super(name, exp);
 }

 @Override
 public void playInstrument() {
     System.out.println(name + " играет крутое соло на гитаре!");
 }
}
