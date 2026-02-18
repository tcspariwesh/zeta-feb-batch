package com.zeta.design_patterns.builder;
class User {

    private String name;
    private int age;
    private String email;

    private User(UserBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
    }

    public static class UserBuilder {
        private String name;
        private int age;
        private String email;

        public UserBuilder(String name) {
            this.name = name;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
