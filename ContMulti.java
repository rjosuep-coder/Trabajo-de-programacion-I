public class ContMulti implements Reproducible {
    String titulo;
    double duracion;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getDuracion() {
        return duracion;
    }
    
    public ContMulti(String titulo, double duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }
}



