package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Log user access object
 **/
@ApiModel(description = "Log user access object")
public class LogAcessoUsuario  {
  
  @SerializedName("idUsuario")
  private Long idUsuario = null;
  @SerializedName("login")
  private String login = null;
  @SerializedName("mensagem")
  private String mensagem = null;
  @SerializedName("versaoAPP")
  private String versaoAPP = null;
  @SerializedName("device")
  private String device = null;
  @SerializedName("senhaOK")
  private Integer senhaOK = null;
  @SerializedName("tentativasIncorretas")
  private Long tentativasIncorretas = null;
  @SerializedName("idPlataforma")
  private Long idPlataforma = null;
  public enum StatusEnum {
     SUCESSO,  SENHA_INVALIDA,  BLOQUEDO,  CADASTRADO,  SENHA_ALTERADO, 
  };
  @SerializedName("status")
  private StatusEnum status = null;

  
  /**
   * Unique user identifier (id)
   **/
  @ApiModelProperty(required = true, value = "Unique user identifier (id)")
  public Long getIdUsuario() {
    return idUsuario;
  }
  public void setIdUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
  }

  
  /**
   * User login
   **/
  @ApiModelProperty(required = true, value = "User login")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }

  
  /**
   * Log message
   **/
  @ApiModelProperty(value = "Log message")
  public String getMensagem() {
    return mensagem;
  }
  public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
  }

  
  /**
   * Application version
   **/
  @ApiModelProperty(value = "Application version")
  public String getVersaoAPP() {
    return versaoAPP;
  }
  public void setVersaoAPP(String versaoAPP) {
    this.versaoAPP = versaoAPP;
  }

  
  /**
   * Disposition operation
   **/
  @ApiModelProperty(value = "Disposition operation")
  public String getDevice() {
    return device;
  }
  public void setDevice(String device) {
    this.device = device;
  }

  
  /**
   * Passaword status
   **/
  @ApiModelProperty(value = "Passaword status")
  public Integer getSenhaOK() {
    return senhaOK;
  }
  public void setSenhaOK(Integer senhaOK) {
    this.senhaOK = senhaOK;
  }

  
  /**
   * Number of incorrect attemps
   **/
  @ApiModelProperty(value = "Number of incorrect attemps")
  public Long getTentativasIncorretas() {
    return tentativasIncorretas;
  }
  public void setTentativasIncorretas(Long tentativasIncorretas) {
    this.tentativasIncorretas = tentativasIncorretas;
  }

  
  /**
   * Unique platform identifier (id)
   **/
  @ApiModelProperty(value = "Unique platform identifier (id)")
  public Long getIdPlataforma() {
    return idPlataforma;
  }
  public void setIdPlataforma(Long idPlataforma) {
    this.idPlataforma = idPlataforma;
  }

  
  /**
   * User status
   **/
  @ApiModelProperty(value = "User status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogAcessoUsuario {\n");
    
    sb.append("  idUsuario: ").append(idUsuario).append("\n");
    sb.append("  login: ").append(login).append("\n");
    sb.append("  mensagem: ").append(mensagem).append("\n");
    sb.append("  versaoAPP: ").append(versaoAPP).append("\n");
    sb.append("  device: ").append(device).append("\n");
    sb.append("  senhaOK: ").append(senhaOK).append("\n");
    sb.append("  tentativasIncorretas: ").append(tentativasIncorretas).append("\n");
    sb.append("  idPlataforma: ").append(idPlataforma).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
