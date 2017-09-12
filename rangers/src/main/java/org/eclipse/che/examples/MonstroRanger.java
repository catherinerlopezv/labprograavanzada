package org.eclipse.che.examples;

public class MonstroRanger implements FabricaRanger {
    
    private String Poder;
    private String Color;
    private String elementoPrimario;
    private int edad;
    
    public MonstroRanger (String Poder, String Color ,  String elementoPrimario , int edad)
    {
        this.Poder=Poder;
        this.Color=Color;
        this.elementoPrimario=elementoPrimario;
        this.edad=edad;
        
    }
    
     public String toString(){
        return "Poder: "+this.Poder+" Color: "+this.Color+" Elemento Primario: "+this.elementoPrimario+" edad: "+this.edad;
    }
}
