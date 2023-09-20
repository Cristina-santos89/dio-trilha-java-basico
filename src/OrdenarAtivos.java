import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrdenarAtivos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita a quantidade de ativos ao usuário
        System.out.print("Digite a quantidade de ativos: ");
        int quantidadeAtivos = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        
        // Cria uma lista para armazenar os ativos
        List<String> ativos = new ArrayList<>();
        
        // Solicita os tipos de ativos ao usuário
        for (int i = 0; i < quantidadeAtivos; i++) {
            System.out.print("Digite o tipo do ativo " + (i + 1) + ": ");
            String tipoAtivo = scanner.nextLine();
            ativos.add(tipoAtivo);
        }
        
        // Ordena os ativos em ordem alfabética
        Collections.sort(ativos);
        
        // Exibe os ativos organizados
        System.out.println("Ativos organizados em ordem alfabética:");
        for (String ativo : ativos) {
            System.out.println(ativo);
        }
        
        // Fecha o scanner
        scanner.close();
    }
}