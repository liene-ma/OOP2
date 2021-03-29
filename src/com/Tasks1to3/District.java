package com.Tasks1to3;
import java.util.ArrayList;

public class District {

    private String title;
    private String city;
    private int districtID;
    private ArrayList<Officer> officersInTheDistrict = new ArrayList<>();


    public District (String title, String city, int districtID) {
        this.title = title;
        this.city = city;
        this.districtID = districtID;
    }

    public District () {
    }

    public boolean addNewOfficer(Officer officer) {
        if (officer != null) {
            this.officersInTheDistrict.add(officer);
            return true;
        }
        return false;
    }

    public boolean removeOfficer(Officer officer) {
        officersInTheDistrict.remove(officer);
        return true;
    }

    public float calculateAvgLevelInDistrict() {
        float totalLevel = 0;
        for (Officer officer : officersInTheDistrict) {
            totalLevel += officer.calculatedLevel();
        }
        return totalLevel/officersInTheDistrict.size();
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getDistrictID() {
        return districtID;
    }

    public void setDistrictID(int districtID) {
        this.districtID = districtID;
    }

    public ArrayList<Officer> getOfficersInTheDistrict() {
        return officersInTheDistrict;
    }

    public void setOfficersInTheDistrict(ArrayList<Officer> officersInTheDistrict) {
        this.officersInTheDistrict = officersInTheDistrict;
    }

    @Override
    public String toString() {
        return title + ", " + city + ", " + districtID + ", " + officersInTheDistrict;
    }
}


