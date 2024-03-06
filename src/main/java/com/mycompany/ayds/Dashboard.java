
package com.mycompany.ayds;


public class Dashboard {
    private int info;
    private boolean isShowing;
    private SensorProxy sensor=new SensorProxy();
    public Dashboard(){
        info=0;
        isShowing=false;
    }

    public Dashboard(boolean isShowing) {
        this.info = sensor.read();
        this.isShowing = isShowing;
    }
    
    public void updateData()
    {
       info=sensor.read();
    }
    
    public void updateDisplay()
    {
        System.out.println("NUEVO DATO: "+info);
    }
    
    public void consultar()
    {
        updateData();
        updateDisplay();
    }
}
