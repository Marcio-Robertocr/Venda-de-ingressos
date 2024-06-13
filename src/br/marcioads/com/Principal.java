package br.marcioads.com;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Márcio Roberto
 */
public class Principal {
    
    public static void main(String[] args){
        
        List dados= new ArrayList();
        int op; 
        Pista pista = new Pista();
        Vip vip = new Vip();
        Camarote camarote = new Camarote();
        
        do{
           op= Integer.parseInt(JOptionPane.showInputDialog("Escolha um tipo de ingresso:\n1-Pista\n2-Vip\n3-Camarote"));
           if(op>3){
               JOptionPane.showMessageDialog(null, "Opção inválida");
           }
           switch(op){
               case 1:
                   pista.compra();
                   dados.add(pista);
                   pista.Resumo();
                   break;
               case 2:
                   vip.compra();
                   dados.add(vip);
                   vip.Resumo();
                   break;
               case 3:
                   camarote.compra();
                   dados.add(camarote);
                   camarote.Resumo();
                   break;
               default:
                   JOptionPane.showMessageDialog(null, "Opção inválida");
           }
                    
        }while(op!=0);
    }
    
}
