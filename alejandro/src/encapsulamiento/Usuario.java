/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;

public class Usuario {
    //Primer regla de encapsulamiento
    private String nombre;
     private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre)  {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad)throws Exception{
        if(edad <0) throw new Exception();
        this.edad = edad;
    }
   
}
