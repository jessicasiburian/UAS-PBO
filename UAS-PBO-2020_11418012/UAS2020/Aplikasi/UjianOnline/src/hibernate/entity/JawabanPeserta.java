package hibernate.entity;
// Generated Jun 24, 2020 11:10:55 AM by Hibernate Tools 4.3.1



/**
 * JawabanPeserta generated by hbm2java
 */
public class JawabanPeserta  implements java.io.Serializable {


     private JawabanPesertaId id;
     private String jawabanPeserta;

    public JawabanPeserta() {
    }

	
    public JawabanPeserta(JawabanPesertaId id) {
        this.id = id;
    }
    public JawabanPeserta(JawabanPesertaId id, String jawabanPeserta) {
       this.id = id;
       this.jawabanPeserta = jawabanPeserta;
    }
   
    public JawabanPesertaId getId() {
        return this.id;
    }
    
    public void setId(JawabanPesertaId id) {
        this.id = id;
    }
    public String getJawabanPeserta() {
        return this.jawabanPeserta;
    }
    
    public void setJawabanPeserta(String jawabanPeserta) {
        this.jawabanPeserta = jawabanPeserta;
    }




}


