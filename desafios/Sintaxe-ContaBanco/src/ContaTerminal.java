import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        double saldo = 237.48;
    
        //TODO: Formatar valor para R$

        
        // TODO: conhecer e importar a classe scanner
        Scanner scanner = new Scanner(System.in);

        // Exibir as mensagens para o nosso usuário
        // Obter pela scanner os valores do usuário

        System.out.println("Por favor, digite o número da Conta: ");
        int conta = scanner.nextInt();
        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();
        System.out.println("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.next();

        System.out.println("Olá, " + nomeCliente + ". Obrigado por criar uma conta em nosso banco. Sua Agência é " + agencia + ", conta número " + conta + " e seu saldo é de R$" + saldo + ", já disponível para saque.");

        // Imprimir as mensagens no terminal.

    }

}
