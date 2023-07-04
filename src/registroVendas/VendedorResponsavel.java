package registroVendas;

import java.util.ArrayList;
import java.util.List;

public class VendedorResponsavel {

    //Vendedores identificados pelo nome
    private List<String> vendedoresNomes = new ArrayList<>();
    private List<String> vendedoresEmails = new ArrayList<>();
    private List<String> vendedoresCpfs = new ArrayList<>();

    //Cadastrar cliente
    public boolean cadastrarVendedor(String nomeVendedor, String emailVendedor, String cpfVendedor){
        for (String cpfs : vendedoresCpfs){
            if (cpfVendedor == cpfs) {
                System.out.println("CPF já cadastrado!");
                return false;
            }
        }
        for (String emails : vendedoresEmails){
            if (emailVendedor == emails) {
                System.out.println("E-mail já cadastrado!");
                return false;
            }
        }
        if (emailVendedor.contains("@") && cpfVendedor.length() == 11){
            vendedoresNomes.add(nomeVendedor);
            vendedoresEmails.add(emailVendedor);
            vendedoresCpfs.add(cpfVendedor);
            return true;
        } else {
            return false;
        }
    }

    //Ver clientes cadastrados
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
