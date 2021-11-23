package ru.mirea.task14.opt1;

import ru.mirea.task14.opt2.GameMoveS;

import java.util.Stack;

public class GameClass141 extends Stack<Integer> {
    public GameClass141(){

    }
    public GameClass141(Integer[] massInt){
        for (Integer i = 0; i < 5; i++){
            this.push(massInt[i]);
          //  System.out.println();
        }
    }
    public static void main(String [] args){
        GameClass141 gamerOne = new GameClass141(new Integer[]{8,5,7,3,0});
        GameClass141 gamerTwo = new GameClass141(new Integer[]{6,4,2,1,9});
        GameClass141 helpStack = new GameClass141();
        int i = 0;
        GameMoveS1 gameMoveS1 = new GameMoveS1();

        while (gamerOne.size() != 0 && gamerTwo.size() != 0 && i <= 105){
            if (gamerOne.peek() == 0){
                if (gamerTwo.peek() == 9){
                    gameMoveS1.GameMove(gamerOne,gamerTwo,1, helpStack);
                }
                else{
                    gameMoveS1.GameMove(gamerTwo,gamerOne,2, helpStack);
                }
            }
            else if (gamerTwo.peek() == 0){
                if (gamerOne.peek() == 9){
                    gameMoveS1.GameMove(gamerTwo,gamerOne,2, helpStack);
                }
                else{
                    gameMoveS1.GameMove(gamerOne,gamerTwo,1, helpStack);
                }
            }
            else{
                if (gamerOne.peek() > gamerTwo.peek()){
                    gameMoveS1.GameMove(gamerOne,gamerTwo,1, helpStack);
                }
                else{
                    gameMoveS1.GameMove(gamerTwo,gamerOne,2, helpStack);
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
        Integer size = gamerOne.size();
        for (Integer in = 0; in < size; in++){
            System.out.println(gamerOne.pop());
        }
    }
}
