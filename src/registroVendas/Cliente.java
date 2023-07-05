package registroVendas;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    //Identificação dos clientes
    private List<String> clientesNome = new ArrayList<>();
    private List<String> clientesEmail = new ArrayList<>();
    private List<String> clientesCpfs = new ArrayList<>();

    //Cadastrar cliente
    public void cadastrarClienteNome(String nomeCliente){
        clientesNome.add(nomeCliente);
    }

    public void cadastrarClienteEmail(String emailCliente){
        clientesEmail.add(emailCliente);
    }

    public void cadastrarClienteCpf(String cpfCliente){
        clientesCpfs.add(cpfCliente);
    }

    public boolean listaContemEmailCliente(String emailCliente){
        return clientesEmail.contains(emailCliente);
    }

    public boolean emailContemArroba (String emailCliente){
        return emailCliente.contains("@");
    }
    public boolean listaContemCpfCliente (String cpfCliente){
        return clientesCpfs.contains(cpfCliente);
    }

    //Ver clientes cadastrados
    public void verClientes(){
        for (int i = 0; i < clientesNome.size(); i++){
            System.out.println("----------");
            System.out.println("Nome: " + clientesNome.get(i));
            System.out.println("E-mail: " + clientesEmail.get(i));
            System.out.println("CPF: " + clientesCpfs.get(i));
        }
    }
    public boolean identificarCliente(String nomeClienteVenda){
        for (String nome : clientesNome) {
            if (nome.equalsIgnoreCase(nomeClienteVenda)) {
                return true;
            }
        }
        return false;
    }



    public void identificarClienteCpf(String cpfCliente){
        boolean clienteEncontrado = true;
        for (int i = 0; i < clientesCpfs.size(); i++){
            if (clientesCpfs.get(i).equalsIgnoreCase(cpfCliente)){
                System.out.println("Cliente encontrado!");
                System.out.println("----------");
                System.out.println("Nome: " + clientesNome.get(i));
                System.out.println("E-mail: " + clientesEmail.get(i));
                System.out.println("CPF: " + clientesCpfs.get(i));
                System.out.println("----------");
                clienteEncontrado = true;
                break;
            } else {
                clienteEncontrado = false;
            }
        }
        if (clienteEncontrado == false) {
            System.out.println("Cliente não encontrado!");
        }
    }
}
