
package com.mycompany.ayds;


public class SensorProxy {
 private int datos;
 private String proposito;
 
 
 public SensorProxy(){
     datos=0;
     proposito="";
 }

    public SensorProxy(int datos, String proposito) {
        this.datos = datos;
        this.proposito = proposito;
    }

    public int getDatos() {
        return datos;
    }

    public void setDatos(int datos) {
        this.datos = datos;
    }

    public String getProposito() {
        return proposito;
    }

    public void setProposito(String proposito) {
        this.proposito = proposito;
    }
 
 
  public int read()
  {
      
       int x=0,c=0;
        while(x==0){
            System.out.println("UPDATING..."); 
            System.out.println("DATOS: "+datos);
            c++;
            datos++;
            if (c==10) {
               x=1;
            }
        }
      return datos;
  }
}
