public class ParamEx1 {
    //2-) Criar 1 método com retorno que monte uma frase com os valores que recebeu por parâmetro
    public static String texto(String primeiroTexto, String segundoTexto){
        return primeiroTexto+segundoTexto;
    }

    public static void main(String[] args){
        String primeiroTexto = "Primeiro texto leitura";
        String segundoTexto = "Segundo texto concatena";
        System.out.println(texto(primeiroTexto, segundoTexto));
    }

}
