package exceptions;

public class WrongPasswordException extends Exception {
    private Boolean pass;

    public Boolean getPass() {
        return pass;
    }

    public void setPass(Boolean pass) {
        this.pass = pass;
    }

    public WrongPasswordException(Boolean pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "WrongPasswordException{" +
                "pass=" + pass +
                '}';
    }
}
