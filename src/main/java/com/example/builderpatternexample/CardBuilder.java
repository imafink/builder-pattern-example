package com.example.builderpatternexample;

import java.sql.Date;
import java.sql.Time;

public class CardBuilder {

    private String card_title;
    private String card_description;
    private int pillar_id;
    private int user_id;
    private Date due_date;
    private int priority;
    private String status;
    private Time reminder_time;
    private boolean notification_enabled;
    private String subcategory;
    
    public Card buildCard() {
        return new Card(card_title, card_description, pillar_id, user_id, due_date, priority, status, reminder_time, notification_enabled, subcategory);
    }

    /* GET ATTRIBUTES */
    public String getCardTitle() {
        return card_title;
    }

    public String getCardDescription() {
        return card_description;
    }

    public int getPillarId() {
        return pillar_id;
    }

    public Date getDueDate() {
        return due_date;
    }

    public int getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }

    public Time getReminderTime() {
        return reminder_time;
    }

    public boolean getNotificationEnabled() {
        return notification_enabled;
    }

    public String getSubcategory() {
        return subcategory;
    }

    public int getUserId() {
        return user_id;
    }

    /* SET ATTRIBUTES */
    public String setCardTitle() {
        this.card_title = card_title;
        return card_title;
    }

    public String setCardDescription() {
        this.card_description = card_description;
        return card_description;
    }

    public int setPillarId() {
        this.pillar_id = pillar_id;
        return pillar_id;
    }

    public Date setDueDate() {
        this.due_date = due_date;
        return due_date;
    }

    public int setPriority() {
        this.priority = priority;
        return priority;
    }

    public String setStatus() {
        this.status = status;
        return status;
    }

    public Time setReminderTime() {
        this.reminder_time = reminder_time;
        return reminder_time;
    }

    public boolean setNotificationEnabled() {
        this.notification_enabled = notification_enabled;
        return notification_enabled;
    }

    public String setSubcategory() {
        this.subcategory = subcategory;
        return subcategory;
    }

    public int setUserId() {
        this.user_id = user_id;
        return user_id;
    }
}
