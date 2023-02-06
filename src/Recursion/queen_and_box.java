package src.Recursion;

public class queen_and_box {
    public static void main(String[] args) {
        //queen_wrt_box(new boolean[4],0,2,"");
        queen_wrt_queen(new boolean[4],0,2,0,"");
    }
    public static void queen_wrt_box(boolean[] board,int cur_queen,int total_queen,String ans){
        if(cur_queen==total_queen){
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < board.length; i++) {
            if(board[i]==false) {
                board[i]=true;
                queen_wrt_box(board,cur_queen+1,total_queen,ans+'b'+i+'q'+cur_queen);
                board[i]=false;
            }
        }
    }
    public static void queen_wrt_queen(boolean[] board,int cur_queen,int total_queen,int indx,String ans){
        if(total_queen==cur_queen){
            System.out.println(ans);
            return;
        }
        if(indx==board.length){
            return;
        }

        queen_wrt_queen(board,cur_queen+1,total_queen,indx+1,ans+'b'+indx+'q'+cur_queen);
        queen_wrt_queen(board,cur_queen,total_queen,indx+1,ans);
    }
}
