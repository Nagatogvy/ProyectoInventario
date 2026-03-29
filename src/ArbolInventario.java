public class ArbolInventario {

    Producto raiz;

    public ArbolInventario() {
        raiz = null;
    }

    // INSERTAR
    public void insertar(int id, String nombre) {
        raiz = insertarRec(raiz, id, nombre);
    }

    private Producto insertarRec(Producto raiz, int id, String nombre) {

        if (raiz == null) {
            return new Producto(id, nombre);
        }

        if (id < raiz.id) {
            raiz.izquierdo =
                insertarRec(raiz.izquierdo, id, nombre);
        }

        else if (id > raiz.id) {
            raiz.derecho =
                insertarRec(raiz.derecho, id, nombre);
        }

        return raiz;
    }
    // MOSTRAR INVENTARIO
    public void mostrarInventario() {
        inorden(raiz);
    }

    private void inorden(Producto raiz) {

     if (raiz != null) {

        inorden(raiz.izquierdo);

        System.out.println(
            "ID: " + raiz.id +
            " | Nombre: " + raiz.nombre
        );

        inorden(raiz.derecho);
        }
    }
    // BUSCAR PRODUCTO
    public boolean buscar(int id) {
     return buscarRec(raiz, id);
    }

    private boolean buscarRec(Producto raiz, int id) {

     if (raiz == null) {
          return false;
     }

     if (raiz.id == id) {
         return true;
      }

     if (id < raiz.id) {
         return buscarRec(raiz.izquierdo, id);
     }

     return buscarRec(raiz.derecho, id);
    }

}