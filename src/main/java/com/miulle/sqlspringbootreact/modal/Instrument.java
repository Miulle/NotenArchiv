package com.miulle.sqlspringbootreact.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "instrument")
public class Instrument {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private Integer instrumentID;

    @Column
    private String instrument;

    @Column
    private String abkuerzung;

    public Integer getInstrumentID() {
        return instrumentID;
    }

    public void setInstrumentID(Integer instrumentID) {
        this.instrumentID = instrumentID;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public String getAbkuerzung() {
        return abkuerzung;
    }

    public void setAbkuerzung(String abkuerzung) {
        this.abkuerzung = abkuerzung;
    }

}
