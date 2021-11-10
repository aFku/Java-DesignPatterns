public class NoMoneyException extends RuntimeException{
    public String getMessage(){
        return "You have not enough money!";
    }
}