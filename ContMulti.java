import java.util.Scanner;

public abstratc class ContMulti implements Reproducible {
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






