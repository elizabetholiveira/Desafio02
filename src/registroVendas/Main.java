package registroVendas;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner resposta = new Scanner(System.in);

        Usuario usuario = new Usuario();
        Cliente cliente = new Cliente();
        VendedorResponsavel vendedorResponsavel = new VendedorResponsavel();
        Pagamento pagamento = new Pagamento();
        DataRegistro dataRegistro = new DataRegistro();

        System.out.println("Boas-vindas ao sistema de registro de vendas!");

        boolean sistemaAtivo = true;

        while (sistemaAtivo) {
            usuario.Menu();
            int selecao = resposta.nextInt();

            switch (selecao) {
                case 0:
                    sistemaAtivo = false;
                    break;
                case 1:
                    System.out.println("Digite o nome do cliente que deseja cadastrar:");
                    resposta.nextLine();
                    cliente.cadastrarCliente(resposta.nextLine());
                case 2:
                    System.out.println();
                    System.out.println("----------");
                    System.out.println("Clientes cadastrados:");
                    cliente.verClientes();
                    System.out.println("----------");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Digite o nome do vendedor que deseja cadastar:");
                    resposta.nextLine();
                    vendedorResponsavel.cadastrarVendedor(resposta.nextLine());
                case 4:
                    System.out.println();
                    System.out.println("----------");
                    System.out.println("Vendedores cadastrados:");
                    vendedorResponsavel.verVendedores();
                    System.out.println("----------");
                    System.out.println();
                    break;
                case 5:
                    //Selecionando vendedor:
                    System.out.println("Digite o nome do vendedor responsável pela venda:");
                    resposta.nextLine();
                    String nomeVendedorVenda = resposta.nextLine();
                    boolean vendedorExiste = vendedorResponsavel.identificarVendedor(nomeVendedorVenda);
                    if (vendedorExiste == true){
                        System.out.println("Vendedor encontrado!");
                    } else {
                        System.out.println("Vendedor não encontrado!");
                        break;
                    }
                    //Selecionando cliente:
                    System.out.println("Digite o nome do cliente:");
                    String nomeClienteVenda = resposta.nextLine();
                    //Digitando valor da compra:
                    System.out.println("Digite o valor da compra:");
                    pagamento.setValorPagamento(new BigDecimal(resposta.next()));
                    //Data da venda:
                    dataRegistro.setDataRegistroVenda(LocalDate.now());
                    //Dados da venda:
                    System.out.println();
                    System.out.println("----------");
                    System.out.println("Dados da venda:");
                    System.out.println("Vendedor: " + nomeVendedorVenda);
                    System.out.println("Cliente: " + nomeClienteVenda);
                    System.out.println("Valor: " + pagamento.getValorPagamento());
                    System.out.println("Data da venda: " + dataRegistro.getDataRegistroVenda());
                    System.out.println("----------");
                    System.out.println();
            }
        }
    }
}
