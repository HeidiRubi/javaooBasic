package com.testAutomationCoach.aAbstraccion;

public class Alarma {

    String horaActual;
    String horaAlarma;
    String tipoAlarma;
    String[] diasAlarma;

    public void pausarAlarma(){

    }
    public void programarAlarma(String horaAlarma, String[] diasAlarma){//variables diferentes a las de arriba

    }

    public void setTipoAlarma(String tipSonido){

    }

    public void agregarDiaAlarma(String dia){
        if(diasAlarma == null){
            diasAlarma = new String[7];
        }
        int numeroCoincidencias = 0;
        for (String diaActual: diasAlarma){
            if(diaActual != null && diaActual.equals((dia))){
                numeroCoincidencias++;
                break;
            }
        }
        if(numeroCoincidencias ==0){
            //meter dia/
        }
    }
}
