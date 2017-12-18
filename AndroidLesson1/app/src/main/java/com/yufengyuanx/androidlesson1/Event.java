package com.yufengyuanx.androidlesson1;

/**
 * Created by yufengyuan on 12/17/17.
 */

public class Event {
    /**
     * All data for a event
     */
    private String title;
    private String address;
    private String description;

    public Event(String title, String address, String description) {
        this.title = title;
        this.address = address;
        this.description = description;
    }

    /**
     * Getters for private attributes of Event class.
     */



    public String getTitle() {
        return this.title;
    }

    public String getAddress() {
        return address;
    }

    public String getDescription() {
        return description;
    }

}
