import java.util.*;

public class GraphColoring {
    private Map<String, List<String>> graph;

    public GraphColoring() {
        this.graph = new HashMap<>();
    }
    public void addNeighbour(String current, String neighbour) {
        //thêm neighbour trong danh sách các node liền kề của current và ngược lại
        graph.computeIfAbsent(current, s -> new ArrayList<>()).add(neighbour);
        graph.computeIfAbsent(neighbour, s -> new ArrayList<>()).add(current);
    }

    public Map<String, Integer> Coloring() {
        //map để lưu trữ giá trị color của các nút
        Map<String, Integer> nodeColors = new HashMap<>();
        //set lưu giá trị color của các nút neighbour
        Set<Integer> usedColors = new HashSet<>();

        //lặp qua tất cả các nút
        for (String node : graph.keySet()) {
            //xóa giá trị trong usedColors
            usedColors.clear();
            // lặp qua tất cả neighbour của current
            for (String neighbour : graph.get(node)) {
                //nếu nút đã được tô màu thì thêm giá trị vào usedColors
                if (nodeColors.containsKey(neighbour)) {
                    usedColors.add(nodeColors.get(neighbour));
                }
            }

            //tô màu cho node hiện tại
            for (int color = 0; color < graph.size(); color++) {
                if (!usedColors.contains(color)) {
                    nodeColors.put(node, color);
                    break;
                }
            }
        }
        return  nodeColors;
    }
}
