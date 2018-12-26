package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{configuracao_registro_cobranca_response_description}}}
 **/
@ApiModel(description = "{{{configuracao_registro_cobranca_response_description}}}")
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
   * {{{configuracao_registro_cobranca_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{configuracao_registro_cobranca_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{configuracao_registro_cobranca_response_id_emissor_value}}}
   **/
  @ApiModelProperty(value = "{{{configuracao_registro_cobranca_response_id_emissor_value}}}")
  public Long getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   * {{{configuracao_registro_cobranca_response_codigo_banco_value}}}
   **/
  @ApiModelProperty(value = "{{{configuracao_registro_cobranca_response_codigo_banco_value}}}")
  public Long getCodigoBanco() {
    return codigoBanco;
  }
  public void setCodigoBanco(Long codigoBanco) {
    this.codigoBanco = codigoBanco;
  }

  
  /**
   * {{{configuracao_registro_cobranca_response_uri_value}}}
   **/
  @ApiModelProperty(value = "{{{configuracao_registro_cobranca_response_uri_value}}}")
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
  }

  
  /**
   * {{{configuracao_registro_cobranca_response_key_store_name_value}}}
   **/
  @ApiModelProperty(value = "{{{configuracao_registro_cobranca_response_key_store_name_value}}}")
  public String getKeyStoreName() {
    return keyStoreName;
  }
  public void setKeyStoreName(String keyStoreName) {
    this.keyStoreName = keyStoreName;
  }

  
  /**
   * {{{configuracao_registro_cobranca_response_key_store_password_value}}}
   **/
  @ApiModelProperty(value = "{{{configuracao_registro_cobranca_response_key_store_password_value}}}")
  public String getKeyStorePassword() {
    return keyStorePassword;
  }
  public void setKeyStorePassword(String keyStorePassword) {
    this.keyStorePassword = keyStorePassword;
  }

  
  /**
   * {{{configuracao_registro_cobranca_response_keystore_alias_value}}}
   **/
  @ApiModelProperty(value = "{{{configuracao_registro_cobranca_response_keystore_alias_value}}}")
  public String getKeystoreAlias() {
    return keystoreAlias;
  }
  public void setKeystoreAlias(String keystoreAlias) {
    this.keystoreAlias = keystoreAlias;
  }

  
  /**
   * {{{configuracao_registro_cobranca_response_key_store_private_key_password_value}}}
   **/
  @ApiModelProperty(value = "{{{configuracao_registro_cobranca_response_key_store_private_key_password_value}}}")
  public String getKeyStorePrivateKeyPassword() {
    return keyStorePrivateKeyPassword;
  }
  public void setKeyStorePrivateKeyPassword(String keyStorePrivateKeyPassword) {
    this.keyStorePrivateKeyPassword = keyStorePrivateKeyPassword;
  }

  
  /**
   * {{{configuracao_registro_cobranca_response_type_keystore_value}}}
   **/
  @ApiModelProperty(value = "{{{configuracao_registro_cobranca_response_type_keystore_value}}}")
  public String getTypeKeystore() {
    return typeKeystore;
  }
  public void setTypeKeystore(String typeKeystore) {
    this.typeKeystore = typeKeystore;
  }

  
  /**
   * {{{configuracao_registro_cobranca_response_trust_store_name_value}}}
   **/
  @ApiModelProperty(value = "{{{configuracao_registro_cobranca_response_trust_store_name_value}}}")
  public String getTrustStoreName() {
    return trustStoreName;
  }
  public void setTrustStoreName(String trustStoreName) {
    this.trustStoreName = trustStoreName;
  }

  
  /**
   * {{{configuracao_registro_cobranca_response_trust_store_password_value}}}
   **/
  @ApiModelProperty(value = "{{{configuracao_registro_cobranca_response_trust_store_password_value}}}")
  public String getTrustStorePassword() {
    return trustStorePassword;
  }
  public void setTrustStorePassword(String trustStorePassword) {
    this.trustStorePassword = trustStorePassword;
  }

  
  /**
   * {{{configuracao_registro_cobranca_response_truststore_alias_value}}}
   **/
  @ApiModelProperty(value = "{{{configuracao_registro_cobranca_response_truststore_alias_value}}}")
  public String getTruststoreAlias() {
    return truststoreAlias;
  }
  public void setTruststoreAlias(String truststoreAlias) {
    this.truststoreAlias = truststoreAlias;
  }

  
  /**
   * {{{configuracao_registro_cobranca_response_type_truststore_value}}}
   **/
  @ApiModelProperty(value = "{{{configuracao_registro_cobranca_response_type_truststore_value}}}")
  public String getTypeTruststore() {
    return typeTruststore;
  }
  public void setTypeTruststore(String typeTruststore) {
    this.typeTruststore = typeTruststore;
  }

  
  /**
   * {{{configuracao_registro_cobranca_response_uri_adicional_value}}}
   **/
  @ApiModelProperty(value = "{{{configuracao_registro_cobranca_response_uri_adicional_value}}}")
  public String getUriAdicional() {
    return uriAdicional;
  }
  public void setUriAdicional(String uriAdicional) {
    this.uriAdicional = uriAdicional;
  }

  
  /**
   * {{{configuracao_registro_cobranca_response_status_value}}}
   **/
  @ApiModelProperty(value = "{{{configuracao_registro_cobranca_response_status_value}}}")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * {{{configuracao_registro_cobranca_persist_secret_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{configuracao_registro_cobranca_persist_secret_value}}}")
  public SecretEnum getSecret() {
    return secret;
  }
  public void setSecret(SecretEnum secret) {
    this.secret = secret;
  }

  
  /**
   * {{{configuracao_registro_cobranca_persist_client_id_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{configuracao_registro_cobranca_persist_client_id_value}}}")
  public ClientIDEnum getClientID() {
    return clientID;
  }
  public void setClientID(ClientIDEnum clientID) {
    this.clientID = clientID;
  }

  
  /**
   * {{{configuracao_registro_cobranca_persist_chave_value}}}
   **/
  @ApiModelProperty(value = "{{{configuracao_registro_cobranca_persist_chave_value}}}")
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
