    public class Video extends ContMulti {
        private String resolucion;

        public Video(String titulo, double duracion, String resolucion) {
            super(titulo, duracion);
            this.resolucion = resolucion;
        }

        public void reproducir() {
            System.out.println("🎬 Proyectando: " + getTitulo() + " (" + resolucion + ")");
         }

        public void mostrarDetalles() {
            System.out.println("[VIDEO] " + getTitulo()+ " | "+ resolucion + " | " + getDuracion() + "s");
        }
        @Override
        public  void  pedirDatos() {
          String t,r;
           int d; 
              t = pedirTexto("Titulo de la cancion: ");
                setTitulo(t);

               r = pedirTexto("Resolucion: ");
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
 






