public class VeiculoPasseio extends Veiculo {

    private Double consumo;

    public VeiculoPasseio() {}

    public Double getConsumo() {
        return consumo;
    }

    public void setConsumo(Double consumo) {
        this.consumo = consumo;
    }

    @Override
    public String toString(){
        return "Marca: " + getMarca() + " Modelo: " + getModelo() + " Placa: " + getPlaca()
                + " Ano: " + getAno() + " Valor: " + getValor() + " Consumo: " + getConsumo();
    }
}