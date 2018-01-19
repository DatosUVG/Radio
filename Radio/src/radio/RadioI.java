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
        
        double f = Double.parseDouble(freq); 
        f = f + 2;
        
        
        return Double.toString(f);
    }
    
    String frecAtras(String freq){
        
        double f = Double.parseDouble(freq); 
        f = f - 2;        
        
        return Double.toString(f);
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
            tipoFreq = "am";
            //AQUI FALTA LA CONVERSION DE FM A AM
        }
        
        if(tipoFreq == "am"){
            tipoFreq = "fm";
            
            //AQUI FALTA LA CONVERSION DE FM A AM
            
        }
        
        return tipoFreq;
    }
    
    void guardarFrecAm(int frec, int pos){
     
        
    }
    
    void guardarFrecFm(float frec, int pos){
     
        
    }
    
    String mostrarEstacion(String estacion){
        
        return estacion;
    }
    
    
    
}
