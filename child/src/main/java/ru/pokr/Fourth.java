package ru.pokr;

import javax.persistence.Entity;

@Entity
public class Fourth extends Third {
    private String fourth;

    public String getFourth() {
        return this.fourth;
    }

    public void setFourth(String fourth) {
        this.fourth = fourth;
    }
}
