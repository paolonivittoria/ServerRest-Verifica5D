/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverrest;

/**
 *
 * @author delfo
 */
public class DaFareService {
    public static Boolean calcolaVincita(String g, String n) 
            throws IllegalArgumentException {
        Integer numConvertito= Integer.parseInt(n);
        // Controllo se i parametri passati sono validi
                if (!parametriValidi(g, numConvertito)) {        
            throw new IllegalArgumentException("I parametri non possono essere vuoti");
        }
        
        String giocata = g.toUpperCase().trim();
        Boolean vittoria=false;
        switch(giocata){
                case "DISPARI":
                    if(numConvertito==0){
                       vittoria=false; 
                    }else{
                        vittoria = numConvertito%2 != 0;
                    }
                case "PARI":
                    if(numConvertito==0){
                       vittoria=false; 
                    }else{
                        vittoria = numConvertito%2 == 0;
                    }
        
        }
        return vittoria; // Placeholder, da sostituire con il risultato della logica di calcolo
    }

    // Metodo di validazione dei parametri (da implementare)
    public static boolean parametriValidi(String g, Integer n)
    {
        return (n>36||n<0||g.equals("")||n==null);
    }
}
