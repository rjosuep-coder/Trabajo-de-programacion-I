import java.util.Scanner;

public abstract class ContMulti implements Reproducible {
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
    
    public ContMulti(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public String pedirTexto(String tex){
        String texto;
        Scanner tec;
        tec = new Scanner(System.in);
        
        System.out.println(tex);
        texto = tec.nextLine();
        return texto;
    }
    
    public int pedirValor(String tex){
        Scanner tec;
        tec = new Scanner(System.in);
        int valor;
        
        System.out.println(tex);
        valor = tec.nextInt();
        return valor;
    }
}









