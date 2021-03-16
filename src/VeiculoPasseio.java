public class VeiculoPasseio extends Veiculo {

    private Double consumo;

    public VeiculoPasseio(String placa) {
        super(placa);
    }

    public Double getConsumo() {
        return consumo;
    }

    public void setConsumo(Double consumo) {
        this.consumo = consumo;
    }
}