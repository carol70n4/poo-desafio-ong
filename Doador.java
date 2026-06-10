public class Doador extends MembroONG {

    private double valorDoadoMensal;

    public double getValorDoadoMensal() {
        return valorDoadoMensal;
    }

    public void setValorDoadoMensal(double valorDoadoMensal) {
        this.valorDoadoMensal = valorDoadoMensal;
    }

    @Override
    public void exibirResumo() {

        System.out.println("\nDoador");
        super.exibirResumo();
        System.out.println("Status: Doador Ativo");
        System.out.println("Valor mensal doado: R$ " + valorDoadoMensal);
    }
}