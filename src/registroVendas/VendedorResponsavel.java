package registroVendas;

import java.util.ArrayList;
import java.util.List;

public class VendedorResponsavel {

    //Vendedores identificados pelo nome
    private List<String> vendedores = new ArrayList<>();
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
            vendedores.add(nomeVendedor);
            vendedoresEmails.add(emailVendedor);
            vendedoresCpfs.add(cpfVendedor);
            return true;
        } else {
            return false;
        }
    }

    //Ver clientes cadastrados
    public void verVendedores(){
        for (int i = 0; i < vendedores.size(); i++){
            System.out.println(vendedores.get(i));
        }
    }

    public boolean identificarVendedor(String nomeVendedorVenda){
        for (String nome : vendedores) {
            if (nome.equalsIgnoreCase(nomeVendedorVenda)) {
                return true;
            }
        }
        return false;
    }
}
