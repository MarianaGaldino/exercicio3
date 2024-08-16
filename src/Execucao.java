import java.util.Scanner;

public class Execucao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicitando ao usuário para escolher um dia da semana
        System.out.println("Escolha um dia da semana:");
        System.out.println("SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO");
        String escolha = scanner.nextLine().toUpperCase();
        try {
            DiaDaSemana diaEscolhido = DiaDaSemana.valueOf(escolha);
            System.out.println("Você escolheu: " + diaEscolhido);
        } catch (IllegalArgumentException e) {
            System.out.println("Dia inválido. Por favor, escolha um dia válido.");
        }

        // Solicitando ao usuário para escolher o tamanho do cafe
        System.out.println("Bom dia, escolha um tamanho de café:");
        System.out.println("SMALL, MEDIUM OU LARGE");
        String chooseCoffee = scanner.nextLine().toUpperCase();
        try {
            CoffeeSize coffeeEscolhido = CoffeeSize.valueOf(chooseCoffee);

            System.out.println("Você escolheu: " + coffeeEscolhido);
            System.out.println("O preço é " + coffeeEscolhido.getPrice());
        } catch (IllegalArgumentException e) {
            System.out.println("Tamanho inválido. Por favor, escolha um tamanho válido.");
        }
        scanner.close();
    }
}



