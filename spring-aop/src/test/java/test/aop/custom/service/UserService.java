package test.aop.custom.service;

import test.aop.custom.entity.User;

public interface UserService {

    User createUser(String firstName, String lastName, int age);

    User queryUser();
}
