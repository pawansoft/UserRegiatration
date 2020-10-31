public class UserDetail {

    //Main method
    public static void main(String[] args) {
        UserDetail userDetail = new UserDetail();
        boolean isFNameValid = userDetail.checkFName("Pawan");
        if(isFNameValid == true)
        {
            System.out.println("First Name is Valid");
        }
        else
        {
            System.out.println("First Name is not valid");
        }
    }

    //  This method is used to validate the First Name
    public boolean checkFName(String fName) {
        return (fName.matches("[A-Z][a-z]{3,}"));
    }
}
