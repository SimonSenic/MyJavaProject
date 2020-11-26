package sk.kosickaacademic.simon.myjavaproject;

import java.util.ArrayList;
import java.util.Scanner;

public class B extends A implements I{
    private int count;
    private int number;

    @Override
    public void message() {
        super.message();
        System.out.println("Message B.");
    }

    public B(){
        System.out.print("Reversed text: ");
        for(int i=getTxt().length()-1; i>=0; i--)
            System.out.print(getTxt().charAt(i));
        System.out.println();
    }

    public void numbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter count of numbers: ");
        count = sc.nextInt();
        try{
            ArrayList<Integer> array = new ArrayList<>();
            for(int i=1; i<=count; i++){
                System.out.println("Enter " +i +". number: ");
                number = sc.nextInt();
                array.add(number);
            }

            System.out.print("Numbers are: ");
            for(int i:array){
                if(i==array.get(count-1)) System.out.print(i);
                else System.out.print(i +", ");
            }
            System.out.println();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
