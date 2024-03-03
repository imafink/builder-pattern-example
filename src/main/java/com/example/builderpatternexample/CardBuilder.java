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

    public CardBuilder() {
        // Optionally, you can initialize default values here
    }

    public CardBuilder setCardTitle(String card_title) {
        this.card_title = card_title;
        return this;
    }

    public CardBuilder setCardDescription(String card_description) {
        this.card_description = card_description;
        return this;
    }

    public CardBuilder setPillarId(int pillar_id) {
        this.pillar_id = pillar_id;
        return this;
    }

    public CardBuilder setUserId(int user_id) {
        this.user_id = user_id;
        return this;
    }

    public CardBuilder setDueDate(Date due_date) {
        this.due_date = due_date;
        return this;
    }

    public CardBuilder setPriority(int priority) {
        this.priority = priority;
        return this;
    }

    public CardBuilder setStatus(String status) {
        this.status = status;
        return this;
    }

    public CardBuilder setReminderTime(Time reminder_time) {
        this.reminder_time = reminder_time;
        return this;
    }

    public CardBuilder setNotificationEnabled(boolean notification_enabled) {
        this.notification_enabled = notification_enabled;
        return this;
    }

    public CardBuilder setSubcategory(String subcategory) {
        this.subcategory = subcategory;
        return this;
    }

    public Card buildCard() {
        return new Card(card_title, card_description, pillar_id, user_id, due_date, priority, status, reminder_time, notification_enabled, subcategory);
    }
}
