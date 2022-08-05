public class Pila {
    private Nodo cima;
    private int tamaño;

    public Pila() {
        cima = null;
        tamaño = 0;
    }

    public boolean estaVacia(){
        return cima == null;
    }

    public void Apilar(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguente = cima;
        cima = nuevo;
        tamaño++;
    }

    public int Despilar() {
        int aux = cima.getDato();
        cima = cima.getSiguente();
        tamaño--;
        return aux;
    }

    public int Cima() {
        return cima.getDato();
    }

    public int getTamaño() {
        return tamaño;
    }

    public String MostrarPila() {
        Nodo temp = cima;
        String mPila = "";
        while(!estaVacia()){
            mPila += cima.dato + "\n";
            cima = cima.siguente;
        }
        cima = temp;
        return mPila;
    }

    public String invertirPila() {
        Nodo temp = cima;
        Pila cc = new Pila();
        while(!estaVacia()){
            cc.Apilar(cima.dato);
            cima = cima.siguente;
        }
        cima = temp;
        return cc.MostrarPila();
    }
} 
