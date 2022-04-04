import java.util.Scanner;

public class ExemploNome {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nomeDig = leitor.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobrenomeDig = leitor.nextLine();

        exibeNomeSobrenome(nomeDig, sobrenomeDig);
    }

    public static void exibeNomeSobrenome(String nome, String sobrenome){
        System.out.println("Olá "+nome+" "+sobrenome);
    }
}
