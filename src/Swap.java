import java.time.LocalDateTime;

public class Swap {
    private String monedaUno;
    private String monedaFinal;
    private Double montoPrimario;
    private Double cantidadEnMonedaObjetivo;

    public Swap(String monedaUno, String monedaFinal, double cantidadACambiar, double cantidadEnMonedaObjetivo) {
        this.monedaUno = monedaUno;
        this.monedaFinal = monedaFinal;
        this.montoPrimario = cantidadACambiar;
        this.cantidadEnMonedaObjetivo = cantidadEnMonedaObjetivo;
    }

    public String getMonedaUno() {

        return monedaUno;
    }

    public void setMonedaUno(String monedaUno) {

        this.monedaUno = monedaUno;
    }

    public String getMonedaFinal() {

        return monedaFinal;
    }

    public void setMonedaFinal(String monedaFinal) {

        this.monedaFinal = monedaFinal;
    }

    public Double getCantidadACambiar() {

        return montoPrimario;
    }

    public void setCantidadACambiar(Double cantidadACambiar) {

        this.montoPrimario = cantidadACambiar;
    }

    public Double getCantidadEnMonedaObjetivo() {

        return cantidadEnMonedaObjetivo;
    }

    public void setCantidadEnMonedaObjetivo(Double cantidadEnMonedaObjetivo) {
        this.cantidadEnMonedaObjetivo = cantidadEnMonedaObjetivo;
    }


}
