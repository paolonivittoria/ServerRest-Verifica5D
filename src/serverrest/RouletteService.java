/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverrest;

/**
 *
 * @author delfo
 */
public class RouletteService {
    public static Boolean calcolaVincita(String g, String n) 
            throws IllegalArgumentException {
        Integer numConvertito= Integer.parseInt(n);
        // Controllo se i parametri passati sono validi
                if (!parametriValidi(g, numConvertito)) {        
            throw new IllegalArgumentException("I parametri non possono essere vuoti");
        }
        
        String giocata = g.toUpperCase().trim();
        Boolean vittoria;
        switch(giocata){
                case "DISPARI":
                    vittoria = (numConvertito != 0) && (numConvertito % 2 != 0);
                    break;
                case "PARI":
                    vittoria = (numConvertito != 0) && (numConvertito % 2 == 0);
                break;
                
                default:
                throw new IllegalArgumentException("Giocata non valida: " + g);
        }
        return vittoria; // Placeholder, da sostituire con il risultato della logica di calcolo
    }

    // Metodo di validazione dei parametri (da implementare)
    public static boolean parametriValidi(String g, Integer n)
    {
        if (g == null || n == null) return false;

        String giocata = g.trim();
        if (giocata.isEmpty()) return false;

        if (n < 0 || n > 36) return false;

        String up = giocata.toUpperCase();
        return up.equals("PARI") || up.equals("DISPARI");
    }
}
