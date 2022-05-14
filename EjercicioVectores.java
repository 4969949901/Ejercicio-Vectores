
package ejerciciovectores;


public class EjercicioVectores {

    public static void main(String[] args) {
        int[]numeros =new int []{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int suma= 0;
        
        for(int i=0; i<numeros.length; i++){
           suma=suma+numeros[i];
           System.out.println("Position: "+ numeros[i]);
           
        }
        
        float promedio=suma/numeros.length;
        System.out.println("La suma es de:"+ suma);
        System.out.println("El promedio es de:"+ promedio);
        
        
    }
    
}
