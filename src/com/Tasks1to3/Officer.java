package com.Tasks1to3;

public class Officer extends Person {

    private int officerID;
    private int crimesSolved;

    public Officer(String name, String surname, int officerID, int crimesSolved) {
        super.setName(name);
        super.setSurname(surname);
        this.officerID = officerID;
        this.crimesSolved = crimesSolved;
    }

    public Officer() {
    }

    public int calculatedLevel() {
        if (crimesSolved <= 20) {
            return 1;
        }
        if (crimesSolved > 20 && crimesSolved <= 40) {
            return 2;
        }
        if (crimesSolved > 40) {
            return 3;
        }
        return calculatedLevel();
    }

    public int getOfficerID() {
        return officerID;
    }

    public void setOfficerID(int officerID) {
        this.officerID = officerID;
    }

    public int getCrimesSolved() {
        return crimesSolved;
    }

    public void setCrimesSolved(int crimesSolved) {
        this.crimesSolved = crimesSolved;
    }



    @Override
    public String toString() {
        return super.getName() + ", " + super.getSurname() + ", " + officerID + ", " + crimesSolved + ".";
    }

}

