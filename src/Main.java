import java.util.Map;

public class Main {
    public static void main(String[] args) {
        GraphColoring graphColoring = new GraphColoring();
        //Việt Nam
        graphColoring.addNeighbour("Việt Nam", "TQ");
        graphColoring.addNeighbour("Việt Nam", "Lao");
        graphColoring.addNeighbour("Việt Nam", "Campuchia");
        //trung quốc
        graphColoring.addNeighbour("TQ", "Myanmar");
        graphColoring.addNeighbour("TQ", "Lao");
        //Lao
        graphColoring.addNeighbour("Lao", "TL");
        graphColoring.addNeighbour("Lao", "Myanmar");
        graphColoring.addNeighbour("Lao", "Campuchia");
        //Campuchia
        graphColoring.addNeighbour("Campuchia", "TL");
        //Thai Lan
        graphColoring.addNeighbour("TL", "Myanmar");
        graphColoring.addNeighbour("TL", "Malaysia");


        Map<String, Integer> mapColoring = graphColoring.Coloring();
        for (Map.Entry<String, Integer> entry : mapColoring.entrySet()) {
            System.out.println("Nước " + entry.getKey() + " được tô màu " + entry.getValue());
        }
    }
}