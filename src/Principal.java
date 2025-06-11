import com.google.gson.Gson;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) { Scanner scanner = new Scanner(System.in);
        ApiConversor apiConversor = new ApiConversor();
        Gson gson = new Gson();

        while (true) {
            System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
            System.out.println("°   Seja bem-vindo(a) ao Conversor de Moedas!   °");
            System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°° \n");
            System.out.println("Escolha uma das opções de conversão abaixo:");
            System.out.println("(1) Dólar Americano (USD) =>> Real Brasileiro (BRL)");
            System.out.println("(2) Real Brasileiro (BRL) =>> Dólar Americano (USD)");
            System.out.println("(3) Dólar Americano (USD) =>> Peso Argentino (ARS)");
            System.out.println("(4) Peso Argentino (ARS) =>> Dólar Americano (USD)");
            System.out.println("(5) Dólar Americano (USD) =>> Iene Japonês (JPY)");
            System.out.println("(6) Iene Japonês (JPY) =>> Dólar Americano (USD)");
            System.out.println("(7) Sair");
            System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");

            System.out.print("Digite a opção de sua escolha: ");
            int choice = scanner.nextInt();

            if (choice == 7) {
                System.out.println("Obrigado por usar o conversor. Até a próxima conversão!");
                break;
            }

            if (choice < 1 || choice > 6) {
                System.out.println("Opção digitada está inválida. Tente mais uma vez.");
                continue;
            }

            System.out.print("Digite o valor que deseja converter: ");
            double amount = scanner.nextDouble();

            String baseCurrency = "";
            String targetCurrency = "";

            switch (choice) {
                case 1: baseCurrency = "USD"; targetCurrency = "BRL"; break;
                case 2: baseCurrency = "BRL"; targetCurrency = "USD"; break;
                case 3: baseCurrency = "USD"; targetCurrency = "ARS"; break;
                case 4: baseCurrency = "ARS"; targetCurrency = "USD"; break;
                case 5: baseCurrency = "USD"; targetCurrency = "JPY"; break;
                case 6: baseCurrency = "JPY"; targetCurrency = "USD"; break;
            }

            try {
                // 1. Fazer a requisição à API
                String jsonResponse = apiConversor.getConversionRates(baseCurrency);

                // 2. Usar o GSON para converter o JSON para nosso objeto Java
                ConversorApp conversorApp = gson.fromJson(jsonResponse, ConversorApp.class);

                // 3. Obter a taxa específica e calcular o valor
                double rate = conversorApp.conversionRates().get(targetCurrency);
                double convertedAmount = amount * rate;

                // 4. Exibir o resultado formatado
                System.out.printf("\nResultado: %.2f %s equivalem a %.2f %s\n\n",
                        amount, baseCurrency, convertedAmount, targetCurrency);

            } catch (Exception e) {
                System.err.println("Ocorreu um erro: " + e.getMessage());
            }
        }
        scanner.close();

    }
}
