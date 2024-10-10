import java.util.ArrayList;
import java.util.Scanner;

public class MenuDeOpciones {
    public void mostrarMenuMonedas(String denominacion){
        System.out.println("Seleccione la denominación " + denominacion + ": \n");
        System.out.println(listaMoneda);
    }

    private final String listaMoneda =          """
                    USD --- Dólar Estadounidense
                    BOB --- Bolivar Boliviano
                    ARS --- Peso Argentino
                    BRL --- Real Brasileño
                    CLP --- Peso Chileno
                    COP --- Peso Colombiano
                    EUR --- Euro
                    GBP --- Libra Esterlina
                    MXN --- Peso Mejicano       """;

    public void mostrarMenuPrincipal(){
        System.out.println("A continuación digíte la opción que desea realizar: \n");
        String menuPrincipal =                      """
                             1) Convertir divisas
                             2) Salir               """;
        System.out.println(menuPrincipal);
    }

    public int leerOpcionPrincipal(){
        Scanner lectura = new Scanner(System.in);
        System.out.println("Vuelve a intentarlo");
        return lectura.nextInt();
    }

    public String leerOpcionMoneda(){
        Scanner lectura = new Scanner(System.in);
        String opcion = lectura.nextLine().toLowerCase();
        while (!listaMoneda.toLowerCase().contains(opcion)) {
            System.out.println("Ocurrió un error, digite nuevamente las 3 letras correspondientes");
            opcion = lectura.nextLine().toLowerCase();
        }
        return opcion.toUpperCase();
    }

    public Double leerCantidadACambiar(){
        System.out.println("Digite el monto a convertir");
        Scanner lectura = new Scanner(System.in);
        double cantidad;
        while (!lectura.hasNextDouble()) {
            System.out.println("La cantidad digitada no es un número válido");
            System.out.println("Ingrese una cantidad válida");
            lectura.nextLine();
        }
        cantidad = lectura.nextDouble();
        lectura.nextLine();
        return cantidad;
    }

    public Double cantidadObtenida(
            String monedaBase,
            Double cantidadCambiar,
            Double tasaDeConversion,
            String monedaFinal){

        Double resultado = cantidadCambiar * tasaDeConversion;
        System.out.println("\n"+"\n"+"\n"+"---" +cantidadCambiar + " " + monedaBase + " equivalen a: " + resultado + " " + monedaFinal+ "---" +"\n"+"\n"+"\n");
        return resultado;
    }



}

