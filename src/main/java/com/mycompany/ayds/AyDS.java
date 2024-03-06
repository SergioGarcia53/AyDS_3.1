
package com.mycompany.ayds;

public class AyDS {

    public static void main(String[] args) {
        Dashboard kiosko=new Dashboard(true);
        for (int i = 0; i < 10; i++) {
            kiosko.consultar();
        }    
    }
}
