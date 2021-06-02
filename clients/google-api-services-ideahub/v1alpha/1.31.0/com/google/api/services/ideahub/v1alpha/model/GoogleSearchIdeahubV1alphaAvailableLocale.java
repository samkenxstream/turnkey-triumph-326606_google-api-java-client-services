/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.ideahub.v1alpha.model;

/**
 * Represents locales that are available for a web property.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Idea Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleSearchIdeahubV1alphaAvailableLocale extends com.google.api.client.json.GenericJson {

  /**
   * A string in BCP 47 format, without a resource prefix.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String locale;

  /**
   * A string in BCP 47 format, prefixed with the platform and property name, and "locales/".
   * Format: platforms/{platform}/properties/{property}/locales/{locale}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * A string in BCP 47 format, without a resource prefix.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocale() {
    return locale;
  }

  /**
   * A string in BCP 47 format, without a resource prefix.
   * @param locale locale or {@code null} for none
   */
  public GoogleSearchIdeahubV1alphaAvailableLocale setLocale(java.lang.String locale) {
    this.locale = locale;
    return this;
  }

  /**
   * A string in BCP 47 format, prefixed with the platform and property name, and "locales/".
   * Format: platforms/{platform}/properties/{property}/locales/{locale}
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * A string in BCP 47 format, prefixed with the platform and property name, and "locales/".
   * Format: platforms/{platform}/properties/{property}/locales/{locale}
   * @param name name or {@code null} for none
   */
  public GoogleSearchIdeahubV1alphaAvailableLocale setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public GoogleSearchIdeahubV1alphaAvailableLocale set(String fieldName, Object value) {
    return (GoogleSearchIdeahubV1alphaAvailableLocale) super.set(fieldName, value);
  }

  @Override
  public GoogleSearchIdeahubV1alphaAvailableLocale clone() {
    return (GoogleSearchIdeahubV1alphaAvailableLocale) super.clone();
  }

}