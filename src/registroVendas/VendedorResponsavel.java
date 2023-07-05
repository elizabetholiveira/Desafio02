package registroVendas;

import java.util.ArrayList;
import java.util.List;

public class VendedorResponsavel {

    //Vendedores identificados pelo nome
    private List<String> vendedoresNomes = new ArrayList<>();
    private List<String> vendedoresEmails = new ArrayList<>();
    private List<String> vendedoresCpfs = new ArrayList<>();

    //Cadastrar vendedor
    public void cadastrarVendedorNome(String nomeVendedor){
        vendedoresNomes.add(nomeVendedor);
    }

    public void cadastrarVendedorEmail(String emailVendedor){
        vendedoresEmails.add(emailVendedor);
    }

    public void cadastrarVendedorCpf(String cpfVendedor){
        vendedoresCpfs.add(cpfVendedor);
    }

    public boolean listaContemEmailVendedor(String emailVendedor){
        return vendedoresEmails.contains(emailVendedor);
    }

    public boolean emailContemArroba(String emailVendedor){
        return emailVendedor.contains("@");
    }

    public boolean listaContemCpfVendedor(String cpfVendedor){
        return vendedoresCpfs.contains(cpfVendedor);
    }

    //Ver vendedores cadastrados
    public void verVendedores(){
        for (int i = 0; i < vendedoresNomes.size(); i++){
            System.out.println("----------");
            System.out.println("Nome: " + vendedoresNomes.get(i));
            System.out.println("E-mail: " + vendedoresEmails.get(i));
            System.out.println("CPF: " + vendedoresCpfs.get(i));
        }
    }

    public boolean identificarVendedor(String nomeVendedorVenda){
        for (String nome : vendedoresNomes) {
            if (nome.equalsIgnoreCase(nomeVendedorVenda)) {
                return true;
            }
        }
        return false;
    }

    public void identificarVendedorEmail(String emailVendedor, Vendas vendas){
        boolean vendedorEncontrado = true;
        for (int i = 0; i < vendedoresEmails.size(); i++){
            if (vendedoresEmails.get(i).equalsIgnoreCase(emailVendedor)){
                System.out.println("Vendedor encontrado!");
                System.out.println("----------");
                System.out.println("Nome: " + vendedoresNomes.get(i));
                System.out.println("E-mail: " + vendedoresEmails.get(i));
                System.out.println("CPF: " + vendedoresCpfs.get(i));
                System.out.println("----------");
                for (int h = 0; h < vendas.getVendedorResponsávelVenda().size(); h++){
                    if (vendas.getVendedorResponsávelVenda().get(h).equalsIgnoreCase(vendedoresNomes.get(i))){
                        System.out.println();
                        System.out.println("Dados da venda:");
                        System.out.println("Vendedor: " + vendas.getVendedorResponsávelVenda().get(h));
                        System.out.println("Cliente: " + vendas.getClienteVenda().get(h));
                        System.out.printf("Valor: R$ %,.2f%n", vendas.getValorVenda().get(h));
                        System.out.println("Data da venda: " + vendas.getDataVenda().get(h));
                        System.out.println();
                        System.out.println("----------");
                    }
                }
                vendedorEncontrado = true;
                break;
            } else {
                vendedorEncontrado = false;
            }
        }
        if (vendedorEncontrado == false) {
            System.out.println("Vendedor não encontrado!");
        }
    }
}
