public class ExemplosAula {

    //Exemplo1
    public static void primeiroMetodo() {
        System.out.println("Meu primeiro método!");
    }

    //Exemplo3
    public static void main(String[] args) {
        primeiroMetodo(2);
        exibeNomeUsuario("Jenny");
        multiplicacao(3, 2);
    }
    public static int primeiroMetodo(int numero) {
        int resultado = numero+2;
        return resultado;
    }

    //Método sem retorno e sem parametro
    public static void metodoSemRetornoSemParametro(){
        System.out.println("Exemplo de método");
    }

    //Método sem retorno e com parametro
    public static void exibeNomeUsuario(String nomeUsuario){
        System.out.println("Olá "+nomeUsuario);
    }

    //Método com retorno e com parametro
    public static int multiplicacao(int numeroA, int numeroB){
        int resultado = numeroA * numeroB;
        System.out.println("O resultado é "+resultado);
        return resultado;
    }

    // Método com retorno e sem parametro
    
}
