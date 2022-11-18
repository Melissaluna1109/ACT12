import java.util.Scanner;
import java.util.InputMismatchException;

public class plantilla {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner entrada = new Scanner(System.in);
        int numero;
        boolean salir = false;
        while (!salir) {

            try {
                System.out.println("SELECIONA LA OPCION DESEADA222");
                System.out.println();
                System.out.println("¡Bienvenido a tu agenda de contactos!");
                System.out.println();
                System.out.println("1. Mostrar contactos de la agenda");
                System.out.println();
                System.out.println("2. Crear un nuevo contacto");
                System.out.println();
                System.out.println("3. Borrar un contacto");
                System.out.println();
                System.out.println("0. Salir");
                System.out.println();

                numero = entrada.nextInt();
                System.out.println();
                if (numero == 0) {
                    salir = true;
                } else if (numero > 0 && numero < 4) {
                    addressbook.load(addressbook.agenda);
                    switch (numero) {
                        case 1:
                            addressbook.list(addressbook.agenda);

                            break;
                        case 2:
                            addressbook.create(addressbook.agenda);
                            break;
                        case 3:
                            addressbook.delete(addressbook.agenda);
                            break;
                    }
                    addressbook.save(addressbook.agenda);
                } else {
                    throw new IllegalArgumentException("Opción no valida");
                }
            } catch (InputMismatchException e) {
                System.out.println();
                System.out.println("Debes de teclear un número");
                entrada.next();
                System.out.println();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.println();
            }
        }
    }
}
