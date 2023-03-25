import javax.swing.JOptionPane;

public class Exercicio02 {
    public static void main(String[] args) {

        String palavradigitada;// declarar variavel do tipo de texto

        palavradigitada = JOptionPane.showInputDialog("Digite uma palavra"); //Ler a palavra digitada
        
        System.out.println("o usuario digitou :"+palavradigitada); //Exibir: "O usuario digitou: "+palavra digitada        

    }
}
