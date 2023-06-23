package org.abhi;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAppClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigFile.class);

        BaseballCoach coach = context.getBean("baseballCoachBeanCreate",BaseballCoach.class);
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
        System.out.println(coach.getEmail());
//        coach = context.getBean("cricketCoach",CricketCoach.class);
//        System.out.println(coach.getDailyWorkout());
//        System.out.println(coach.getDailyFortune());
//        TrackCoach trackCoach = context.getBean("myTrackCoach",TrackCoach.class);
//        System.out.println(trackCoach.getEmail());
//        System.out.println(trackCoach.getDailyFortune());
//        trackCoach.setName("NewName");
//        System.out.println("-".repeat(15));
//        TrackCoach anotherCoach = context.getBean("myTrackCoach",TrackCoach.class);
//        System.out.println(anotherCoach.getName());
        context.close();
    }
}
