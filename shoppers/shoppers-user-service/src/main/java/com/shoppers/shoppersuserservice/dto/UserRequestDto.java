package com.shoppers.shoppersuserservice.dto;


public class UserRequestDto {


    private int userId;
    private String firstName;
    private String lastName;
    private String userName;
    private String roles;
    private String email;
    private String mobile;

    public UserRequestDto(int userId, String firstName, String lastName, String userName, String roles, String email, String mobile) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.roles = roles;
        this.email = email;
        this.mobile = mobile;
    }

    public UserRequestDto() {
    }

    public int getUserId() {
        return userId;
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

    public String getRoles() {
        return roles;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    @Override
    public String toString() {
        return "UserRequestDto{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", roles='" + roles + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
