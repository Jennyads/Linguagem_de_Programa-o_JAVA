package proj_pedido;


public class Cliente {
    private String cli_nome;
    private int cli_cpf;

    public Cliente(String cli_nome, int cli_cpf) {
        this.cli_nome = cli_nome;
        this.cli_cpf = cli_cpf;
    }

    public void Imprimir(){
        System.out.println("Nome do cliente: " + cli_nome);
        System.out.println("CPF do cliente: " + cli_cpf);
    }


}
