import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class JalaMonedas {

    public Monedas jalaMoneda (String tipoDeMoneda) {
        URI dirección = URI.create("https://v6.exchangerate-api.com/v6/c7824e6f6bdffb8fa3d19d40/latest/" + tipoDeMoneda + "/");
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(dirección)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Monedas.class);

        } catch (Exception e) {
            throw new RuntimeException("No se puede convertir.");
        }
    }
}
