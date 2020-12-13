package com.miulle.sqlspringbootreact.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "werk")
public class Werk {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer werkID;

    @Column
    private Integer komponistID;

    @Column
    private Integer nummer;

    @Column
    private String titel;

    @Column
    private String op_verzeichnis;

    @Column
    private String satz;

    @Column
    private String bemerkung;

    @Column
    private Integer laenge;

    @Column
    private Integer erstellungs_jahr;

    @Column
    private String komponist2;

    @Column
    private Integer alte_nummer;

    @Column
    private Boolean video_aufnahme_vorhanden;

    @Column
    private Boolean audio_aufnahme_vorhanden;

    @Column
    private String noten_archiv;

    @Column
    private Integer werk_unique_nr;

    @Column
    private Boolean partitur;

    @Column
    private Boolean orchesternoten;

    @Column
    private Boolean urheberrecht;

    @Column
    private String partitur_kommentar;

    @Column
    private String orchesternoten_kommentar;

    @Column
    private String urheberrecht_kommentar;

    public Integer getWerkID() {
        return werkID;
    }

    public void setWerkID(Integer werkID) {
        this.werkID = werkID;
    }

    public Integer getKomponistID() {
        return komponistID;
    }

    public void setKomp_ID(Integer komponistID) {
        this.komponistID = komponistID;
    }

    public Integer getNummer() {
        return nummer;
    }

    public void setNummer(Integer nummer) {
        this.nummer = nummer;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getOp_verzeichnis() {
        return op_verzeichnis;
    }

    public void setOp_verzeichnis(String op_verzeichnis) {
        this.op_verzeichnis = op_verzeichnis;
    }

    public String getSatz() {
        return satz;
    }

    public void setSatz(String satz) {
        this.satz = satz;
    }

    public String getBemerkung() {
        return bemerkung;
    }

    public void setBemerkung(String bemerkung) {
        this.bemerkung = bemerkung;
    }

    public Integer getLaenge() {
        return laenge;
    }

    public void setLaenge(Integer laenge) {
        this.laenge = laenge;
    }

    public Integer getErstellungs_jahr() {
        return erstellungs_jahr;
    }

    public void setErstellungs_jahr(Integer erstellungs_jahr) {
        this.erstellungs_jahr = erstellungs_jahr;
    }

    public String getKomponist2() {
        return komponist2;
    }

    public void setKomponist2(String komponist2) {
        this.komponist2 = komponist2;
    }

    public Integer getAlte_nummer() {
        return alte_nummer;
    }

    public void setAlte_nummer(Integer alte_nummer) {
        this.alte_nummer = alte_nummer;
    }

    public Boolean getVideo_aufnahme_vorhanden() {
        return video_aufnahme_vorhanden;
    }

    public void setVideo_aufnahme_vorhanden(Boolean video_aufnahme_vorhanden) {
        this.video_aufnahme_vorhanden = video_aufnahme_vorhanden;
    }

    public Boolean getAudio_aufnahme_vorhanden() {
        return audio_aufnahme_vorhanden;
    }

    public void setAudio_aufnahme_vorhanden(Boolean audio_aufnahme_vorhanden) {
        this.audio_aufnahme_vorhanden = audio_aufnahme_vorhanden;
    }

    public String getNoten_archiv() {
        return noten_archiv;
    }

    public void setNoten_archiv(String noten_archiv) {
        this.noten_archiv = noten_archiv;
    }

    public Integer getWerk_unique_nr() {
        return werk_unique_nr;
    }

    public void setWerk_unique_nr(Integer werk_unique_nr) {
        this.werk_unique_nr = werk_unique_nr;
    }

    public Boolean getPartitur() {
        return partitur;
    }

    public void setPartitur(Boolean partitur) {
        this.partitur = partitur;
    }

    public Boolean getOrchesternoten() {
        return orchesternoten;
    }

    public void setOrchesternoten(Boolean orchesternoten) {
        this.orchesternoten = orchesternoten;
    }

    public Boolean getUrheberrecht() {
        return urheberrecht;
    }

    public void setUrheberrecht(Boolean urheberrecht) {
        this.urheberrecht = urheberrecht;
    }

    public String getPartitur_kommentar() {
        return partitur_kommentar;
    }

    public void setPartitur_kommentar(String partitur_kommentar) {
        this.partitur_kommentar = partitur_kommentar;
    }

    public String getOrchesternoten_kommentar() {
        return orchesternoten_kommentar;
    }

    public void setOrchesternoten_kommentar(String orchesternoten_kommentar) {
        this.orchesternoten_kommentar = orchesternoten_kommentar;
    }

    public String getUrheberrecht_kommentar() {
        return urheberrecht_kommentar;
    }

    public void setUrheberrecht_kommentar(String urheberrecht_kommentar) {
        this.urheberrecht_kommentar = urheberrecht_kommentar;
    }

}
