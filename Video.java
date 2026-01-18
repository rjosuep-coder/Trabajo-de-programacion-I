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
            System.out.println("[VIDEO] " + getTitulo() + " | Calidad: " + resolucion + " | " + getDuracion() + "s");
        }
         public  Video pedirDatosV() {
        String titulo,resolucion;
        double duracion;
        Scanner tex;
        Video v;
        tex= new Scanner(System.in);
        
        System.out.print("Introduce el título: ");
         titulo = sc.nextLine();

        System.out.print("Introduce el artista: ");
         resolucion = sc.nextLine();

        System.out.print("Introduce la duración (segundos): ");
         duracion = sc.nextDouble();
    
        //Limpiar el buffer después de leer números
        sc.nextLine(); 
         v = new Video(titulo, duracion, resolucion);
        return v;
    }
}
 



