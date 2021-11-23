package ru.mirea.task14.opt2;

import java.util.LinkedList;
import java.util.Queue;

public class GameClass142 extends LinkedList<Integer> {
    public GameClass142(Integer [] Mass){
        for (int i = 0; i < 5; i++){
            this.addLast(Mass[i]);
        }
    }
    public static void main(String [] args){
        Queue<Integer> gamerOne = new GameClass142(new Integer[]{0,3,7,5,8});
        Queue<Integer> gamerTwo = new GameClass142(new Integer[]{9,1,2,4,6});
        int i = 0;
        GameMoveS gameMoveS = new GameMoveS();

        while (gamerOne.size() != 0 && gamerTwo.size() != 0 && i <= 105){
            if (gamerOne.peek() == 0){
                if (gamerTwo.peek() == 9){
                    gameMoveS.GameMove(gamerOne,gamerTwo,1);
                }
                else{
                    gameMoveS.GameMove(gamerTwo,gamerOne,2);
                }
            }
            else if (gamerTwo.peek() == 0){
                if (gamerOne.peek() == 9){
                    gameMoveS.GameMove(gamerTwo,gamerOne,2);
                }
                else{
                    gameMoveS.GameMove(gamerOne,gamerTwo,1);
                }
            }
            else{
                if (gamerOne.peek() > gamerTwo.peek()){
                    gameMoveS.GameMove(gamerOne,gamerTwo,1);
                }
                else{
                    gameMoveS.GameMove(gamerTwo,gamerOne,2);
                }
            }
            i++;
        }
        if (gamerOne.size() == 0){
            System.out.println("GamerTwo win");
        }
        else if (gamerTwo.size() == 0){
            System.out.println("GamerOne win");
        }
        else {
            System.out.println("Botva");
        }
        System.out.println("number of moves = " + i);

        for (Integer in : gamerOne){
            System.out.println(in);
        }
    }
}
