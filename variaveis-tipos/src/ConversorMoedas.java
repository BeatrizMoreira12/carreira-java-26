public class ConversorMoedas {
    public static void main(String[] args) {

        double valorReal = 451.50;
        double taxaCambio = 5.25;

        double valorDolares = valorReal/taxaCambio;
        System.out.println("o valor da moeda é :" + valorDolares);

    }
}
