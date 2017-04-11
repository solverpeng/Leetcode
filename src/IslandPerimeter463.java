/**
 * <pre>
 *      author: solverpeng
 *      blog  : http://solverpeng.com
 *      time  : 2017/4/1 0001
 *      desc  :
 * </pre>
 */
public class IslandPerimeter463 {
    public static void main(String[] args) {
        int[][] grid = {
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        };

        int perimeter = islandPerimeter(grid);
        System.out.println(perimeter);
    }

    public static int islandPerimeter(int[][] grid) {
        int island = 0;
        int neighbours = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    island++;
                    if (i < grid.length - 1 && grid[i + 1][j] == 1) {
                        neighbours++;
                    }
                    if (j < grid[i].length - 1 && grid[i][j + 1] == 1) {
                        neighbours++;
                    }
                }

            }
        }

        return island * 4 - neighbours * 2;
    }
}
