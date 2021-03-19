public class VeiculoPassageiros extends Veiculo{
    private int nroPass;

    public VeiculoPassageiros(String placa) {
        super(placa);
    }

    public int getNroPass() {
        return nroPass;
    }

    public void setNroPass(int nroPass) {
        this.nroPass = nroPass;
    }
}
