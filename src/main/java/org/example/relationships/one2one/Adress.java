package org.example.relationships.one2one;

import jakarta.persistence.Embeddable;

@Embeddable
public class Adress {
    private int pin;
    private String city;
    private String state;

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "pin=" + pin +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
