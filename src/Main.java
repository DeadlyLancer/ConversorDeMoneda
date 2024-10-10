import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int opcionUsuario = 0;
        JalaMonedas consulta = new JalaMonedas();
        ArrayList<Swap> listaDeConversiones = new ArrayList<>();
        while (opcionUsuario != 2) {
            MenuDeOpciones menu = new MenuDeOpciones();
            menu.mostrarMenuPrincipal();
            opcionUsuario = menu.leerOpcionPrincipal();

            switch (opcionUsuario) {
                case 1:
                    menu.mostrarMenuMonedas("de origen");
                    String monedaBase = menu.leerOpcionMoneda();
                    menu.mostrarMenuMonedas("\n"+"Objetivo");
                    String monedaFinal = menu.leerOpcionMoneda();
                    Double cantidadCambiar = menu.leerCantidadACambiar();
                    Monedas conversor = consulta.jalaMoneda(monedaBase);
                    Double tasaDeConversion = conversor.getConversionRate(monedaFinal.toUpperCase());
                    Double cantidadObtenida = menu.cantidadObtenida(monedaBase, cantidadCambiar, tasaDeConversion, monedaFinal);
                    Swap nuevaConversion = new Swap(monedaBase, monedaFinal, cantidadCambiar, cantidadObtenida);
                    listaDeConversiones.add(nuevaConversion);
                    break;
                case 2:
                    System.out.println("Gracias por utilizar el conversor de moneda");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción del menú.");
            }

        }
    }
}