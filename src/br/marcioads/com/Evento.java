
package br.marcioads.com;


/**
 *
 * @author Márcio Roberto
 */
public class Evento {

    private String nome;
    private String cpf;
    private String evento= "Digital Camp";
    private final double valor =200;

    public double getValor() {
        return valor;
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

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }
    
}
