package com.company;

public class PizzaBuilder {
    Pizza _pizza;

    public Pizza build(){
        return this._pizza;
    }

    public PizzaBuilder(){
        _pizza=new Pizza();
    }

    public PizzaBuilder setTipoMasa (String masa){
        _pizza.setMasa(masa);
        return this;
    }

    public PizzaBuilder setTamaño(int tamaño){
        _pizza.setTipo(tamaño);
        return this;
    }
    public PizzaBuilder setTipoSalsa (String tipoSalsa){
        _pizza.setTipoSalsa(tipoSalsa);
        return this;
    }
    public PizzaBuilder setRelleno(boolean relleno){
        _pizza.setRelleno(relleno);
        return this;
    }
    public PizzaBuilder setSalsa (boolean salsa){
        _pizza.setSalsa(salsa);
        return this;
    }
    public PizzaBuilder setCebolla (boolean cebolla){
        _pizza.setCebolla(cebolla);
        return this;
    }
    public PizzaBuilder setSinGluten (boolean gluten){
        _pizza.setGluten(gluten);
        return this;
    }
    public PizzaBuilder setExtraQueso (boolean queso){
        _pizza.setExtraQueso(queso);
        return this;
    }
    public PizzaBuilder setPiña (boolean piña){
        _pizza.setPiña(piña);
        return this;
    }
    public PizzaBuilder setChampiñones (boolean champis){
        _pizza.setChampiñones(champis);
        return this;
    }
    public PizzaBuilder setJamon (boolean jamon){
        _pizza.setJamon(jamon);
        return this;
    }
}
