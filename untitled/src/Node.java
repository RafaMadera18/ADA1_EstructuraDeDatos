public class Nodo {
    private int valor;

    private Nodo siguiente;

    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return this.siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}

public class Pila {
    private Nodo inicio;

    private int tamano;

    public boolean estaVacia() {
        return this.inicio == null;
    }

    public int getTamano() {
        return this.tamano;
    }

    public void apilar(int valor) {
        var nuevo = new Nodo();
        nuevo.setValor(valor);
        if (estaVacia()) {
            this.inicio = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }

        this.tamano++;
    }

    public void retirar() {
        if (!estaVacia()) {
            inicio = inicio.getSiguiente();
            tamano--;
        }
    }

    public int cima() throws Exception {
        if (estaVacia()) {
            throw new Exception("La pila se encuentra vacia.");
        }
        return this.inicio.getValor();
    }

    public void eliminar(){
        this.inicio = null;
        this.tamano = 0;
    }

    public void listar(){
        Nodo aux = this.inicio;
        while (aux != null) {
            System.out.println("|\t" + aux.getValor() + "\t|");
            System.out.println("------------");
            aux = aux.getSiguiente();
        }
    }
}