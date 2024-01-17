import java.awt.color.ICC_Profile;

public class PilaApp {
    public static void main(String[] args) {

        Pila pila = new Pila();

        System.out.println("<<--Ejemplo de Pila -->>\n\n");

        pila.apilar(1);
        pila.apilar(2);
        pila.apilar(3);
        pila.apilar(4);
        pila.apilar(5);

        System.out.println("<<-- Pila -->>");
        pila.listar();
        System.out.println("\n<<-- Tamaño -->>");
        System.out.println(pila.getTamano());

        System.out.println("\n<<-- Retirar el elemento tope de la pila -->>");
        pila.retirar();
        pila.listar();
        System.out.println("Tamaño: " + pila.getTamano());

        System.out.println("\n<<-- Retirar el elemento tope de la pila -->>");
        pila.retirar();
        pila.listar();
        System.out.println("Tamaño: " + pila.getTamano());

        System.out.println("\n<<-- Retirar el elemento tope de la pila -->>");
        pila.retirar();
        pila.listar();
        System.out.println("Tamaño: " + pila.getTamano());

        System.out.println("\n<<-- Elimina la pila -->>");
        pila.eliminar();

        System.out.println("\n<<- Consulta si la pila esta vacia -->>");
        System.out.println(pila.estaVacia());

        System.out.println("\n\n<<-- Fin de ejemplo pila -->>");
    }
}