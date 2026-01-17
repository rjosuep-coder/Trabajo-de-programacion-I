public class ContMulti {
    String titulo;
    int duracion;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }
    
    public ContMulti(String titulo, int duracionSegundos) {
        this.titulo = titulo;
        this.duracion = duracion;
    }
}
