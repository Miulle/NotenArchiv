package com.miulle.sqlspringbootreact.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "werkbesetzung")
public class Werkbesetzung {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer werkBID;

    @Column(unique = true, nullable = false)
    private Integer werkID;

    @Column
    private Integer h_floete;

    @Column
    private Integer h_oboe;

    @Column
    private Integer h_klarinette;

    @Column
    private Integer h_fagott;

    @Column
    private Integer b_horn;

    @Column
    private Integer b_trompete;

    @Column
    private Integer b_posaune;

    @Column
    private Integer b_tuba;

    @Column
    private Integer p_pauke;

    @Column
    private Integer p_percussion;

    @Column
    private Integer s_harfe;

    @Column
    private Integer s_streicher;

    @Column
    private Integer i_instrument2;

    @Column
    private Integer i_instrument3;

    @Column
    private Integer i_instrument4;

    public Integer getWerkBID() {
        return werkBID;
    }

    public void setWerkBID(Integer werkBID) {
        this.werkBID = werkBID;
    }

    public Integer getWerkID() {
        return werkID;
    }

    public void setWerkID(Integer werkID) {
        this.werkID = werkID;
    }

    public Integer getH_floete() {
        return h_floete;
    }

    public void setH_floete(Integer h_floete) {
        this.h_floete = h_floete;
    }

    public Integer getH_oboe() {
        return h_oboe;
    }

    public void setH_oboe(Integer h_oboe) {
        this.h_oboe = h_oboe;
    }

    public Integer getH_klarinette() {
        return h_klarinette;
    }

    public void setH_klarinette(Integer h_klarinette) {
        this.h_klarinette = h_klarinette;
    }

    public Integer getH_fagott() {
        return h_fagott;
    }

    public void setH_fagott(Integer h_fagott) {
        this.h_fagott = h_fagott;
    }

    public Integer getB_horn() {
        return b_horn;
    }

    public void setB_horn(Integer b_horn) {
        this.b_horn = b_horn;
    }

    public Integer getB_trompete() {
        return b_trompete;
    }

    public void setB_trompete(Integer b_trompete) {
        this.b_trompete = b_trompete;
    }

    public Integer getB_posaune() {
        return b_posaune;
    }

    public void setB_posaune(Integer b_posaune) {
        this.b_posaune = b_posaune;
    }

    public Integer getB_tuba() {
        return b_tuba;
    }

    public void setB_tuba(Integer b_tuba) {
        this.b_tuba = b_tuba;
    }

    public Integer getP_pauke() {
        return p_pauke;
    }

    public void setP_pauke(Integer p_pauke) {
        this.p_pauke = p_pauke;
    }

    public Integer getP_percussion() {
        return p_percussion;
    }

    public void setP_percussion(Integer p_percussion) {
        this.p_percussion = p_percussion;
    }

    public Integer getS_harfe() {
        return s_harfe;
    }

    public void setS_harfe(Integer s_harfe) {
        this.s_harfe = s_harfe;
    }

    public Integer getS_streicher() {
        return s_streicher;
    }

    public void setS_streicher(Integer s_streicher) {
        this.s_streicher = s_streicher;
    }

    public Integer getI_instrument2() {
        return i_instrument2;
    }

    public void setI_instrument2(Integer i_instrument2) {
        this.i_instrument2 = i_instrument2;
    }

    public Integer getI_instrument3() {
        return i_instrument3;
    }

    public void setI_instrument3(Integer i_instrument3) {
        this.i_instrument3 = i_instrument3;
    }

    public Integer getI_instrument4() {
        return i_instrument4;
    }

    public void setI_instrument4(Integer i_instrument4) {
        this.i_instrument4 = i_instrument4;
    }

}
