import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();

         pessoa.setNome("Diego Brito");
         pessoa.setEndereco("Osasco-SP");
         pessoa.setTelefone("1199999-9999");

        System.out.println("Exercício 2");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Endereço: " + pessoa.getEndereco());
        System.out.println("Telefone: " + pessoa.getTelefone());

        // 3 e 4

        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        cc.setNumero(1);
        cc.setTitular("Diego Brito");
        cc.setSaldo(1000.00);

        cp.setNumero(2);
        cp.setTitular("Diego");
        cp.setSaldo(2000.00);

        System.out.println("\nExercício 3 e 4");
        double saldo = cc.getSaldo();
        double rendimento = cc.rendimento();
        double imposto = cc.calcularImposto();

        System.out.println("Conta Corrente");
        System.out.println("Nome: " + cc.getTitular());
        System.out.printf("Saldo: R$ %.2f\n" ,saldo);


        System.out.printf("Rendimento: R$ %.2f\n", rendimento);
        System.out.printf("Imposto a ser pago: R$ %.2f\n", imposto);

        saldo = cp.getSaldo();
        rendimento = cp.rendimento();
        imposto = cp.calcularImposto();

        System.out.println("\nConta Poupança");
        System.out.println("Nome: " + cp.getTitular());
        System.out.printf("Saldo: R$ %.2f\n" ,saldo);
        System.out.printf("Rendimento: R$ %.2f \n", rendimento);
        System.out.printf("Imposto a ser pago sobre o rendimento: R$ %.2f", imposto);


    }
}
