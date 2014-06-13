package controllers;

import models.Company;
import models.Post;
import models.User;
import play.mvc.Result;
import views.html.test;

import java.util.Date;

import static play.mvc.Results.ok;

/**
 * Created by yxzhao on 6/12/14.
 */
public class TestPage {


    public static Result test() {
        User user = new User();
        user.setUserName("username");
        user.setZipCode(94086);
        user.save();

        Post post = new Post();
        post.setTitle("a job title");
        post.setDate(new Date());
        post.setContent("Here is a job");
        Company google = new Company();
        google.setAddress("MV");
        google.setName("Google.com");
        google.setZipCode(94043);
        google.save();
        post.setCompanyId(google.getId());
        post.setUserId(user.getId());

        post.save();

        return ok(test.render("testTitle", user));

    }
}
