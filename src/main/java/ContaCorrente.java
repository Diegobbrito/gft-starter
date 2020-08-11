public class ContaCorrente extends Conta implements Imposto {


    public double rendimento() {
        return this.getSaldo() * 0.03;
    }

    @Override
    public double calcularImposto() {
        return rendimento() * 0.25;
    }
}
