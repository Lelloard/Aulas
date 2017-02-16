package aula1;

import javax.swing.*;

/**
 * Created by Johnathan on 11/02/2017.
 */
public class Calcula {


    public static void  main (String[] args){

        double numero1 , numero2 , numero3, numero4;

       numero1 =    Integer.parseInt( JOptionPane.showInputDialog("Coloque o primeiro numero"));
        numero2 = Integer.parseInt( JOptionPane.showInputDialog("Coloque o segundo numero"));
        numero3 = Integer.parseInt(JOptionPane.showInputDialog("coloque o terceiro numero"));
        numero4 = numero1 + numero2 + numero3;

        JOptionPane.showMessageDialog(null,String.valueOf(numero4),"Resultado",JOptionPane.INFORMATION_MESSAGE);

    }
}
