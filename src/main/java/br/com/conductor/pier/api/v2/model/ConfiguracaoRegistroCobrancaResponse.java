package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Response Representation of the collection register configuration resource
 **/
@ApiModel(description = "Response Representation of the collection register configuration resource")
public class ConfiguracaoRegistroCobrancaResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idEmissor")
  private Long idEmissor = null;
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
  public enum SecretEnum {
     INATIVO,  ATIVO, 
  };
  @SerializedName("secret")
  private SecretEnum secret = null;
  public enum ClientIDEnum {
     INATIVO,  ATIVO, 
  };
  @SerializedName("clientID")
  private ClientIDEnum clientID = null;
  @SerializedName("chave")
  private String chave = null;

  
  /**
   * Identifier Code of the Configuration
   **/
  @ApiModelProperty(value = "Identifier Code of the Configuration")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Code of the issuer
   **/
  @ApiModelProperty(value = "Code of the issuer")
  public Long getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   * Code of the Bank
   **/
  @ApiModelProperty(value = "Code of the Bank")
  public Long getCodigoBanco() {
    return codigoBanco;
  }
  public void setCodigoBanco(Long codigoBanco) {
    this.codigoBanco = codigoBanco;
  }

  
  /**
   * URL of access to the bank
   **/
  @ApiModelProperty(value = "URL of access to the bank")
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
  }

  
  /**
   * Way to the digital certificate of the issuer
   **/
  @ApiModelProperty(value = "Way to the digital certificate of the issuer")
  public String getKeyStoreName() {
    return keyStoreName;
  }
  public void setKeyStoreName(String keyStoreName) {
    this.keyStoreName = keyStoreName;
  }

  
  /**
   * Password of the digital certificate of the issuer
   **/
  @ApiModelProperty(value = "Password of the digital certificate of the issuer")
  public String getKeyStorePassword() {
    return keyStorePassword;
  }
  public void setKeyStorePassword(String keyStorePassword) {
    this.keyStorePassword = keyStorePassword;
  }

  
  /**
   * Alias of digital certificate of the issuer
   **/
  @ApiModelProperty(value = "Alias of digital certificate of the issuer")
  public String getKeystoreAlias() {
    return keystoreAlias;
  }
  public void setKeystoreAlias(String keystoreAlias) {
    this.keystoreAlias = keystoreAlias;
  }

  
  /**
   * Key password of the digital certificate of the issuer
   **/
  @ApiModelProperty(value = "Key password of the digital certificate of the issuer")
  public String getKeyStorePrivateKeyPassword() {
    return keyStorePrivateKeyPassword;
  }
  public void setKeyStorePrivateKeyPassword(String keyStorePrivateKeyPassword) {
    this.keyStorePrivateKeyPassword = keyStorePrivateKeyPassword;
  }

  
  /**
   * Type of digital certificate of the issuer
   **/
  @ApiModelProperty(value = "Type of digital certificate of the issuer")
  public String getTypeKeystore() {
    return typeKeystore;
  }
  public void setTypeKeystore(String typeKeystore) {
    this.typeKeystore = typeKeystore;
  }

  
  /**
   * Way of the digital certificate of the bank
   **/
  @ApiModelProperty(value = "Way of the digital certificate of the bank")
  public String getTrustStoreName() {
    return trustStoreName;
  }
  public void setTrustStoreName(String trustStoreName) {
    this.trustStoreName = trustStoreName;
  }

  
  /**
   * Password of the digital certificate of the bank
   **/
  @ApiModelProperty(value = "Password of the digital certificate of the bank")
  public String getTrustStorePassword() {
    return trustStorePassword;
  }
  public void setTrustStorePassword(String trustStorePassword) {
    this.trustStorePassword = trustStorePassword;
  }

  
  /**
   * Alias of digital certificate of the bank
   **/
  @ApiModelProperty(value = "Alias of digital certificate of the bank")
  public String getTruststoreAlias() {
    return truststoreAlias;
  }
  public void setTruststoreAlias(String truststoreAlias) {
    this.truststoreAlias = truststoreAlias;
  }

  
  /**
   * Type of the digital certificate of the bank
   **/
  @ApiModelProperty(value = "Type of the digital certificate of the bank")
  public String getTypeTruststore() {
    return typeTruststore;
  }
  public void setTypeTruststore(String typeTruststore) {
    this.typeTruststore = typeTruststore;
  }

  
  /**
   * Additional URL of access to the bank
   **/
  @ApiModelProperty(value = "Additional URL of access to the bank")
  public String getUriAdicional() {
    return uriAdicional;
  }
  public void setUriAdicional(String uriAdicional) {
    this.uriAdicional = uriAdicional;
  }

  
  /**
   * Status indicator if the configuration is active
   **/
  @ApiModelProperty(value = "Status indicator if the configuration is active")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * Secret needed for retrieving the Access Token. Used for communication with Banco do Brasil
   **/
  @ApiModelProperty(required = true, value = "Secret needed for retrieving the Access Token. Used for communication with Banco do Brasil")
  public SecretEnum getSecret() {
    return secret;
  }
  public void setSecret(SecretEnum secret) {
    this.secret = secret;
  }

  
  /**
   * ClientID needed for retrieving the Access Token. Used for communication with Banco do Brasil
   **/
  @ApiModelProperty(required = true, value = "ClientID needed for retrieving the Access Token. Used for communication with Banco do Brasil")
  public ClientIDEnum getClientID() {
    return clientID;
  }
  public void setClientID(ClientIDEnum clientID) {
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
    sb.append("class ConfiguracaoRegistroCobrancaResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idEmissor: ").append(idEmissor).append("\n");
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
