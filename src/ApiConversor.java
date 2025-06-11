import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiConversor {

    public String getConversionRates(String baseCurrency) {
        String apiKey = "1f66390c6afdae990f56d303";
        URI uri = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + baseCurrency);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (Exception e) {
            throw new RuntimeException("Não foi possível obter as taxas de câmbio.", e);
        }
    }
}
