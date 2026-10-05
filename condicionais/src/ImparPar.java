import java.util.Scanner;

public class ImparPar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Vamos descobri se seu número é par ou impar:");

        //variavel que armazena a informação do usuário e converte para inteiro
        int num = Integer.parseInt(input.nextLine());

        // se o num for divido por 2 e for igual a 0 apresenta a seguinte mensagem
        if (num % 2 == 0) {
            System.out.println("Seu número é Par");
        }
        else {
            System.out.println("Esse número é Impar");
        }


    }
}
