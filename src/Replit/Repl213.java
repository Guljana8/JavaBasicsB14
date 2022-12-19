package Replit;

public class Repl213 {
    public static class TemperatureNotAllowed extends RuntimeException{
        TemperatureNotAllowed(String errorMsg){
            super(errorMsg);
        }
    }
    public static void main(String[] args) {
        int temperature=0;

        if(temperature<32){
            throw new TemperatureNotAllowed("It is freezing");
        }
    }

}
