package MainFiles;

public class Entities  {
    int health, damage;
    String name;

    public Entities(String name, int health, int damage){
        this.name = name;
        this.health = health;
        this.damage = damage;
        
        
        
    }

    }
    class Player {
        String playerName;
        int playerHealth, playerDamage;
        public Player(String playerName, int playerHealth, int playerDamage){
            this.playerName = playerName;
            this.playerHealth = playerHealth;
            this.playerDamage = playerDamage;
    }
}