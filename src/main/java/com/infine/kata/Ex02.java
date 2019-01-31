package com.infine.kata;

import java.io.Serializable;
import java.util.Objects;

public class Ex02  implements Serializable{
    private String name;
    private double value;

    public Ex02(String name, double value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ex02 other = (Ex02) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (Double.doubleToLongBits(this.value) != Double.doubleToLongBits(other.value)) {
            return false;
        }
        return true;
    }
    

}
