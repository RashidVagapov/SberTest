import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int n = 9;
        int m = 9;

        Element[][] elements = new Element[n][m];

        for(int i = 0; i < n; i++){
            for(int k = 0; k < m; k++){
                elements[i][k] = new Element(i, k);
            }
        }

        List<Element> neighbours = getNeighbours(elements, elements[8][5]);

        for(Element neighbour : neighbours){
            System.out.println(neighbour);
        }

    }

    private static List<Element> getNeighbours(Element[][] source, Element element){
        int x = element.getX();
        int y = element.getY();
        int n = source.length;
        int m = source[n-1].length;
        List<Element> result = new ArrayList<>();

        for(int i = x-1; i <= x+1; i++){
            for(int k = y-1; k <= y+1; k++){
                if(i >= 0 && i < n && k >= 0 && k < m && (i != x || k != y)){
                    result.add(source[i][k]);
                }
            }
        }

        return result;
    }
}