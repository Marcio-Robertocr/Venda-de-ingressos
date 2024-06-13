
package br.marcioads.com;

import javax.swing.JOptionPane;


/**
 *
 * @author Márcio Roberto
 */
public class Vip extends Evento{

    Evento vip= new Evento();
   final double porcentagem = 0.30;
    double preco= vip.getValor()+(vip.getValor()*porcentagem);
    
 
        public void compra(){
        vip.setNome(JOptionPane.showInputDialog("Nome completo: "));
        vip.setCpf(JOptionPane.showInputDialog("Cpf:  "));
    }
    
        public void Resumo(){
        String msg= "*****   RESUMO   *****\n";
        msg+= "------------------------------------";
        msg+= "\nNome:          " +vip.getNome();
        msg+= "\nCPF:           "+vip.getCpf();
        msg+= "\nEvento:        " +vip.getEvento();
        msg+= "\nClasse          Vip";
        msg+= "\nData:          30/11/2023";
        msg+= "\nValor a pagar:      "+preco;
        JOptionPane.showMessageDialog(null, msg);
        }
}

