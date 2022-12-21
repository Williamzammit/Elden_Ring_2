package MainFiles;

public class Entities  {
    double health;
    double damage;
    String name;
    int skillPoints;

    public Entities(String name, double health, double damage, int skillPoints){
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.skillPoints = skillPoints;
        
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