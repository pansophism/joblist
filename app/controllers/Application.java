package controllers;

import models.Post;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;
import views.html.post;

import java.util.List;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render(Post.find.all()));
    }

    public static Result showPost(long postId) {
        return ok(post.render(Post.find.byId(postId)));
    }

    public static Result showPostByCompany (long companyId) {
        List<Post> posts = Post.find.where().eq("company_id", companyId).findList();
        return ok(index.render(posts));
    }

    public static Result showPostByUser(long userId) {
        List<Post> posts = Post.find.where().eq("user_id", userId).findList();
        return ok(index.render(posts));
    }
}
