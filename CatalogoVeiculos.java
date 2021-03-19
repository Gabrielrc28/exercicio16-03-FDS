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
        /*Veiculo v1 = new Veiculo("ABC123","Toyota","Etios",2018,11.000);
        Veiculo v2  = new Veiculo("GFH549","Chevrolet","Onix",2023,15.000);*/
        Veiculo.add("Impala");
        Marca.add("GM");
        Ano.add(1967);
        tipo.add("Passeio");
        
        /*Scanner in = new Scanner(System.in);*/
        System.out.println("Procura por \n1)Placa \n2)Marca \n3)Modelo \n4)Ano \n5)Valor");

    }
}