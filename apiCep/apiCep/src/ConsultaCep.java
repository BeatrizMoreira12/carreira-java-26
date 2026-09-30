// precisa inserir o pacote na estrutura do projeto
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCep {
    public Endereco buscaEndereco(String cep){
        URI endereco = URI.create("https://viacep.com.br/ws/" + cep +"/json");


        // uma classe que guarda uma requição http > configura
         HttpRequest request = HttpRequest.newBuilder()
                //tranforma a url em uri > onde o java compreende o endereço
                .uri(endereco)
                //pode criar a requisição
                .build();
        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                  // pega a requisição e envia > quando a requisição voltar quero ela como tipo string
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(),Endereco.class);
        } catch (Exception e) {
            throw new RuntimeException("Não consegui obter o endereço a partit desse CEP.");
        }



    }




}
