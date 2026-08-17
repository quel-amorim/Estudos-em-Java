package praticas;
import java.util.Scanner;
public class calculadora {
    public static void main(){
        calculadora calc = new calculadora();
        Scanner leitor = new Scanner(System.in);
        System.out.println("Interação de perguntas os valores para realizar as operações !");
        System.out.print("1° valor :");
        float numero01 = leitor.nextFloat();
        System.out.println("");
        System.out.print("2° valor :");
        float numero02 = leitor.nextFloat();

        System.out.println("Operações registradas no programa já definido !");
    
        // Chamando as funções
        calc.somar(numero01, numero02);
        calc.diminuir(numero01, numero02);
        calc.divisao(numero01, numero02);
        calc.multiplicar(numero01, numero02);

        leitor.close();
    }

    void somar(float numero01,float numero02){
        System.out.println(numero01 + "+" + numero02 + "=" +(numero01+numero02));
    }
    void diminuir(float numero01,float numero02){
        System.out.println(numero01 + "-" + numero02 + "=" +(numero01-numero02));
    }
    void divisao(float numero01,float numero02){
        if (numero02 != 0){
            System.out.println(numero01 + "/" + numero02 + "=" +(numero01/numero02));
        }else{
             System.out.println("Divisão por Zero");
        }
    }
    void multiplicar(float numero01,float numero02){
        System.out.println(numero01 + "x" + numero02 + "=" +(numero01*numero02));
    }
}
