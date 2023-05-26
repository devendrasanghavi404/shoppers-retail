package com.shoppers.shoppersuserservice.dto;

public class UserRequestDto {


    private int userId;
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String mobile;

    public UserRequestDto(String firstName, String lastName, String userName, String email, String mobile) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.mobile = mobile;
    }

    public UserRequestDto() {
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public String getUserName() {
        return userName;
    }


    public String getEmail() {
        return email;
    }


    public String getMobile() {
        return mobile;
    }


    public int getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "UserRequestDto{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }

}
