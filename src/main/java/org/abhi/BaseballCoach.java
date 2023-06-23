package org.abhi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class BaseballCoach implements Coach{

    private Fortune fortune;

    @Value("${foo.email}")
    private String email;
    public BaseballCoach(Fortune fortune) {
        this.fortune = fortune;
        System.out.println("Baseball Coach Default");
    }


    @Override
    public String getDailyWorkout() {
        return "Batting practice 30 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortune.getFortune();
    }

    public String getEmail() {
        return email;
    }
}
