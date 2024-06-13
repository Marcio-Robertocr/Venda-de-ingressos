package br.marcioads.com;

import javax.swing.JOptionPane;

/**
 *
 * @author Márcio Roberto
 */
public class Pista extends Evento{
    
    Evento pista = new Evento(); 
    double preco= pista.getValor();  

    
        public void compra(){
                   
        pista.setNome(JOptionPane.showInputDialog("Nome completo: "));
        pista.setCpf(JOptionPane.showInputDialog("Cpf:  "));
    }
    
        public void Resumo(){
        String msg= "*****   RESUMO   *****\n";
        msg+= "------------------------------------";
        msg+= "\nNome:       " +pista.getNome();
        msg+= "\nCPF:          "+pista.getCpf();
        msg+= "\nEvento:       " +pista.getEvento();
        msg+= "\nClasse          Pista";
        msg+= "\nData:          30/11/2023";
        msg+= "\nValor a pagar:      "+preco;
        JOptionPane.showMessageDialog(null, msg);
        }
}
    
