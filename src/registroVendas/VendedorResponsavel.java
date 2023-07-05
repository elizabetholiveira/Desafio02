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
}
