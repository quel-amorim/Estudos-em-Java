package Boas_Praticas; // pegar a pasta
import java.util.Scanner; // Importando a biblioteca scanner
// Exercicio 01 - fazer tabuada !
public class ex01{
    int numero; // definido uma variavel do tipo inteiro

    public ex01(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um número para fazer a tabuada !  : ");
        numero = scanner.nextInt();
    }
    public void exibir(){
        System.out.println("Tabuada do " + numero + " ! ");
        for(int i = 0; i <= 10; i++){ // loop do 0 até 10
            System.out.println(numero + " x " + i + " = " + (numero*i));
        }
        System.out.println("Fim da tabuada ! ");
    }
    public static void main(String[]args){
        ex01 codar = new ex01();
        codar.exibir();
    }
}