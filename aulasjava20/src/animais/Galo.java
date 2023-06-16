
package animais;

public class Galo implements Animal{

    @Override
    public void emitirSom() {
        System.out.println("Som: Co Co Ri Cooooo");
    }

    @Override
    public void comer() {
        System.out.println("Comida: Milho");
    }
    
    
    
}
