package com.zeta.design_patterns.builder;

public class BuilderDemo {
    public static void main(String[] args) {
    	User user = new User.UserBuilder("Amit")
                .age(25)
                .email("amit@gmail.com")
                .build();
    }
}
