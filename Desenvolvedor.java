public class Desenvolvedor extends Funcionario {

    public void calcularBonificacao() {
        bonificacao = salario * 0.1;
    }

    public void calcularRemuneracaoTotal(){
        remuneracao = salario + bonificacao;
    }



    public Desenvolvedor(String nome, String cpf, String cargo, double salario) {
        super(nome, cpf, cargo, salario);
    }
}
