package ro.mycode.view;

import ro.mycode.controller.AppleController;
import ro.mycode.models.Apple;

import java.util.Scanner;

public class ViewApple {
    private Scanner scanner;
    private AppleController appleController;
    public ViewApple(){
        appleController=new AppleController();
        scanner = new Scanner(System.in);
        play();
    }


    public void meniu() {
        System.out.println("Buna ziua!");
        System.out.println("Apasa tasta 1 pentru a afisa toate produsele Apple ");
        System.out.println("Apasa tasta 2 pentru a adauga un produs Apple ");
        System.out.println("Apasa tasta 3 pentru a sterge un produs Apple ");
    }
    public void play() {
        int alegere = 0;
        boolean running = true;
        while (running) {
            meniu();
            alegere = Integer.parseInt(scanner.nextLine());
            switch (alegere) {
                case 1:
                    appleController.afisareApple();
                    break;
                case 2:addApple();
                    break;
                case 3: removeApple();
                    break;
                default:
                    System.out.println("Alegere incorecta");
                    break;

            }
        }
    }


    private void addApple(){
        System.out.println("Type:");
        String type=scanner.nextLine();
        System.out.println("Director:");
        String director=scanner.nextLine();
        System.out.println("Id:");
        int id=Integer.parseInt(scanner.nextLine());

        Apple apple=appleController.finfById(id);
        if(apple==null){
            Apple apple1=new Apple(type,director,id);
            appleController.addApple(apple1);
        }else{
            System.out.println("Produsul Apple exista deja");
        }
    }

    private void removeApple(){
        System.out.println("Id: ");
        int id=Integer.parseInt(scanner.nextLine());
        Apple apple=appleController.finfById(id);

        if (apple == null) {
            System.out.println("Nu exista un produs Apple cub id-ul introdus");
        }else{
            appleController.removeApple(apple);
            System.out.println("Produsul Apple a fost sters");
        }
    }
}
