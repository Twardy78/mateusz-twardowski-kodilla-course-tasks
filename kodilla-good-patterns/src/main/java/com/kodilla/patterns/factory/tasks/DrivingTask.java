package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task{

    private final String taskName;
    private final String where;
    private final String using;
    private boolean execute;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        this.execute = false;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    public String getWhere() {
        return where;
    }

    public String getUsing() {
        return using;
    }

    @Override
    public void executeTask() {
        System.out.println("Executing task : " + taskName);
        execute = true;
    }

    @Override
    public boolean inTaskExecuted(){
        return execute;
    }
}
