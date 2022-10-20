package Class19;

public class userClass {
    /*Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
     *Create a subclass  userInfo that will have user address variable and it also being initialized
     * through constructor call.
     * Print users name, mobile number and address in userDetails method. Test your code.
     */
    String name;
    String phoneNumber;

    userClass(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    static class UserInfo extends userClass {
        String userAddress;

        UserInfo(String name, String phoneNumber, String userAddress) {
            super(name, phoneNumber);
            this.userAddress = userAddress;
        }

        void userDetails() {
            System.out.print("Name " + name + ". Phone number: " + phoneNumber + " Address: " + userAddress);
        }

        static class userTester {
            public static void main(String[] args) {
                UserInfo user = new UserInfo("Alice", "1111111", "Wonderland");
                user.userDetails();
            }
        }
    }
}