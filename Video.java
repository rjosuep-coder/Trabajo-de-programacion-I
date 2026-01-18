    public class Video extends ContMulti {
        private String resolucion;

        public Video(String titulo, int duracion, String resolucion) {
            super(titulo, duracion);
            this.resolucion = resolucion;
        }

        public void reproducir() {
            System.out.println("🎬 Proyectando: " + getTitulo() + " (" + resolucion + ")");
         }

        public void mostrarDetalles() {
            System.out.println("[VIDEO] " + getTitulo() + " | Calidad: " + resolucion + " | " + getDuracion() + "s");
        }
}
 

