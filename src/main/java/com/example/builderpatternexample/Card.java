package com.example.builderpatternexample;

import java.sql.Date;
import java.sql.Time;

public class Card {
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

    public Card(String card_title, String card_description, int pillar_id, int user_id, Date due_date, int priority, String status, Time reminder_time, boolean notification_enabled, String subcategory) {
        super();
        this.card_title = card_title;
        this.card_description =  card_description;
        this.pillar_id = pillar_id;
        this.user_id = user_id;
        this.due_date = due_date;
        this.priority = priority;
        this.status = status;
        this.reminder_time = reminder_time;
        this.notification_enabled = notification_enabled;
        this.subcategory = subcategory;
    }   
}
