public class VeiculoPassageiros extends Veiculo{
    private int nroPass;

    public VeiculoPassageiros() {}

    public int getNroPass() {
        return nroPass;
    }

    public void setNroPass(int nroPass) {
        this.nroPass = nroPass;
    }

    @Override
    public String toString(){
        return "Marca: " + getMarca() + " Modelo: " + getModelo() + " Placa: " + getPlaca()
                + " Ano: " + getAno() + " Valor: " + getValor() + " Nro Passageiros" + getNroPass();
    }
}
