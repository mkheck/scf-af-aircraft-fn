package com.thehecklers.scfafaircraftfn;

import java.util.Objects;

public class Aircraft {
    private String adshex, reg, type;

    public Aircraft() {
    }

    public Aircraft(String adshex, String reg, String type) {
        this.adshex = adshex;
        this.reg = reg;
        this.type = type;
    }

    public String getAdshex() {
        return adshex;
    }

    public void setAdshex(String adshex) {
        this.adshex = adshex;
    }

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aircraft aircraft = (Aircraft) o;
        return Objects.equals(adshex, aircraft.adshex) && Objects.equals(reg, aircraft.reg) && Objects.equals(type, aircraft.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adshex, reg, type);
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "adshex='" + adshex + '\'' +
                ", reg='" + reg + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
