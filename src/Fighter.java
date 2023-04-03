
class Fighter extends Character {
    Fighter(int strength, int vitality, int intelligence,double healthPoint) {
        super(strength, vitality, intelligence,healthPoint);
    }
    Fighter(){}

    @Override
    public void createCharacter(){
        setStrength(random.nextInt(6, 10));
        setVitality(random.nextInt(3,7));
        setIntelligence(random.nextInt(1,5));
        setHealthPoint(Math.round(getVitality()*7 + getStrength() * 4 + getIntelligence() * 2));
        System.out.println("Fighter created with"+" str: "+getStrength()+" vit: "+getVitality()+" int: "+getIntelligence()+" HP: "+getHealthPoint()+"AP: "+getActionPoint());
        Fighter fighter = new Fighter(getStrength(), getVitality(), getIntelligence(),getHealthPoint());
    }

}
