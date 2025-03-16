import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Por favor, digite seu nome:");
            String nome = scanner.nextLine();
            System.out.println("Por favor, digite sua conta:");
            Integer numero = scanner.nextInt();
            System.out.println("Por favor, digite sua agência:");
            Integer agencia = scanner.nextInt();
            System.out.println("Por favor, digite seu saldo:");
            double saldo = scanner.nextDouble();
            System.out.println("Olá " + nome + ", obrigada por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        } finally {
            scanner.close();
        }
        
    }
}
