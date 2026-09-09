import static java.lang.IO.*;
import static java.util.ArrayList.*;

void main() {
    String nome,cpf,cargo = null;
    double salario = 0, totalEmpresa = 0;
    ArrayList <Funcionario> funcionarios = new ArrayList<>();
    int acao = 0 ,totalVendas = 0;



    while(acao !=3){
        acao = Integer.parseInt(readln("Escolha sua ação \n 1- Cadastrar funcionario \n 2- Mostrar funcionarios\n 3- Sair \n"));
        while(acao == 1){
            int escolha = Integer.parseInt(readln("Deseja cadastrar 1- Vendedor, 2- Gerente ou 3- Desenvolvedor \n"));
            if (escolha == 1){
                nome = readln("Digite o nome do funcionario:");
                if (nome.isEmpty()){
                    println("Nome invalido, tente novamente");
                    break;
                }
                cpf = readln("Digite o CPF do funcionario:");
                if (cpf.isEmpty()){
                    println("CPF invalido, tente novamente");
                    break;
                }
                cargo = "Vendedor";
                try{
                    salario = Double.parseDouble(readln("Digite o salario:"));
                }
                catch (NumberFormatException a){
                    println("Valor invalido, tente novamente");
                    break;
                }
                if (salario < 0){
                    println("Salario não pode ser menor que 0, tente novamente");
                    break;
                }
                try{
                   totalVendas = Integer.parseInt(readln("Digite o total de vendas neste mês: "));
                }
                catch (NumberFormatException a){
                    println("Valor invalido, tente novamente");
                    break;
                }if (totalVendas < 0){
                    println("Total de vendas não pode ser menor que 0, tente novamente");
                    break;
                }
                funcionarios.add(new Vendedor(nome, cpf, cargo, salario, totalVendas));
            }

            if(escolha == 2){
                nome = readln("Digite o nome do funcionario:");
                if (nome == null){
                    println("Nome invalido, tente novamente");
                    break;
                }
                cpf = readln("Digite o CPF do funcionario:");
                if (cpf == null){
                    println("CPF invalido, tente novamente");
                    break;
                }
                cargo = "Gerente";
                try{
                    salario = Double.parseDouble(readln("Digite o salario:"));
                }
                catch (NumberFormatException a){
                    println("Valor invalido, tente novamente");
                    break;
                }
                if (salario < 0){
                    println("Salario não pode ser menor que 0, tente novamente");
                    break;
                }
                funcionarios.add(new Gerente(nome, cpf, cargo, salario));
            }

            if (escolha == 3){
                nome = readln("Digite o nome do funcionario:");
                if (nome == null){
                    println("Nome invalido, tente novamente");
                    break;
                }
                cpf = readln("Digite o CPF do funcionario:");
                if (cpf == null){
                    println("CPF invalido, tente novamente");
                    break;
                }
                cargo = "Desenvolvedor";
                try{
                    salario = Double.parseDouble(readln("Digite o salario:"));
                }
                catch (NumberFormatException a){
                    println("Valor invalido, tente novamente");
                    break;
                }
                if (salario < 0){
                    println("Salario não pode ser menor que 0, tente novamente");
                    break;
                }
                funcionarios.add(new Desenvolvedor(nome, cpf, cargo, salario));
            }
            break;
        }
        while(acao == 2){
            for (int x = 0; x < funcionarios.size() ; x++){
                funcionarios.get(x).calcularBonificacao();
                funcionarios.get(x).calcularRemuneracaoTotal();
                println(funcionarios.get(x));
                totalEmpresa = totalEmpresa + funcionarios.get(x).remuneracao;
            }
            println("Gasto total da empresa: " + totalEmpresa);
            break;
        }
    }
    println("Volte novamente");
}

