public class ClassificacaoCategoria {
    public static void main(String[] args) {

        // classificação por categoria

        double precoClassificacao = 150.0;
        if (precoClassificacao <= 50.00 ){
            System.out.println("Preço econômico");
        } else if (precoClassificacao > 50.01 && precoClassificacao <= 200 ) {
            System.out.println(" O preço é intermediario");
        } else{
            System.out.println("o preço informado é premium");
        }
    }
}
