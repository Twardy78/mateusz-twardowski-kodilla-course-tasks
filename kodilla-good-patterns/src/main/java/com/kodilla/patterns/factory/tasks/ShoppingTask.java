package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{

    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    private boolean execute;

    public ShoppingTask(final String taskName,final String whatToBuy,final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
        this.execute = false;
    }
    @Override
    public String getTaskName() {
        return taskName;
    }

    public String getWhatToBuy() {
        return whatToBuy;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public void executeTask() {
        System.out.println("Executing task : " + taskName);
        execute = true;
    }
    @Override
    public boolean inTaskExecuted() {
        return execute;
    }
}
