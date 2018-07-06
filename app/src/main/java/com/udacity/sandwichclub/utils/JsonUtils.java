package com.udacity.sandwichclub.utils;

import com.udacity.sandwichclub.model.Sandwich;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonUtils {

    public static Sandwich parseSandwichJson(String json) {
        try {
            JSONObject j = new JSONObject(json);
            return new Sandwich();
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}

class JsonContractSandwich {
    final static String NAME = "name";
    final static String MAIN_NAME = "mainName";
    final static String ALSO_KNOWN_AS = "alsoKnownAs";
    final static String PLACE_OF_ORIGIN = "placeOfOrigin";
    final static String DESCRIPTION = "description";
    final static String IMAGE = "image";
    final static String INGREDIENTS = "ingredients";
}
