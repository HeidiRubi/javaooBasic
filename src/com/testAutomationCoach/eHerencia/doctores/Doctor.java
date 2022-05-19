package com.testAutomationCoach.eHerencia.doctores;

public class Doctor extends ProfesionalDeSalud{

    private String especialidad;

    public void tratarPaciente(){//override (sobreescribir)
        System.out.println("Dale Paracetamol");
    }

    public void prescribirMedicina() {}

    public String getEspecialidad() {
        return null;
    }
}
