package com.testAutomationCoach.aAbstraccion;

public class EjemploAlarma {
    public static void main(String[] args) {
        Alarma alarma = new Alarma();
        //alarma.diasAlarma = new String[7];//se inicializa el alarma.diasAlarma
        alarma.horaActual = "07:00";
        alarma.horaAlarma = "07:40";
        alarma.tipoAlarma = "Twist of chain";
        alarma.agregarDiaAlarma ("Lunes");
        alarma.agregarDiaAlarma("Viernes");

        alarma.pausarAlarma();
        alarma.programarAlarma(alarma.horaAlarma, alarma.diasAlarma);
        alarma.setTipoAlarma(alarma.tipoAlarma);
    }
}
