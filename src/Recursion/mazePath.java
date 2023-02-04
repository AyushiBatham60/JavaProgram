package src.Recursion;

public class mazePath {
    public static void main(String[] args) {
        int[][] maze=new int[3][3];
        maze_path(maze,0,0,maze.length-1,maze[0].length-1,"");
    }
    public static void maze_path(int[][] maze,int curRow,int curCol,int destRow,int destCol,String path){
        if(curRow==destRow&& curCol==destCol){
            System.out.println(path);
            return;
        }
        if(curRow>destRow || curCol>destCol || curRow>=maze.length || curCol>=maze[0].length){
            return;
        }

        maze_path(maze,curRow+1,curCol,destRow,destCol,path+"D");
        maze_path(maze,curRow,curCol+1,destRow,destCol,path+"R");

    }
}
