package praticas;

import java.util.Scanner;
public class Teste01 {

    public static void main(String[]args){
        Pessoa meu = new Pessoa();
        System.out.println("Primeiro Passo !");
        meu.adquirirInformacoes();
        System.out.println("Segundo Passo !");
        meu.exibirDados();
    }
}

class Pessoa{
    Scanner leitor = new Scanner(System.in);
    String nome;
    int idade;
    String profissao;
    double salario;
    String tempoExperiencia;

    void adquirirInformacoes(){
        System.out.println("Cadastrar Informações Pessoais");
        System.out.print("Nome :"); nome = leitor.nextLine();
        System.out.print("IDADE :");idade = leitor.nextInt();
        leitor.nextLine();
        System.out.print("PROFISSÃO :");profissao = leitor.nextLine();
        System.out.println("SALÁRIO R$:"); salario = leitor.nextDouble();
        leitor.nextLine();
        System.out.println("TEMPO DE EXPERIÊNCIA"); tempoExperiencia = leitor.nextLine();
        //
        System.out.println("Obrigado " + nome + " ,já fizemos a colete de seus dados para deixar no nosso sistema !");
    }
    void exibirDados(){
        System.out.println("INFORMAÇÕES DO CLIENTE :" + nome);
        System.out.println("====================================");
        System.out.println("IDADE : " + idade + " anos");
        System.out.println("PROFISSÃO :" + profissao);
        System.out.println("SALÁRIO : R$" + salario);
        System.out.println("TEMPO DE EXPERIÊNCIA :" + tempoExperiencia);
        System.out.println("====================================");
    }
}
