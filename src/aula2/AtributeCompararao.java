package aula2;

import javax.swing.*;

/**
 * Created by Johnathan on 11/02/2017.
 */
public class AtributeCompararao {

    public  static  void  main (String[] args){

        String opcao1 = "Digite 1 para soma \n ";
        String opcao2 = "Digite 2 para sulbtrair \n ";
        String opcao3 = "Digite 3 para multiplicar \n";
        String opcao4 = "Digite 4 para dividir";

        int numeral = Integer.parseInt(JOptionPane.showInputDialog( opcao1 + opcao2 + opcao3 + opcao4));

        if(numeral == 1){

            int numero1 , numero2 , numero3;

            numero1 = Integer.parseInt( JOptionPane.showInputDialog("Coloque o primeiro numero"));
            numero2 = Integer.parseInt( JOptionPane.showInputDialog("Coloque o segundo numero"));
            numero3 = numero1 + numero2;

            JOptionPane.showMessageDialog(null,String.valueOf(numero3),"Resultado",JOptionPane.INFORMATION_MESSAGE);


        } else if(numeral == 2){

            int numero1 , numero2 , numero3;

            numero1 = Integer.parseInt( JOptionPane.showInputDialog("Coloque o primeiro numero"));
            numero2 = Integer.parseInt( JOptionPane.showInputDialog("Coloque o segundo numero"));
            numero3 = numero1 - numero2;

            JOptionPane.showMessageDialog(null,String.valueOf(numero3),"Resultado",JOptionPane.INFORMATION_MESSAGE);

        }

    }
}
