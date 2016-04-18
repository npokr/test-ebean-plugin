package ru.pokr;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Second extends First {
    private String second;

    public String getSecond() {
        return this.second;
    }

    public void setSecond(String second) {
        this.second = second;
    }
}
