public class Main {
    public static void main(String[] args) {
        Player1 player1 = new Player1("Ndi Irom", "Sword", 20);
        Player2 player2 = new Player2("Onye Irom", "Shot Gun", 70, true);
        
       // System.out.println(player1.getName());
       //System.out.println(player1.getHealth());
       // System.out.println(player1.getWeapon());

       //player1.damageByGun1();
      // player1.damageByGun2();

      //player1.damageByGun2();
      //player2.damageByGun2();
      
      player1.damageByGun1();
      player1.heal();
    }
    
}


