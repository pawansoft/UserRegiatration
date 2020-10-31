public class UserDetail {

    //Main method
    public static void main(String[] args) {
        UserDetail userDetail = new UserDetail();
        System.out.println(userDetail.checkFName("Pawan"));
        System.out.println(userDetail.checkLName("Kumar"));

    }

    //  This method is used to validate the First Name
    public boolean checkFName(String fName) {
        return (fName.matches("[A-Z][a-z]{3,}"));
    }

    //  This method is used to validate Last Name
    public boolean checkLName(String lastName) {
        return (lastName.matches("[A-Z][a-z]{3,}"));
    }
}



