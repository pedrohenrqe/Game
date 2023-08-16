package br.senai.sp.jandira.game.model;

public class Player {
    public String name;
    public String skin;
    public int life;

    private int Life;

    public  Player(){
        life = 100;
    }

    public int GetLife() {
        return life;
    }
}
