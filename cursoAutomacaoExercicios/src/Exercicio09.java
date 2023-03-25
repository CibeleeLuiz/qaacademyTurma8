import javax.swing.JOptionPane;

import javafx.beans.binding.When;

public class Exercicio09 {
   public static void main(String[] args) throws Exception {
    int i = 0;//declarar variável do tipo numérico
    int num = Integer.parseInt(JOptionPane.showInputDialog("digite numero"));
    int resultado;

    while(i<=10){
        resultado=num*i;
        i=i+1;        
        System.out.println(resultado);    

    }


   }
    

}
