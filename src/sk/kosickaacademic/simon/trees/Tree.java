package sk.kosickaacademic.simon.trees;

public abstract class Tree {
    private int age;

    public Tree(int age){
        this.age = age;
    }

    public abstract void description();

    public int getAge() {
        return age;
    }

}
