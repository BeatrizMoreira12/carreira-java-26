import java.util.Scanner;

public class ComparandoNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        int num1 = input.nextInt();
        System.out.println("Digite o segundo numero:");
        int num2 = input.nextInt();

        if(num1 > num2){
            System.out.println("O numero 1 é maior que o segundo");
        } else if (num2 > num1) {
            System.out.println("O numero 2 é maior que os segundo");
        }
        else {
            System.out.println("os números são iguais");
        }
        input.close();
    }
}
