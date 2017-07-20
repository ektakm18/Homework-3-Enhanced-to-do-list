package com.sargent.mark.todolist.data;

/**
 * Created by mark on 7/4/17.
 */

public class ToDoItem {
    private String description;
    private String dueDate;
    private String category;
    private int check;

    public ToDoItem(String description, String dueDate, String category, int check) {
        this.description = description;
        this.dueDate = dueDate;
        this.category = category;
        this.check = check;
    }

    public ToDoItem(String description, String dueDate, String category) {
        this.description = description;
        this.dueDate = dueDate;
        //adding the category variable
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    //getter and setter for category
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    //getter and setter for checkbox
    public int getCheck() {
        return check;
    }

    public void setCheck(int check) {
        this.check = check;
    }
}
