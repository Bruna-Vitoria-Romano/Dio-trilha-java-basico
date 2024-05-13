import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int Numero;
        String Agencia;
        String NomeCliente;
        BigDecimal Saldo;

        System.out.println("Olá! Por favor, insira o seu nome:");
        NomeCliente = sc.nextLine();

        System.out.println("Agora insira o número da agência:");
        Numero = sc.nextInt();

        System.out.println("Agora insira a sua agência bancária:");
        Agencia = sc.nextLine();

        System.out.println("Certo, agora digite o saldo da conta:");
        Saldo = sc.nextBigDecimal();

        //System.out.println($"Olá {sc.NomeCliente}, obrigado por criar uma conta em nosso banco, sua agência é {Agencia}, conta {Numero} e seu saldo {Saldo} já está disponível para saque");
    }
}
