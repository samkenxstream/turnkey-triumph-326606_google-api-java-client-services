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

package com.google.api.services.keep.v1.model;

/**
 * The block of text for a single text section or list item.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Keep API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TextContent extends com.google.api.client.json.GenericJson {

  /**
   * The text of the note. The limits on this vary with the specific field using this type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String text;

  /**
   * The text of the note. The limits on this vary with the specific field using this type.
   * @return value or {@code null} for none
   */
  public java.lang.String getText() {
    return text;
  }

  /**
   * The text of the note. The limits on this vary with the specific field using this type.
   * @param text text or {@code null} for none
   */
  public TextContent setText(java.lang.String text) {
    this.text = text;
    return this;
  }

  @Override
  public TextContent set(String fieldName, Object value) {
    return (TextContent) super.set(fieldName, value);
  }

  @Override
  public TextContent clone() {
    return (TextContent) super.clone();
  }

}