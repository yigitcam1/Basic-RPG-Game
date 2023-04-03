
class Tank extends Character{
    Tank(int strength, int vitality, int intelligence,double healthPoint) {
        super(strength, vitality, intelligence,healthPoint);
    }
    Tank(){}

    @Override
    public void createCharacter() {
        setStrength(random.nextInt(3, 7));
        setVitality(random.nextInt(6, 10));
        setIntelligence(random.nextInt(1, 5));
        setHealthPoint(Math.round(getVitality()*0.7 + getStrength() * 0.2 + getIntelligence() * 0.1));
        System.out.println("Tank created with"+" str: "+getStrength()+" vit: "+getVitality()+" int: "+getIntelligence()+" HP: "+getHealthPoint()+"AP: "+getActionPoint());
        Tank tank = new Tank(getStrength(), getVitality(),getIntelligence(),getHealthPoint());
    }
}
