public class ConsumoAutonomia
{
    public  static void main(String[] args)
    {
        double consumoMedio = 12.5; // O carro faz 12,5 km por litro
        double capacidadeTanque = 50; // O tanque tem capacidade para 50 litros
        double combustivelAtual = 20; // Há 20 litros disponíveis
        double distanciaViagem = 200; // A viagem planejada tem 200 km

        double autonomiaMaxima = consumoMedio * capacidadeTanque;
        double autonomiaAtual = consumoMedio * combustivelAtual;

        System.out.println("Autonomia atual: " + autonomiaAtual);
        System.out.println("Autonomia maxima: " + autonomiaMaxima);

    }
}
