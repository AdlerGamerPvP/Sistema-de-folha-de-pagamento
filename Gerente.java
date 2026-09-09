public class Gerente extends Funcionario {

    public void calcularBonificacao() {
        bonificacao = salario * 0.2;
    }
    public void calcularRemuneracaoTotal(){
        remuneracao = salario + bonificacao;
    }

    public Gerente(String nome, String cpf, String cargo, double salario) {
        super(nome, cpf, cargo, salario);
    }
}
