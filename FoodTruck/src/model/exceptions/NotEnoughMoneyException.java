package model.exceptions;

public abstract class NotEnoughMoneyException extends Exception {

    public NotEnoughMoneyException() { }

    public NotEnoughMoneyException(String msg) { super(msg); }


}
