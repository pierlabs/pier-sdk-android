package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de persist\u00EAncia de um log de requisi\u00E7\u00E3o mobile
 **/
@ApiModel(description = "Objeto de persist\u00EAncia de um log de requisi\u00E7\u00E3o mobile")
public class LogRequisicaoMobilePersist  {
  
  @SerializedName("metodo")
  private String metodo = null;
  @SerializedName("dataHoraRequisicao")
  private String dataHoraRequisicao = null;
  @SerializedName("idRequisicao")
  private Long idRequisicao = null;
  @SerializedName("login")
  private String login = null;
  @SerializedName("cpf")
  private String cpf = null;
  @SerializedName("appVersion")
  private String appVersion = null;
  @SerializedName("deviceId")
  private String deviceId = null;
  @SerializedName("phoneId")
  private String phoneId = null;
  @SerializedName("idChave")
  private Long idChave = null;
  @SerializedName("idPlataforma")
  private Long idPlataforma = null;
  @SerializedName("userAgent")
  private String userAgent = null;
  @SerializedName("marcaCelular")
  private String marcaCelular = null;
  @SerializedName("modeloCelular")
  private String modeloCelular = null;
  @SerializedName("latitude")
  private String latitude = null;
  @SerializedName("longitude")
  private String longitude = null;
  @SerializedName("codigoRetorno")
  private Integer codigoRetorno = null;
  @SerializedName("idProposta")
  private Long idProposta = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("informacaoAdicional")
  private String informacaoAdicional = null;

  
  /**
   * M\u00E9todo onde o c\u00F3digo \u00E9 executado
   **/
  @ApiModelProperty(required = true, value = "M\u00E9todo onde o c\u00F3digo \u00E9 executado")
  public String getMetodo() {
    return metodo;
  }
  public void setMetodo(String metodo) {
    this.metodo = metodo;
  }

  
  /**
   * Data e hora que o m\u00E9todo \u00E9 acessado
   **/
  @ApiModelProperty(required = true, value = "Data e hora que o m\u00E9todo \u00E9 acessado")
  public String getDataHoraRequisicao() {
    return dataHoraRequisicao;
  }
  public void setDataHoraRequisicao(String dataHoraRequisicao) {
    this.dataHoraRequisicao = dataHoraRequisicao;
  }

  
  /**
   * Identificador da requisi\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Identificador da requisi\u00E7\u00E3o")
  public Long getIdRequisicao() {
    return idRequisicao;
  }
  public void setIdRequisicao(Long idRequisicao) {
    this.idRequisicao = idRequisicao;
  }

  
  /**
   * Login do usu\u00E1rio
   **/
  @ApiModelProperty(value = "Login do usu\u00E1rio")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }

  
  /**
   * N\u00FAmero do cpf do usu\u00E1rio
   **/
  @ApiModelProperty(value = "N\u00FAmero do cpf do usu\u00E1rio")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * Vers\u00E3o da aplica\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Vers\u00E3o da aplica\u00E7\u00E3o")
  public String getAppVersion() {
    return appVersion;
  }
  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }

  
  /**
   * Identifica\u00E7\u00E3o do dispositivo
   **/
  @ApiModelProperty(value = "Identifica\u00E7\u00E3o do dispositivo")
  public String getDeviceId() {
    return deviceId;
  }
  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  
  /**
   * Identifica\u00E7\u00E3o do mobile
   **/
  @ApiModelProperty(value = "Identifica\u00E7\u00E3o do mobile")
  public String getPhoneId() {
    return phoneId;
  }
  public void setPhoneId(String phoneId) {
    this.phoneId = phoneId;
  }

  
  /**
   * Identifica\u00E7\u00E3o da chave
   **/
  @ApiModelProperty(value = "Identifica\u00E7\u00E3o da chave")
  public Long getIdChave() {
    return idChave;
  }
  public void setIdChave(Long idChave) {
    this.idChave = idChave;
  }

  
  /**
   * Identifica\u00E7\u00E3o da plataforma
   **/
  @ApiModelProperty(value = "Identifica\u00E7\u00E3o da plataforma")
  public Long getIdPlataforma() {
    return idPlataforma;
  }
  public void setIdPlataforma(Long idPlataforma) {
    this.idPlataforma = idPlataforma;
  }

  
  /**
   * Agente de usu\u00E1rio
   **/
  @ApiModelProperty(value = "Agente de usu\u00E1rio")
  public String getUserAgent() {
    return userAgent;
  }
  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }

  
  /**
   * Marca do celular
   **/
  @ApiModelProperty(value = "Marca do celular")
  public String getMarcaCelular() {
    return marcaCelular;
  }
  public void setMarcaCelular(String marcaCelular) {
    this.marcaCelular = marcaCelular;
  }

  
  /**
   * Modelo do celular
   **/
  @ApiModelProperty(value = "Modelo do celular")
  public String getModeloCelular() {
    return modeloCelular;
  }
  public void setModeloCelular(String modeloCelular) {
    this.modeloCelular = modeloCelular;
  }

  
  /**
   * Latitude do celular acessado
   **/
  @ApiModelProperty(value = "Latitude do celular acessado")
  public String getLatitude() {
    return latitude;
  }
  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  
  /**
   * Longitude do celular acessado
   **/
  @ApiModelProperty(value = "Longitude do celular acessado")
  public String getLongitude() {
    return longitude;
  }
  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  
  /**
   * C\u00F3digo de retorno
   **/
  @ApiModelProperty(value = "C\u00F3digo de retorno")
  public Integer getCodigoRetorno() {
    return codigoRetorno;
  }
  public void setCodigoRetorno(Integer codigoRetorno) {
    this.codigoRetorno = codigoRetorno;
  }

  
  /**
   * Identifica\u00E7\u00E3o da proposta
   **/
  @ApiModelProperty(value = "Identifica\u00E7\u00E3o da proposta")
  public Long getIdProposta() {
    return idProposta;
  }
  public void setIdProposta(Long idProposta) {
    this.idProposta = idProposta;
  }

  
  /**
   * Identifica\u00E7\u00E3o da conta
   **/
  @ApiModelProperty(value = "Identifica\u00E7\u00E3o da conta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Informa\u00E7\u00F5es complementares
   **/
  @ApiModelProperty(value = "Informa\u00E7\u00F5es complementares")
  public String getInformacaoAdicional() {
    return informacaoAdicional;
  }
  public void setInformacaoAdicional(String informacaoAdicional) {
    this.informacaoAdicional = informacaoAdicional;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogRequisicaoMobilePersist {\n");
    
    sb.append("  metodo: ").append(metodo).append("\n");
    sb.append("  dataHoraRequisicao: ").append(dataHoraRequisicao).append("\n");
    sb.append("  idRequisicao: ").append(idRequisicao).append("\n");
    sb.append("  login: ").append(login).append("\n");
    sb.append("  cpf: ").append(cpf).append("\n");
    sb.append("  appVersion: ").append(appVersion).append("\n");
    sb.append("  deviceId: ").append(deviceId).append("\n");
    sb.append("  phoneId: ").append(phoneId).append("\n");
    sb.append("  idChave: ").append(idChave).append("\n");
    sb.append("  idPlataforma: ").append(idPlataforma).append("\n");
    sb.append("  userAgent: ").append(userAgent).append("\n");
    sb.append("  marcaCelular: ").append(marcaCelular).append("\n");
    sb.append("  modeloCelular: ").append(modeloCelular).append("\n");
    sb.append("  latitude: ").append(latitude).append("\n");
    sb.append("  longitude: ").append(longitude).append("\n");
    sb.append("  codigoRetorno: ").append(codigoRetorno).append("\n");
    sb.append("  idProposta: ").append(idProposta).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  informacaoAdicional: ").append(informacaoAdicional).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
