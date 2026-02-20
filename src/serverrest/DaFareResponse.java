/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serverrest;

/**
 *
 * @author delfo
 */
public class DaFareResponse {
    private String giocata;
    private String numero;
    private Boolean vittoria;
    
    // Costruttore vuoto necessario per GSON
    public DaFareResponse() {
    }
    
    // Costruttore con parametri
       public DaFareResponse(String giocata, String numero, Boolean vittoria) {
        this.giocata = giocata;
        this.numero = numero;
        this.vittoria = vittoria;
    }
    
    // Getter
   public String getGiocata() {
        return giocata;
    }

    public String getNumero() {
        return numero;
    }

    public Boolean getVittoria() {
        return vittoria;
    }
    
    // Setter
    public void setGiocata(String giocata) {
        this.giocata = giocata;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setVittoria(Boolean vittoria) {
        this.vittoria = vittoria;
    }
}