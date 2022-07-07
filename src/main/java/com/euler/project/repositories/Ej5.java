public class Ej5 {
    int i,n,limite,j,resultado;
    boolean bandera;
    public Ej5(){
        n=20;
        j=0;
        limite=999999999;

    }
    public int obtenerResultado(){
        for (i=1;i<limite;i++){
            for (j=n;j>0;j--){
                if(i%j==0){
                    System.out.print("   i:  "+i+ "   j: "+j);
                    bandera=true;

                }else{
                    bandera=false;
                    break;

                }
            }
            if (bandera){
                resultado=i;
                break;
            }



        }
        return this.resultado;

    }

}
