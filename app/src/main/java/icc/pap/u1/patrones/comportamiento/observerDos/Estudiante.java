package icc.pap.u1.patrones.comportamiento.observerDos;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Estudiante {
    private String codigo;
    private String nombreCompleto;
    private double promedioAcademico;
    private int numeroInacistencias;
    private EstadoMatricula estado;
    private final List<Consumer<CambioEstudiante>> observadores;

    public Estudiante(String codigo, String nombreCompleto, double promedioAcademico, int numeroInacistencias,
            EstadoMatricula estado) {
        this.codigo = codigo;
        this.nombreCompleto = nombreCompleto;
        this.promedioAcademico = promedioAcademico;
        this.numeroInacistencias = numeroInacistencias;
        this.estado = estado;
        this.observadores = new ArrayList<>();
    }

    public void suscribir(Consumer<CambioEstudiante> observador) {
        observadores.add(observador);
    }

    public void notifyAll(CambioEstudiante cambio) {
        for (Consumer<CambioEstudiante> observador : observadores) {
            observador.accept(cambio);
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (this.codigo.equals(codigo)) return;
        String oldCod = this.codigo;
        this.codigo = codigo;
        notifyAll(new CambioEstudiante(this, "codigo", oldCod, codigo));
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        if (this.nombreCompleto.equals(nombreCompleto)) return;
        String oldNom = this.nombreCompleto;
        this.nombreCompleto = nombreCompleto;
        notifyAll(new CambioEstudiante(this, "nombre", oldNom, nombreCompleto));
    }

    public double getPromedioAcademico() {
        return promedioAcademico;
    }

    public void setPromedioAcademico(double promedioAcademico) {
        if (this.promedioAcademico == promedioAcademico) return;
        double oldProm = this.promedioAcademico;
        this.promedioAcademico = promedioAcademico;
        notifyAll(new CambioEstudiante(this, "promedio", oldProm, promedioAcademico));
    }

    public int getNumeroInacistencias() {
        return numeroInacistencias;
    }

    public void setNumeroInacistencias(int numeroInacistencias) {
        if (this.numeroInacistencias == numeroInacistencias) return;
        int oldIna = this.numeroInacistencias;
        this.numeroInacistencias = numeroInacistencias;
        notifyAll(new CambioEstudiante(this, "inasistencias", oldIna, numeroInacistencias));
    }

    public EstadoMatricula getEstado() {
        return estado;
    }

    public void setEstado(EstadoMatricula estado) {
        if (this.estado == estado) return;
        EstadoMatricula oldEstado = this.estado;
        this.estado = estado;
        notifyAll(new CambioEstudiante(this, "estado", oldEstado, estado));
    }

    public List<Consumer<CambioEstudiante>> getObservadores() {
        return observadores;
    }

    @Override
    public String toString() {
        return "Estudiante [codigo=" + codigo + ", nombreCompleto=" + nombreCompleto + ", promedioAcademico="
                + promedioAcademico + ", numeroInacistencias=" + numeroInacistencias + ", estado=" + estado + "]";
    }
}