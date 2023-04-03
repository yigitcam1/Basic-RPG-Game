public class LongSword extends OffensiveItems {


    LongSword(String name, int value, double weight, double rarity, int type) {
        super(name, value, weight, rarity, type);
    }

    @Override
    public boolean doubleAttackCheck() {
        return false;
    }

}
