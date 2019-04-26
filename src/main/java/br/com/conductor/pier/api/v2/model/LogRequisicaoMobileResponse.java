package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de resposta de um log de requisi\u00E7\u00E3o mobile
 **/
@ApiModel(description = "Objeto de resposta de um log de requisi\u00E7\u00E3o mobile")
public class LogRequisicaoMobileResponse  {
  
  @SerializedName("appVersion")
  private String appVersion = null;
  @SerializedName("codigoRetorno")
  private Integer codigoRetorno = null;
  @SerializedName("cpf")
  private String cpf = null;
  @SerializedName("dataHoraRequisicao")
  private String dataHoraRequisicao = null;
  @SerializedName("deviceId")
  private String deviceId = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idChave")
  private Long idChave = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idPlataforma")
  private Long idPlataforma = null;
  @SerializedName("idProposta")
  private Long idProposta = null;
  @SerializedName("idRequisicao")
  private Long idRequisicao = null;
  @SerializedName("informacaoAdicional")
  private String informacaoAdicional = null;
  @SerializedName("latitude")
  private String latitude = null;
  @SerializedName("login")
  private String login = null;
  @SerializedName("longitude")
  private String longitude = null;
  @SerializedName("marcaCelular")
  private String marcaCelular = null;
  @SerializedName("metodo")
  private String metodo = null;
  @SerializedName("modeloCelular")
  private String modeloCelular = null;
  @SerializedName("phoneId")
  private String phoneId = null;
  @SerializedName("userAgent")
  private String userAgent = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getAppVersion() {
    return appVersion;
  }
  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getCodigoRetorno() {
    return codigoRetorno;
  }
  public void setCodigoRetorno(Integer codigoRetorno) {
    this.codigoRetorno = codigoRetorno;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDataHoraRequisicao() {
    return dataHoraRequisicao;
  }
  public void setDataHoraRequisicao(String dataHoraRequisicao) {
    this.dataHoraRequisicao = dataHoraRequisicao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDeviceId() {
    return deviceId;
  }
  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getIdChave() {
    return idChave;
  }
  public void setIdChave(Long idChave) {
    this.idChave = idChave;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getIdPlataforma() {
    return idPlataforma;
  }
  public void setIdPlataforma(Long idPlataforma) {
    this.idPlataforma = idPlataforma;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getIdProposta() {
    return idProposta;
  }
  public void setIdProposta(Long idProposta) {
    this.idProposta = idProposta;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getIdRequisicao() {
    return idRequisicao;
  }
  public void setIdRequisicao(Long idRequisicao) {
    this.idRequisicao = idRequisicao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getInformacaoAdicional() {
    return informacaoAdicional;
  }
  public void setInformacaoAdicional(String informacaoAdicional) {
    this.informacaoAdicional = informacaoAdicional;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getLatitude() {
    return latitude;
  }
  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getLongitude() {
    return longitude;
  }
  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getMarcaCelular() {
    return marcaCelular;
  }
  public void setMarcaCelular(String marcaCelular) {
    this.marcaCelular = marcaCelular;
  }

  
  /**
   * M\u00E9todo onde o c\u00F3digo \u00E9 executado
   **/
  @ApiModelProperty(value = "M\u00E9todo onde o c\u00F3digo \u00E9 executado")
  public String getMetodo() {
    return metodo;
  }
  public void setMetodo(String metodo) {
    this.metodo = metodo;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getModeloCelular() {
    return modeloCelular;
  }
  public void setModeloCelular(String modeloCelular) {
    this.modeloCelular = modeloCelular;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getPhoneId() {
    return phoneId;
  }
  public void setPhoneId(String phoneId) {
    this.phoneId = phoneId;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getUserAgent() {
    return userAgent;
  }
  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogRequisicaoMobileResponse {\n");
    
    sb.append("  appVersion: ").append(appVersion).append("\n");
    sb.append("  codigoRetorno: ").append(codigoRetorno).append("\n");
    sb.append("  cpf: ").append(cpf).append("\n");
    sb.append("  dataHoraRequisicao: ").append(dataHoraRequisicao).append("\n");
    sb.append("  deviceId: ").append(deviceId).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idChave: ").append(idChave).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idPlataforma: ").append(idPlataforma).append("\n");
    sb.append("  idProposta: ").append(idProposta).append("\n");
    sb.append("  idRequisicao: ").append(idRequisicao).append("\n");
    sb.append("  informacaoAdicional: ").append(informacaoAdicional).append("\n");
    sb.append("  latitude: ").append(latitude).append("\n");
    sb.append("  login: ").append(login).append("\n");
    sb.append("  longitude: ").append(longitude).append("\n");
    sb.append("  marcaCelular: ").append(marcaCelular).append("\n");
    sb.append("  metodo: ").append(metodo).append("\n");
    sb.append("  modeloCelular: ").append(modeloCelular).append("\n");
    sb.append("  phoneId: ").append(phoneId).append("\n");
    sb.append("  userAgent: ").append(userAgent).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
