import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String login;
    private String senha;
    private LocalDateTime dataNascimento;
    private String cpf;
    private String tipoPessoa;
    private String nivelRenda;
    private List<Conta> contas;

    public Cliente() {
        this.contas = new ArrayList<>();
    }

    public Cliente(String nome, String login, String senha, LocalDateTime dataNascimento, String cpf, String tipoPessoa,
            String nivelRenda, List<Conta> contas) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.tipoPessoa = tipoPessoa;
        this.nivelRenda = nivelRenda;
        this.contas = contas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDateTime getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDateTime dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getNivelRenda() {
        return nivelRenda;
    }

    public void setNivelRenda(String nivelRenda) {
        this.nivelRenda = nivelRenda;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void criarConta(String tipo, int numero, String agencia, int digito) {
        if (tipo.equals("CC")) {
            ContaCorrente cc = new ContaCorrente();

            cc.setAgencia(agencia);
            cc.setNumero(numero);
            // e outros atrinutos...

            contas.add(cc);
            System.out.println("Nova conta criada!");

        } else if (tipo.equals("CP")) {

            ContaPoupanca cp = new ContaPoupanca();

            cp.setAgencia(agencia);
            // e outros atributos...

            contas.add(cp);
            System.out.println("Nova conta criada!");
        } else {
            System.out.println("Tipo de conta invalida!");
        }
    }

    public void excluirConta() {
        System.out.println("Conta encerrada por solicitação do cliente.");
    }

    // Entre outras ações possiveis...

}
