public class Usuario {

    private int idIdentificacion;
    private String nombre;
    private String correo;
    private long telefono;

    public Usuario(int idIdentificacion, String nombre, String correo, long telefono) {
        this.idIdentificacion = idIdentificacion;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }

    public int getIdIdentificacion() { return idIdentificacion; }
    public String getNombre()        { return nombre; }
    public String getCorreo()        { return correo; }
    public long getTelefono()        { return telefono; }
}