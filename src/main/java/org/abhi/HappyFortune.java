package org.abhi;

import org.springframework.stereotype.Component;

@Component("happyFortuneBean")
public class HappyFortune implements Fortune{
    @Override
    public String getFortune() {
        return "Happy Fortune";
    }
}
