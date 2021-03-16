public class VeiculoUtilitario extends Veiculo{
    private int nroEixos;
    private int capCargaTon;

    public VeiculoUtilitario(String placa) {
        super(placa);
    }

    public int getNroEixos() {
        return nroEixos;
    }

    public void setNroEixos(int nroEixos) {
        this.nroEixos = nroEixos;
    }

    public int getCapCargaTon() {
        return capCargaTon;
    }

    public void setCapCargaTon(int capCargaTon) {
        this.capCargaTon = capCargaTon;
    }
}
