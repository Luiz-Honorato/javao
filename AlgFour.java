import java.util.Scanner;

public class AlgFour {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        
        Scanner leitor = new Scanner(System.in);

        for(int i = 0; i < 3; i++) {
            System.out.println("Informe o número: ");
            numeros[i] = leitor.nextInt();
            
        }

        for(int j = 0; j < numeros.length - 1; j++) {
            for(int k = 0; k < numeros.length - j - 1; k++) {
                if(numeros[k] > numeros[k + 1]) {
                    int temp = numeros[k];
                    numeros[k] = numeros[k + 1];
                    numeros[k + 1] = temp;
                }
            }
        }

        for(int numero : numeros) {
            System.out.println(numero);
        }
    
    }
}
