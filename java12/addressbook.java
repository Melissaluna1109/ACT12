import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.io.*;

public class addressbook {

    static HashMap<String, String> agenda = new HashMap<>();

    public static void list(HashMap<String, String> agenda) {
        Iterator<String> recorrer = agenda.keySet().iterator();
        System.out.println("Contactos:");
        while (recorrer.hasNext()) {
            String indice = recorrer.next();
            System.out.println(indice + " : " + agenda.get(indice));
        }
        System.out.println();
    }

    public static void create(HashMap<String, String> agenda) {
        String nombre, telefono;
        Scanner entrada = new Scanner(System.in);
        System.out.print(" nombre del contacto: ");
        nombre = entrada.nextLine();
        System.out.print(" telefono : ");
        telefono = entrada.nextLine();
        agenda.put(telefono, nombre);
        System.out.println("Se agrego el contacto : " + nombre);
        System.out.println();
    }

    public static void delete(HashMap<String, String> agenda) {
        String telefono;
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Ingresa el telefono que desea eliminar  ");
            telefono = entrada.nextLine();
        }
        System.out.println("Se elimino contacto con  el numero: " + telefono);
        agenda.remove(telefono);
        System.out.println();
    }

    public static void load(HashMap<String, String> agenda2) {
    }

    public static void save(HashMap<String, String> agenda2) {
    }

}