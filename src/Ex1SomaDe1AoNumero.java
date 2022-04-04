import java.util.Scanner;

public class Ex1SomaDe1AoNumero {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numeroDig = leitor.nextInt();

        somatoria(numeroDig);
    }

    
    public static void somatoria(int numero){
        int soma = 0;
        for(int i = 0; i <= numero; i++){
            soma = soma+i;
        }
        System.out.println("O resultado da soma de 1 até "+numero+" é = "+soma);
    }

}
