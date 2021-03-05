package com.company;

public class Main {
    /*
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
    */
    public static void main(String[] args) {
        Pizza p1 = new Pizza("fina",true,1,true,"barbacoa",true,false,false,false,true,false);
        System.out.println(p1.toString());

        System.out.println("\n");
        Pizza p2 = new Pizza("normal", false, 2, false, "sin salsa", false, true, true, false, true, false);
        System.out.println(p2.toString());
    }
}
