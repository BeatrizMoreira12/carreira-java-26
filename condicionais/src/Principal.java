public class Principal {
    public static void main(String[] args) {
        String nome = "Jorge";
        double salario =6000.00;
        int numeroDependentes = 3;
        boolean isento = true;

        // se salario for maior que 2850.20 e diferente do inseto seguir a mensagem
        if (salario > 2850.20 && !isento){
            double irrf = salario /100 * 7.5;
            System.out.println("valor irrf:" + irrf);
        }
        else if (isento) {
            System.out.println("ele é isento de irrf");
        } else {
            System.out.println("não há valores de irrf");
        }

    }
}
