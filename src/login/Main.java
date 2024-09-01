package login;

public class Main {
    public static void main(String[] args) {

        //instances
        IDAndPasswords idAndPasswords = new IDAndPasswords();



        LoginPage loginPage = new LoginPage(idAndPasswords.getLoginInfo());
    }
}
