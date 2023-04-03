public interface Actions {

    // Actions made by every character.

    void examine();
    void loot();
    void gearUp();

    // Special actions made by characters with 2 AP

    void heal(); // Healer can make it.
    void tankFist(); // Tank can use it for stun an enemy %100.
    void swiftHands(); // Fighter can attack 2 enemy once with no extra AP.

    // Special attacks made by weapons with 2 AP

    void bleed(); // One-handed sword.
    void stun(); // Long sword.
    void instantKill(); // Dagger or mace(with lower change).
    void magic(); // Derives according to wand type

    // Passive checks

    void attackCheck();
    void criticalCheck();




}
