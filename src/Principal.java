import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();

        int opcion = 0;
        while (opcion!=7){
            System.out.println("Conversor de divisas\n\n"+
                    "1. Dolar americano a Peso Colombiano\n" +
                    "2. Peso Colombiano a Dolar americano\n" +
                    "3. Dolar americano a Peso Argentino\n" +
                    "4. Peso Argentino a Dolar americano\n" +
                    "5. Dolar americano a Real Brasilero\n" +
                    "6. Real Brasilero a Dolar americano\n"+
                    "7. Salir");
            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion)  {
                case 1:
                    ConvertirMoneda.convertir( "USD",  "COP", consulta, lectura);
                    break;

                case 2:
                    ConvertirMoneda.convertir( "COP",  "USD", consulta, lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir( "USD",  "ARS", consulta, lectura);
                    break;

                case 4:
                    ConvertirMoneda.convertir( "ARS",  "USD", consulta, lectura);
                    break;
                case 5:
                    ConvertirMoneda.convertir( "USD",  "BRL", consulta, lectura);
                    break;

                case 6:
                    ConvertirMoneda.convertir( "BRL",  "USD", consulta, lectura);
                    break;
                case 7:
                    System.out.println("Hasta pronto");
                    break;


            }


        }

    }
}