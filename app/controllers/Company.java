package controllers;

import play.db.ebean.Model;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.company;

/**
 * Created by yxzhao on 7/2/14.
 */
public class Company extends Controller {

    public static Result showCompanyById(long id) {

        return ok(company.render(models.Company.find.byId(id)));
    }
}
