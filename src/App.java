
public class App {
    public static void main(String[] args) throws Exception {
        Metodos metodos = new Metodos();

        //int [] arreglo =  {10,20,30,40,50,60,70,80,90,100};
        int[] arreglo = new int[100000];
        for(int i = 0; i < arreglo.length; i++){

            arreglo[i] = i +1;
        }
        int[] arr = new int[100000];
        for(int i = 0; i < 10000; i++){

            arreglo[i] = i +1;
        }
        metodos.printArreglo(arreglo);
        int pos1 = 50417;
        int posicion =  metodos.busquedaBinaria(arreglo,pos1);
        if(posicion != -1){
            System.out.println("El valor se encuentra en la posicion" + posicion);
        }else{
            System.out.println("valor no encontrado 404");
        }
        int posicion1 =  metodos.busquedaSecuencia(arreglo,50417);
        if(posicion != -1){
            System.out.println("El valor se encuentra en la posicion" + posicion);
        }else{
            System.out.println("valor no encontrado 404");
        }

    }
}
