package exceptions;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setLogin("Dimon");
        user.setPassword("12346");
        user.setConfirmPassword("12345");
        loginUser(user.getLogin(), user.getPassword(), user.getConfirmPassword());
    }

    public static void loginUser(String login, String pass, String confirmPass) {
        try {
            if (login.length() > 20) {
                throw new WrongLoginException(login.length(), login);
            }
            if (!pass.equals(confirmPass)) {
                throw new WrongPasswordException(false);
            }
        } catch (WrongLoginException | WrongPasswordException l) {
            System.err.println(l);
        } finally {
            System.out.println("Block Finally");
        }

    }
}
