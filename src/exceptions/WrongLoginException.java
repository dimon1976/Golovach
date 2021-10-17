package exceptions;

public class WrongLoginException extends Exception{
    private int length;

    public WrongLoginException(int length, String message){
        super(message);
        this.length=length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "WrongLoginException {" +
                "length=" + length +
                '}';
    }
}
