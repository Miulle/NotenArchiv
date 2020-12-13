package com.miulle.sqlspringbootreact.modal;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "komponist")
public class Komponist {

    public Integer getKomponistID() {
        return komponistID;
    }

    public void setKomponistID(Integer komponistID) {
        this.komponistID = komponistID;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "komponistID", unique = true, nullable = false)
    private Integer komponistID;

    @Column(name = "komp_id", unique = true, nullable = false)
    private String komp_id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String vorname;

    @Column(nullable = false)
    private Date geburtsjahr;

    @Column
    private Date sterbejahr;

    @Column
    private String beschreibung;

    public String getKomp_id() {
        return komp_id;
    }

    public void setKomp_id(String komp_id) {
        this.komp_id = komp_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public Date getGeburtsjahr() {
        return geburtsjahr;
    }

    public void setGeburtsjahr(Date geburtsjahr) {
        this.geburtsjahr = geburtsjahr;
    }

    public Date getSterbejahr() {
        return sterbejahr;
    }

    public void setSterbejahr(Date sterbejahr) {
        this.sterbejahr = sterbejahr;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

}
