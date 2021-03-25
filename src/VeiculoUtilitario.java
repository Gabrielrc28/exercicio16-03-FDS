public class VeiculoUtilitario extends Veiculo{
    private int nroEixos;
    private int capCargaTon;

    public VeiculoUtilitario() {}

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

    @Override
    public String toString(){
        return "Marca: " + getMarca() + " Modelo: " + getModelo() + " Placa: " + getPlaca()
                + " Ano: " + getAno() + " Valor: " + getValor() + " Capacidade de Carga: "
                + getCapCargaTon() + " Nro. de eixos: " + getNroEixos();
    }
}
