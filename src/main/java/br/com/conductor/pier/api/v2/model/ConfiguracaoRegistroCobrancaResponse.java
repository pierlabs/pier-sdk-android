package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o da resposta do recurso de configura\u00E7\u00E3o de registro de cobran\u00E7a
 **/
@ApiModel(description = "Representa\u00E7\u00E3o da resposta do recurso de configura\u00E7\u00E3o de registro de cobran\u00E7a")
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
   * C\u00F3digo identificador da configura\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador da configura\u00E7\u00E3o")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo do emissor
   **/
  @ApiModelProperty(value = "C\u00F3digo do emissor")
  public Long getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   * C\u00F3digo do Banco
   **/
  @ApiModelProperty(value = "C\u00F3digo do Banco")
  public Long getCodigoBanco() {
    return codigoBanco;
  }
  public void setCodigoBanco(Long codigoBanco) {
    this.codigoBanco = codigoBanco;
  }

  
  /**
   * URL de acesso ao banco
   **/
  @ApiModelProperty(value = "URL de acesso ao banco")
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
  }

  
  /**
   * Caminho do certificado digital do emissor
   **/
  @ApiModelProperty(value = "Caminho do certificado digital do emissor")
  public String getKeyStoreName() {
    return keyStoreName;
  }
  public void setKeyStoreName(String keyStoreName) {
    this.keyStoreName = keyStoreName;
  }

  
  /**
   * Senha do certificado digital do emissor
   **/
  @ApiModelProperty(value = "Senha do certificado digital do emissor")
  public String getKeyStorePassword() {
    return keyStorePassword;
  }
  public void setKeyStorePassword(String keyStorePassword) {
    this.keyStorePassword = keyStorePassword;
  }

  
  /**
   * Alias do certificado digital do emissor
   **/
  @ApiModelProperty(value = "Alias do certificado digital do emissor")
  public String getKeystoreAlias() {
    return keystoreAlias;
  }
  public void setKeystoreAlias(String keystoreAlias) {
    this.keystoreAlias = keystoreAlias;
  }

  
  /**
   * Senha da chave privada do certificado digital do emissor
   **/
  @ApiModelProperty(value = "Senha da chave privada do certificado digital do emissor")
  public String getKeyStorePrivateKeyPassword() {
    return keyStorePrivateKeyPassword;
  }
  public void setKeyStorePrivateKeyPassword(String keyStorePrivateKeyPassword) {
    this.keyStorePrivateKeyPassword = keyStorePrivateKeyPassword;
  }

  
  /**
   * Tipo do certificado digital do emissor
   **/
  @ApiModelProperty(value = "Tipo do certificado digital do emissor")
  public String getTypeKeystore() {
    return typeKeystore;
  }
  public void setTypeKeystore(String typeKeystore) {
    this.typeKeystore = typeKeystore;
  }

  
  /**
   * Caminho do certificado digital do banco
   **/
  @ApiModelProperty(value = "Caminho do certificado digital do banco")
  public String getTrustStoreName() {
    return trustStoreName;
  }
  public void setTrustStoreName(String trustStoreName) {
    this.trustStoreName = trustStoreName;
  }

  
  /**
   * Senha do certificado digital do banco
   **/
  @ApiModelProperty(value = "Senha do certificado digital do banco")
  public String getTrustStorePassword() {
    return trustStorePassword;
  }
  public void setTrustStorePassword(String trustStorePassword) {
    this.trustStorePassword = trustStorePassword;
  }

  
  /**
   * Alias do certificado digital do banco
   **/
  @ApiModelProperty(value = "Alias do certificado digital do banco")
  public String getTruststoreAlias() {
    return truststoreAlias;
  }
  public void setTruststoreAlias(String truststoreAlias) {
    this.truststoreAlias = truststoreAlias;
  }

  
  /**
   * Tipo do certificado digital do banco
   **/
  @ApiModelProperty(value = "Tipo do certificado digital do banco")
  public String getTypeTruststore() {
    return typeTruststore;
  }
  public void setTypeTruststore(String typeTruststore) {
    this.typeTruststore = typeTruststore;
  }

  
  /**
   * URL adicional de acesso ao banco
   **/
  @ApiModelProperty(value = "URL adicional de acesso ao banco")
  public String getUriAdicional() {
    return uriAdicional;
  }
  public void setUriAdicional(String uriAdicional) {
    this.uriAdicional = uriAdicional;
  }

  
  /**
   * Status indicador se a configura\u00E7\u00E3o est\u00E1 ativa
   **/
  @ApiModelProperty(value = "Status indicador se a configura\u00E7\u00E3o est\u00E1 ativa")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * Secret utilizado para recupera\u00E7\u00E3o de Token. Utilizado para registros junto ao Banco do Brasil
   **/
  @ApiModelProperty(required = true, value = "Secret utilizado para recupera\u00E7\u00E3o de Token. Utilizado para registros junto ao Banco do Brasil")
  public SecretEnum getSecret() {
    return secret;
  }
  public void setSecret(SecretEnum secret) {
    this.secret = secret;
  }

  
  /**
   * ClientID utilizado para recupera\u00E7\u00E3o de Token. Utilizado para registros junto ao Banco do Brasil
   **/
  @ApiModelProperty(required = true, value = "ClientID utilizado para recupera\u00E7\u00E3o de Token. Utilizado para registros junto ao Banco do Brasil")
  public ClientIDEnum getClientID() {
    return clientID;
  }
  public void setClientID(ClientIDEnum clientID) {
    this.clientID = clientID;
  }

  
  /**
   * Chave utilizado para recupera\u00E7\u00E3o de Token. Utilizado para registros junto ao Banco do Brasil
   **/
  @ApiModelProperty(value = "Chave utilizado para recupera\u00E7\u00E3o de Token. Utilizado para registros junto ao Banco do Brasil")
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
