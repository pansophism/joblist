package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;
import views.html.post;

import java.util.List;

/**
 * Created by yxzhao on 7/2/14.
 */
public class Post extends Controller {

    public static Result showPost(long postId) {
        return ok(post.render(models.Post.find.byId(postId)));
    }

    public static Result showPostByCompany (long companyId) {
        List<models.Post> posts = models.Post.find.where().eq("company_id", companyId).findList();
        return ok(index.render(posts));
    }

    public static Result showPostByUser(long userId) {
        List<models.Post> posts = models.Post.find.where().eq("user_id", userId).findList();
        return ok(index.render(posts));
    }
}
