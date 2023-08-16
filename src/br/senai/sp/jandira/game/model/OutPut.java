package br.senai.sp.jandira.game.model;

public class OutPut {
    public void PrintPlayer(Player player){
        System.out.println("-----------------------------");
        System.out.println("O nome do Player é: " + player.name);
        System.out.println("A skin do Player é: " + player.skin);
        System.out.println("A life do Player é: " + player.GetLife());
    }
    public void PrintEnemy(Enemy enemy){
        System.out.println("-----------------------------");
        System.out.println("O nome do Enemy é: " + enemy.name);
        System.out.println("A skin do Enemy é: " + enemy.skin);
        System.out.println("A Life do Enemy é: " + enemy.getLife());
    }
}
