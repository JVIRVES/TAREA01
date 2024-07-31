import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String OP;

        System.out.println("\n\t Bienvenido a 'Your Best Library'");
        System.out.println("\n ¿Que deseas realizar hoy?: ");
        System.out.println("\n a) Crear un Usuario \n b) Ingresar a la biblioteca \n c) Modificar Usuario \n Escoge una opción: ");
        OP = sc.nextLine();

        if (OP.equals("a")) {

            System.out.println("\n Ingrese un nombre de  Usuario: ");
            Usuario usuario = new Usuario();
            System.out.println("\n Ingrese su No. de ID: ");
            usuario.setID(sc.nextInt());
            System.out.println("\n Ingrese su nombre : ");
            usuario.setNombre(sc.nextLine());
            System.out.println("\n Ingrese su apellido : ");
            usuario.setApellido(sc.nextLine());
            System.out.println("\n Ingrese su correo : ");
            usuario.setCorreo(sc.nextLine());

        }else if (OP.equals("b")) {

            String X;
            String Y;
            System.out.println("\n Ingrese su nombre de  Usuario: ");
            Y= sc.nextLine();
            System.out.println("\n Bienvenido a 'Your Best Library' " + Y);
            System.out.println("\n ¿Deseas ver los libros disponibles?");
            X = sc.nextLine();

            if (X.equals("yes")) {

                Set<String>conjuntoHash = new HashSet<>();
                conjuntoHash.add("Bajo la Misma Estrella, John Green, Ed: Nube de Tinta, Año: 2014, P: 301");
                conjuntoHash.add("Mi Vida de Rubia, Flor Aguilera, Ed: Loqueleo, Año: 2008, P: 152");
                conjuntoHash.add("Ghost Girl, Tonya Hurley, Ed: Alfaguara, Año: 2008, P: 344");
                conjuntoHash.add("Juventud en Extasis, Carlos Sanchez, Ed: Diamante, Año: 1995, P: 192");
                conjuntoHash.add("El Cristal con que se mira, Alicia Molina, Ed: FCE, Año: 2011, P: 220");

                for (String valor : conjuntoHash) {

                    System.out.println("Libro: " + valor);
                }

            }else {

                System.out.println("\n Que tengas buen día");
            }

        }


    }
}
