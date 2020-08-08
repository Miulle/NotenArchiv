package com.miulle.sqlspringbootreact.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "konzerte")
public class Konzert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer konzertID;

    @Column(nullable = false)
    private String ort;

    @Column(nullable = false)
    private Date datum;

    @Column
    private String halle;

    @Column
    private String solisten;

    @Column
    private String solistInstrument;

    @Column
    private String bemerkung;

    @Column(nullable = false)
    private String dirigent;

    public Integer getKonzertID() {
        return konzertID;
    }

    public void setKonzertID(Integer konzertID) {
        this.konzertID = konzertID;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getHalle() {
        return halle;
    }

    public void setHalle(String halle) {
        this.halle = halle;
    }

    public String getSolisten() {
        return solisten;
    }

    public void setSolisten(String solisten) {
        this.solisten = solisten;
    }

    public String getSolistInstrument() {
        return solistInstrument;
    }

    public void setSolistInstrument(String solistInstrument) {
        this.solistInstrument = solistInstrument;
    }

    public String getBemerkung() {
        return bemerkung;
    }

    public void setBemerkung(String bemerkung) {
        this.bemerkung = bemerkung;
    }

    public String getDirigent() {
        return dirigent;
    }

    public void setDirigent(String dirigent) {
        this.dirigent = dirigent;
    }

}
