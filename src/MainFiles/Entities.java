package MainFiles;

public class Entities  {
    double health;
    double damage;
    String name;

    public Entities(String name, double health, double damage){
        this.name = name;
        this.health = health;
        this.damage = damage;
        
        
        
    }

    }
    class Player {
        String playerName;
        double playerHealth;
        double playerDamage;
        public Player(String playerName, double playerHealth, double playerDamage){
            this.playerName = playerName;
            this.playerHealth = playerHealth;
            this.playerDamage = playerDamage;
    }
}