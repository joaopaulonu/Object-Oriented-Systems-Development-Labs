package TesteES;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TesteES {

    public static void main(String[] args) {
        
        // O try-with-resources garante que o BufferedReader seja fechado automaticamente
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            
            // Leitura de uma String
            System.out.print("Informe uma String: ");
            String teste = in.readLine();
            System.out.println("A String lida foi: " + teste);
            
            // Leitura de um Inteiro
            System.out.print("Informe um inteiro: ");
            // Lê a linha como String e converte explicitamente para int
            int numero = Integer.parseInt(in.readLine());
            System.out.println("O inteiro lido foi: " + numero);
            
        } catch (IOException e) {
            System.err.println("Erro de I/O ao tentar ler os dados: " + e.getMessage());
        } catch (NumberFormatException e) {
            e.printStackTrace();
            
            // Captura o erro caso o usuário digite texto ao invés de número
            System.err.println("Erro: Você não digitou um número inteiro válido.");
        }
    }
}