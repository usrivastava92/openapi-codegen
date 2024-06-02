/*
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.atlassian.aigateway.model;

import java.util.Objects;
import com.atlassian.aigateway.model.RunStepDeltaStepDetailsToolCallsCodeOutputImageObject;
import com.atlassian.aigateway.model.RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage;
import com.atlassian.aigateway.model.RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import com.atlassian.aigateway.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-02T19:36:59.215862+05:30[Asia/Kolkata]", comments = "Generator version: 7.6.0")
public class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject> adapterRunStepDeltaStepDetailsToolCallsCodeOutputLogsObject = gson.getDelegateAdapter(this, TypeToken.get(RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.class));
            final TypeAdapter<RunStepDeltaStepDetailsToolCallsCodeOutputImageObject> adapterRunStepDeltaStepDetailsToolCallsCodeOutputImageObject = gson.getDelegateAdapter(this, TypeToken.get(RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.class));

            return (TypeAdapter<T>) new TypeAdapter<RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner>() {
                @Override
                public void write(JsonWriter out, RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject`
                    if (value.getActualInstance() instanceof RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject) {
                        JsonElement element = adapterRunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.toJsonTree((RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `RunStepDeltaStepDetailsToolCallsCodeOutputImageObject`
                    if (value.getActualInstance() instanceof RunStepDeltaStepDetailsToolCallsCodeOutputImageObject) {
                        JsonElement element = adapterRunStepDeltaStepDetailsToolCallsCodeOutputImageObject.toJsonTree((RunStepDeltaStepDetailsToolCallsCodeOutputImageObject)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: RunStepDeltaStepDetailsToolCallsCodeOutputImageObject, RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject");
                }

                @Override
                public RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject
                    try {
                        // validate the JSON object to see if any exception is thrown
                        RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.validateJsonElement(jsonElement);
                        actualAdapter = adapterRunStepDeltaStepDetailsToolCallsCodeOutputLogsObject;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject'", e);
                    }
                    // deserialize RunStepDeltaStepDetailsToolCallsCodeOutputImageObject
                    try {
                        // validate the JSON object to see if any exception is thrown
                        RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.validateJsonElement(jsonElement);
                        actualAdapter = adapterRunStepDeltaStepDetailsToolCallsCodeOutputImageObject;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'RunStepDeltaStepDetailsToolCallsCodeOutputImageObject'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for RunStepDeltaStepDetailsToolCallsCodeOutputImageObject failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'RunStepDeltaStepDetailsToolCallsCodeOutputImageObject'", e);
                    }

                    if (match == 1) {
                        RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner ret = new RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner() {
        super("oneOf", Boolean.FALSE);
    }

    public RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject", RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.class);
        schemas.put("RunStepDeltaStepDetailsToolCallsCodeOutputImageObject", RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * RunStepDeltaStepDetailsToolCallsCodeOutputImageObject, RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof RunStepDeltaStepDetailsToolCallsCodeOutputImageObject) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be RunStepDeltaStepDetailsToolCallsCodeOutputImageObject, RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject");
    }

    /**
     * Get the actual instance, which can be the following:
     * RunStepDeltaStepDetailsToolCallsCodeOutputImageObject, RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject
     *
     * @return The actual instance (RunStepDeltaStepDetailsToolCallsCodeOutputImageObject, RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject`. If the actual instance is not `RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject`
     * @throws ClassCastException if the instance is not `RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject`
     */
    public RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject getRunStepDeltaStepDetailsToolCallsCodeOutputLogsObject() throws ClassCastException {
        return (RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject)super.getActualInstance();
    }
    /**
     * Get the actual instance of `RunStepDeltaStepDetailsToolCallsCodeOutputImageObject`. If the actual instance is not `RunStepDeltaStepDetailsToolCallsCodeOutputImageObject`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RunStepDeltaStepDetailsToolCallsCodeOutputImageObject`
     * @throws ClassCastException if the instance is not `RunStepDeltaStepDetailsToolCallsCodeOutputImageObject`
     */
    public RunStepDeltaStepDetailsToolCallsCodeOutputImageObject getRunStepDeltaStepDetailsToolCallsCodeOutputImageObject() throws ClassCastException {
        return (RunStepDeltaStepDetailsToolCallsCodeOutputImageObject)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject
        try {
            RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with RunStepDeltaStepDetailsToolCallsCodeOutputImageObject
        try {
            RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for RunStepDeltaStepDetailsToolCallsCodeOutputImageObject failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner with oneOf schemas: RunStepDeltaStepDetailsToolCallsCodeOutputImageObject, RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
     * @throws IOException if the JSON string is invalid with respect to RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
     */
    public static RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.class);
    }

    /**
     * Convert an instance of RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

