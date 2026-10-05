import java.util.Scanner;

public class DiaUtil {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Informe o dia da semana ( em letras mnúsculas):");
        String semana = input.nextLine();

        // o equals compara se o valor da variavel é igual ao valor da condição
        if(semana.equals("segunda")|| semana.equals("terça")
        || semana.equals("quarta")|| semana.equals("quinta")
        || semana.equals("sexta")){
            System.out.println("é um dia da semana");
        }
        else{
            System.out.println("Não é um dia da semana");

        }
        input.close();

    }
}
