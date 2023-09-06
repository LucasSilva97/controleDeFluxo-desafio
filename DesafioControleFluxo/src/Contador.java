import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = inputScanner.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = inputScanner.nextInt();

        System.out.println(parametroUm);
        System.out.println(parametroDois);

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

        inputScanner.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        } else {
            int contagem = parametroDois - parametroUm;
            System.out.println("\nImprimindo as ocorrências:\n");
            for (int i = 1; i <= contagem; i++) {
                System.out.printf("Imprimindo o número %d\n", i);
            }
        }
    }
}