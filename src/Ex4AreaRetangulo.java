import java.util.Scanner;

public class Ex4AreaRetangulo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor da base do retângulo:");
        int base = leitor.nextInt();

        System.out.println("Digite o valor da altura do retângulo:");
        int altura = leitor.nextInt();

        int area = base*altura;

        areaRetangulo(area);
    }

    public static void areaRetangulo(int area){
        System.out.println("A área do retangulo é: "+area);

    }
}
