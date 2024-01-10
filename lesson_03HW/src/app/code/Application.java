package app.code;

import app.staff.administration.Director;
import app.staff.administration.Manager;
import app.staff.specialists.TaskExecutor;
import app.staff.specialists.TaskLogger;
import app.staff.specialists.TeamLead;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        //Without String

//        TaskExecutor taskExecutor = new TaskExecutor();
//        TaskLogger taskLogger = new TaskLogger();
//        TeamLead teamLead = new TeamLead();
//
//        Manager manager = new Manager();
//        manager.setTeamLead(teamLead);
//        manager.setTaskExecutor(taskExecutor);
//        manager.setTaskLogger(taskLogger);
//
//        Director director = new Director();
//        director.setManager(manager);
//
//        director.manageCompany();

        ///With String

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Director director = context.getBean(Director.class);
        director.manageCompany();

    }
}

