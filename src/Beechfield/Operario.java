package Beechfield;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BYRON
 */
public class Operario extends Empleado{
    
   int Categoria;

    public Operario(int Categoria, String nombre, int nnumeroID) {
        super(nombre, nnumeroID);
        this.Categoria = Categoria;
    }
   
    public void  categoria() {
       int categoria1=2000;
     
         int categoria2=3000;
             int categoria3=4000;
        
    }

    @Override
    public String toString() {
        return "Operario{" + "Categoria=" + Categoria() + '}';
    }

    private String Categoria() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
