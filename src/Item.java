public abstract class Item {

    private String name;
    private int type;
    private int value;
    private double weight,rarity;

    Item(String name, int value, double weight,double rarity, int type) {
        this.name = name;
        this.value = value;
        this.weight = weight;
        this.rarity = rarity;
        this.type = type;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getRarity() {
        return rarity;
    }

    public void setRarity(double rarity) {
        this.rarity = rarity;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

}
