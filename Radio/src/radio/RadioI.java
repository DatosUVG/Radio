/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radio;

/**
 *
 * @author Andres
 */
public class RadioI {

    String frecAdelante(String freq){
        
        
        return ;
    }
    
    String frecAtras(String freq){
        
        
        return ;
    }
    
    boolean prender(boolean estado){
        
        estado = true;
        return estado;
    }
    
    boolean apagar(boolean estado){
        
        estado = false;
        return estado;
    }
    
    String cambioFrecuencia(String tipoFreq){
        if(tipoFreq == "fm")
        {       
            
            return tipoFreq;
        }
    }
    
    void guardarFrecAm(int frec, int pos){
     
        
    }
    
    void guardarFrecFm(float frec, int pos){
     
        
    }
    
    String mostrarEstacion(String estacion){
        
        return estacion;
    }
    
    
    
}
