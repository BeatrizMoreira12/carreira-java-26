public class CadastroLivro {
    public static void main(String[] args) {

        //cadastro de livro
        String titulo = "O pequeno principe";
        String autor = " Antoine de Saint-Exupéry";
        int numeroPaginas = 96;
        double preco = 39.9;
        char categoria = 'F';

        String descricaoCategoria;

        if (categoria == 'F') {
            descricaoCategoria = "Ficção";
        } else if (categoria == 'N') {
            descricaoCategoria = "Não-ficção";
        }else if (categoria == 'T') {
            descricaoCategoria = "Tecnologia";
        } else if (categoria == 'H') {
            descricaoCategoria = "História";
        }
        else{
            descricaoCategoria = "Categoria inválida";
        }
        System.out.println("Livro cadastrado com sucesso: "+ titulo + " de" + autor + "." + "Ele possui " + numeroPaginas + "," + "custa " + preco + " e pertence á categoria " +  descricaoCategoria);

    }
}
