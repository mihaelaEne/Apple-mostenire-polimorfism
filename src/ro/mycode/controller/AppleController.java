package ro.mycode.controller;

import ro.mycode.models.Apple;
import ro.mycode.models.Ceas;
import ro.mycode.models.IPhone;
import ro.mycode.models.Laptop;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class AppleController  {

    private ArrayList<Apple>apples;

    public AppleController(ArrayList<Apple>apples){
        this.apples=apples;
    }

    public AppleController(){
        this.apples=new ArrayList<>();
        this.load();
    }

    public void load() {
        try {
            File file = new File("C:\\mycode\\OOP\\mostenirea\\Teme\\AppleMostenire\\src\\ro\\mycode\\data\\apple.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String text = scanner.nextLine();
                switch (text.split(",")[0]) {
                    case "Ceas":
                        this.apples.add(new Ceas(text));
                        break;
                    case "IPhone":
                        this.apples.add(new IPhone(text));
                        break;
                    case "Laptop":
                        this.apples.add(new Laptop(text));
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addApple(Apple apple){this.apples.add(apple);}
    public void removeApple(Apple apple){this.apples.remove(apple);}

    public void afisareApple() {
        for( Apple apple: apples){
            System.out.println(apple);
            System.out.println("\n");;
        }
    }

    public String toSave(){
        String text="";
        int i;
        for(i=0;i<apples.size();i++){
            text+=apples.get(i).toSave()+"\n";
        }
        text+=apples.get(i).toSave();
        return text;
    }


    public void save(){
        try {
            File file = new File("C:\\mycode\\OOP\\mostenirea\\Teme\\AppleMostenire\\src\\ro\\mycode\\data\\apple.txt");
            FileWriter fileWriter=new FileWriter(file);
            PrintWriter printWriter=new PrintWriter(fileWriter);
            printWriter.print(toSave());
            printWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Apple finfById(int id){
        for(int i=0; i<apples.size();i++){
            if(apples.get(i).getId()==id){
                return apples.get(i);
            }
        }
        return null;
    }
}
