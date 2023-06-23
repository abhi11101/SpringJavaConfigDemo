package org.abhi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("myTrackCoach")
@Scope("prototype")
public class TrackCoach implements Coach{

    private String email;

    private String name ="ABHI";

    @Autowired
    @Qualifier(value = "happyFortuneBean")
    private Fortune happyFortune;  //Field Injection
    public TrackCoach() {
        System.out.println("Track Coach Default");
    }

    @PostConstruct
    public void doPostConstruct(){
        System.out.println("Post Construct is called");
    }

    @PreDestroy
    public void doPreDestroy(){
        System.out.println("Pre Destroy is called");
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        System.out.println("Track Setter");
        this.email = email;
    }

    @Override
    public String getDailyWorkout() {
        return "Run 5k";
    }

    @Override
    public String getDailyFortune() {
        return happyFortune.getFortune();
    }

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
