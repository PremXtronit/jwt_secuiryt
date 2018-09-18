package com.jwtsecurity.comman;

public interface Apis {

    /*User Controller*/
    String CREATE_USER = "/user";
    String UPDATE_USER = "/user/{id}";
    String DELETE_USER = "/user/{id}";
    String GET_USER = "/user/{id}";


    String GET_ARTICLE = "/nyTimesArticle/{period}";
}
