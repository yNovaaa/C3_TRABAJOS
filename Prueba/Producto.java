public class Producto {
    private int  codigo;
    private String descripcion;
    private double precio;

    public Producto(int codigo, String descripcion, double precio){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public int getCodigo(){
        return codigo;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public double getPrecio(){
        return precio;
    }

    public void mostrarProducto(){
        System.out.println("codigo: " + this.getCodigo());
        System.out.println("descripcion: " + this.getDescripcion());
        System.out.println("El precio es: " + this.getPrecio());
    }


}