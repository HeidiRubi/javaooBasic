package com.testAutomationCoach.eHerencia.doctores;

public class EjemploDoctores {
    public static void main(String[] args) {
        ProfesionalDeSalud p = new ProfesionalDeSalud();
        p.tratarPaciente();
        p.setNombre("Dr. Torres");

        Doctor d = new Doctor();
        d.setNombre("Dr. Penia");
        d.tratarPaciente();
    }
}
