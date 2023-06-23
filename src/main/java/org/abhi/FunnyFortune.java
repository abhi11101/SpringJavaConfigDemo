package org.abhi;

import org.springframework.stereotype.Component;

@Component
public class FunnyFortune implements Fortune{

    public FunnyFortune() {
        System.out.println("Funny Fortune Default");
    }

    @Override
    public String getFortune() {
        return "Funny Fortune";
    }
}
