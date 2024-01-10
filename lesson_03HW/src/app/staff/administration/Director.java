package app.staff.administration;

public class Director {

    private  Manager manager;

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public void manageCompany() {
        manager.assignTasks();
    }
}
