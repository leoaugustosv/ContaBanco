import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        


        System.out.println("Insira o número da conta abaixo: ");
        int numeroConta = sc.nextInt();

        System.out.println("Insira a agência: ");
        String codigoAgencia = sc.next();

        System.out.println("Insira o nome do cliente: ");
        String nomeCliente = sc.nextLine();
        nomeCliente+=sc.nextLine();

        


        System.out.println("Insira o saldo inicial a ser depositado: ");
        double saldoConta = sc.nextDouble();

        System.out.println("\n");
        System.out.printf("Olá, %S, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %s. Seu saldo atual é de R$ %.2f.",
        nomeCliente, codigoAgencia, numeroConta, saldoConta);
        
        sc.close();
        
    }
}
