package Facade;

public class Main {
    public static void main(String[] args) {
        ChuckNorrisFacade facade = new ChuckNorrisFacade();
        try {
            System.out.println(facade.getAttributeValueFromJson("https://api.chucknorris.io/jokes/random", "value")+"\n");
            System.out.println(facade.getAttributeValueFromJson("https://api.fxratesapi.com/latest", "date")+"\n");

            //facade.getAttributeValueFromJson("https://api.chucknorris.io/jokes/random", "amount");
            facade.getAttributeValueFromJson("https://api.jackiechan.io/jokes/random", "value");


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
