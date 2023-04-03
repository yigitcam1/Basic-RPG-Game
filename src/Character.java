import java.security.SecureRandom;

public abstract class Character {

    SecureRandom random = new SecureRandom();

    private int strength,vitality,intelligence;
    private double actionPoint = 3;
    private double healthPoint;
    private double armorPoint = 0;

    Character(int strength,int vitality,int intelligence,double healthPoint){
        this.strength = strength;
        this.vitality = vitality;
        this.intelligence = intelligence;
        this.healthPoint = healthPoint;
    }

    public Character(){}

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public double getHealthPoint(){
        return healthPoint;
    }

    public void setHealthPoint(double healthPoint){
        this.healthPoint = healthPoint;
    }

    public double getActionPoint(){return actionPoint;}

    public void setActionPoint(double actionPoint){this.actionPoint = actionPoint;}

    public double getArmorPoint() {
        return armorPoint;
    }

    public void setArmorPoint(double armorPoint) {
        this.armorPoint = armorPoint;
    }

    public abstract void createCharacter();

}
