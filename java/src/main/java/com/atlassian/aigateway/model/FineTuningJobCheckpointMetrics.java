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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.atlassian.aigateway.JSON;

/**
 * Metrics at the step number during the fine-tuning job.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-02T19:36:59.215862+05:30[Asia/Kolkata]", comments = "Generator version: 7.6.0")
public class FineTuningJobCheckpointMetrics {
  public static final String SERIALIZED_NAME_STEP = "step";
  @SerializedName(SERIALIZED_NAME_STEP)
  private BigDecimal step;

  public static final String SERIALIZED_NAME_TRAIN_LOSS = "train_loss";
  @SerializedName(SERIALIZED_NAME_TRAIN_LOSS)
  private BigDecimal trainLoss;

  public static final String SERIALIZED_NAME_TRAIN_MEAN_TOKEN_ACCURACY = "train_mean_token_accuracy";
  @SerializedName(SERIALIZED_NAME_TRAIN_MEAN_TOKEN_ACCURACY)
  private BigDecimal trainMeanTokenAccuracy;

  public static final String SERIALIZED_NAME_VALID_LOSS = "valid_loss";
  @SerializedName(SERIALIZED_NAME_VALID_LOSS)
  private BigDecimal validLoss;

  public static final String SERIALIZED_NAME_VALID_MEAN_TOKEN_ACCURACY = "valid_mean_token_accuracy";
  @SerializedName(SERIALIZED_NAME_VALID_MEAN_TOKEN_ACCURACY)
  private BigDecimal validMeanTokenAccuracy;

  public static final String SERIALIZED_NAME_FULL_VALID_LOSS = "full_valid_loss";
  @SerializedName(SERIALIZED_NAME_FULL_VALID_LOSS)
  private BigDecimal fullValidLoss;

  public static final String SERIALIZED_NAME_FULL_VALID_MEAN_TOKEN_ACCURACY = "full_valid_mean_token_accuracy";
  @SerializedName(SERIALIZED_NAME_FULL_VALID_MEAN_TOKEN_ACCURACY)
  private BigDecimal fullValidMeanTokenAccuracy;

  public FineTuningJobCheckpointMetrics() {
  }

  public FineTuningJobCheckpointMetrics step(BigDecimal step) {
    this.step = step;
    return this;
  }

   /**
   * Get step
   * @return step
  **/
  @javax.annotation.Nullable
  public BigDecimal getStep() {
    return step;
  }

  public void setStep(BigDecimal step) {
    this.step = step;
  }


  public FineTuningJobCheckpointMetrics trainLoss(BigDecimal trainLoss) {
    this.trainLoss = trainLoss;
    return this;
  }

   /**
   * Get trainLoss
   * @return trainLoss
  **/
  @javax.annotation.Nullable
  public BigDecimal getTrainLoss() {
    return trainLoss;
  }

  public void setTrainLoss(BigDecimal trainLoss) {
    this.trainLoss = trainLoss;
  }


  public FineTuningJobCheckpointMetrics trainMeanTokenAccuracy(BigDecimal trainMeanTokenAccuracy) {
    this.trainMeanTokenAccuracy = trainMeanTokenAccuracy;
    return this;
  }

   /**
   * Get trainMeanTokenAccuracy
   * @return trainMeanTokenAccuracy
  **/
  @javax.annotation.Nullable
  public BigDecimal getTrainMeanTokenAccuracy() {
    return trainMeanTokenAccuracy;
  }

  public void setTrainMeanTokenAccuracy(BigDecimal trainMeanTokenAccuracy) {
    this.trainMeanTokenAccuracy = trainMeanTokenAccuracy;
  }


  public FineTuningJobCheckpointMetrics validLoss(BigDecimal validLoss) {
    this.validLoss = validLoss;
    return this;
  }

   /**
   * Get validLoss
   * @return validLoss
  **/
  @javax.annotation.Nullable
  public BigDecimal getValidLoss() {
    return validLoss;
  }

  public void setValidLoss(BigDecimal validLoss) {
    this.validLoss = validLoss;
  }


  public FineTuningJobCheckpointMetrics validMeanTokenAccuracy(BigDecimal validMeanTokenAccuracy) {
    this.validMeanTokenAccuracy = validMeanTokenAccuracy;
    return this;
  }

   /**
   * Get validMeanTokenAccuracy
   * @return validMeanTokenAccuracy
  **/
  @javax.annotation.Nullable
  public BigDecimal getValidMeanTokenAccuracy() {
    return validMeanTokenAccuracy;
  }

  public void setValidMeanTokenAccuracy(BigDecimal validMeanTokenAccuracy) {
    this.validMeanTokenAccuracy = validMeanTokenAccuracy;
  }


  public FineTuningJobCheckpointMetrics fullValidLoss(BigDecimal fullValidLoss) {
    this.fullValidLoss = fullValidLoss;
    return this;
  }

   /**
   * Get fullValidLoss
   * @return fullValidLoss
  **/
  @javax.annotation.Nullable
  public BigDecimal getFullValidLoss() {
    return fullValidLoss;
  }

  public void setFullValidLoss(BigDecimal fullValidLoss) {
    this.fullValidLoss = fullValidLoss;
  }


  public FineTuningJobCheckpointMetrics fullValidMeanTokenAccuracy(BigDecimal fullValidMeanTokenAccuracy) {
    this.fullValidMeanTokenAccuracy = fullValidMeanTokenAccuracy;
    return this;
  }

   /**
   * Get fullValidMeanTokenAccuracy
   * @return fullValidMeanTokenAccuracy
  **/
  @javax.annotation.Nullable
  public BigDecimal getFullValidMeanTokenAccuracy() {
    return fullValidMeanTokenAccuracy;
  }

  public void setFullValidMeanTokenAccuracy(BigDecimal fullValidMeanTokenAccuracy) {
    this.fullValidMeanTokenAccuracy = fullValidMeanTokenAccuracy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FineTuningJobCheckpointMetrics fineTuningJobCheckpointMetrics = (FineTuningJobCheckpointMetrics) o;
    return Objects.equals(this.step, fineTuningJobCheckpointMetrics.step) &&
        Objects.equals(this.trainLoss, fineTuningJobCheckpointMetrics.trainLoss) &&
        Objects.equals(this.trainMeanTokenAccuracy, fineTuningJobCheckpointMetrics.trainMeanTokenAccuracy) &&
        Objects.equals(this.validLoss, fineTuningJobCheckpointMetrics.validLoss) &&
        Objects.equals(this.validMeanTokenAccuracy, fineTuningJobCheckpointMetrics.validMeanTokenAccuracy) &&
        Objects.equals(this.fullValidLoss, fineTuningJobCheckpointMetrics.fullValidLoss) &&
        Objects.equals(this.fullValidMeanTokenAccuracy, fineTuningJobCheckpointMetrics.fullValidMeanTokenAccuracy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(step, trainLoss, trainMeanTokenAccuracy, validLoss, validMeanTokenAccuracy, fullValidLoss, fullValidMeanTokenAccuracy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FineTuningJobCheckpointMetrics {\n");
    sb.append("    step: ").append(toIndentedString(step)).append("\n");
    sb.append("    trainLoss: ").append(toIndentedString(trainLoss)).append("\n");
    sb.append("    trainMeanTokenAccuracy: ").append(toIndentedString(trainMeanTokenAccuracy)).append("\n");
    sb.append("    validLoss: ").append(toIndentedString(validLoss)).append("\n");
    sb.append("    validMeanTokenAccuracy: ").append(toIndentedString(validMeanTokenAccuracy)).append("\n");
    sb.append("    fullValidLoss: ").append(toIndentedString(fullValidLoss)).append("\n");
    sb.append("    fullValidMeanTokenAccuracy: ").append(toIndentedString(fullValidMeanTokenAccuracy)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("step");
    openapiFields.add("train_loss");
    openapiFields.add("train_mean_token_accuracy");
    openapiFields.add("valid_loss");
    openapiFields.add("valid_mean_token_accuracy");
    openapiFields.add("full_valid_loss");
    openapiFields.add("full_valid_mean_token_accuracy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FineTuningJobCheckpointMetrics
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FineTuningJobCheckpointMetrics.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FineTuningJobCheckpointMetrics is not found in the empty JSON string", FineTuningJobCheckpointMetrics.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FineTuningJobCheckpointMetrics.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FineTuningJobCheckpointMetrics` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FineTuningJobCheckpointMetrics.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FineTuningJobCheckpointMetrics' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FineTuningJobCheckpointMetrics> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FineTuningJobCheckpointMetrics.class));

       return (TypeAdapter<T>) new TypeAdapter<FineTuningJobCheckpointMetrics>() {
           @Override
           public void write(JsonWriter out, FineTuningJobCheckpointMetrics value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FineTuningJobCheckpointMetrics read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FineTuningJobCheckpointMetrics given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FineTuningJobCheckpointMetrics
  * @throws IOException if the JSON string is invalid with respect to FineTuningJobCheckpointMetrics
  */
  public static FineTuningJobCheckpointMetrics fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FineTuningJobCheckpointMetrics.class);
  }

 /**
  * Convert an instance of FineTuningJobCheckpointMetrics to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

