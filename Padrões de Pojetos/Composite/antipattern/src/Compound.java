import java.util.ArrayList;
import java.util.List;
import Leaf;

public class Compound{
    
    private List<Leaf> leafs;

    public Compound(){
        leafs = new ArrayList<Component>();
    }

    public List<Leaf> getLeafs(){
        return leafs;
    }
    
    public void add(Leaf leaf){
        leafs.add(leaf);
    }

    public void remove(Leaf leaf){
        leafs.remove(leaf);
    }
}
