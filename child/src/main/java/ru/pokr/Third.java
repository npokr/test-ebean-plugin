package ru.pokr;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Third extends Second {
    private String third;

    public String getThird() {
        return this.third;
    }

    public void setThird(String third) {
        this.third = third;
    }
}
