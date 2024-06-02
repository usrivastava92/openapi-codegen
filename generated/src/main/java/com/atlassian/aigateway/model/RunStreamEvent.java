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
import com.atlassian.aigateway.model.RunObject;
import com.atlassian.aigateway.model.RunStreamEventOneOf;
import com.atlassian.aigateway.model.RunStreamEventOneOf1;
import com.atlassian.aigateway.model.RunStreamEventOneOf2;
import com.atlassian.aigateway.model.RunStreamEventOneOf3;
import com.atlassian.aigateway.model.RunStreamEventOneOf4;
import com.atlassian.aigateway.model.RunStreamEventOneOf5;
import com.atlassian.aigateway.model.RunStreamEventOneOf6;
import com.atlassian.aigateway.model.RunStreamEventOneOf7;
import com.atlassian.aigateway.model.RunStreamEventOneOf8;
import com.atlassian.aigateway.model.RunStreamEventOneOf9;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-02T18:29:03.933402+05:30[Asia/Kolkata]", comments = "Generator version: 7.6.0")
public class RunStreamEvent extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(RunStreamEvent.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!RunStreamEvent.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'RunStreamEvent' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<RunStreamEventOneOf> adapterRunStreamEventOneOf = gson.getDelegateAdapter(this, TypeToken.get(RunStreamEventOneOf.class));
            final TypeAdapter<RunStreamEventOneOf1> adapterRunStreamEventOneOf1 = gson.getDelegateAdapter(this, TypeToken.get(RunStreamEventOneOf1.class));
            final TypeAdapter<RunStreamEventOneOf2> adapterRunStreamEventOneOf2 = gson.getDelegateAdapter(this, TypeToken.get(RunStreamEventOneOf2.class));
            final TypeAdapter<RunStreamEventOneOf3> adapterRunStreamEventOneOf3 = gson.getDelegateAdapter(this, TypeToken.get(RunStreamEventOneOf3.class));
            final TypeAdapter<RunStreamEventOneOf4> adapterRunStreamEventOneOf4 = gson.getDelegateAdapter(this, TypeToken.get(RunStreamEventOneOf4.class));
            final TypeAdapter<RunStreamEventOneOf5> adapterRunStreamEventOneOf5 = gson.getDelegateAdapter(this, TypeToken.get(RunStreamEventOneOf5.class));
            final TypeAdapter<RunStreamEventOneOf6> adapterRunStreamEventOneOf6 = gson.getDelegateAdapter(this, TypeToken.get(RunStreamEventOneOf6.class));
            final TypeAdapter<RunStreamEventOneOf7> adapterRunStreamEventOneOf7 = gson.getDelegateAdapter(this, TypeToken.get(RunStreamEventOneOf7.class));
            final TypeAdapter<RunStreamEventOneOf8> adapterRunStreamEventOneOf8 = gson.getDelegateAdapter(this, TypeToken.get(RunStreamEventOneOf8.class));
            final TypeAdapter<RunStreamEventOneOf9> adapterRunStreamEventOneOf9 = gson.getDelegateAdapter(this, TypeToken.get(RunStreamEventOneOf9.class));

            return (TypeAdapter<T>) new TypeAdapter<RunStreamEvent>() {
                @Override
                public void write(JsonWriter out, RunStreamEvent value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `RunStreamEventOneOf`
                    if (value.getActualInstance() instanceof RunStreamEventOneOf) {
                        JsonElement element = adapterRunStreamEventOneOf.toJsonTree((RunStreamEventOneOf)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `RunStreamEventOneOf1`
                    if (value.getActualInstance() instanceof RunStreamEventOneOf1) {
                        JsonElement element = adapterRunStreamEventOneOf1.toJsonTree((RunStreamEventOneOf1)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `RunStreamEventOneOf2`
                    if (value.getActualInstance() instanceof RunStreamEventOneOf2) {
                        JsonElement element = adapterRunStreamEventOneOf2.toJsonTree((RunStreamEventOneOf2)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `RunStreamEventOneOf3`
                    if (value.getActualInstance() instanceof RunStreamEventOneOf3) {
                        JsonElement element = adapterRunStreamEventOneOf3.toJsonTree((RunStreamEventOneOf3)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `RunStreamEventOneOf4`
                    if (value.getActualInstance() instanceof RunStreamEventOneOf4) {
                        JsonElement element = adapterRunStreamEventOneOf4.toJsonTree((RunStreamEventOneOf4)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `RunStreamEventOneOf5`
                    if (value.getActualInstance() instanceof RunStreamEventOneOf5) {
                        JsonElement element = adapterRunStreamEventOneOf5.toJsonTree((RunStreamEventOneOf5)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `RunStreamEventOneOf6`
                    if (value.getActualInstance() instanceof RunStreamEventOneOf6) {
                        JsonElement element = adapterRunStreamEventOneOf6.toJsonTree((RunStreamEventOneOf6)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `RunStreamEventOneOf7`
                    if (value.getActualInstance() instanceof RunStreamEventOneOf7) {
                        JsonElement element = adapterRunStreamEventOneOf7.toJsonTree((RunStreamEventOneOf7)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `RunStreamEventOneOf8`
                    if (value.getActualInstance() instanceof RunStreamEventOneOf8) {
                        JsonElement element = adapterRunStreamEventOneOf8.toJsonTree((RunStreamEventOneOf8)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `RunStreamEventOneOf9`
                    if (value.getActualInstance() instanceof RunStreamEventOneOf9) {
                        JsonElement element = adapterRunStreamEventOneOf9.toJsonTree((RunStreamEventOneOf9)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: RunStreamEventOneOf, RunStreamEventOneOf1, RunStreamEventOneOf2, RunStreamEventOneOf3, RunStreamEventOneOf4, RunStreamEventOneOf5, RunStreamEventOneOf6, RunStreamEventOneOf7, RunStreamEventOneOf8, RunStreamEventOneOf9");
                }

                @Override
                public RunStreamEvent read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize RunStreamEventOneOf
                    try {
                        // validate the JSON object to see if any exception is thrown
                        RunStreamEventOneOf.validateJsonElement(jsonElement);
                        actualAdapter = adapterRunStreamEventOneOf;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'RunStreamEventOneOf'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for RunStreamEventOneOf failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'RunStreamEventOneOf'", e);
                    }
                    // deserialize RunStreamEventOneOf1
                    try {
                        // validate the JSON object to see if any exception is thrown
                        RunStreamEventOneOf1.validateJsonElement(jsonElement);
                        actualAdapter = adapterRunStreamEventOneOf1;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'RunStreamEventOneOf1'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for RunStreamEventOneOf1 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'RunStreamEventOneOf1'", e);
                    }
                    // deserialize RunStreamEventOneOf2
                    try {
                        // validate the JSON object to see if any exception is thrown
                        RunStreamEventOneOf2.validateJsonElement(jsonElement);
                        actualAdapter = adapterRunStreamEventOneOf2;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'RunStreamEventOneOf2'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for RunStreamEventOneOf2 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'RunStreamEventOneOf2'", e);
                    }
                    // deserialize RunStreamEventOneOf3
                    try {
                        // validate the JSON object to see if any exception is thrown
                        RunStreamEventOneOf3.validateJsonElement(jsonElement);
                        actualAdapter = adapterRunStreamEventOneOf3;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'RunStreamEventOneOf3'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for RunStreamEventOneOf3 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'RunStreamEventOneOf3'", e);
                    }
                    // deserialize RunStreamEventOneOf4
                    try {
                        // validate the JSON object to see if any exception is thrown
                        RunStreamEventOneOf4.validateJsonElement(jsonElement);
                        actualAdapter = adapterRunStreamEventOneOf4;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'RunStreamEventOneOf4'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for RunStreamEventOneOf4 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'RunStreamEventOneOf4'", e);
                    }
                    // deserialize RunStreamEventOneOf5
                    try {
                        // validate the JSON object to see if any exception is thrown
                        RunStreamEventOneOf5.validateJsonElement(jsonElement);
                        actualAdapter = adapterRunStreamEventOneOf5;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'RunStreamEventOneOf5'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for RunStreamEventOneOf5 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'RunStreamEventOneOf5'", e);
                    }
                    // deserialize RunStreamEventOneOf6
                    try {
                        // validate the JSON object to see if any exception is thrown
                        RunStreamEventOneOf6.validateJsonElement(jsonElement);
                        actualAdapter = adapterRunStreamEventOneOf6;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'RunStreamEventOneOf6'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for RunStreamEventOneOf6 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'RunStreamEventOneOf6'", e);
                    }
                    // deserialize RunStreamEventOneOf7
                    try {
                        // validate the JSON object to see if any exception is thrown
                        RunStreamEventOneOf7.validateJsonElement(jsonElement);
                        actualAdapter = adapterRunStreamEventOneOf7;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'RunStreamEventOneOf7'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for RunStreamEventOneOf7 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'RunStreamEventOneOf7'", e);
                    }
                    // deserialize RunStreamEventOneOf8
                    try {
                        // validate the JSON object to see if any exception is thrown
                        RunStreamEventOneOf8.validateJsonElement(jsonElement);
                        actualAdapter = adapterRunStreamEventOneOf8;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'RunStreamEventOneOf8'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for RunStreamEventOneOf8 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'RunStreamEventOneOf8'", e);
                    }
                    // deserialize RunStreamEventOneOf9
                    try {
                        // validate the JSON object to see if any exception is thrown
                        RunStreamEventOneOf9.validateJsonElement(jsonElement);
                        actualAdapter = adapterRunStreamEventOneOf9;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'RunStreamEventOneOf9'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for RunStreamEventOneOf9 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'RunStreamEventOneOf9'", e);
                    }

                    if (match == 1) {
                        RunStreamEvent ret = new RunStreamEvent();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for RunStreamEvent: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public RunStreamEvent() {
        super("oneOf", Boolean.FALSE);
    }

    public RunStreamEvent(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("RunStreamEventOneOf", RunStreamEventOneOf.class);
        schemas.put("RunStreamEventOneOf1", RunStreamEventOneOf1.class);
        schemas.put("RunStreamEventOneOf2", RunStreamEventOneOf2.class);
        schemas.put("RunStreamEventOneOf3", RunStreamEventOneOf3.class);
        schemas.put("RunStreamEventOneOf4", RunStreamEventOneOf4.class);
        schemas.put("RunStreamEventOneOf5", RunStreamEventOneOf5.class);
        schemas.put("RunStreamEventOneOf6", RunStreamEventOneOf6.class);
        schemas.put("RunStreamEventOneOf7", RunStreamEventOneOf7.class);
        schemas.put("RunStreamEventOneOf8", RunStreamEventOneOf8.class);
        schemas.put("RunStreamEventOneOf9", RunStreamEventOneOf9.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return RunStreamEvent.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * RunStreamEventOneOf, RunStreamEventOneOf1, RunStreamEventOneOf2, RunStreamEventOneOf3, RunStreamEventOneOf4, RunStreamEventOneOf5, RunStreamEventOneOf6, RunStreamEventOneOf7, RunStreamEventOneOf8, RunStreamEventOneOf9
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof RunStreamEventOneOf) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof RunStreamEventOneOf1) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof RunStreamEventOneOf2) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof RunStreamEventOneOf3) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof RunStreamEventOneOf4) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof RunStreamEventOneOf5) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof RunStreamEventOneOf6) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof RunStreamEventOneOf7) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof RunStreamEventOneOf8) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof RunStreamEventOneOf9) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be RunStreamEventOneOf, RunStreamEventOneOf1, RunStreamEventOneOf2, RunStreamEventOneOf3, RunStreamEventOneOf4, RunStreamEventOneOf5, RunStreamEventOneOf6, RunStreamEventOneOf7, RunStreamEventOneOf8, RunStreamEventOneOf9");
    }

    /**
     * Get the actual instance, which can be the following:
     * RunStreamEventOneOf, RunStreamEventOneOf1, RunStreamEventOneOf2, RunStreamEventOneOf3, RunStreamEventOneOf4, RunStreamEventOneOf5, RunStreamEventOneOf6, RunStreamEventOneOf7, RunStreamEventOneOf8, RunStreamEventOneOf9
     *
     * @return The actual instance (RunStreamEventOneOf, RunStreamEventOneOf1, RunStreamEventOneOf2, RunStreamEventOneOf3, RunStreamEventOneOf4, RunStreamEventOneOf5, RunStreamEventOneOf6, RunStreamEventOneOf7, RunStreamEventOneOf8, RunStreamEventOneOf9)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `RunStreamEventOneOf`. If the actual instance is not `RunStreamEventOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RunStreamEventOneOf`
     * @throws ClassCastException if the instance is not `RunStreamEventOneOf`
     */
    public RunStreamEventOneOf getRunStreamEventOneOf() throws ClassCastException {
        return (RunStreamEventOneOf)super.getActualInstance();
    }
    /**
     * Get the actual instance of `RunStreamEventOneOf1`. If the actual instance is not `RunStreamEventOneOf1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RunStreamEventOneOf1`
     * @throws ClassCastException if the instance is not `RunStreamEventOneOf1`
     */
    public RunStreamEventOneOf1 getRunStreamEventOneOf1() throws ClassCastException {
        return (RunStreamEventOneOf1)super.getActualInstance();
    }
    /**
     * Get the actual instance of `RunStreamEventOneOf2`. If the actual instance is not `RunStreamEventOneOf2`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RunStreamEventOneOf2`
     * @throws ClassCastException if the instance is not `RunStreamEventOneOf2`
     */
    public RunStreamEventOneOf2 getRunStreamEventOneOf2() throws ClassCastException {
        return (RunStreamEventOneOf2)super.getActualInstance();
    }
    /**
     * Get the actual instance of `RunStreamEventOneOf3`. If the actual instance is not `RunStreamEventOneOf3`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RunStreamEventOneOf3`
     * @throws ClassCastException if the instance is not `RunStreamEventOneOf3`
     */
    public RunStreamEventOneOf3 getRunStreamEventOneOf3() throws ClassCastException {
        return (RunStreamEventOneOf3)super.getActualInstance();
    }
    /**
     * Get the actual instance of `RunStreamEventOneOf4`. If the actual instance is not `RunStreamEventOneOf4`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RunStreamEventOneOf4`
     * @throws ClassCastException if the instance is not `RunStreamEventOneOf4`
     */
    public RunStreamEventOneOf4 getRunStreamEventOneOf4() throws ClassCastException {
        return (RunStreamEventOneOf4)super.getActualInstance();
    }
    /**
     * Get the actual instance of `RunStreamEventOneOf5`. If the actual instance is not `RunStreamEventOneOf5`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RunStreamEventOneOf5`
     * @throws ClassCastException if the instance is not `RunStreamEventOneOf5`
     */
    public RunStreamEventOneOf5 getRunStreamEventOneOf5() throws ClassCastException {
        return (RunStreamEventOneOf5)super.getActualInstance();
    }
    /**
     * Get the actual instance of `RunStreamEventOneOf6`. If the actual instance is not `RunStreamEventOneOf6`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RunStreamEventOneOf6`
     * @throws ClassCastException if the instance is not `RunStreamEventOneOf6`
     */
    public RunStreamEventOneOf6 getRunStreamEventOneOf6() throws ClassCastException {
        return (RunStreamEventOneOf6)super.getActualInstance();
    }
    /**
     * Get the actual instance of `RunStreamEventOneOf7`. If the actual instance is not `RunStreamEventOneOf7`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RunStreamEventOneOf7`
     * @throws ClassCastException if the instance is not `RunStreamEventOneOf7`
     */
    public RunStreamEventOneOf7 getRunStreamEventOneOf7() throws ClassCastException {
        return (RunStreamEventOneOf7)super.getActualInstance();
    }
    /**
     * Get the actual instance of `RunStreamEventOneOf8`. If the actual instance is not `RunStreamEventOneOf8`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RunStreamEventOneOf8`
     * @throws ClassCastException if the instance is not `RunStreamEventOneOf8`
     */
    public RunStreamEventOneOf8 getRunStreamEventOneOf8() throws ClassCastException {
        return (RunStreamEventOneOf8)super.getActualInstance();
    }
    /**
     * Get the actual instance of `RunStreamEventOneOf9`. If the actual instance is not `RunStreamEventOneOf9`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RunStreamEventOneOf9`
     * @throws ClassCastException if the instance is not `RunStreamEventOneOf9`
     */
    public RunStreamEventOneOf9 getRunStreamEventOneOf9() throws ClassCastException {
        return (RunStreamEventOneOf9)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to RunStreamEvent
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with RunStreamEventOneOf
        try {
            RunStreamEventOneOf.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for RunStreamEventOneOf failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with RunStreamEventOneOf1
        try {
            RunStreamEventOneOf1.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for RunStreamEventOneOf1 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with RunStreamEventOneOf2
        try {
            RunStreamEventOneOf2.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for RunStreamEventOneOf2 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with RunStreamEventOneOf3
        try {
            RunStreamEventOneOf3.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for RunStreamEventOneOf3 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with RunStreamEventOneOf4
        try {
            RunStreamEventOneOf4.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for RunStreamEventOneOf4 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with RunStreamEventOneOf5
        try {
            RunStreamEventOneOf5.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for RunStreamEventOneOf5 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with RunStreamEventOneOf6
        try {
            RunStreamEventOneOf6.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for RunStreamEventOneOf6 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with RunStreamEventOneOf7
        try {
            RunStreamEventOneOf7.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for RunStreamEventOneOf7 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with RunStreamEventOneOf8
        try {
            RunStreamEventOneOf8.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for RunStreamEventOneOf8 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with RunStreamEventOneOf9
        try {
            RunStreamEventOneOf9.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for RunStreamEventOneOf9 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for RunStreamEvent with oneOf schemas: RunStreamEventOneOf, RunStreamEventOneOf1, RunStreamEventOneOf2, RunStreamEventOneOf3, RunStreamEventOneOf4, RunStreamEventOneOf5, RunStreamEventOneOf6, RunStreamEventOneOf7, RunStreamEventOneOf8, RunStreamEventOneOf9. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of RunStreamEvent given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of RunStreamEvent
     * @throws IOException if the JSON string is invalid with respect to RunStreamEvent
     */
    public static RunStreamEvent fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, RunStreamEvent.class);
    }

    /**
     * Convert an instance of RunStreamEvent to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

