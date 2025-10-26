package learning.practices.src.twoDarrayprogram;

public class ShortestPathDirection {
    public static float getShortedPath(String path){
        int x = 0, y = 0;
        for(int i = 0;i<path.length();i++){
            char dir = path.charAt(i);
            if(dir == 'N'){
                y++;
            }else if(dir == 'S'){
                y--;
            }else if(dir == 'W'){
                x--;
            }else{
                x++;
            }
        }
        // formula root (x2-x2)+(y2-y2)
        int xSquare = x*x;
        int ySquare = y*y;
        return (float)Math.sqrt(xSquare + ySquare);
    }
    public static void main(String args[]){
        String path = "WNEENESENNN";
        System.out.println(getShortedPath(path));
    }

}
