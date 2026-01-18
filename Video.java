    public class Video extends ContMulti {
         String resolucion;

        public Video(String titulo, int duracion, String resolucion) {
            super(titulo, duracion);
            this.resolucion = resolucion;
        }

        @Override
        public  void  pedirDatos() {
          String t,r;
           int d; 
             t = pedirTexto("Titulo del video: ");
                setTitulo(t);

             r = pedirTexto("Resolucion (1080p/720p/480p) : ");
                resolucion = r;
    
             d = pedirValor("Duracion en segundos: ");
                 setDuracion(d);
        
        }
         @Override
        public void reproducir() {
        System.out.println("Reproduciendo video: "
                + titulo
                + " [" + resolucion+ "]");
        }

         @Override
        public void mostrar() {
        System.out.println("[VIDEO] "
                + titulo
                + " | " + resolucion
                + " | " + duracion + "s");
        }
}
 











