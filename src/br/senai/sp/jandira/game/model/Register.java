package br.senai.sp.jandira.game.model;

import java.util.Scanner;

public class Register {

    int avaliaAmbos = 0;
    Scanner teclado = new Scanner(System.in);
    Player player = new Player();
    OutPut output = new OutPut();
    Enemy enemy = new Enemy();

    public static void register() {
    }

    public void BothRegister() {
        avaliaAmbos = 1;
        PlayerRegister();
        EnemyRegister();
        output.PrintPlayer(player);
        output.PrintEnemy(enemy);
    }

    public void PlayerRegister() {
        System.out.println("------------- Cadastro Player ---------------");
        System.out.print("Qual o seu nome: ");
        player.name = teclado.nextLine();
        System.out.print("Escolha sua skin (red - green - blue): ");
        player.skin = teclado.nextLine();
        System.out.println("---------- Cadastro Realizado ---------------");
        output.PrintPlayer(player);
    }

    public void EnemyRegister() {
        System.out.println("------------- Cadastro Enemy ---------------");
        System.out.print("Qual o seu nome: ");
        enemy.name = teclado.nextLine();
        System.out.print("Escolha sua skin (red - green - blue): ");
        enemy.skin = teclado.nextLine();
        System.out.println("---------- Cadastro Realizado ---------------");

        if (avaliaAmbos != 1) {
            output.PrintEnemy(enemy);
        }
    }

    public void Decision() {
        String decision;

        do {
            System.out.println("----------- Seja Bem vindo!! -----------------");
            System.out.println("O que deseja cadastrar? (Player - Enemy - Ambos)");
            decision = teclado.nextLine();

            switch (decision.toLowerCase()) {
                case "player":
                    PlayerRegister();
                    break;
                case "enemy":
                    EnemyRegister();
                    break;
                case "ambos":
                    BothRegister();
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

            System.out.println("Deseja fazer outro cadastro? (s/n)");
            decision = teclado.nextLine();
        } while (decision.equalsIgnoreCase("s"));
    }
}
