package org.abhi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    private Fortune fortune;

    public CricketCoach() {
        System.out.println("Cricket Default constructor");
    }

    @Autowired
    @Qualifier(value = "funnyFortune")
    public void setFortune(Fortune fortune) { // Setter Injection
        this.fortune = fortune;
        System.out.println("Cricket Setter");
    }

    @Override
    public String getDailyWorkout() {
        return "50 over match practice..";
    }

    @Override
    public String getDailyFortune() {
        return fortune.getFortune();
    }
}
