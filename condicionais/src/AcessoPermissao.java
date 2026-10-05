import java.util.Scanner;

public class AcessoPermissao {
    public  static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int codigoAcesso = 2023;
        int permissaoMinimo = 1 ;
        int permissaoMaximo = 3;

        System.out.println("Digite o codigo de acesso:");
        int  codigoAcessoDigi = sc.nextInt();
        System.out.println("Digite o nivel de permissão:");
        int permissaoDigi = sc.nextInt();

        boolean codigoValido = codigoAcesso ==  codigoAcessoDigi;
        boolean permisssaoValida = permissaoDigi  >= permissaoMinimo  && permissaoDigi <= permissaoMaximo;

        if(codigoValido && permisssaoValida){
            System.out.println("Acesso permitido. Seja bem-vndo ao sistema");
        }else {
            System.out.println("Acesso negado.Motivo (s):");
            if (!codigoValido)  {
                System.out.println(" - Código de acesso incorreto");
            }
            if(!permisssaoValida){
                System.out.println(" - Nível de permissão inválida");
            }
        }
    }
}
