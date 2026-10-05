import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Me informar o valor da compra:");
        double valor1 = input.nextDouble();

        if(valor1 >= 100.0){
            // pega o valor da compra e multiplica pelo desconto
            double desconto = valor1 * 0.10;
            // descobre o desconto e subtrai pelo valor real
            double precoReal = valor1 - desconto;
            System.out.println("Você ganhou o desconto de  10% :" + precoReal);
        }
        else {
            System.out.println("Você não recebeu o desconto, valor abaixo da média. Valor a pagar: " +  valor1);
        }
        input.close();
    }
}
