import java.util.ArrayList;
import java.util.List;

public class Compound implements Component{
    
    private List<Component> leafs;

    public Compound(){
        leafs = new ArrayList<Component>();
    }
    
    public void add(Component leaf){
        leafs.add(leaf);
    }

    public void remove(Component leaf){
        leafs.remove(leaf);
    }

    public void execute(String param){
        for(Component leaf : leafs)
            leaf.execute(param);
    }
}
