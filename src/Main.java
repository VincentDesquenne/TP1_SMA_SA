import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        Agent a1 = new Agent("a1");
        Agent a2 = new Agent("a2");
        Agent a3 = new Agent("a3");
        Agent a4 = new Agent("a4");
        ArrayList<Agent> arrayList = new ArrayList<>();
        arrayList.add(a1);
        arrayList.add(a2);
        arrayList.add(a3);
        arrayList.add(a4);

        Environnement env = new Environnement(5,5, arrayList);
        System.out.println(env);
    }
}
