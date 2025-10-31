package Boas_Praticas;
import java.util.Scanner;

public class Ex03 {
    private Scanner scanner = new Scanner(System.in); // leitor criado
    private int num; // variavel inteira criada

    public Ex03(){
        System.out.println("Programa que diz se o número digitado é PAR ou IMPAR !");
        System.out.println("Digite um número : ");
        num = scanner.nextInt();
        scanner.nextLine(); // para deixar um espaço da resposta para o resultado !

    }
    public void exibir(){
        if(num % 2 == 0){
            System.out.println(num + " É PAR ! ");
        }else{
            System.out.println(num + " É IMPAR ! ");
        }
    }
    public static void main(String[]args){
        Ex03 teste_ex = new Ex03();

        teste_ex.exibir();
    }
}
