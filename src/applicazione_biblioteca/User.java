/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicazione_biblioteca;

/**
 *
 * @author 7-5AINF
 */
public class User {
    private String nome;
    private String cognome;
    private String data_nascita;
    private String residenza;
    private Boolean permesso_prenotazione; 
    private Boolean permesso_aggiunta; 
    private Boolean permesso_rimozione; 
    private static User user;
    
    public User (String nome, String cognome, String data_nascita,
            String residenza, Boolean permesso_prenotazione, 
            Boolean permesso_aggiunta, Boolean permesso_rimozione){
        
        this.nome = nome;
        this.cognome = cognome;
        this.data_nascita = data_nascita;
        this.residenza = residenza;
        this.permesso_prenotazione = permesso_prenotazione;
        this.permesso_aggiunta = permesso_aggiunta;
        this.permesso_rimozione = permesso_rimozione;     
   }     
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getData_nascita() {
        return data_nascita;
    }

    public void setData_nascita(String data_nascita) {
        this.data_nascita = data_nascita;
    }

    public String getResidenza() {
        return residenza;
    }

    public void setResidenza(String residenza) {
        this.residenza = residenza;
    }

    public Boolean getPermesso_prenotazione() {
        return permesso_prenotazione;
    }

    public void setPermesso_prenotazione(Boolean permesso_prenotazione) {
        this.permesso_prenotazione = permesso_prenotazione;
    }

    public Boolean getPermesso_aggiunta() {
        return permesso_aggiunta;
    }

    public void setPermesso_aggiunta(Boolean permesso_aggiunta) {
        this.permesso_aggiunta = permesso_aggiunta;
    }

    public Boolean getPermesso_rimozione() {
        return permesso_rimozione;
    }

    public void setPermesso_rimozione(Boolean permesso_rimozione) {
        this.permesso_rimozione = permesso_rimozione;
    }
    
    public static void saveUser(User user){
        User.user=user;
    }
    
    public static User getUser(){
        return user;
    }
    
        
    
}
