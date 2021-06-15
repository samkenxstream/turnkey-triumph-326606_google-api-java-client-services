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

package com.google.api.services.gkehub.v1.model;

/**
 * Version for Hierarchy Controller
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ConfigManagementHierarchyControllerVersion extends com.google.api.client.json.GenericJson {

  /**
   * Version for Hierarchy Controller extension
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String extension;

  /**
   * Version for open source HNC
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String hnc;

  /**
   * Version for Hierarchy Controller extension
   * @return value or {@code null} for none
   */
  public java.lang.String getExtension() {
    return extension;
  }

  /**
   * Version for Hierarchy Controller extension
   * @param extension extension or {@code null} for none
   */
  public ConfigManagementHierarchyControllerVersion setExtension(java.lang.String extension) {
    this.extension = extension;
    return this;
  }

  /**
   * Version for open source HNC
   * @return value or {@code null} for none
   */
  public java.lang.String getHnc() {
    return hnc;
  }

  /**
   * Version for open source HNC
   * @param hnc hnc or {@code null} for none
   */
  public ConfigManagementHierarchyControllerVersion setHnc(java.lang.String hnc) {
    this.hnc = hnc;
    return this;
  }

  @Override
  public ConfigManagementHierarchyControllerVersion set(String fieldName, Object value) {
    return (ConfigManagementHierarchyControllerVersion) super.set(fieldName, value);
  }

  @Override
  public ConfigManagementHierarchyControllerVersion clone() {
    return (ConfigManagementHierarchyControllerVersion) super.clone();
  }

}