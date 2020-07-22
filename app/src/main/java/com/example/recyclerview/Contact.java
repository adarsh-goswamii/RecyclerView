package com.example.recyclerview;

public class Contact
{
    private String name;
    private String imgUrl;
    private String email;

    public Contact(String name, String imgUrl, String email) {
        this.name = name;
        this.imgUrl = imgUrl;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "contact{" +
                "name='" + name + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
