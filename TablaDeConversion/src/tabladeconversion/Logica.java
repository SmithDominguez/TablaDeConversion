/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabladeconversion;

/**
 *
 * @author PC
 */
public class Logica {
    private double valor;
    private String txtValor;
    private boolean inversa;
    
    private int op;
    
    private static final int Kg_Lb = 0;
    private static final int Sol_Dolar = 1;
    private static final int C_F = 2;
    private static final int Pies_Metros = 3;
    
    public Logica(String txtValor, int op, boolean inversa){
        this.txtValor = txtValor;
        this.op = op;
        this.inversa = inversa;
    }
    
    private void convertir(){
        this.valor = getNumero(txtValor);
    }
    
    private double getNumero(String s){
        try{
            return Double.parseDouble(s);
        }catch(Exception e){
            return 0;
        }
    }
        public double getResultado(){
        convertir();
        if (!inversa){
            switch(op){
                case Kg_Lb: return valor*2.205;
                case Sol_Dolar: return valor/3.77;
                case C_F: return (valor*1.8)+32;
                case Pies_Metros: return valor/3.281;
            }
        }else{
            switch(op){
                case Kg_Lb: return valor/2.205;
                case Sol_Dolar: return valor*3.77;
                case C_F: return ((valor-32)*(5.0/9.0));
                case Pies_Metros: return valor*3.281;
            }
        }
         return 0;
    }
}
