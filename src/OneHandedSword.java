public class OneHandedSword extends OffensiveItems {
    private int strength;
    OneHandedSword(String name, int value, double weight, double rarity, int type,int strength) {
        super(name, value, weight, rarity, type);
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public boolean doubleAttackCheck() {
        // zar at
        return getSpeed() > 2;
    }


}
