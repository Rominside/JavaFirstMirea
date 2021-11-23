package ru.mirea.task14.opt2;

import java.util.Queue;

public class GameMoveS {
    public void GameMove(Queue<Integer> gamerPush, Queue<Integer> gamerRemove, int n){
        if (n == 1){
            gamerPush.offer(gamerPush.remove());
            gamerPush.offer(gamerRemove.remove());
        }
        else{
            gamerPush.offer(gamerRemove.remove());
            gamerPush.offer(gamerPush.remove());
        }
    }
}
