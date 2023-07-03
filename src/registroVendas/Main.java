package registroVendas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner resposta = new Scanner(System.in);

        Usuario usuario = new Usuario();
        Cliente cliente = new Cliente();
        VendedorResponsavel vendedorResponsavel = new VendedorResponsavel();

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
            }
        }
    }
}
