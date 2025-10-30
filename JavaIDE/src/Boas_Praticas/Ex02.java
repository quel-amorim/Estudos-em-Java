package Boas_Praticas;
import java.util.Scanner;
import java.util.ArrayList;

public class Ex02 {
    private ArrayList<String> pessoas = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void CriaPessoas(){
        System.out.println("Nome Completo ? ");
        String nome = scanner.nextLine();

        System.out.println("Idade ? ");
        int idade = Integer.parseInt(scanner.nextLine());

        String user = nome  + " , " + idade;

        pessoas.add(user);

        System.out.println("Criado ! ");
    }

    public void exibir(){
        System.out.println(pessoas);
    }
    public static void main(String[]args){
        Ex02 rodarteste = new Ex02();

        rodarteste.CriaPessoas();
        System.out.println("Formatação ! ");
        rodarteste.exibir();
    }
}
