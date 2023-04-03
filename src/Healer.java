
class Healer extends Character{

    Healer(int strength, int vitality, int intelligence,double healthPoint){
        super(strength, vitality, intelligence,healthPoint);
    }
    Healer(){}

    @Override
    public void createCharacter() {
        setStrength(random.nextInt(1, 5));
        setVitality(random.nextInt(3,7));
        setIntelligence(random.nextInt(6,10));
        setHealthPoint(getVitality()*0.7 + getStrength() * 0.2 + getIntelligence() * 0.1);
        System.out.println("Healer created with"+" str: "+getStrength()+" vit: "+getVitality()+" int: "+getIntelligence()+" HP: "+getHealthPoint()+"AP: "+getActionPoint());
        Healer healer = new Healer(getStrength(), getVitality(), getIntelligence(),getHealthPoint());
    }
}
