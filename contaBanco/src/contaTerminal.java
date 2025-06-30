import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da conta:");
        int numeroConta = sc.nextInt();
        System.out.println("Número da Agência: ");
        String numeroAgencia = sc.next();
        sc.nextLine(); 
        System.out.println("Nome do cliente:");
        String nomeCliente = sc.nextLine();
        System.out.println("Digite o saldo da conta:");
        double saldoConta = sc.nextDouble();
        
        System.out.println("Olá " + nomeCliente + ", obrigado por ter criado uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque.");

        sc.close();
    }
}
