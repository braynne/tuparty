package iub.tuparty.entidades;

public class ClaseBase {
    private int id;
    
    public void guardar() {
        System.out.println("Se está guardando");
    }
    
    public void eliminar() {
        System.out.println("Se está cerrando");
    }
    
    @Override
    public String toString() {
        return String.valueOf(id);
    }

    public int getId() { return id; }

    public void setId(int id) {
        this.id = id;
    }
    
}