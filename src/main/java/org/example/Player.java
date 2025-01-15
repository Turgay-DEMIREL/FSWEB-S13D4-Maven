package org.example;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    // constructer yazımı
    public Player(String name, int healthPercentage, Weapon weapon){
        this.name = name;
        this.healthPercentage = healthPercentage < 0 ? 0 : Math.min(healthPercentage, 100);
        this.weapon = weapon;
        //player objesi oluşturulduğu anda eğer healthPercentage
        // 100'den büyük verildiyse, 100 değerine set edilmeli.
        // Eğer healthPercentage 0'dan küçük verildiyse
        // 0'a set edilmeli. (yukarıda 2. satırda yazıldı.)
    }
    //Metodlar 3 tane
public int healthRemaining(){
        return this.healthPercentage;
    }
public void loseHealth(int damage){
    this.healthPercentage -= damage;
    //this.healthPercentage = this.healthPercentage - damage;

        if(this.healthPercentage < 0){
            System.out.println(this.name + " player has been knocked out of game");
            this.healthPercentage = 0;
        }
    }
public void restoreHealth(int healthPotion){
        this.healthPercentage = Math.min(this.healthPercentage + healthPotion, 100);
}



}
