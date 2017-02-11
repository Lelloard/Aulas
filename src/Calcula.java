import javax.swing.*;

/**
 * Created by Johnathan on 11/02/2017.
 */
public class Calcula {


    public static void  main (String[] args){

        int numero1 , numero2 , numero3;

       numero1 = Integer.parseInt( JOptionPane.showInputDialog("Coloque o primeiro numero"));
        numero2 = Integer.parseInt( JOptionPane.showInputDialog("Coloque o segundo numero"));
        numero3 = numero1 + numero2;

        JOptionPane.showConfirmDialog(null,String.valueOf(numero3),"Resultado",JOptionPane.INFORMATION_MESSAGE);

    }
}
