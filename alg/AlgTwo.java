import java.util.Scanner;;
public class AlgTwo {
    public static void main(String[] args) {
        int total = 0;
        int userNumber;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número");
       
        for(int n = 0; n < 5; n++) {
            userNumber = leitor.nextInt();

            if (userNumber >= 10 && userNumber <= 150) {
                total++;
            }
        }

        System.out.println("Total de número entres 10 e 150 (inclusives)" + total);

    }
}
