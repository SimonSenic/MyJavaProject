package sk.kosickaacademic.simon.trees;

public interface Fruit {
    default public void getFruit(){
        System.out.println("None");
    }
}
