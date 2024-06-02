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
import com.atlassian.aigateway.model.ChatCompletionRequestMessageContentPart;
import java.util.List;



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
public class ChatCompletionRequestUserMessageContent extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ChatCompletionRequestUserMessageContent.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ChatCompletionRequestUserMessageContent.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ChatCompletionRequestUserMessageContent' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<String> adapterString = gson.getDelegateAdapter(this, TypeToken.get(String.class));

            final Type typeInstanceListChatCompletionRequestMessageContentPart = new TypeToken<List<ChatCompletionRequestMessageContentPart>>(){}.getType();
            final TypeAdapter<List<ChatCompletionRequestMessageContentPart>> adapterListChatCompletionRequestMessageContentPart = (TypeAdapter<List<ChatCompletionRequestMessageContentPart>>) gson.getDelegateAdapter(this, TypeToken.get(typeInstanceListChatCompletionRequestMessageContentPart));

            return (TypeAdapter<T>) new TypeAdapter<ChatCompletionRequestUserMessageContent>() {
                @Override
                public void write(JsonWriter out, ChatCompletionRequestUserMessageContent value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `String`
                    if (value.getActualInstance() instanceof String) {
                        JsonPrimitive primitive = adapterString.toJsonTree((String)value.getActualInstance()).getAsJsonPrimitive();
                        elementAdapter.write(out, primitive);
                        return;
                    }
                    // check if the actual instance is of the type `List<ChatCompletionRequestMessageContentPart>`
                    if (value.getActualInstance() instanceof List<?>) {
                        List<?> list = (List<?>) value.getActualInstance();
                        if (list.get(0) instanceof ChatCompletionRequestMessageContentPart) {
                            JsonArray array = adapterListChatCompletionRequestMessageContentPart.toJsonTree((List<ChatCompletionRequestMessageContentPart>)value.getActualInstance()).getAsJsonArray();
                            elementAdapter.write(out, array);
                            return;
                        }
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: List<ChatCompletionRequestMessageContentPart>, String");
                }

                @Override
                public ChatCompletionRequestUserMessageContent read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize String
                    try {
                        // validate the JSON object to see if any exception is thrown
                        if (!jsonElement.getAsJsonPrimitive().isString()) {
                            throw new IllegalArgumentException(String.format("Expected json element to be of type String in the JSON string but got `%s`", jsonElement.toString()));
                        }
                        actualAdapter = adapterString;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'String'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for String failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'String'", e);
                    }
                    // deserialize List<ChatCompletionRequestMessageContentPart>
                    try {
                        // validate the JSON object to see if any exception is thrown
                        if (!jsonElement.isJsonArray()) {
                            throw new IllegalArgumentException(String.format("Expected json element to be a array type in the JSON string but got `%s`", jsonElement.toString()));
                        }

                        JsonArray array = jsonElement.getAsJsonArray();
                        // validate array items
                        for(JsonElement element : array) {
                            ChatCompletionRequestMessageContentPart.validateJsonElement(element);
                        }
                        actualAdapter = adapterListChatCompletionRequestMessageContentPart;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'List<ChatCompletionRequestMessageContentPart>'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for List<ChatCompletionRequestMessageContentPart> failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'List<ChatCompletionRequestMessageContentPart>'", e);
                    }

                    if (match == 1) {
                        ChatCompletionRequestUserMessageContent ret = new ChatCompletionRequestUserMessageContent();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for ChatCompletionRequestUserMessageContent: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public ChatCompletionRequestUserMessageContent() {
        super("oneOf", Boolean.FALSE);
    }

    public ChatCompletionRequestUserMessageContent(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("String", String.class);
        schemas.put("List<ChatCompletionRequestMessageContentPart>", List.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return ChatCompletionRequestUserMessageContent.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * List<ChatCompletionRequestMessageContentPart>, String
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof String) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof List<?>) {
            List<?> list = (List<?>) instance;
            if (list.get(0) instanceof ChatCompletionRequestMessageContentPart) {
                super.setActualInstance(instance);
                return;
            }
        }

        throw new RuntimeException("Invalid instance type. Must be List<ChatCompletionRequestMessageContentPart>, String");
    }

    /**
     * Get the actual instance, which can be the following:
     * List<ChatCompletionRequestMessageContentPart>, String
     *
     * @return The actual instance (List<ChatCompletionRequestMessageContentPart>, String)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `String`. If the actual instance is not `String`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `String`
     * @throws ClassCastException if the instance is not `String`
     */
    public String getString() throws ClassCastException {
        return (String)super.getActualInstance();
    }
    /**
     * Get the actual instance of `List<ChatCompletionRequestMessageContentPart>`. If the actual instance is not `List<ChatCompletionRequestMessageContentPart>`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `List<ChatCompletionRequestMessageContentPart>`
     * @throws ClassCastException if the instance is not `List<ChatCompletionRequestMessageContentPart>`
     */
    public List<ChatCompletionRequestMessageContentPart> getListChatCompletionRequestMessageContentPart() throws ClassCastException {
        return (List<ChatCompletionRequestMessageContentPart>)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ChatCompletionRequestUserMessageContent
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with String
        try {
            if (!jsonElement.getAsJsonPrimitive().isString()) {
                throw new IllegalArgumentException(String.format("Expected json element to be of type String in the JSON string but got `%s`", jsonElement.toString()));
            }
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for String failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with List<ChatCompletionRequestMessageContentPart>
        try {
            if (!jsonElement.isJsonArray()) {
                throw new IllegalArgumentException(String.format("Expected json element to be a array type in the JSON string but got `%s`", jsonElement.toString()));
            }
            JsonArray array = jsonElement.getAsJsonArray();
            // validate array items
            for(JsonElement element : array) {
                ChatCompletionRequestMessageContentPart.validateJsonElement(element);
            }
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for List<ChatCompletionRequestMessageContentPart> failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for ChatCompletionRequestUserMessageContent with oneOf schemas: List<ChatCompletionRequestMessageContentPart>, String. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of ChatCompletionRequestUserMessageContent given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ChatCompletionRequestUserMessageContent
     * @throws IOException if the JSON string is invalid with respect to ChatCompletionRequestUserMessageContent
     */
    public static ChatCompletionRequestUserMessageContent fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ChatCompletionRequestUserMessageContent.class);
    }

    /**
     * Convert an instance of ChatCompletionRequestUserMessageContent to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

