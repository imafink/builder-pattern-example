package com.example.builderpatternexample;

import java.sql.Date;
import java.sql.Time;

public class Main {

    public static void main(String[] args) {
        Card myCard = new CardBuilder()
                .setCardTitle("MyTitle")
                .setCardDescription("Basic version of myCard")
                .setPillarId(1)
                .setUserId(1234)
                .setDueDate(Date.valueOf("2024-12-22")) // Correct date format
                .setPriority(5)
                .setStatus("WIP")
                .setReminderTime(Time.valueOf("08:09:09")) // Assuming the correct time format
                .setNotificationEnabled(true) // Corrected line
                .setSubcategory("My subcategory")
                .buildCard();
        System.out.println("My card is " + myCard);
    }
}
