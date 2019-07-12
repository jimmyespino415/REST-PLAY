package controllers;

import play.mvc.*;
import play.libs.Json;
import java.util.HashMap;
import com.fasterxml.jackson.databind.JsonNode;
import com.auth0.beans.Any;
/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(views.html.index.render());
    }
    public Result returnMap(){
        HashMap<String, Object> result = new HashMap<String, Object>(){
            {
            put("Datos numericos", 15);
            put("Datos String","Recibidos");
            }
        };

        return ok(Json.toJson(result));
    }

    public Result catchObj(){
        JsonNode jsonNode = request().body().asJson();
        Any any = Json.fromJson(jsonNode, Any.class);

        return ok(Json.toJson(any));
    }
}
