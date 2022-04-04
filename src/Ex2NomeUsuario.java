import java.util.Scanner;

public class Ex2NomeUsuario {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nomeDig = leitor.nextLine();

        nomeUser(nomeDig);


    }

    public static void nomeUser (String nome){
        System.out.println("Meu nome é "+nome);

    }
}
