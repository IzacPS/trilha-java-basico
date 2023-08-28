import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, Informe o seu nome:");
        String name = scanner.next();
        System.out.println("Por favor, informe o número da conta:");
        int account = scanner.nextInt();
        System.out.println("Por favor, informe o número da Agência:");
        String agency = scanner.next();
        System.out.println("Por favor, informe o saldo que estará disponível na conta:");
        double balance = scanner.nextDouble();

        System.out.println();
        System.out.print("Olá " + name + ", ");
        System.out.print("obrigado por criar uma conta em nosso banco, ");
        System.out.print("sua agência é " + agency + ", ");
        System.out.print("conta " + account + " ");
        System.out.println("e saldo " + balance + " já está disponível para saque.");

        scanner.close();
    }
}
