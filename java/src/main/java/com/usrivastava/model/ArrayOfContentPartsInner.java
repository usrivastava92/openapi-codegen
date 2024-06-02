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


package com.usrivastava.model;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;


import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonElement;

import com.usrivastava.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-02T19:36:59.215862+05:30[Asia/Kolkata]", comments = "Generator version: 7.6.0")
public class ArrayOfContentPartsInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ArrayOfContentPartsInner.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ArrayOfContentPartsInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ArrayOfContentPartsInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<MessageContentImageFileObject> adapterMessageContentImageFileObject = gson.getDelegateAdapter(this, TypeToken.get(MessageContentImageFileObject.class));
            final TypeAdapter<MessageContentImageUrlObject> adapterMessageContentImageUrlObject = gson.getDelegateAdapter(this, TypeToken.get(MessageContentImageUrlObject.class));
            final TypeAdapter<MessageRequestContentTextObject> adapterMessageRequestContentTextObject = gson.getDelegateAdapter(this, TypeToken.get(MessageRequestContentTextObject.class));

            return (TypeAdapter<T>) new TypeAdapter<ArrayOfContentPartsInner>() {
                @Override
                public void write(JsonWriter out, ArrayOfContentPartsInner value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `MessageContentImageFileObject`
                    if (value.getActualInstance() instanceof MessageContentImageFileObject) {
                        JsonElement element = adapterMessageContentImageFileObject.toJsonTree((MessageContentImageFileObject)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `MessageContentImageUrlObject`
                    if (value.getActualInstance() instanceof MessageContentImageUrlObject) {
                        JsonElement element = adapterMessageContentImageUrlObject.toJsonTree((MessageContentImageUrlObject)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `MessageRequestContentTextObject`
                    if (value.getActualInstance() instanceof MessageRequestContentTextObject) {
                        JsonElement element = adapterMessageRequestContentTextObject.toJsonTree((MessageRequestContentTextObject)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: MessageContentImageFileObject, MessageContentImageUrlObject, MessageRequestContentTextObject");
                }

                @Override
                public ArrayOfContentPartsInner read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize MessageContentImageFileObject
                    try {
                        // validate the JSON object to see if any exception is thrown
                        MessageContentImageFileObject.validateJsonElement(jsonElement);
                        actualAdapter = adapterMessageContentImageFileObject;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'MessageContentImageFileObject'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for MessageContentImageFileObject failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'MessageContentImageFileObject'", e);
                    }
                    // deserialize MessageContentImageUrlObject
                    try {
                        // validate the JSON object to see if any exception is thrown
                        MessageContentImageUrlObject.validateJsonElement(jsonElement);
                        actualAdapter = adapterMessageContentImageUrlObject;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'MessageContentImageUrlObject'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for MessageContentImageUrlObject failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'MessageContentImageUrlObject'", e);
                    }
                    // deserialize MessageRequestContentTextObject
                    try {
                        // validate the JSON object to see if any exception is thrown
                        MessageRequestContentTextObject.validateJsonElement(jsonElement);
                        actualAdapter = adapterMessageRequestContentTextObject;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'MessageRequestContentTextObject'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for MessageRequestContentTextObject failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'MessageRequestContentTextObject'", e);
                    }

                    if (match == 1) {
                        ArrayOfContentPartsInner ret = new ArrayOfContentPartsInner();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for ArrayOfContentPartsInner: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public ArrayOfContentPartsInner() {
        super("oneOf", Boolean.FALSE);
    }

    public ArrayOfContentPartsInner(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("MessageContentImageFileObject", MessageContentImageFileObject.class);
        schemas.put("MessageContentImageUrlObject", MessageContentImageUrlObject.class);
        schemas.put("MessageRequestContentTextObject", MessageRequestContentTextObject.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return ArrayOfContentPartsInner.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * MessageContentImageFileObject, MessageContentImageUrlObject, MessageRequestContentTextObject
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof MessageContentImageFileObject) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof MessageContentImageUrlObject) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof MessageRequestContentTextObject) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be MessageContentImageFileObject, MessageContentImageUrlObject, MessageRequestContentTextObject");
    }

    /**
     * Get the actual instance, which can be the following:
     * MessageContentImageFileObject, MessageContentImageUrlObject, MessageRequestContentTextObject
     *
     * @return The actual instance (MessageContentImageFileObject, MessageContentImageUrlObject, MessageRequestContentTextObject)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `MessageContentImageFileObject`. If the actual instance is not `MessageContentImageFileObject`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `MessageContentImageFileObject`
     * @throws ClassCastException if the instance is not `MessageContentImageFileObject`
     */
    public MessageContentImageFileObject getMessageContentImageFileObject() throws ClassCastException {
        return (MessageContentImageFileObject)super.getActualInstance();
    }
    /**
     * Get the actual instance of `MessageContentImageUrlObject`. If the actual instance is not `MessageContentImageUrlObject`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `MessageContentImageUrlObject`
     * @throws ClassCastException if the instance is not `MessageContentImageUrlObject`
     */
    public MessageContentImageUrlObject getMessageContentImageUrlObject() throws ClassCastException {
        return (MessageContentImageUrlObject)super.getActualInstance();
    }
    /**
     * Get the actual instance of `MessageRequestContentTextObject`. If the actual instance is not `MessageRequestContentTextObject`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `MessageRequestContentTextObject`
     * @throws ClassCastException if the instance is not `MessageRequestContentTextObject`
     */
    public MessageRequestContentTextObject getMessageRequestContentTextObject() throws ClassCastException {
        return (MessageRequestContentTextObject)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ArrayOfContentPartsInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with MessageContentImageFileObject
        try {
            MessageContentImageFileObject.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for MessageContentImageFileObject failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with MessageContentImageUrlObject
        try {
            MessageContentImageUrlObject.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for MessageContentImageUrlObject failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with MessageRequestContentTextObject
        try {
            MessageRequestContentTextObject.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for MessageRequestContentTextObject failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for ArrayOfContentPartsInner with oneOf schemas: MessageContentImageFileObject, MessageContentImageUrlObject, MessageRequestContentTextObject. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of ArrayOfContentPartsInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ArrayOfContentPartsInner
     * @throws IOException if the JSON string is invalid with respect to ArrayOfContentPartsInner
     */
    public static ArrayOfContentPartsInner fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ArrayOfContentPartsInner.class);
    }

    /**
     * Convert an instance of ArrayOfContentPartsInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
