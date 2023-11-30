package agenciabancariajava;

import java.util.Date;


public class Pessoa {
    
    // id de usuario
    private static int counter = 1;
    
    private int numeroPessoa;
    private String nome;
    private String cpf;
    private String email;
    private Date criacaoContaDia;

    public Pessoa(String nome, String cpf, String email) {
        this.numeroPessoa = Pessoa.counter;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.criacaoContaDia = new Date();
        Pessoa.counter += 1;
    }

    public int getNumeroPessoa() {
        return numeroPessoa;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCriacaoContaDia() {
        return this.criacaoContaDia;
    }
    
    public String  toString(){
        return "\nName: " + this.getNome() +
                "\nCPF: " + this.getCpf() +
                "\nEmail: " + this.getEmail() +
                "\nAccount Creation Date: " + Utilitarios.dateToString(this.getCriacaoContaDia());
                
    }
}
