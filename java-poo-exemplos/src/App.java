public class App {
    public static void main(String[] args) throws Exception {
        
        Cliente cliente1 = new Cliente();

        cliente1.setCpf("123.456.789-00");
        cliente1.setLogin("vitorsantos");
        cliente1.setNivelRenda("ALTA");
        // e outros atributos...

        cliente1.criarConta("CC", 1, "2001", 3);
        cliente1.criarConta("CP", 2, "2001", 1);

        System.out.println("Numero de contas do cliente: " + cliente1.getContas().size());

        Conta conta = new Conta();

        conta.depositar(1000);
        conta.sacar(900);

        System.out.println("Saldo da conta generica: " + conta.getSaldo());

        ContaCorrente cc = new ContaCorrente();

        cc.depositar(1000);
        cc.sacar(900);

        System.out.println("Saldo da conta corrente: " + cc.getSaldo());

        cc.setTitular(cliente1);

        ContaPoupanca cp = new ContaPoupanca();

        cp.depositar(1000);
        cp.sacar(900);

        System.out.println("Saldo da conta poupança: " + cp.getSaldo());

        cp.setTitular(cliente1);
    }
}
