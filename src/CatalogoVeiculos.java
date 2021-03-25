import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


public class CatalogoVeiculos{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int option = 0;

        VeiculoPasseio veiculoPasseio = new VeiculoPasseio();
        VeiculoPassageiros veiculoPassageiros = new VeiculoPassageiros();
        VeiculoUtilitario veiculoUtilitario = new VeiculoUtilitario();
        List<Veiculo> veiculos = new ArrayList<>();


        while (option != 1){
            System.out.println("Selecione o tipo de veiculo que desejas cadastrar:");
            System.out.println("2 - Veiculo de Passeio.");
            System.out.println("3 - Veiculo de Passageiros.");
            System.out.println("4 - Veiculo Utilitário.");
            System.out.println("5 - Veiculo já cadastrados.");
            System.out.println("1 - Para sair");
            option = ler.nextInt();

            switch (option){
                case 1:
                    break;
                case 2:

                    System.out.println("******** Veiculo de passeio ********");
                    System.out.println("Digite a marca:");
                    veiculoPasseio.setMarca(ler.next());

                    System.out.println("Digite a modelo:");
                    veiculoPasseio.setModelo(ler.next());

                    System.out.println("Digite a placa:");
                    veiculoPasseio.setPlaca(ler.next());

                    System.out.println("Digite o ano:");
                    veiculoPasseio.setAno(ler.nextInt());

                    System.out.println("Digite o valor:");
                    veiculoPasseio.setValor(ler.nextDouble());

                    System.out.println("Digite o consumo:");
                    veiculoPasseio.setConsumo(ler.nextDouble());

                    veiculos.add(veiculoPasseio);
                    System.out.println("Veiculo Cadastrado!");
                    break;

                case 3:

                    System.out.println("******** Veiculo de Passageiros ********");
                    System.out.println("Digite a marca:");
                    veiculoPassageiros.setMarca(ler.next());

                    System.out.println("Digite a modelo:");
                    veiculoPassageiros.setModelo(ler.next());

                    System.out.println("Digite a placa:");
                    veiculoPassageiros.setPlaca(ler.next());

                    System.out.println("Digite o ano:");
                    veiculoPassageiros.setAno(ler.nextInt());

                    System.out.println("Digite o valor:");
                    veiculoPassageiros.setValor(ler.nextDouble());

                    System.out.println("Digite o nro de passageiros:");
                    veiculoPassageiros.setNroPass(ler.nextInt());

                    veiculos.add(veiculoPassageiros);
                    System.out.println("Veiculo Cadastrado!");
                    break;

                case 4:

                    System.out.println("******** Veiculo Utilitário ********");
                    System.out.println("Digite a marca:");
                    veiculoUtilitario.setMarca(ler.next());

                    System.out.println("Digite a modelo:");
                    veiculoUtilitario.setModelo(ler.next());

                    System.out.println("Digite a placa:");
                    veiculoUtilitario.setPlaca(ler.next());

                    System.out.println("Digite o ano:");
                    veiculoUtilitario.setAno(ler.nextInt());

                    System.out.println("Digite o valor:");
                    veiculoUtilitario.setValor(ler.nextDouble());

                    System.out.println("Digite o nro de eixos:");
                    veiculoUtilitario.setNroEixos(ler.nextInt());

                    System.out.println("Digite a capacidade de carga:");
                    veiculoUtilitario.setCapCargaTon(ler.nextInt());

                    veiculos.add(veiculoUtilitario);
                    System.out.println("Veiculo Cadastrado!");
                    break;

                case 5:
                    if(veiculos.size() > 0){
                        for(Veiculo v : veiculos){
                            System.out.println(v.toString());
                        }
                    }else {
                        System.out.println("Não temos veiculos cadastrados.");
                    }
                    break;

                default:
                    break;
            }
        }
    }
}