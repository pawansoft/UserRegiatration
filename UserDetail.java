public class UserDetail {

    //Main method
    public static void main(String[] args) {
        UserDetail userDetail = new UserDetail();
        System.out.println(userDetail.checkFName("Pawan"));
        System.out.println(userDetail.checkLName("Kumar"));
        System.out.println(userDetail.checkEmail("pk.soft29@gmail.com"));
        System.out.println(userDetail.checkMobileNumber("91 8083373213"));
        System.out.println(userDetail.checkPassword("sgsPsghfsgt1"));

    }

    //  This method is used to validate the First Name
    public boolean checkFName(String fName) {
        return (fName.matches("[A-Z][a-z]{3,}"));
    }

    //  This method is used to validate Last Name
    public boolean checkLName(String lastName) {
        return (lastName.matches("[A-Z][a-z]{3,}"));
    }

    //  This method is used to validate email Id
    public boolean checkEmail(String email) {
        return (email.matches("^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*[@][0-9A-Za-z]+([.][a-zA-Z]{2,4})*$"));
    }

    //This method is used to validate Mobile Number
    public boolean checkMobileNumber(String mobileNumber){
        return (mobileNumber.matches("^[0-9]{1,2}[ ][0-9]{10}$"));
    }

    //this method is used to validate password
    public boolean checkPassword(String password) {
        return (password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{8,}$"));
    }
}



