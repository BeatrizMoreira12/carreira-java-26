import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        // instancia o objeto consulta (URL)
        ConsultaCep consultaCep = new ConsultaCep();

        System.out.println("Digite o número de cep:");
        //pegando as informações  do scanner
        var cep = leitura.nextLine();

        try {
            // GET E SET alimenta a classe consultaCep
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);
            // apresenta o novo endereço
            System.out.println(novoEndereco);

            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJson(novoEndereco);
        }catch (RuntimeException | IOException e){
            //mostrar a mensagem de erro
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }



    }
}
