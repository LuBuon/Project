package com.euler.project.repositories;

public class Ej7 {
    Long numero;
    int primoOrden,primoOrdenMax,i,j,ultimoPrimo,maxPrimo;
    boolean bandera;

    Ej7(){
        maxPrimo=0;
        primoOrdenMax=10001;
        primoOrden=1;
        i=2;
    }

    public int obtenerResultado(){
        while (primoOrden<=primoOrdenMax){
            for(j=2;j<i;j++){
                if(i%j==0){
                    bandera=false;
                    break;
                }else{
                    bandera=true;
                }
            }
            if (bandera=true){
                ultimoPrimo=j;
                if (ultimoPrimo>maxPrimo){
                    maxPrimo=ultimoPrimo;
                    primoOrden=primoOrden+1;
                    System.out.println("ultimo primo "+maxPrimo);
                }
            }
            i=i+1;
        }
        return this.ultimoPrimo;
    }
}
