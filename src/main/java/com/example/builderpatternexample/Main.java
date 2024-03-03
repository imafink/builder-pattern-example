package com.example.builderpatternexample;

public class Main {

    public static void main(String[] args) {
        Card myCard = new CardBuilder().buildCard("MyTitle", "Basic version of myCard", 1, 1234, 45609, 5, "WIP", 11, true, "My subcategory");
        System.out.println("My card is " + myCard);

        Card yourCard = new CardBuilder().buildCard("YourTitle", "Your version of a card", 1, 4321, 983823, 2, "Backlog", 11, false, "Your subcategory");
        System.out.println("Your card is " + yourCard);
    }
    
}
