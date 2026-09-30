package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        // objeto realiza a leitura do dado que for inserido
        Scanner leitura = new Scanner(System.in);
        String busca = "";
        // listagem dos titulos
        List<Titulo> titulos = new ArrayList<>();

        // trata para que as variaveis que esta sendo passada venha como minuscula
        Gson gson = new GsonBuilder()
                //o fieldnamingpolicy é a politica da nomenclatura dos campos do json
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                // organizar o arquivo json
                .setPrettyPrinting()
                .create();

        // condição > enquanto o usuario não digitar " sair" permanece o programa
        while (!busca.equalsIgnoreCase("sair")) {
            System.out.println("Digite um filme para busca: ");

             busca = leitura.nextLine();
             // se o usuario escrever "sair" > fechar o programa
            if (busca.equalsIgnoreCase("sair")) {
                // finaliza
                break;
            }
            //tratando os dados da url - recebe a frase com espaço
            String buscaCodificada = URLEncoder.encode(busca, StandardCharsets.UTF_8);

            //conexão com a api > informa o código da api
            String endereco = "https://www.omdbapi.com/?t=" + buscaCodificada + "&apikey=eca044a8";
            try{
                HttpClient client = HttpClient.newHttpClient();

                // uma classe que guarda uma requição http > configura
                HttpRequest request = HttpRequest.newBuilder()
                        //tranforma a url em uri > onde o java compreende o endereço
                        .uri(URI.create(endereco))
                        //pode criar a requisição
                        .build();
                //classe que manda a resposta
                HttpResponse<String> response = client
                        // pega a requisição e envia > quando a requisição voltar quero ela como tipo string
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println("Informações gerais do json:\n"+ json);

                //Titulo meuTitulo = gson.fromJson(json, Titulo.class);
                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println("Usando somente o record:\n"+ meuTituloOmdb);

                //tratamento de erro, informar onde está acontecendo o erro
                //try {
                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println("Titulo convertido\n"+ meuTitulo);

                //adiciona informação do titulo
                titulos.add(meuTitulo);

            }
            // Trata erro quando o valor informado não pode ser convertido para número
            catch (NumberFormatException e){
                System.out.println("Aconteceu um erro: ");
                System.out.println(e.getMessage());

                // Trata erro caso a URL contenha um argumento inválido
            } catch(IllegalArgumentException e){
                System.out.println("algum erro de argumento na busca, verifique o endereço");
                // chamando a exception criada manualmente
            }catch (ErroDeConversaoDeAnoException e ){
                System.out.println(e.getMessage());
            }
        }

        System.out.println(titulos);

        //cria um arquivo json quando os sistema é executado
        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();
        System.out.println("Finalizou");

    }
}
