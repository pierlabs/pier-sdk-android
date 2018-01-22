package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00C3\u00A7\u00C3\u00A3o da requisi\u00C3\u00A7\u00C3\u00A3o do recurso Configura\u00C3\u00A7\u00C3\u00A3o Registro de Cobran\u00C3\u00A7a Online
 **/
@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o da requisi\u00C3\u00A7\u00C3\u00A3o do recurso Configura\u00C3\u00A7\u00C3\u00A3o Registro de Cobran\u00C3\u00A7a Online")
public class ConfiguracaoRegistroCobrancaPersist  {
  
  @SerializedName("codigoBanco")
  private Long codigoBanco = null;
  @SerializedName("uri")
  private String uri = null;
  @SerializedName("keyStoreName")
  private String keyStoreName = null;
  @SerializedName("keyStorePassword")
  private String keyStorePassword = null;
  @SerializedName("keystoreAlias")
  private String keystoreAlias = null;
  @SerializedName("keyStorePrivateKeyPassword")
  private String keyStorePrivateKeyPassword = null;
  @SerializedName("typeKeystore")
  private String typeKeystore = null;
  @SerializedName("trustStoreName")
  private String trustStoreName = null;
  @SerializedName("trustStorePassword")
  private String trustStorePassword = null;
  @SerializedName("truststoreAlias")
  private String truststoreAlias = null;
  @SerializedName("typeTruststore")
  private String typeTruststore = null;
  @SerializedName("uriAdicional")
  private String uriAdicional = null;
  public enum StatusEnum {
     INATIVO,  ATIVO, 
  };
  @SerializedName("status")
  private StatusEnum status = null;

  
  /**
   * C\u00C3\u00B3digo do Banco.
   **/
  @ApiModelProperty(required = true, value = "C\u00C3\u00B3digo do Banco.")
  public Long getCodigoBanco() {
    return codigoBanco;
  }
  public void setCodigoBanco(Long codigoBanco) {
    this.codigoBanco = codigoBanco;
  }

  
  /**
   * URL de acesso ao banco.
   **/
  @ApiModelProperty(value = "URL de acesso ao banco.")
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
  }

  
  /**
   * Caminho do certificado digital do emissor.
   **/
  @ApiModelProperty(value = "Caminho do certificado digital do emissor.")
  public String getKeyStoreName() {
    return keyStoreName;
  }
  public void setKeyStoreName(String keyStoreName) {
    this.keyStoreName = keyStoreName;
  }

  
  /**
   * Senha do certificado digital do emissor.
   **/
  @ApiModelProperty(value = "Senha do certificado digital do emissor.")
  public String getKeyStorePassword() {
    return keyStorePassword;
  }
  public void setKeyStorePassword(String keyStorePassword) {
    this.keyStorePassword = keyStorePassword;
  }

  
  /**
   * Alias do certificado digital do emissor.
   **/
  @ApiModelProperty(value = "Alias do certificado digital do emissor.")
  public String getKeystoreAlias() {
    return keystoreAlias;
  }
  public void setKeystoreAlias(String keystoreAlias) {
    this.keystoreAlias = keystoreAlias;
  }

  
  /**
   * Senha da chave privada do certificado digital do emissor.
   **/
  @ApiModelProperty(value = "Senha da chave privada do certificado digital do emissor.")
  public String getKeyStorePrivateKeyPassword() {
    return keyStorePrivateKeyPassword;
  }
  public void setKeyStorePrivateKeyPassword(String keyStorePrivateKeyPassword) {
    this.keyStorePrivateKeyPassword = keyStorePrivateKeyPassword;
  }

  
  /**
   * Tipo do certificado digital do emissor.
   **/
  @ApiModelProperty(value = "Tipo do certificado digital do emissor.")
  public String getTypeKeystore() {
    return typeKeystore;
  }
  public void setTypeKeystore(String typeKeystore) {
    this.typeKeystore = typeKeystore;
  }

  
  /**
   * Caminho do certificado digital do banco.
   **/
  @ApiModelProperty(value = "Caminho do certificado digital do banco.")
  public String getTrustStoreName() {
    return trustStoreName;
  }
  public void setTrustStoreName(String trustStoreName) {
    this.trustStoreName = trustStoreName;
  }

  
  /**
   * Senha do certificado digital do banco.
   **/
  @ApiModelProperty(value = "Senha do certificado digital do banco.")
  public String getTrustStorePassword() {
    return trustStorePassword;
  }
  public void setTrustStorePassword(String trustStorePassword) {
    this.trustStorePassword = trustStorePassword;
  }

  
  /**
   * Alias do certificado digital do banco.
   **/
  @ApiModelProperty(value = "Alias do certificado digital do banco.")
  public String getTruststoreAlias() {
    return truststoreAlias;
  }
  public void setTruststoreAlias(String truststoreAlias) {
    this.truststoreAlias = truststoreAlias;
  }

  
  /**
   * Tipo do certificado digital do banco.
   **/
  @ApiModelProperty(value = "Tipo do certificado digital do banco.")
  public String getTypeTruststore() {
    return typeTruststore;
  }
  public void setTypeTruststore(String typeTruststore) {
    this.typeTruststore = typeTruststore;
  }

  
  /**
   * URL adicional de acesso ao banco.
   **/
  @ApiModelProperty(value = "URL adicional de acesso ao banco.")
  public String getUriAdicional() {
    return uriAdicional;
  }
  public void setUriAdicional(String uriAdicional) {
    this.uriAdicional = uriAdicional;
  }

  
  /**
   * Status descrevendo a situa\u00C3\u00A7\u00C3\u00A3o atual da configura\u00C3\u00A7\u00C3\u00A3o.
   **/
  @ApiModelProperty(required = true, value = "Status descrevendo a situa\u00C3\u00A7\u00C3\u00A3o atual da configura\u00C3\u00A7\u00C3\u00A3o.")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfiguracaoRegistroCobrancaPersist {\n");
    
    sb.append("  codigoBanco: ").append(codigoBanco).append("\n");
    sb.append("  uri: ").append(uri).append("\n");
    sb.append("  keyStoreName: ").append(keyStoreName).append("\n");
    sb.append("  keyStorePassword: ").append(keyStorePassword).append("\n");
    sb.append("  keystoreAlias: ").append(keystoreAlias).append("\n");
    sb.append("  keyStorePrivateKeyPassword: ").append(keyStorePrivateKeyPassword).append("\n");
    sb.append("  typeKeystore: ").append(typeKeystore).append("\n");
    sb.append("  trustStoreName: ").append(trustStoreName).append("\n");
    sb.append("  trustStorePassword: ").append(trustStorePassword).append("\n");
    sb.append("  truststoreAlias: ").append(truststoreAlias).append("\n");
    sb.append("  typeTruststore: ").append(typeTruststore).append("\n");
    sb.append("  uriAdicional: ").append(uriAdicional).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
