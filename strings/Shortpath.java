
public class Shortpath {

    public static float shortestPath(String str) {

            int x1=0;
            int y1=0;
            int x2=0;
            int y2=0;

        for (int i = 0; i < str.length(); i++) {

            // by starting x , y 0 honge
            // but x2 y2 is the ending point
           
            

            int direction = str.charAt(i);

            switch (direction) {
                case 'N':
                    y2++;
                    break;
                case 'S':
                    y2--;
                    break;
                case 'E':
                    x2++;
                    break;
                case 'W':
                    x2--;
                    break;

                default:
                    break;
            }



        }

        int X2 = (x2-x1)*(x2-x1);
        int Y2 = (y2-y1)*(y2-y1);
        
        return (float) Math.sqrt(X2+Y2);

    }

    public static void main(String args[]) {

        String path = "WNEENESENNN";

        float result = shortestPath(path);
        System.out.print(result);

    }
}
