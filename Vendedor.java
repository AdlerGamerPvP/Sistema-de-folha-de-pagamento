public class Vendedor extends Funcionario {
    private float comissaoValor = 10;
    private int totalVendas;
    private double comissao;


    public void calcularBonificacao() {
        comissao = totalVendas * comissaoValor;
        bonificacao = salario * 0.05 + comissao;
    }

    @Override
    public void calcularRemuneracaoTotal(){
    comissao = totalVendas * comissaoValor;
    remuneracao = salario + bonificacao + comissao;
    }

    public Vendedor(String nome, String cpf, String cargo, double salario, int totalVendas) {
        super(nome, cpf, cargo, salario);
        this.totalVendas = totalVendas;
    }

    @Override
    public String toString() {
         return "Funcionário: " + nome +
                "\nCargo: " + cargo +
                "\nSalário: " + salario +
                "\nBonificação: " + bonificacao +
                "\nComissão: " + comissao +
                "\nRemuneração total: " + remuneracao +
                "\nTotal de vendas:" + totalVendas +
                "\n------------------------------------------";
    }
}
