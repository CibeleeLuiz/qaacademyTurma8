public class Excasa3 {
    //criar um método com retorno que receba como parâmetro um número inteiro e retorne true e o valor do parâmetro divido por 2 for igual a 0. Caso contrário, retornar false. Exiba a resposta no método main.

    public static boolean eDivisivelPorDois(int num){
        if(num%2==0){
            return true;           
        }
        else{
            return false;

        }

    }
    public static void main(String[] args){
        int meuvalor = 1547;
        System.out.println(eDivisivelPorDois(meuvalor));
    }
    
}
