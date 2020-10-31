public class UserDetail {

    //Main method
    public static void main(String[] args) {
        UserDetail userDetail =  new UserDetail();
        //passing valid email Id
        System.out.println("All Are valid email Id");
        System.out.println(userDetail.checkEmail("abc@yahoo.com"));
        System.out.println(userDetail.checkEmail("abc-100@yahoo.com"));
        System.out.println(userDetail.checkEmail("abc.100@yahoo.com"));
        System.out.println(userDetail.checkEmail("abc111@abc.com"));
        System.out.println(userDetail.checkEmail("abc-100@abc.net"));
        System.out.println(userDetail.checkEmail("abc.100@abc.com.au"));
        System.out.println(userDetail.checkEmail("abc@1.com"));
        System.out.println(userDetail.checkEmail("abc@gmail.com.com"));
        System.out.println(userDetail.checkEmail("abc+100@gmail.com"));

        //passing Invalid email Id
        System.out.println("All Are Invalid email Id");
        System.out.println(userDetail.checkEmail("abc"));
        System.out.println(userDetail.checkEmail("abc@yahoo.my"));
        System.out.println(userDetail.checkEmail("abc.123@gmail.1"));
        System.out.println(userDetail.checkEmail("abc123@.com"));
        System.out.println(userDetail.checkEmail("abc123@.com.com"));
        System.out.println(userDetail.checkEmail(".abc@abc.com.au"));
        System.out.println(userDetail.checkEmail("abc()*@gmail.com"));
        System.out.println(userDetail.checkEmail("abc@%*.com"));
        System.out.println(userDetail.checkEmail("abc..2002@gmail.com"));
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
        return (password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[*.!@#$%^&(){}:'<>,.>/~`_+=|].).{8,}$"));
    }
}



