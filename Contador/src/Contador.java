import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Digite o primeiro número: ");
        int numero1 = sc.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int numero2 = sc.nextInt();

        try {
            verificarParametros(numero1, numero2);
            imprimirNumeros(numero1, numero2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }

    public static void verificarParametros(int numero1, int numero2) throws ParametrosInvalidosException {
        if (numero1 < numero2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    public static void imprimirNumeros(int numero1, int numero2) {
        int subtracao = numero1 - numero2;
        for (int i = 1; i <= subtracao; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
