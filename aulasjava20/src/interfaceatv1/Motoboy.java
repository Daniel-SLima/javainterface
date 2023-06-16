
package interfaceatv1;

import java.time.LocalDate;

public class Motoboy extends Funcionario{
    private String placaDaMoto;

    @Override
    public String toString() {
        return "\n\nMotoboy: "+ super.toString() + "\nPlaca Da Moto: " + placaDaMoto;
    }

    
    
    public Motoboy(String placaDaMoto, String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataNascimento, LocalDate dataAdmissao) {
        super(nome, cpf, rg, genero, salarioBase, dataNascimento, dataAdmissao);
        this.placaDaMoto = placaDaMoto;
    }

    public String getPlacaDaMoto() {
        return placaDaMoto;
    }

    public void setPlacaDaMoto(String placaDaMoto) {
        this.placaDaMoto = placaDaMoto;
    }

    @Override
    public double getSalarioFinal() {
    return salarioBase;    
    }
    
    
    
}
