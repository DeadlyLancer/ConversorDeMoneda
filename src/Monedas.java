import java.util.Map;

public record Monedas(String result,
                      Map<String, Double> conversion_rates) {
    public Double getConversionRate(String monedaObjetivo) {
        return conversion_rates.get(monedaObjetivo);
    }
}


