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

package com.google.api.services.containeranalysis.v1alpha1.model;

/**
 * ComplianceNote encapsulates all information about a specific compliance check.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Container Analysis API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ComplianceNote extends com.google.api.client.json.GenericJson {

  /**
   * Right now we only have one compliance type, but we may add additional types in the future.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CisBenchmark cisBenchmark;

  /**
   * A description about this compliance check.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * A rationale for the existence of this compliance check.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rationale;

  /**
   * A description of remediation steps if the compliance check fails.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String remediation;

  /**
   * Serialized scan instructions with a predefined format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String scanInstructions;

  /**
   * The title that identifies this compliance check.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The OS and config versions the benchmark applies to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ComplianceVersion> version;

  /**
   * Right now we only have one compliance type, but we may add additional types in the future.
   * @return value or {@code null} for none
   */
  public CisBenchmark getCisBenchmark() {
    return cisBenchmark;
  }

  /**
   * Right now we only have one compliance type, but we may add additional types in the future.
   * @param cisBenchmark cisBenchmark or {@code null} for none
   */
  public ComplianceNote setCisBenchmark(CisBenchmark cisBenchmark) {
    this.cisBenchmark = cisBenchmark;
    return this;
  }

  /**
   * A description about this compliance check.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * A description about this compliance check.
   * @param description description or {@code null} for none
   */
  public ComplianceNote setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * A rationale for the existence of this compliance check.
   * @return value or {@code null} for none
   */
  public java.lang.String getRationale() {
    return rationale;
  }

  /**
   * A rationale for the existence of this compliance check.
   * @param rationale rationale or {@code null} for none
   */
  public ComplianceNote setRationale(java.lang.String rationale) {
    this.rationale = rationale;
    return this;
  }

  /**
   * A description of remediation steps if the compliance check fails.
   * @return value or {@code null} for none
   */
  public java.lang.String getRemediation() {
    return remediation;
  }

  /**
   * A description of remediation steps if the compliance check fails.
   * @param remediation remediation or {@code null} for none
   */
  public ComplianceNote setRemediation(java.lang.String remediation) {
    this.remediation = remediation;
    return this;
  }

  /**
   * Serialized scan instructions with a predefined format.
   * @see #decodeScanInstructions()
   * @return value or {@code null} for none
   */
  public java.lang.String getScanInstructions() {
    return scanInstructions;
  }

  /**
   * Serialized scan instructions with a predefined format.
   * @see #getScanInstructions()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeScanInstructions() {
    return com.google.api.client.util.Base64.decodeBase64(scanInstructions);
  }

  /**
   * Serialized scan instructions with a predefined format.
   * @see #encodeScanInstructions()
   * @param scanInstructions scanInstructions or {@code null} for none
   */
  public ComplianceNote setScanInstructions(java.lang.String scanInstructions) {
    this.scanInstructions = scanInstructions;
    return this;
  }

  /**
   * Serialized scan instructions with a predefined format.
   * @see #setScanInstructions()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public ComplianceNote encodeScanInstructions(byte[] scanInstructions) {
    this.scanInstructions = com.google.api.client.util.Base64.encodeBase64URLSafeString(scanInstructions);
    return this;
  }

  /**
   * The title that identifies this compliance check.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The title that identifies this compliance check.
   * @param title title or {@code null} for none
   */
  public ComplianceNote setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * The OS and config versions the benchmark applies to.
   * @return value or {@code null} for none
   */
  public java.util.List<ComplianceVersion> getVersion() {
    return version;
  }

  /**
   * The OS and config versions the benchmark applies to.
   * @param version version or {@code null} for none
   */
  public ComplianceNote setVersion(java.util.List<ComplianceVersion> version) {
    this.version = version;
    return this;
  }

  @Override
  public ComplianceNote set(String fieldName, Object value) {
    return (ComplianceNote) super.set(fieldName, value);
  }

  @Override
  public ComplianceNote clone() {
    return (ComplianceNote) super.clone();
  }

}