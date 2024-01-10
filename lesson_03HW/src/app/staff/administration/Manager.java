package app.staff.administration;

import app.staff.specialists.TaskExecutor;
import app.staff.specialists.TaskLogger;
import app.staff.specialists.TeamLead;

public class Manager {

    private TeamLead teamLead;
    private TaskExecutor taskExecutor;
    private TaskLogger taskLogger;

    public TeamLead getTeamLead() {
        return teamLead;
    }

    public void setTeamLead(TeamLead teamLead) {
        this.teamLead = teamLead;
    }

    public TaskExecutor getTaskExecutor() {
        return taskExecutor;
    }

    public void setTaskExecutor(TaskExecutor taskExecutor) {
        this.taskExecutor = taskExecutor;
    }

    public TaskLogger getTaskLogger() {
        return taskLogger;
    }

    public void setTaskLogger(TaskLogger taskLogger) {
        this.taskLogger = taskLogger;
    }

    public void assignTasks(){
        teamLead.assignTasks();
        taskExecutor.executeTask();
        taskLogger.logTask();
    }
}
