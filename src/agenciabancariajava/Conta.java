package agenciabancariajava;

//import agenciabancariajava.Utilitarios;
// https://www.youtube.com/watch?v=AExKQiCqwGs
public class Conta {
    // id da conta atribuido
    private static int contadorConta = 1;

    private int numeroConta;
    private Pessoa pessoa;
    private Double saldo = 0.0;
    
    public Conta(Pessoa pessoa){
        this.numeroConta = Conta.contadorConta;
        this.pessoa = pessoa;
        this.updateSaldo();
        Conta.contadorConta += 1;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
    private void updateSaldo(){
        this.saldo = this.getSaldo();
    }
    
    public String toString(){
        return "\nConta no banco: " + this.getNumeroConta() +
               "\nCliente: " + this.pessoa.getNome() +
               "\nCPF: " + this.pessoa.getNome() +
               "\nEmail: " + this.pessoa.getNome() +
               "\nSaldo: " + Utilitarios.doubleToString(this.getSaldo()) +
               "\n";
              
    }
    
    public void depositar(Double valor){
        if (valor > 0){
            setSaldo(getSaldo() + valor);
            System.out.println("Seu depósito foi realizado com sucesso!");
        }else{
            System.out.println("Não foi possivel fazer o deposito nesta conta");
        }
    }
    
    public void sacar(Double valor){
        if(valor > 0 && this.getSaldo()>= valor){
            setSaldo(getSaldo() - valor);
            System.out.println("Seu saque foi realizado com sucesso!");
        }else{
            System.out.println("Não foi possivel fazer o saque nesta conta");
        }
    }
    
    public void transferencia(Conta contaDeposito, Double valor){
        if( valor > 0 && this.getSaldo() >= valor){
            setSaldo(getSaldo() - valor);
            contaDeposito.saldo = contaDeposito.getSaldo() + valor;
            System.out.println("Transferência realizada com sucesso!");
        }else{
            System.out.println("Não foi possível realizar a tranferência");
        }
    }
}
