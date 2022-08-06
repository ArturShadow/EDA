public class Arbol_Binario {
    Arbol_Nodo raiz;
    int cant;
    int altura;
    int subizq = 0;
    int subder = 0;
    String[] niveles;

    public Arbol_Binario() {
        raiz = null;
    }

    public void Insertar(int d) {
        Arbol_Nodo nuevo = new Arbol_Nodo(d);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            Arbol_Nodo auxiliar = raiz;
            Arbol_Nodo padre;
            while (true) {
                padre = auxiliar;
                if (d < auxiliar.data) {
                    auxiliar = auxiliar.left;
                    if (auxiliar == null) {
                        padre.left = nuevo;
                        return;
                    }
                } else {
                    auxiliar = auxiliar.right;
                    if (auxiliar == null) {
                        padre.right = nuevo;
                        return;
                    }
                }
            }
        }
    }

    public boolean Vacio() {
        return raiz == null;
    }

    private void InOrden(Arbol_Nodo r) {
        if (r != null) {
            InOrden(r.left);
            System.out.print(r.data + ", ");
            InOrden(r.right);
        }
    }

    public void recorrerInOrden() {
        InOrden(raiz);
    }

    private void PreOrden(Arbol_Nodo r) {
        if (r != null) {
            System.out.print(r.data + ", ");
            PreOrden(r.left);
            PreOrden(r.right);
        }

    }

    public synchronized void recorrerPreOrden() {
        PreOrden(raiz);
    }

    private void PostOrden(Arbol_Nodo r) {
        if (r != null) {
            PostOrden(r.left);
            PostOrden(r.right);
            System.out.print(r.data + ", ");
        }
    }

    public synchronized void recorrerPostOrden() {
        PostOrden(raiz);
    }

    public Arbol_Nodo BuscarNodo(int d) {
        Arbol_Nodo aux = raiz;
        while (aux.data != d) {
            if (d < aux.data) {
                aux = aux.left;
            } else {
                aux = aux.right;
            }
            if (aux == null) {
                return null;
            }
        }
        return aux;
    }

    public boolean existe(int info) {
        Arbol_Nodo reco = raiz;
        while (reco != null) {
            if (info == reco.data) {
                return true;
            } else if (info > reco.data) {
                reco = reco.right;
            } else {
                reco = reco.left;
            }
        }
        return false;
    }

    private void cantidadNodosHoja(Arbol_Nodo reco) {
        if (reco != null) {
            if (reco.left == null && reco.right == null) {
                cant++;
            }
            cantidadNodosHoja(reco.left);
            cantidadNodosHoja(reco.right);
        }
    }

    public int cantidadNodosHoja() {
        cant = 0;
        cantidadNodosHoja(raiz);
        return cant;
    }

    public int retornarAltura() {
        altura = 0;
        retornarAltura(raiz, 1);
        return altura;
    }

    private void retornarAltura(Arbol_Nodo reco, int nivel) {
        if (reco != null) {
            retornarAltura(reco.left, nivel + 1);
            if (nivel > altura) {
                altura = nivel;
            }
            retornarAltura(reco.right, nivel + 1);
        }
    }

    public void menorValor() {
        if (raiz != null) {
            Arbol_Nodo reco = raiz;
            while (reco.left != null) {
                reco = reco.right;
            }
            System.out.println("Menor valor del árbol:" + reco.data);
        }
    }

    public void mayorValor() {
        if (raiz != null) {
            Arbol_Nodo reco = raiz;
            while (reco.right != null) {
                reco = reco.right;

            }
            System.out.println("Mayor valor del árbol:" + reco.data);
        }
    }

    public void imprimirBalance() {
        subizq = 0;
        subder = 0;
        Balance(this.raiz, true, 0);
        System.out.println("lado Izquierdo " + subizq + " Lado Derecho " + subder);
        if (subizq - subder == 0) {
            System.out.println("El balance es: 0 ");
        } else if (subizq - subder == -1) {
            System.out.println("El balance es -1, derecha");
        } else if (subizq - subder == 1) {
            System.out.println("El balance 1, izquierda");
        } else {
            System.out.println("No es balanceado.." + "porque es mas grande el lado "
                    + ((subizq > subder) ? "Izquierdo" : "Derecho"));
        }
    }

    public void Balance(Arbol_Nodo reco, boolean lado, int i) {
        if (reco != null) {
            if (reco.right == null && reco.left == null) {
                if (lado) {
                    subder = (i > subder) ? i : subder;
                } else {
                    subizq = (i > subizq) ? i : subizq;
                }
            }
            Balance(reco.right, lado, i + 1);
            if (i == 0) {
                lado = false;
            }
            Balance(reco.left, lado, i + 1);
        }
    } // altura arbol

    public void imprimirNivel() {
        niveles = new String[altura + 1];
        imprimirNivel(raiz, 0);
        for (int i = 0; i < niveles.length; i++) {
            System.out.println("Número " + niveles[i] + "en el nivel... " + i);
        }
    }

    private void imprimirNivel(Arbol_Nodo pivote, int nivel2) {
        if (pivote != null) {
            niveles[nivel2] = pivote.data + ", " + ((niveles[nivel2] != null) ? niveles[nivel2] : "");
            imprimirNivel(pivote.right, nivel2 + 1);
            imprimirNivel(pivote.left, nivel2 + 1);
        }
    }

    public void imprimirAlturaDeCadaNodo() {
        imprimirAlturaDeCadaNodo(raiz, 1);
    }

    private void imprimirAlturaDeCadaNodo(Arbol_Nodo reco, int nivel) {
        if (reco != null) {
            System.out.println("El nodo contiene: " + reco.data + " y su altura es: " + nivel);
            imprimirAlturaDeCadaNodo(reco.left, nivel + 1);
            imprimirAlturaDeCadaNodo(reco.right, nivel + 1);
        }
    }

    public boolean Eliminar(int d) {
        Arbol_Nodo auxiliar = raiz;
        Arbol_Nodo padre = raiz;
        boolean hijoizq = true;
        while (auxiliar.data != d) {
            padre = auxiliar;
            if (d < auxiliar.data) {
                hijoizq = true;
                auxiliar = auxiliar.left;
            } else {
                hijoizq = false;
                auxiliar = auxiliar.right;
            }
            if (auxiliar == null) {
                return false;
            }
        } // si es hoja
        if (auxiliar.left == null && auxiliar.right == null) {

            if (auxiliar == raiz) {
                raiz = null;
            } else if (hijoizq) {
                padre.left = null;
            } else {
                padre.right = null;
            }
        } else if (auxiliar.right == null)

        {
            if (auxiliar == raiz) {
                raiz = auxiliar.left;
            } else if (hijoizq) {
                padre.left = auxiliar.left;
            } else {
                padre.right = auxiliar.left;
            }
        } else if (auxiliar.left == null) {
            if (auxiliar == raiz) {
                raiz = auxiliar.right;
            } else if (hijoizq) {
                padre.left = auxiliar.right;
            } else {
                padre.right = auxiliar.right;
            } // es la raiz
        } else {
            Arbol_Nodo reemplazo = ObtenerReemplazo(auxiliar);
            if (auxiliar == raiz) {
                raiz = reemplazo;
            } else if (hijoizq) {
                padre.left = reemplazo;
            } else {
                padre.right = reemplazo;
            }
            reemplazo.left = auxiliar.left;
        }
        return true;
    }

    private Arbol_Nodo ObtenerReemplazo(Arbol_Nodo nodoreemplazo) {
        Arbol_Nodo reemplazarpadre = nodoreemplazo;
        Arbol_Nodo reemplazo = nodoreemplazo;
        Arbol_Nodo auxiliar = nodoreemplazo.right;
        while (auxiliar != null) {
            reemplazarpadre = reemplazo;
            reemplazo = auxiliar;
            auxiliar = auxiliar.left;
        }
        if (reemplazo != nodoreemplazo.right) {
            reemplazarpadre.left = reemplazo.right;
            reemplazo.right = nodoreemplazo.right;
        }
        System.out.println("El Nodo Reemplazo es: " + reemplazo);
        return reemplazo;

    }

    public int cantidadNodos() {
        cant = 0;
        cantidad(raiz);
        return cant;
    }

    private void cantidad(Arbol_Nodo reco) {
        if (reco != null) {
            cant++;
            cantidad(reco.left);
            cantidad(reco.right);
        }
    }

    public Arbol_Nodo Raiz() {
        return raiz;
    }

    String NodosHojas() {
        throw new UnsupportedOperationException("Not supported yet.");
        // To change body of generated methods, choose Tools | Templates.
    }

    String retornaAltura() {
        throw new UnsupportedOperationException("Not supported yet.");
        // To change body of generated methods, choose Tools | Templates.
    }
}
