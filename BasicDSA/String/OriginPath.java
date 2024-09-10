package BasicDSA.String;

//calculate shortest path between origin and coordinate
public class OriginPath {
    public static double displacement(String path) {
        double dis = 0, x = 0, y = 0;

        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'N')
                y++;
            else if (path.charAt(i) == 'S')
                y--;
            else if (path.charAt(i) == 'E')
                x++;
            else if (path.charAt(i) == 'W')
                x--;
            else {
                System.out.println("Invalid input!");
                return 0;
            }
        }
        dis = Math.sqrt((x*x)+(y*y));

        return dis;
    }

    public static void main(String args[]) {
        String path = "WNEENESENNN";
        System.out.println(displacement(path));
    }
}
