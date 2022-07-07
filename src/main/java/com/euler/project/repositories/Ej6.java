public class Ej6 {

    int i,sumaCuadrados,suma,limite,resultado;
    public Ej6(){
        suma=0;
        sumaCuadrados=0;
        limite=100;
        resultado=0;

    }

    public int obtenerResultado(){
        for (i=0;i<=limite;i++){
            sumaCuadrados=sumaCuadrados+i*i;
            suma=suma+i;

        }
        resultado=(suma*suma)-sumaCuadrados;
        return this.resultado;
    }

}
