public class Dagger extends OffensiveItems {
    Dagger(String name, int value, double weight, double rarity, int type) {
        super(name, value, weight, rarity, type);
    }

    @Override
    public boolean doubleAttackCheck() {
        // zar at
        return getSpeed() > 2;
    }

}
