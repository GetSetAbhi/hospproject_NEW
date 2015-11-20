/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hosp;

/**
 *
 * @author abhishekraina
 */
public class SymptomsData {
    private int id;
    private String symptoms;
    private String medicines;

    /**
     * @return the id
     * 
     * 
     */
    
    public SymptomsData() {
    
    }
    
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the symptoms
     */
    public String getSymptoms() {
        return symptoms;
    }

    /**
     * @param symptoms the symptoms to set
     */
    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    /**
     * @return the medicines
     */
    public String getMedicines() {
        return medicines;
    }

    /**
     * @param medicines the medicines to set
     */
    public void setMedicines(String medicines) {
        this.medicines = medicines;
    }
    
    
}
