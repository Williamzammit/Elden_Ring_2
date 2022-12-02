package MainFiles;


public class Combat {
    Entities selectedEnemy;
    Entities[][] enemies = { {new Entities("FortniteMan", 10, 5), new Entities("nuts", 20, 1), new Entities("lol", 7, 2)},{},{},{},{}};
    public Entities getEnemy() {
        
    selectedEnemy = enemies[0][(int) (Math.random()*2)];

        return selectedEnemy;
    }
    public void initiateCombat(Entities enemy) {
        System.out.println("\033[1n" + enemy.name + "\033[0m" + "\n" + "Health: " + enemy.health + "\n" + "Damage:" + enemy.damage);
   }
}
