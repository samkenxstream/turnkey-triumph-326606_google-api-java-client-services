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

package com.google.api.services.chat.v1.model;

/**
 * An image that is specified by a URL and can have an onClick action.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Chat API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAppsCardV1Image extends com.google.api.client.json.GenericJson {

  /**
   * The alternative text of this image, used for accessibility.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String altText;

  /**
   * An image URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String imageUrl;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsCardV1OnClick onClick;

  /**
   * The alternative text of this image, used for accessibility.
   * @return value or {@code null} for none
   */
  public java.lang.String getAltText() {
    return altText;
  }

  /**
   * The alternative text of this image, used for accessibility.
   * @param altText altText or {@code null} for none
   */
  public GoogleAppsCardV1Image setAltText(java.lang.String altText) {
    this.altText = altText;
    return this;
  }

  /**
   * An image URL.
   * @return value or {@code null} for none
   */
  public java.lang.String getImageUrl() {
    return imageUrl;
  }

  /**
   * An image URL.
   * @param imageUrl imageUrl or {@code null} for none
   */
  public GoogleAppsCardV1Image setImageUrl(java.lang.String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public GoogleAppsCardV1OnClick getOnClick() {
    return onClick;
  }

  /**
   * @param onClick onClick or {@code null} for none
   */
  public GoogleAppsCardV1Image setOnClick(GoogleAppsCardV1OnClick onClick) {
    this.onClick = onClick;
    return this;
  }

  @Override
  public GoogleAppsCardV1Image set(String fieldName, Object value) {
    return (GoogleAppsCardV1Image) super.set(fieldName, value);
  }

  @Override
  public GoogleAppsCardV1Image clone() {
    return (GoogleAppsCardV1Image) super.clone();
  }

}