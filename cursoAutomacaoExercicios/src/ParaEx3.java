public class ParaEx3 {
    // 3-) criar 1 métodos sem retorno que some dois valores e se for maior que 100, retorne true. Caso contrário, retorne false
    public static boolean maiorQueCem(int valor1, int valor2){
        int resultado = valor1+valor2;
        if(resultado>100){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        int numero2 = 12;
        int numero3 = 8;
        int numero4 = 15;
        int numero5= 305;

        System.out.println(maiorQueCem(numero2, numero4));


    }
    
        
            
}

