/*
DeepTest se enfoca en generar imágenes sintéticas realistas
aplicando transformaciones de imagen en imágenes semilla e imitando
diferentes fenómenos del mundo real como distorsiones de lentes de cámara, objetos
movimientos, diferentes condiciones climáticas, etc.
 */
package resolucion_imagen;
interface Angulo_Traslacion{
   public default void Mejorar(){
       System.out.println("Para trasladar un ángulo hay que trasladar los "
               + "\ndos lados que lo forman. Incrementando la resolucion "
               + "\ny definiendo mejor sensibilidad");
   }
}

interface Angulo_Rotacion{
     public default void Mejorar(){
       System.out.println("Se mide entre dos orientaciones que comparten un punto fijo "
               + "\ncomun respecto al que se verifica un giro. si este esta hubicado en el"
               + "\nautomovil permitira, aumentar el grado de visibilidad en al dar giros en vueltas de carrertera");
   }  
}

public class Resolucion_Imagen implements Angulo_Traslacion, Angulo_Rotacion{

        @Override
    public void Mejorar(){
        //se puede elegir la implementacion de una interfaz
        //por ejemplo escogemos que sea  el Angulo_Traslacion
        Angulo_Traslacion.super.Mejorar();
    }
/*
    @Override 
    public void Mejorar(){
    //se puede elegir la implementacion de una interfaz
    //por ejemplo, escogeremos que sea Angulo_Rotacion
    Angulo_Rotacion.super.Mejorar();
    }
    */
    public static void main(String[] args) {
        
        Resolucion_Imagen sensibilidad = new Resolucion_Imagen();
        sensibilidad.Mejorar();
        
    } 
}