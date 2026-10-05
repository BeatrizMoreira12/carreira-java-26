import java.util.Scanner;

public class NumerIntervalo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Me informe o valor do emprestimo");
        int emprestimo = input.nextInt();


        if (emprestimo >= 1000 && emprestimo <=5000){
            System.out.println("O valor está dentro da regra do emprestimo");
        }else {
            System.out.println("O valor não está dentro da regra do emprestimo");
        }
        input.close();
    }

}

