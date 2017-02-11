import javax.swing.*;
import java.awt.*;

/**
 * Created by Léllo Arruda on 09/02/2017.
 */

/* Aurelio um peograma que pega dois valores e multiplica
*  cria variaveis do int , Usa a classe JOptionPane.showInputDialog()
*  para buscar o valor e atribuir nas variaveis
*  multiplica os valores e exibir na tela com JOptionPane.showConfirmDialog() */




public class Aula {


    public static void main(String[] args){

        int numero1, numero2, valor3;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("coloque o primeiro numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("coloque o segundo numero"));
        valor3 = numero1 / numero2;

        JOptionPane.showMessageDialog(  null,String.valueOf(valor3), "resultado",JOptionPane.INFORMATION_MESSAGE);


    }
}
