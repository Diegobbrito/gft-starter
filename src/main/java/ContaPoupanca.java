public class ContaPoupanca extends Conta implements Imposto{

    public double rendimento() {
        return this.getSaldo() * 0.05;
    }

    @Override
    public double calcularImposto() {
        return rendimento() * 0.1;
    }
}
