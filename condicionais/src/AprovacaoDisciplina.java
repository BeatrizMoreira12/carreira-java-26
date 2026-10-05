import java.util.Scanner;

public class AprovacaoDisciplina {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Informe a média da nota");
        double nota = input.nextDouble();

        if (nota >= 7.0 ){
            System.out.println("Aluna foi aprovado.");

        } else if (nota >= 5.0) {
            System.out.println("está de recuparação");
        }
        else {
            System.out.println("reprovado");
        }

    }
}
