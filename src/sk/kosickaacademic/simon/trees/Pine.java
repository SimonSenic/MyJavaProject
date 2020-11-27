package sk.kosickaacademic.simon.trees;

public class Pine extends Tree implements Conifer {
    public Pine(int age){
        super(age);
    }

    @Override
    public void description() {
        System.out.println("Pine is a beautiful tree. ");
    }
}
