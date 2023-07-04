package registroVendas;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    //Clientes identificados pelo nome
    private List<String> clientes = new ArrayList<>();
    private List<String> clientesEmail = new ArrayList<>();
    private List<String> clientesCpfs = new ArrayList<>();

    //Cadastrar cliente
    public boolean cadastrarCliente(String nomeCliente, String emailCliente, String cpfCliente){
        for (String cpfs : clientesCpfs){
            if (cpfCliente == cpfs){
                System.out.println("CPF já cadastrado!");
                return false;
            }
        }
        for (String emails : clientesEmail){
            if (emailCliente == emails) {
                System.out.println("E-mail já cadastrado!");
                return false;
            }
        }
        if (emailCliente.contains("@") && cpfCliente.length() == 11){
            clientes.add(nomeCliente);
            clientesEmail.add(emailCliente);
            clientesCpfs.add(cpfCliente);
            return true;
        } else {
            return false;
        }
    }

    //Ver clientes cadastrados
    public void verClientes(){
        for (int i = 0; i < clientes.size(); i++){
            System.out.println("----------");
            System.out.println("Nome: " + clientes.get(i));
            System.out.println("E-mail: " + clientesEmail.get(i));
            System.out.println("CPF: " + clientesCpfs.get(i));
        }
    }
    public boolean identificarCliente(String nomeClienteVenda){
        for (String nome : clientes) {
            if (nome.equalsIgnoreCase(nomeClienteVenda)) {
                return true;
            }
        }
        return false;
    }
}
