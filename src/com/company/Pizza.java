package com.company;

public class Pizza {
    private String masa;
    private boolean relleno;
    private int tipo;
    private boolean salsa;
    private String tipoSalsa;
    private boolean cebolla;
    private boolean gluten;
    private boolean extraQueso;
    private boolean piña;
    private boolean jamon;
    private boolean champiñones;

    public Pizza(String masa, boolean relleno, int tipo, boolean salsa, String tipoSalsa, boolean cebolla, boolean gluten, boolean extraQueso, boolean piña, boolean jamon, boolean champiñones) {
        this.masa = masa;
        this.relleno = relleno;
        this.tipo = tipo;
        this.salsa = salsa;
        this.tipoSalsa = tipoSalsa;
        this.cebolla = cebolla;
        this.gluten = gluten;
        this.extraQueso = extraQueso;
        this.piña = piña;
        this.jamon = jamon;
        this.champiñones = champiñones;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public boolean isSalsa() {
        return salsa;
    }

    public void setSalsa(boolean salsa) {
        this.salsa = salsa;
    }

    public String getTipoSalsa() {
        return tipoSalsa;
    }

    public void setTipoSalsa(String tipoSalsa) {
        this.tipoSalsa = tipoSalsa;
    }

    public boolean isCebolla() {
        return cebolla;
    }

    public void setCebolla(boolean cebolla) {
        this.cebolla = cebolla;
    }

    public boolean isGluten() {
        return gluten;
    }

    public void setGluten(boolean gluten) {
        this.gluten = gluten;
    }

    public boolean isExtraQueso() {
        return extraQueso;
    }

    public void setExtraQueso(boolean extraQueso) {
        this.extraQueso = extraQueso;
    }

    public boolean isPiña() {
        return piña;
    }

    public void setPiña(boolean piña) {
        this.piña = piña;
    }

    public boolean isJamon() {
        return jamon;
    }

    public void setJamon(boolean jamon) {
        this.jamon = jamon;
    }

    public boolean isChampiñones() {
        return champiñones;
    }

    public void setChampiñones(boolean champiñones) {
        this.champiñones = champiñones;
    }

    private String booleanToString(boolean bool){
        if (bool)
            return "sí";
        return "no";
    }

    private String tipoToString(int r){
        if (r==1)
            return "familiar";
        else if (r==2)
            return "mediana";
        else if (r==3)
            return "pequeña";
        else
            return "tamaño no válido";
    }

    @Override
    public String toString(){
        return "Masa: "+masa+"\nRelleno: "+booleanToString(relleno)+"\nTipo: "+tipoToString(tipo)+"\nSalsa: "+
                booleanToString(salsa)+"\nTipo Salsa: "+tipoSalsa+"\nCebollas: "+booleanToString(cebolla)+
                "\nGluten: "+booleanToString(gluten)+"\nExtra de queso: "+booleanToString(extraQueso)+
                "\nPiña: "+booleanToString(piña)+"\nChampiñones: "+booleanToString(champiñones)+"Jamon: "+
                booleanToString(jamon);
    }
}
