import java.util.Scanner;

public class ConvertirMoneda {

    public static void convertir(String monedaBase, String monedaTarget, ConsultarMoneda consulta, Scanner Lectura){
        double cantidad;
        double cantidadConvertida;

        Monedas monedas = consulta.buscarMoneda(monedaBase, monedaTarget);
        System.out.println("La tasa de conversion es"+monedaBase+"="+monedas.conversion_rate()+" "+monedaTarget);
        System.out.println("Ingresar la cantidad de"+monedaBase);
        cantidad = Double.parseDouble(Lectura.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println(cantidad+" "+monedaBase +" = "+cantidadConvertida +" "+monedas.target_code());


}
public static void convertirOtraMoneda(ConsultarMoneda consulta, Scanner lectura){
        System.out.println("Ingresar codigo de moneda base:");
        String monedaBase = lectura.nextLine().toUpperCase();
        System.out.println("Ingrese la moneda objetivo:");
        String monedaObjetivo = lectura.nextLine().toUpperCase();
        convertir(monedaBase,monedaObjetivo,consulta,lectura);

    }
}
