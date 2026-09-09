abstract class Funcionario {
    protected String nome;
    protected String cpf;
    protected String cargo;
    protected double salario;
    protected double bonificacao;
    protected double remuneracao;



    public abstract void calcularBonificacao();
    public void calcularRemuneracaoTotal(){
        remuneracao = salario + bonificacao;
    }


    @Override
    public String toString() {
        return  "Funcionário: " + nome +
                "\nCargo: " + cargo +
                "\nSalário: " + salario +
                "\nBonificação: " + bonificacao +
                "\nRemuneração total: " + remuneracao +
                "\n------------------------------------------";
    }


    public Funcionario(String nome, String cpf, String cargo, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
    }
}
