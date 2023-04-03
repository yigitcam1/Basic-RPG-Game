class Enemy extends Character{
    private String name = "Enemy";

    Enemy(int strength, int vitality, int intelligence,double healthPoint) {
        super(strength, vitality, intelligence,healthPoint);
    }
    Enemy(){}

    public void setisim(int numara){
        name = name + numara;
    }
    @Override
    public void createCharacter() {
        setStrength(random.nextInt(1,5));
        setVitality(random.nextInt(1,5));
        setIntelligence(random.nextInt(1,5));
        setHealthPoint(getVitality()*7 + getStrength() * 2 + getIntelligence() * 1);
        setActionPoint(2);
        System.out.println("Enemy created with"+" str: "+getStrength()+" vit: "+getVitality()+" int: "+getIntelligence()+" HP: "+getHealthPoint()+"AP: "+getActionPoint());
    }

}
