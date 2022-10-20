package StudyGroupMeetings;

public class BankAccount {
    private String userName;
    private String passWord;
    String accountType;
    double balance;
    double tranferMoney;
    boolean isCredit;
    String result = "";

    public BankAccount(String custuserName, String custPassword) {
        userName = custuserName;
        passWord = custPassword;
    }


    public String login(String confirmedPass) {
        if (!userName.isEmpty()) {
            if (passWord.equals(confirmedPass)) {
                result = "You have successfully login";
            } else {
                result = "Your password does not match";
            }
        }
        return result;
    }
}
