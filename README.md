import java.util.Scanner;

public class Aplicacion {
         public static void main( String arg[]){
                Aplicacion ap;
                ap = new Aplicacion();
                int n;
                Globo[] arr;
                Punto p;
                Globo[] min;
                String premios;        
                
                n = ap.pedirValor(8,30, " para la cantidad de globos");
                arr = ap.generarGlobos(n);
                ap.mostrarArr(arr);
                p = ap.pedirPunto();
                min = ap.globoCercano(p,arr);
                ap.mostrarArr(min);
                //premios = ap.obtenerPremios(arr);
                //mostrar();
         }
         
         
        public int pedirValor(int li, int ls, String a){
            Scanner tec;
            tec= new Scanner(System.in);
            int valor;
        
             do {
                System.out.println("Ingrese un valor entre " + li + " y " + ls + a);
                valor = tec.nextInt();
            } while (valor < li || valor > ls);
        
            return valor;
        }
        
        public Punto pedirPunto (){
        Punto p = new Punto();
        
        float x,y;
        System.out.println("");
        System.out.println("Ingresar punto");
        
        x = pedirValor(0,800, " para x");
        y = pedirValor(0,600, " para y");
        
        p.setCoordenadaX(x);
        p.setCoordenadaY(y);
        
        return p;
    }
        
        public Globo[] generarGlobos(int n){
            Globo[] arr;
            arr = new Globo[n];
            
        
            for (int i = 0; i<n; i++){
                Globo globo;
                globo = new Globo();
                globo.genGlobo(800,600);
                arr[i] = globo;
            }
        
            return arr;     
        }
        
        public void mostrarArr(Globo[] arr){
            for (int i = 0; i<arr.length; i++){
                arr[i].mostrar();
            }
        }
        
        public Globo[] globoCercano(Punto pedido , Globo arr[]){
            Globo[] cercano;
            cercano = new Globo[2];
            double d, disMin;
            int j;
            
            d = 0;
            disMin = pedido.calcularDistancia(arr[0].ubicacion);
            
            for(int i = 1; i < arr.length; i++){
                d = pedido.calcularDistancia(arr[i].ubicacion);
             
                if (d < disMin){
                    j = 0;
                    disMin = d;
                    cercano[j] = arr[i];
                    j++;
                }
            }
        
        return cercano;
    }
        
        
}
