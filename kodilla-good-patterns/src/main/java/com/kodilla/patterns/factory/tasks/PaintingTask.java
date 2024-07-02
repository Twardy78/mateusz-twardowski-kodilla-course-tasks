package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{

    private final String taskName;
    private final String color;
    private final String whatToPaint;
    private boolean execute;

    public PaintingTask(final String taskName,final  String color,final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
        this.execute = false;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    public String getColor() {
        return color;
    }

    public String getWhatToPaint() {
        return whatToPaint;
    }

    @Override
    public void executeTask(){
        System.out.println("Execute task : " + taskName);
        execute = true;
    }

    @Override
    public boolean inTaskExecuted(){
        return execute;
    }
}
