import java.util.Scanner;

public class ValidacaoSenha {
    public static void main(String[] args){
        //objeto de entrada do teclado
        Scanner input = new Scanner(System.in);
        //apresentação da mensagem
        System.out.println("Informe a senha:");
        //converte o dado para o tipo inteiro
        int senha = Integer.parseInt(input.nextLine());

        //fecha o scanner
        input.close();
        //condição > se a senha for igaul ao valor apresentar mensagem
        if(senha == 123456){
            System.out.println("Acesso permitido");
        }
        else {
            System.out.println("acesso negado");
        }
    }
}
