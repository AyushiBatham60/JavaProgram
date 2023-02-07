package src.Array;

import java.util.Scanner;

public class mazePath_d2 {
    static int count=0;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int[][] maze=new int[len][len];
        maze(maze,0,0,maze.length-1,maze[0].length-1,"");
        System.out.println();
        System.out.println(count);
    }
    public static void maze(int[][] maze,int currow,int curcol,int totalRow,int totalCol,String ans){
        if(curcol==totalCol && currow==totalRow){
            System.out.print(ans+',');
            count=count+1;
            return;
        }
        if(curcol>=maze[0].length || currow>=maze.length){
            return;
        }
        maze(maze,currow+1,curcol,totalRow,totalCol,ans+'V');
        maze(maze,currow,curcol+1,totalRow,totalCol,ans+'H');

        if(currow==curcol ||((currow+curcol)== maze.length-1)) {
            maze(maze, currow + 1, curcol + 1, totalRow, totalCol, ans + 'D');
        }

    }
}
