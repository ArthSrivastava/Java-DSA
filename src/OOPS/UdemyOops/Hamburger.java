package OOPS.UdemyOops;

public class Hamburger {
    private String name;
    private String meat;
    private String breadRollType;
    private double price;
    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
        System.out.println(this.name + " hamburger on a " + this.breadRollType + " with " + this.meat + ", price is " +
                this.price);
    }

    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
        this.price += addition1Price;
        System.out.println("Added " + addition1Name + " for an extra " + this.addition1Price);
    }
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
        this.price += addition2Price;
        System.out.println("Added " + addition2Name + " for an extra " + this.addition2Price);
    }
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
        this.price += addition3Price;
        System.out.println("Added " + addition3Name + " for an extra " + this.addition3Price);
    }
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
        this.price += addition4Price;
        System.out.println("Added " + addition4Name + " for an extra " + this.addition4Price);
    }
    public double itemizeHamburger() {
        return this.price;
    }
}
