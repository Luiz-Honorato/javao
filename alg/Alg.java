import java.util.Scanner;

public class Alg {

    public static void main(String[] args) {
        String continuar;
        continuar = "s";
        int fabricacaoVeiculo = 0, totalSeminovos = 0, totalVeiculos = 0;
        float valorVeiculo, desconto, totalPagar;
        Scanner leitor = new Scanner(System.in);
        
        while(continuar.equals("s") || continuar.equals("S")) {
            System.out.println("Digite o ano do veículo: ");
            fabricacaoVeiculo = leitor.nextInt();
            leitor.nextLine();

            System.out.println("Digite o valor do veículo: ");
            valorVeiculo = leitor.nextFloat();
            leitor.nextLine();

            if (fabricacaoVeiculo <= 2000) {
                desconto = 0.12f;
            } else {
                desconto = 0.07f;
                totalSeminovos++;
            }
            totalVeiculos++;
            totalPagar = valorVeiculo * (1 - desconto); // Calcula o valor com desconto
            
            System.out.println("Valor do veículo: " + formatCurrency(valorVeiculo));
            System.out.println("Total a pagar: " + formatCurrency(totalPagar));

            System.out.println("Deseja continuar? S -SIM/N -Não");
            continuar = leitor.nextLine();
        }

        System.out.println("Total seminovos: " + totalSeminovos);
        System.out.println("Total de Veículos: " + totalVeiculos);
    }
    
    public static String formatCurrency(float value) {
        return String.format("%.2f", value);
    }

}
