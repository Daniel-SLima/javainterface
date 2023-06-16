
package statics;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Lumar Neves", LocalDate.of(2000, 4, 15), 4590.33);
        
        System.out.println(pessoa.toString());
    }
}
