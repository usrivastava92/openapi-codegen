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
 * A list of the categories, and whether they are flagged or not.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-02T18:29:03.933402+05:30[Asia/Kolkata]", comments = "Generator version: 7.6.0")
public class CreateModerationResponseResultsInnerCategories {
  public static final String SERIALIZED_NAME_HATE = "hate";
  @SerializedName(SERIALIZED_NAME_HATE)
  private Boolean hate;

  public static final String SERIALIZED_NAME_HATE_THREATENING = "hate/threatening";
  @SerializedName(SERIALIZED_NAME_HATE_THREATENING)
  private Boolean hateThreatening;

  public static final String SERIALIZED_NAME_HARASSMENT = "harassment";
  @SerializedName(SERIALIZED_NAME_HARASSMENT)
  private Boolean harassment;

  public static final String SERIALIZED_NAME_HARASSMENT_THREATENING = "harassment/threatening";
  @SerializedName(SERIALIZED_NAME_HARASSMENT_THREATENING)
  private Boolean harassmentThreatening;

  public static final String SERIALIZED_NAME_SELF_HARM = "self-harm";
  @SerializedName(SERIALIZED_NAME_SELF_HARM)
  private Boolean selfHarm;

  public static final String SERIALIZED_NAME_SELF_HARM_INTENT = "self-harm/intent";
  @SerializedName(SERIALIZED_NAME_SELF_HARM_INTENT)
  private Boolean selfHarmIntent;

  public static final String SERIALIZED_NAME_SELF_HARM_INSTRUCTIONS = "self-harm/instructions";
  @SerializedName(SERIALIZED_NAME_SELF_HARM_INSTRUCTIONS)
  private Boolean selfHarmInstructions;

  public static final String SERIALIZED_NAME_SEXUAL = "sexual";
  @SerializedName(SERIALIZED_NAME_SEXUAL)
  private Boolean sexual;

  public static final String SERIALIZED_NAME_SEXUAL_MINORS = "sexual/minors";
  @SerializedName(SERIALIZED_NAME_SEXUAL_MINORS)
  private Boolean sexualMinors;

  public static final String SERIALIZED_NAME_VIOLENCE = "violence";
  @SerializedName(SERIALIZED_NAME_VIOLENCE)
  private Boolean violence;

  public static final String SERIALIZED_NAME_VIOLENCE_GRAPHIC = "violence/graphic";
  @SerializedName(SERIALIZED_NAME_VIOLENCE_GRAPHIC)
  private Boolean violenceGraphic;

  public CreateModerationResponseResultsInnerCategories() {
  }

  public CreateModerationResponseResultsInnerCategories hate(Boolean hate) {
    this.hate = hate;
    return this;
  }

   /**
   * Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment.
   * @return hate
  **/
  @javax.annotation.Nonnull
  public Boolean getHate() {
    return hate;
  }

  public void setHate(Boolean hate) {
    this.hate = hate;
  }


  public CreateModerationResponseResultsInnerCategories hateThreatening(Boolean hateThreatening) {
    this.hateThreatening = hateThreatening;
    return this;
  }

   /**
   * Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste.
   * @return hateThreatening
  **/
  @javax.annotation.Nonnull
  public Boolean getHateThreatening() {
    return hateThreatening;
  }

  public void setHateThreatening(Boolean hateThreatening) {
    this.hateThreatening = hateThreatening;
  }


  public CreateModerationResponseResultsInnerCategories harassment(Boolean harassment) {
    this.harassment = harassment;
    return this;
  }

   /**
   * Content that expresses, incites, or promotes harassing language towards any target.
   * @return harassment
  **/
  @javax.annotation.Nonnull
  public Boolean getHarassment() {
    return harassment;
  }

  public void setHarassment(Boolean harassment) {
    this.harassment = harassment;
  }


  public CreateModerationResponseResultsInnerCategories harassmentThreatening(Boolean harassmentThreatening) {
    this.harassmentThreatening = harassmentThreatening;
    return this;
  }

   /**
   * Harassment content that also includes violence or serious harm towards any target.
   * @return harassmentThreatening
  **/
  @javax.annotation.Nonnull
  public Boolean getHarassmentThreatening() {
    return harassmentThreatening;
  }

  public void setHarassmentThreatening(Boolean harassmentThreatening) {
    this.harassmentThreatening = harassmentThreatening;
  }


  public CreateModerationResponseResultsInnerCategories selfHarm(Boolean selfHarm) {
    this.selfHarm = selfHarm;
    return this;
  }

   /**
   * Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders.
   * @return selfHarm
  **/
  @javax.annotation.Nonnull
  public Boolean getSelfHarm() {
    return selfHarm;
  }

  public void setSelfHarm(Boolean selfHarm) {
    this.selfHarm = selfHarm;
  }


  public CreateModerationResponseResultsInnerCategories selfHarmIntent(Boolean selfHarmIntent) {
    this.selfHarmIntent = selfHarmIntent;
    return this;
  }

   /**
   * Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders.
   * @return selfHarmIntent
  **/
  @javax.annotation.Nonnull
  public Boolean getSelfHarmIntent() {
    return selfHarmIntent;
  }

  public void setSelfHarmIntent(Boolean selfHarmIntent) {
    this.selfHarmIntent = selfHarmIntent;
  }


  public CreateModerationResponseResultsInnerCategories selfHarmInstructions(Boolean selfHarmInstructions) {
    this.selfHarmInstructions = selfHarmInstructions;
    return this;
  }

   /**
   * Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts.
   * @return selfHarmInstructions
  **/
  @javax.annotation.Nonnull
  public Boolean getSelfHarmInstructions() {
    return selfHarmInstructions;
  }

  public void setSelfHarmInstructions(Boolean selfHarmInstructions) {
    this.selfHarmInstructions = selfHarmInstructions;
  }


  public CreateModerationResponseResultsInnerCategories sexual(Boolean sexual) {
    this.sexual = sexual;
    return this;
  }

   /**
   * Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness).
   * @return sexual
  **/
  @javax.annotation.Nonnull
  public Boolean getSexual() {
    return sexual;
  }

  public void setSexual(Boolean sexual) {
    this.sexual = sexual;
  }


  public CreateModerationResponseResultsInnerCategories sexualMinors(Boolean sexualMinors) {
    this.sexualMinors = sexualMinors;
    return this;
  }

   /**
   * Sexual content that includes an individual who is under 18 years old.
   * @return sexualMinors
  **/
  @javax.annotation.Nonnull
  public Boolean getSexualMinors() {
    return sexualMinors;
  }

  public void setSexualMinors(Boolean sexualMinors) {
    this.sexualMinors = sexualMinors;
  }


  public CreateModerationResponseResultsInnerCategories violence(Boolean violence) {
    this.violence = violence;
    return this;
  }

   /**
   * Content that depicts death, violence, or physical injury.
   * @return violence
  **/
  @javax.annotation.Nonnull
  public Boolean getViolence() {
    return violence;
  }

  public void setViolence(Boolean violence) {
    this.violence = violence;
  }


  public CreateModerationResponseResultsInnerCategories violenceGraphic(Boolean violenceGraphic) {
    this.violenceGraphic = violenceGraphic;
    return this;
  }

   /**
   * Content that depicts death, violence, or physical injury in graphic detail.
   * @return violenceGraphic
  **/
  @javax.annotation.Nonnull
  public Boolean getViolenceGraphic() {
    return violenceGraphic;
  }

  public void setViolenceGraphic(Boolean violenceGraphic) {
    this.violenceGraphic = violenceGraphic;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateModerationResponseResultsInnerCategories createModerationResponseResultsInnerCategories = (CreateModerationResponseResultsInnerCategories) o;
    return Objects.equals(this.hate, createModerationResponseResultsInnerCategories.hate) &&
        Objects.equals(this.hateThreatening, createModerationResponseResultsInnerCategories.hateThreatening) &&
        Objects.equals(this.harassment, createModerationResponseResultsInnerCategories.harassment) &&
        Objects.equals(this.harassmentThreatening, createModerationResponseResultsInnerCategories.harassmentThreatening) &&
        Objects.equals(this.selfHarm, createModerationResponseResultsInnerCategories.selfHarm) &&
        Objects.equals(this.selfHarmIntent, createModerationResponseResultsInnerCategories.selfHarmIntent) &&
        Objects.equals(this.selfHarmInstructions, createModerationResponseResultsInnerCategories.selfHarmInstructions) &&
        Objects.equals(this.sexual, createModerationResponseResultsInnerCategories.sexual) &&
        Objects.equals(this.sexualMinors, createModerationResponseResultsInnerCategories.sexualMinors) &&
        Objects.equals(this.violence, createModerationResponseResultsInnerCategories.violence) &&
        Objects.equals(this.violenceGraphic, createModerationResponseResultsInnerCategories.violenceGraphic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hate, hateThreatening, harassment, harassmentThreatening, selfHarm, selfHarmIntent, selfHarmInstructions, sexual, sexualMinors, violence, violenceGraphic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateModerationResponseResultsInnerCategories {\n");
    sb.append("    hate: ").append(toIndentedString(hate)).append("\n");
    sb.append("    hateThreatening: ").append(toIndentedString(hateThreatening)).append("\n");
    sb.append("    harassment: ").append(toIndentedString(harassment)).append("\n");
    sb.append("    harassmentThreatening: ").append(toIndentedString(harassmentThreatening)).append("\n");
    sb.append("    selfHarm: ").append(toIndentedString(selfHarm)).append("\n");
    sb.append("    selfHarmIntent: ").append(toIndentedString(selfHarmIntent)).append("\n");
    sb.append("    selfHarmInstructions: ").append(toIndentedString(selfHarmInstructions)).append("\n");
    sb.append("    sexual: ").append(toIndentedString(sexual)).append("\n");
    sb.append("    sexualMinors: ").append(toIndentedString(sexualMinors)).append("\n");
    sb.append("    violence: ").append(toIndentedString(violence)).append("\n");
    sb.append("    violenceGraphic: ").append(toIndentedString(violenceGraphic)).append("\n");
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
    openapiFields.add("hate");
    openapiFields.add("hate/threatening");
    openapiFields.add("harassment");
    openapiFields.add("harassment/threatening");
    openapiFields.add("self-harm");
    openapiFields.add("self-harm/intent");
    openapiFields.add("self-harm/instructions");
    openapiFields.add("sexual");
    openapiFields.add("sexual/minors");
    openapiFields.add("violence");
    openapiFields.add("violence/graphic");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("hate");
    openapiRequiredFields.add("hate/threatening");
    openapiRequiredFields.add("harassment");
    openapiRequiredFields.add("harassment/threatening");
    openapiRequiredFields.add("self-harm");
    openapiRequiredFields.add("self-harm/intent");
    openapiRequiredFields.add("self-harm/instructions");
    openapiRequiredFields.add("sexual");
    openapiRequiredFields.add("sexual/minors");
    openapiRequiredFields.add("violence");
    openapiRequiredFields.add("violence/graphic");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateModerationResponseResultsInnerCategories
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateModerationResponseResultsInnerCategories.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateModerationResponseResultsInnerCategories is not found in the empty JSON string", CreateModerationResponseResultsInnerCategories.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateModerationResponseResultsInnerCategories.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateModerationResponseResultsInnerCategories` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateModerationResponseResultsInnerCategories.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateModerationResponseResultsInnerCategories.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateModerationResponseResultsInnerCategories' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateModerationResponseResultsInnerCategories> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateModerationResponseResultsInnerCategories.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateModerationResponseResultsInnerCategories>() {
           @Override
           public void write(JsonWriter out, CreateModerationResponseResultsInnerCategories value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateModerationResponseResultsInnerCategories read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateModerationResponseResultsInnerCategories given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateModerationResponseResultsInnerCategories
  * @throws IOException if the JSON string is invalid with respect to CreateModerationResponseResultsInnerCategories
  */
  public static CreateModerationResponseResultsInnerCategories fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateModerationResponseResultsInnerCategories.class);
  }

 /**
  * Convert an instance of CreateModerationResponseResultsInnerCategories to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

