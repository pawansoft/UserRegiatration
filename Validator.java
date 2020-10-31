import java.util.Scanner;

public class Validator {

        //  This method is used to validate the First Name
        public boolean checkFName(String fName) {
            return (fName.matches("[A-Z][a-z]{3,}"));
        }

        //This method is used to print message after validation
        public void generateMessage() {
            UserDetail userDetail=getValueByUser();
            if (checkFName(userDetail.getfName()) == true) {
                System.out.println("provided First Name is valid");
            }
            else{
                System.out.println("provided First Name is Invalid");
            }
            if (checkLName(userDetail.getlName()) == true){
                System.out.println("Provided Last Name is valid");
            }
            else {
                System.out.println("Provided Last Name is Invalid");
            }
            if (checkMobileNumber(userDetail.getPhoneNumber()) == true) {
                System.out.println("Provided phone number is valid");
            }
            else
            {
                System.out.println("Provided phone number is Invalid");
            }
            if (checkEmail(userDetail.getEmailId()) == true) {
                System.out.println("Provided Email is valid");
            }
            else {
                System.out.println("Provided Email is Invalid");
            }
            if (checkPassword(userDetail.getPassword()) == true) {
                System.out.println("Provided Password is valid");
            }
            else {
                System.out.println("Provided Password is Invalid");
            }
        }

        //  This method is used to taking and setting all the values into POJO
        public UserDetail getValueByUser(){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter mobile number");
            String phoneNo = scanner.nextLine();
            System.out.println("Enter First Name");
            String fName = scanner.next();
            System.out.println("Enter Last Name");
            String lName = scanner.next();
            System.out.println("Enter email Id");
            String email = scanner.next();
            System.out.println("Enter password");
            String password = scanner.next();

            UserDetail NewUserDetail = new UserDetail();
            NewUserDetail.setfName(fName);
            NewUserDetail.setlName(lName);
            NewUserDetail.setPhoneNumber(phoneNo);
            NewUserDetail.setEmailId(email);
            NewUserDetail.setPassword(password);

            return NewUserDetail;
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
