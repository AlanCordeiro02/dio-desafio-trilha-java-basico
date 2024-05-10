import java.util.Scanner;

public class ContaTerminal {
    int numero;
    String agencia;
    String nomeCliente;
    float saldo;
    


    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();

        System.out.println("Por favor, digite o número da conta");
        conta.numero = scan.nextInt();

        System.out.println("Por favor, digite o número da agência");
        conta.agencia = scan.next();

        System.out.println("Por favor, digite o nome do cliente");
        conta.nomeCliente = scan.next();

        System.out.println("Por favor, digite o saldo da conta");
        conta.saldo = scan.nextFloat();


        System.out.println("Olá " +conta.nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é "+conta.agencia+ ", conta "+conta.numero+ " e seu saldo de "+conta.saldo+ " já está disponível para saque");
    }
}
