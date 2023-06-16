
package animais;

public class Gato implements Animal{

    @Override
    public void emitirSom() {
        System.out.println("Som: Miau miau");
    }

    @Override
    public void comer() {
        System.out.println("Comida: Whiskas");
    }
    
}
