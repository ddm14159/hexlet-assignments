package exercise;

import io.javalin.Javalin;
import java.util.List;

import static io.javalin.rendering.template.TemplateUtil.model;
import io.javalin.rendering.template.JavalinJte;
import exercise.model.User;
import exercise.dto.users.UsersPage;
import exercise.repository.UserRepository;
import org.apache.commons.lang3.StringUtils;
import exercise.util.Security;

public final class App {

    public static Javalin getApp() {

        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
            config.fileRenderer(new JavalinJte());
        });

        app.get("/", ctx -> {
            ctx.render("index.jte");
        });

        app.get("/users", ctx -> {
            List<User> users = UserRepository.getEntities();
            var page = new UsersPage(users);
            ctx.render("users/index.jte", model("page", page));
        });

        // BEGIN
        app.get("/users/build", ctx -> {
            ctx.render("users/build.jte");
        });

        app.post("/users", ctx -> {
            var firstName = ctx.formParam("firstName");
            if (firstName != null) {
                firstName = StringUtils.capitalize(firstName.toLowerCase());
            }

            var lastName = ctx.formParam("lastName");
            if (lastName != null) {
                lastName = StringUtils.capitalize(lastName.toLowerCase());
            }

            var email = ctx.formParam("email");
            if (email != null) {
                email = email.trim().toLowerCase();
            }

            var password = ctx.formParam("password");
            if (password != null) {
                password = Security.encrypt(password);
            }

            var user = new User(firstName, lastName, email, password);
            UserRepository.save(user);
            var page = new UsersPage(UserRepository.getEntities());
            ctx.redirect("/users");
        });
        // END

        return app;
    }

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }
}