import java.util.ArrayList;

public class Test {

    public static ArrayList<Enemy> hayattaMı(ArrayList<Enemy> enemyList){
        for (int i = 0; i < enemyList.size(); i++) {
            if(enemyList.get(i).getHealthPoint() <= 0){
                enemyList.remove(i);

            }
        }
        return enemyList;
    }

    public static ArrayList<Character> karakterHayattaMı(ArrayList<Character> arrayList){
        for (int i = 0; i <arrayList.size() ; i++) {
            if (arrayList.get(i).getHealthPoint() <= 0){
                arrayList.remove(i);
            }
        }
        return arrayList;
    }

    public static void main(String[] args) {
        ArrayList<Character> arrayList = new ArrayList<>();
        Fighter warrior = new Fighter();
        ArrayList<Enemy> rakipler = new ArrayList<>();
        OneHandedSword oneHandedSword = new OneHandedSword("basic sword",2,1,50,1,3);
        warrior.createCharacter();
        int level = 3;
        int killCounter = 0;

        while (true){

            for (int i = 0; i < Math.pow(2,level - 1) ; i++) {
                Enemy enemy = new Enemy();
                enemy.createCharacter();
                rakipler.add(enemy);
            }

            level++;
        }

    }
}
