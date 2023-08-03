import java.util.ArrayList;
import java.util.List;

public class QLCB {

    private List<CanBo> canBoList;

    public QLCB() {
        canBoList = new ArrayList<>();
    }

    public List<CanBo> findByName(String name) {
        List<CanBo> a = new ArrayList<>();
        for (int i = 0; i <canBoList.size(); i++) {
            if (canBoList.get(i).getName().equals(name)) {
                a.add(canBoList.get(i));
            }
        }
        if (a.isEmpty()) System.out.println("Cannot find");
        return a;
    }

    public void add(CanBo canBo) {
        canBoList.add(canBo);
    }
    public void showList() {
        if (canBoList.isEmpty()) System.out.println("Empty");
        for (CanBo i:canBoList) {
            System.out.println(i.toString());
        }
    }
}
