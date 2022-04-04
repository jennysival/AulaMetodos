import java.util.Scanner;

public class Ex3IMC {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite sua altura (ex: 1,70):");
        double altura = leitor.nextDouble();

        System.out.println("Digite seu peso (ex: 70,5):");
        double peso = leitor.nextDouble();

        resultadoIMC(peso, altura);

    }



    public static double resultadoIMC(double peso, double altura){

        double contaIMC = peso / (altura*altura);

        if (contaIMC < 18.5){
            System.out.println("Você está abaixo do seu peso ideal: Magreza");
        }

        else if (contaIMC >= 18.5 && contaIMC <= 24.9){
            System.out.println("Você está em seu peso ideal: Normal");
        }

        else if (contaIMC >= 25 && contaIMC <= 29.9){
            System.out.println("Você está acima do seu peso ideal: Sobrepeso");
        }

        else if (contaIMC >= 30 && contaIMC <= 39.9){
            System.out.println("Você está acima do seu peso ideal: Obesidade");
        }

        else {
            System.out.println("Você está acima do seu peso ideal: Obesidade Grave");
        }

        return contaIMC;

        
    }
}