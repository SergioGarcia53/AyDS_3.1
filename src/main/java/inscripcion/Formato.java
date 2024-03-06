
package inscripcion;

public class Formato {
    
    private boolean inscrito;
    private String curso;
    private ListaDeCursos lista=new ListaDeCursos();

    public Formato() {
        this.inscrito = false;
        this.curso = "";
        
    }
    
    public void inscribir()
    {
   
        System.out.println("HA SIDO INSCRITO");
        inscrito=true;
    }
    public void actualizarFormato()
    {
        System.out.println("Inscrito: "+inscrito); 
    }
    public void elegirCurso()
    {
           String[] materias=lista.getCursos();
                    System.out.println("Materias");

        for (int i = 0; i < materias.length; i++) {
            System.out.println(materias[i]);
        }
        inscribir();
        actualizarFormato();
    }
}
