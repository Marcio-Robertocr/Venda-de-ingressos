package br.marcioads.com;

import javax.swing.JOptionPane;

/**
 *
 * @author Márcio Roberto
 */
public class Camarote extends Evento{
    
    Evento camarote = new Evento(); 
   final double porcentagem = 0.60;
    double preco= camarote.getValor()+(camarote.getValor()*porcentagem);  

    
        public void compra(){
                   
        camarote.setNome(JOptionPane.showInputDialog("Nome completo: "));
        camarote.setCpf(JOptionPane.showInputDialog("Cpf:  "));
    }

        public void Resumo(){
        String msg= "*****   RESUMO   *****\n";
        msg+= "------------------------------------";
        msg+= "\nNome:          " +camarote.getNome();
        msg+= "\nCPF:            "+camarote.getCpf();
        msg+= "\nEvento:         " +camarote.getEvento();
        msg+= "\nClasse          Camarote";
        msg+= "\nData:           30/11/2023";
        msg+= "\nValor a pagar:      "+preco;
        JOptionPane.showMessageDialog(null, msg);
        }
}
