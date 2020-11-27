package sk.kosickaacademic.simon.trees;

public class Linden extends Tree implements Leaf {
    public Linden(int age){
        super(age);
    }

    @Override
    public void description() {
        System.out.println("Linden can be a very tall tree.");
    }
}
