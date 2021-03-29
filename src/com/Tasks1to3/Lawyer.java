package com.Tasks1to3;

public class Lawyer extends Person {

    private int lawyerID;
    private int helpedInCrimeSolving;

    public Lawyer (String name, String surname, int lawyerID, int helpedInCrimeSolving) {
        super.setName(name);
        super.setSurname(surname);
        this.lawyerID = lawyerID;
        this.helpedInCrimeSolving = helpedInCrimeSolving;
    }

    public Lawyer() {
    }

    public int getLawyerID() {
        return lawyerID;
    }

    public void setLawyerID(int lawyerID) {
        this.lawyerID = lawyerID;
    }

    public int getHelpedInCrimeSolving() {
        return helpedInCrimeSolving;
    }

    public void setHelpedInCrimeSolving(int helpedInCrimeSolving) {
        this.helpedInCrimeSolving = helpedInCrimeSolving;
    }

    @Override
    public String toString() {
        return super.getName() + ", " + super.getSurname() + ", " + lawyerID + ", " + helpedInCrimeSolving;
    }
}

