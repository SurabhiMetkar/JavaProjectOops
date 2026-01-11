package org.example.Problem12;

public class Registration {
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email) {
        if (email != null && email.endsWith("@yahoo.com")) {
            this.email = email;
            System.out.println("Email set successfully.");
        } else {
            System.out.println("Invalid email. Only Yahoo email is allowed.");
        }
    }


    public void setUserName(String userName) {
        if (userName != null && userName.length() > 6) {
            this.userName = userName;
            System.out.println("Username set successfully.");
        } else {
            System.out.println("Invalid username. It must be longer than 6 characters and cannot be empty.");
        }
    }


    public void setPassword(String password) {
        if (password != null && password.length() > 6) {
            if (this.userName != null && password.contains(this.userName)) {
                System.out.println("Invalid password. Password cannot contain the username.");
            } else {
                this.password = password;
                System.out.println("Password set successfully.");
            }
        } else {
            System.out.println("Invalid password. It must be longer than 6 characters and cannot be empty.");
        }
    }


    public void displayUserInfo() {
        System.out.println("Email: " + email);
        System.out.println("Username: " + userName);
        System.out.println("Password: " + (password != null ? "********" : null));
    }


    public static void main(String[] args) {
        Registration user = new Registration();
        user.setEmail("example@yahoo.com");
        user.setUserName("User123");
        user.setPassword("mypassword");
        user.displayUserInfo();
    }
}
