package sk.kosickaacademic.simon.myjavaproject;

import java.util.Scanner;

public class A implements I {
    private String txt;

    public void message() {
        System.out.println("Message A.");
    }

    public A(){
        System.out.print("Enter text: ");
        Scanner sc = new Scanner(System.in);
        this.txt=sc.nextLine();
    }

    public String getTxt(){
        return txt;
    }

}
