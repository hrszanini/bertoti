public class Leaf implements Component{
    
    private String name;

    public Leaf(String name){
        this.name = name;
    }

    public void execute(String param){
        System.out.println(name + " : " + param);
    }
}
