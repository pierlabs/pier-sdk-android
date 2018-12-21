package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Request Representation of the Online Collection Configuration resource
 **/
@ApiModel(description = "Request Representation of the Online Collection Configuration resource")
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
  @SerializedName("secret")
  private String secret = null;
  @SerializedName("clientID")
  private String clientID = null;
  @SerializedName("chave")
  private String chave = null;

  
  /**
   * Bank code
   **/
  @ApiModelProperty(required = true, value = "Bank code")
  public Long getCodigoBanco() {
    return codigoBanco;
  }
  public void setCodigoBanco(Long codigoBanco) {
    this.codigoBanco = codigoBanco;
  }

  
  /**
   * Bank access URL
   **/
  @ApiModelProperty(value = "Bank access URL")
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
  }

  
  /**
   * Issuer's digital certificate path
   **/
  @ApiModelProperty(value = "Issuer's digital certificate path")
  public String getKeyStoreName() {
    return keyStoreName;
  }
  public void setKeyStoreName(String keyStoreName) {
    this.keyStoreName = keyStoreName;
  }

  
  /**
   * Digital certificate password of the Issuer
   **/
  @ApiModelProperty(value = "Digital certificate password of the Issuer")
  public String getKeyStorePassword() {
    return keyStorePassword;
  }
  public void setKeyStorePassword(String keyStorePassword) {
    this.keyStorePassword = keyStorePassword;
  }

  
  /**
   * Digital certificate alias of the Issuer
   **/
  @ApiModelProperty(value = "Digital certificate alias of the Issuer")
  public String getKeystoreAlias() {
    return keystoreAlias;
  }
  public void setKeystoreAlias(String keystoreAlias) {
    this.keystoreAlias = keystoreAlias;
  }

  
  /**
   * Private Key's password of digital certificate
   **/
  @ApiModelProperty(value = "Private Key's password of digital certificate")
  public String getKeyStorePrivateKeyPassword() {
    return keyStorePrivateKeyPassword;
  }
  public void setKeyStorePrivateKeyPassword(String keyStorePrivateKeyPassword) {
    this.keyStorePrivateKeyPassword = keyStorePrivateKeyPassword;
  }

  
  /**
   * Digital certificate type of the Issuer
   **/
  @ApiModelProperty(value = "Digital certificate type of the Issuer")
  public String getTypeKeystore() {
    return typeKeystore;
  }
  public void setTypeKeystore(String typeKeystore) {
    this.typeKeystore = typeKeystore;
  }

  
  /**
   * Bank's digital certificate path
   **/
  @ApiModelProperty(value = "Bank's digital certificate path")
  public String getTrustStoreName() {
    return trustStoreName;
  }
  public void setTrustStoreName(String trustStoreName) {
    this.trustStoreName = trustStoreName;
  }

  
  /**
   * Digital certificate password of the bank
   **/
  @ApiModelProperty(value = "Digital certificate password of the bank")
  public String getTrustStorePassword() {
    return trustStorePassword;
  }
  public void setTrustStorePassword(String trustStorePassword) {
    this.trustStorePassword = trustStorePassword;
  }

  
  /**
   * Digital certificate alias of the bank
   **/
  @ApiModelProperty(value = "Digital certificate alias of the bank")
  public String getTruststoreAlias() {
    return truststoreAlias;
  }
  public void setTruststoreAlias(String truststoreAlias) {
    this.truststoreAlias = truststoreAlias;
  }

  
  /**
   * digital certificate type
   **/
  @ApiModelProperty(value = "digital certificate type")
  public String getTypeTruststore() {
    return typeTruststore;
  }
  public void setTypeTruststore(String typeTruststore) {
    this.typeTruststore = typeTruststore;
  }

  
  /**
   * Aditional bank access URL
   **/
  @ApiModelProperty(value = "Aditional bank access URL")
  public String getUriAdicional() {
    return uriAdicional;
  }
  public void setUriAdicional(String uriAdicional) {
    this.uriAdicional = uriAdicional;
  }

  
  /**
   * Status that describes the actual state of the configuration
   **/
  @ApiModelProperty(required = true, value = "Status that describes the actual state of the configuration")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * Secret needed for retrieving the Access Token. Used for communication with Banco do Brasil
   **/
  @ApiModelProperty(value = "Secret needed for retrieving the Access Token. Used for communication with Banco do Brasil")
  public String getSecret() {
    return secret;
  }
  public void setSecret(String secret) {
    this.secret = secret;
  }

  
  /**
   * ClientID needed for retrieving the Access Token. Used for communication with Banco do Brasil
   **/
  @ApiModelProperty(value = "ClientID needed for retrieving the Access Token. Used for communication with Banco do Brasil")
  public String getClientID() {
    return clientID;
  }
  public void setClientID(String clientID) {
    this.clientID = clientID;
  }

  
  /**
   * Key needed for retrieving the Access Token. Used for communication with Itau Bank
   **/
  @ApiModelProperty(value = "Key needed for retrieving the Access Token. Used for communication with Itau Bank")
  public String getChave() {
    return chave;
  }
  public void setChave(String chave) {
    this.chave = chave;
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
    sb.append("  secret: ").append(secret).append("\n");
    sb.append("  clientID: ").append(clientID).append("\n");
    sb.append("  chave: ").append(chave).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
