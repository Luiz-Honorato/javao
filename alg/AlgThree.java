import java.util.Scanner;

public class AlgThree {
    public static void main(String[] args) {
        char sexo;
        int totalM = 0, totalH = 0;
        String name = "";
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite O nome: ");
            name = leitor.nextLine();

            System.out.println("Digite o sexo: ");
            sexo = leitor.next().charAt(0);
            leitor.nextLine();

            switch (sexo) {
                case 'm':
                    totalM++;
                    break;
                case 'h':
                    totalH++;
                    break;
                default:
                    continue;      
            }
        }

        System.out.println("Total Homem: " + totalH);
        System.out.println("Total Mulher: " + totalM);
    }
}
