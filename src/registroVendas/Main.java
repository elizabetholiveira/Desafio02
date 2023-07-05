package registroVendas;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner resposta = new Scanner(System.in);

        Usuario usuario = new Usuario();
        Cliente cliente = new Cliente();
        VendedorResponsavel vendedorResponsavel = new VendedorResponsavel();
        Pagamento pagamento = new Pagamento();
        DataRegistro dataRegistro = new DataRegistro();
        Vendas registroVendas = new Vendas();

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
                    System.out.println("Digite o nome do cliente:");
                    resposta.nextLine();
                    String nomeCliente = resposta.nextLine();
                    System.out.println("Digite o cpf do cliente:");
                    String cpfCliente = resposta.next();
                    System.out.println("Digita o email do cliente:");
                    String emailCliente = resposta.next();
                    if (cliente.emailContemArroba(emailCliente) && !cliente.listaContemEmailCliente(emailCliente) && !cliente.listaContemCpfCliente(cpfCliente)){
                        cliente.cadastrarClienteNome(nomeCliente);
                        cliente.cadastrarClienteEmail(emailCliente);
                        cliente.cadastrarClienteCpf(cpfCliente);
                        System.out.println("Cliente cadastrado com sucesso!");
                    } else {
                        System.out.println("Algum(ns) dados inseridos são inválidos. Cliente não cadastrado!");
                    }
                case 2:
                    System.out.println();
                    System.out.println("----------");
                    System.out.println("Clientes cadastrados:");
                    cliente.verClientes();
                    System.out.println("----------");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Digite o nome do vendedor:");
                    resposta.nextLine();
                    String nomeVendedor = resposta.nextLine();
                    System.out.println("Digite o cpf do vendedor:");
                    String cpfVendedor = resposta.next();
                    System.out.println("Digite o email do vendedor:");
                    String emailVendedor = resposta.next();
                    if (vendedorResponsavel.emailContemArroba(emailVendedor) && !vendedorResponsavel.listaContemEmailVendedor(emailVendedor) && !vendedorResponsavel.listaContemCpfVendedor(cpfVendedor)){
                        vendedorResponsavel.cadastrarVendedorNome(nomeVendedor);
                        vendedorResponsavel.cadastrarVendedorEmail(emailVendedor);
                        vendedorResponsavel.cadastrarVendedorCpf(cpfVendedor);
                        System.out.println("Vendedor cadastrado com sucesso!");
                    } else {
                        System.out.println("Algum(ns) dados inseridos são inválidos. Vendedor não cadastrado!");
                    }
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
                    if (vendedorExiste){
                        System.out.println("Vendedor encontrado!");
                    } else {
                        System.out.println("Vendedor não encontrado!");
                        break;
                    }
                    //Selecionando cliente:
                    System.out.println("Digite o nome do cliente:");
                    String nomeClienteVenda = resposta.nextLine();
                    boolean clienteExiste = cliente.identificarCliente(nomeClienteVenda);
                    if (clienteExiste){
                        System.out.println("Cliente encontrado!");
                    } else {
                        System.out.println("Cliente não encontrado!");
                        break;
                    }
                    //Digitando valor da compra:
                    System.out.println("Digite o valor da compra:");
                    pagamento.setValorPagamento(new BigDecimal(resposta.next()));
                    //Data da venda:
                    dataRegistro.setDataRegistroVenda(LocalDate.now());
                    //Guardar dados da venda:
                    registroVendas.registrarVenda(nomeVendedorVenda, nomeClienteVenda, pagamento.getValorPagamento(), dataRegistro.getDataRegistroVenda());
                    break;
                case 6:
                    registroVendas.listarVendas();
                    break;
                case 7:
                    System.out.println("Digite o cpf do cliente que deseja procurar:");
                    cliente.identificarClienteCpf(resposta.next(), registroVendas);
                    break;
                default:
                    System.out.println("Entrada inválida");
            }
        }
    }
}
