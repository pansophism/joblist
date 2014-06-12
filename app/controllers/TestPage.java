package controllers;

import models.User;
import play.mvc.Result;
import views.html.test;

import static play.mvc.Results.ok;

/**
 * Created by yxzhao on 6/12/14.
 */
public class TestPage {


    public static Result test() {
        User user = new User("username", 94132);
        user.save();
        return ok(test.render("testTitle", user));

    }
}
