import java.util.Scanner;
import java.util.ArrayList;


public class CatalogoVeiculos{

    public CatalogoVeiculos(String placa, String modelo, String marca, int ano, double valor){
        super();
    }
    public static void main(String[] args){
        ArrayList<String> Veiculo = new ArrayList<String>();
        ArrayList<String> Marca = new ArrayList<String>();
        ArrayList<Integer> Ano = new ArrayList<Integer>();
        ArrayList<String> tipo = new ArrayList<String>();

        Veiculo.add("Impala");
        Marca.add("GM");
        Ano.add(1967);
        tipo.add("Passeio");

        

        /*Scanner in = new Scanner(System.in);*/
        System.out.println("Procura por \n1)Placa \n2)Marca \n3)Modelo \n4)Ano \n5)Valor");

    }
}