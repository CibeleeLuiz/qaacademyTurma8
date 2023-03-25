import javax.swing.JOptionPane;

public class Exercicio03 {
    public static void main(String[] args){
        String nome; //declarar variavel em texto
        String idadetrinta; //declarar variavel em tipo numerico
                

        nome = JOptionPane.showInputDialog("Digite nome");//Ler a palavara digitada
        idadetrinta = JOptionPane.showInputDialog("Digite a idade");// Ler a idade
        String terceiro;

        terceiro = idadetrinta;
        idadetrinta = nome;
        nome = terceiro;
        
        System.out.println("usuario digito nome" +nome);//Exibir a idade que foi digitada
        System.out.println("usuario digitou idade" +idadetrinta);//Exibir o nome digitado  

        
       }
    
}

