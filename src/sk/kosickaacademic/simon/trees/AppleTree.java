package sk.kosickaacademic.simon.trees;

public class AppleTree extends Tree implements Leaf, Fruit{
    public AppleTree(int age){
        super(age);
    }

    @Override
    public void description() {
        System.out.println("Apples are sweet. ");
    }

    @Override
    public void getFruit() {
        System.out.println("Apples");
    }
}
