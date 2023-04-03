public abstract class OffensiveItems extends Item {

    private double needAP = 1;

    OffensiveItems(String name, int value, double weight, double rarity, int type) {
        super(name, value, weight, rarity, type);
    }

    public double getSpeed() {
        double speed;
        return speed = (1/getWeight()) + (getRarity() * (0.5));
    }

    public void setNeedAP(double needAP) {
        this.needAP = needAP;
    }

    public double getNeedAP(){
        if (getSpeed() > 2){
            setNeedAP(0.5);
        }
        return needAP;
    }

    public boolean criticalHit(){
        // 6'lık zar attır.
        double criticalCheck = (getSpeed()*(0.5)) + (getRarity()*(0.5));
        return criticalCheck > 2;
    }

    public double calculateAttackPoint() {
        double attackPoint = (getWeight()*(0.5)) + (getRarity()*(0.5));
        if (criticalHit()){
            attackPoint *= 2;
        }
        return attackPoint;
    }

    public abstract boolean doubleAttackCheck();
}
