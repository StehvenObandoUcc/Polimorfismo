public class Clase {

    private int codigoMateria;
    private String nombreMateria;
    private boolean estado;
    private double calificacion;

    public Clase(int codigoMateria, String nombreMateria, boolean estado, double calificacion) {
        this.codigoMateria = codigoMateria;
        this.nombreMateria = nombreMateria;
        this.estado = estado;
        this.calificacion = calificacion;
    }

    public int getCodigoMateria()    { return codigoMateria; }
    public String getNombreMateria() { return nombreMateria; }
    public boolean getEstado()       { return estado; }
    public double getCalificacion()  { return calificacion; }
}