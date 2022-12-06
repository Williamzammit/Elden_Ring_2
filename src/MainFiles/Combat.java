package MainFiles;


public class Combat {
    Entities selectedEnemy;
    Entities[][] enemies = { {new Entities("FortniteMan", 10, 5), new Entities("nuts", 20, 1), new Entities("lol", 7, 2)},{},{},{},{new Entities("Tutorial Enemy", 15, 2)}};
    public Entities getEnemy() {
        
    selectedEnemy = enemies[0][(int) (Math.random()*3)];

        return selectedEnemy;
    }
    public void initiateCombat(Entities enemy) {
        
        System.out.println("\033[1n" + enemy.name + "\033[0m" + "\n" + "Health: " + enemy.health + "\n" + "Damage:" + enemy.damage + "\n");
        System.out.println("Your Turn: " + "\n" + "Attack [1] " + "\n" + "Buff Next Attack [2] " + "\n" + "Block [3] " + "\n" + "Heal [4] " + "\n" + "Use Item [5] " + "\n" + "Flee [6] ");
   }
}
