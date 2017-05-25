package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import models.Device;
import play.mvc.*;
import play.libs.Json;

public class DeviceOverview extends Controller{

    public Result list() {
        JsonNode json = Json.toJson(Device.findAll());
        return ok(json);
    }
}
