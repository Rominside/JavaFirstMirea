package ru.mirea.task14.opt1;

public class GameMoveS1 {
    public void GameMove(GameClass141 gamerPush, GameClass141 gamerRemove, int n, GameClass141 gamerHelp){
        Integer in = gamerPush.pop();
        Integer size = gamerPush.size();
        for (Integer i = 0; i < size; i++){
            gamerHelp.push(gamerPush.pop());
            System.out.println("GamerHelp push" + gamerHelp.peek());
        }
        if (n == 1){
            gamerPush.push(gamerRemove.pop());
            gamerPush.push(in);
        }
        else{
            gamerPush.push(in);
            gamerPush.push(gamerRemove.pop());
        }
        Integer gameHelperSize = gamerHelp.size();
        for (Integer i = 0; i < gameHelperSize; i++){
            gamerPush.push(gamerHelp.pop());
        }
        System.out.println(in);
    }
}
