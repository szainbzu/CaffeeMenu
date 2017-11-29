package edu.cs.birzeit.caffeemenu;

/**
 * Created by Tec on 11/20/2017.
 */

public class Drink {
    private String name;
    private String description;
    private int imageID;

    public static final Drink[] drinks = {
            new Drink("Latte", "espresso and steamed milk", R.drawable.latte),
            new Drink("Cappuccino", "espresso, hot milk, and steamed milk foam", R.drawable.cappuccino),
            new Drink("Filter", "High quality beans roasted and brewed fresh", R.drawable.filter)
    };

    private Drink(String name, String description, int imageID){
        this.name = name;
        this.description = description;
        this.imageID = imageID;
    }
    public String getName(){return name;}
    public String getDescription(){return description;}
    public int getImageID(){return imageID;}

    @Override
    public String toString(){return name;}
}
