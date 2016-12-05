package test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int cmd = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите команду:");
        System.out.println("1: Калькулятор;");
        System.out.println("2: Игра.");
        cmd = scanner.nextInt();
        if((cmd == 1)){
            calculator();
        }else if(cmd == 2){
            game();
        }else{
            System.out.println("Такой команды нет!");
        }
    }

    private static void calculator(){

    }

    private static void game(){

    }
}
