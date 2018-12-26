package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto log acesso usu\u00E1rio
 **/
@ApiModel(description = "Objeto log acesso usu\u00E1rio")
public class LogAcessoUsuarioPersist  {
  
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
   * C\u00F3digo de Identifica\u00E7\u00E3o do Usu\u00E1rio (id)
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo de Identifica\u00E7\u00E3o do Usu\u00E1rio (id)")
  public Long getIdUsuario() {
    return idUsuario;
  }
  public void setIdUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
  }

  
  /**
   * Login do Usu\u00E1rio
   **/
  @ApiModelProperty(required = true, value = "Login do Usu\u00E1rio")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }

  
  /**
   * Mensagem do log
   **/
  @ApiModelProperty(value = "Mensagem do log")
  public String getMensagem() {
    return mensagem;
  }
  public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
  }

  
  /**
   * Vers\u00E2o do aplicativo
   **/
  @ApiModelProperty(value = "Vers\u00E2o do aplicativo")
  public String getVersaoAPP() {
    return versaoAPP;
  }
  public void setVersaoAPP(String versaoAPP) {
    this.versaoAPP = versaoAPP;
  }

  
  /**
   * Opera\u00E7\u00E3o do dispositivo
   **/
  @ApiModelProperty(value = "Opera\u00E7\u00E3o do dispositivo")
  public String getDevice() {
    return device;
  }
  public void setDevice(String device) {
    this.device = device;
  }

  
  /**
   * Status da senha
   **/
  @ApiModelProperty(value = "Status da senha")
  public Integer getSenhaOK() {
    return senhaOK;
  }
  public void setSenhaOK(Integer senhaOK) {
    this.senhaOK = senhaOK;
  }

  
  /**
   * Quantidade de tentativas incorretas
   **/
  @ApiModelProperty(value = "Quantidade de tentativas incorretas")
  public Long getTentativasIncorretas() {
    return tentativasIncorretas;
  }
  public void setTentativasIncorretas(Long tentativasIncorretas) {
    this.tentativasIncorretas = tentativasIncorretas;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da Plataforma (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o da Plataforma (id)")
  public Long getIdPlataforma() {
    return idPlataforma;
  }
  public void setIdPlataforma(Long idPlataforma) {
    this.idPlataforma = idPlataforma;
  }

  
  /**
   * Situa\u00E7\u00E3o do Log
   **/
  @ApiModelProperty(value = "Situa\u00E7\u00E3o do Log")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogAcessoUsuarioPersist {\n");
    
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
