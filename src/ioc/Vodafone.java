package ioc;

public class Vodafone implements Sim{
    public void calling(){
        System.out.println("calling from Vodafone Network");
    }

    public void data(){
        System.out.println("data from Vodafone Network");

    }
}
