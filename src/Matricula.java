import java.time.LocalDate;

public class Matricula {

    private int periodo;
    private double valor;
    private LocalDate fechaLimite;

    public Matricula(int periodo, double valor, LocalDate fechaLimite) {
        this.periodo = periodo;
        this.valor = valor;
        this.fechaLimite = fechaLimite;
    }

    public int getPeriodo()           { return periodo; }
    public double getValor()          { return valor; }
    public LocalDate getFechaLimite() { return fechaLimite; }

    public void maximoPago(LocalDate fecha) {
        if (fecha.isAfter(fechaLimite)) {
            System.out.println("Fecha limite de pago superada.");
        } else {
            System.out.println("Pago dentro del plazo.");
        }
    }
}