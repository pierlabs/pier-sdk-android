package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{log_acesso_usuario_persistencia_descricao}}}
 **/
@ApiModel(description = "{{{log_acesso_usuario_persistencia_descricao}}}")
public class LogAcessoUsuarioPersistencia  {
  
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
   * {{{log_acesso_usuario_persistencia_id_usuario_descricao}}}
   **/
  @ApiModelProperty(required = true, value = "{{{log_acesso_usuario_persistencia_id_usuario_descricao}}}")
  public Long getIdUsuario() {
    return idUsuario;
  }
  public void setIdUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
  }

  
  /**
   * {{{log_acesso_usuario_persistencia_login_descricao}}}
   **/
  @ApiModelProperty(required = true, value = "{{{log_acesso_usuario_persistencia_login_descricao}}}")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }

  
  /**
   * {{{log_acesso_usuario_persistencia_message_descricao}}}
   **/
  @ApiModelProperty(value = "{{{log_acesso_usuario_persistencia_message_descricao}}}")
  public String getMensagem() {
    return mensagem;
  }
  public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
  }

  
  /**
   * {{{log_acesso_usuario_persistencia_versao_app_descricao}}}
   **/
  @ApiModelProperty(value = "{{{log_acesso_usuario_persistencia_versao_app_descricao}}}")
  public String getVersaoAPP() {
    return versaoAPP;
  }
  public void setVersaoAPP(String versaoAPP) {
    this.versaoAPP = versaoAPP;
  }

  
  /**
   * {{{log_acesso_usuario_persistencia_versao_app_descricao}}}
   **/
  @ApiModelProperty(value = "{{{log_acesso_usuario_persistencia_versao_app_descricao}}}")
  public String getDevice() {
    return device;
  }
  public void setDevice(String device) {
    this.device = device;
  }

  
  /**
   * {{{log_acesso_usuario_persistencia_senha_ok_descricao}}}
   **/
  @ApiModelProperty(value = "{{{log_acesso_usuario_persistencia_senha_ok_descricao}}}")
  public Integer getSenhaOK() {
    return senhaOK;
  }
  public void setSenhaOK(Integer senhaOK) {
    this.senhaOK = senhaOK;
  }

  
  /**
   * {{{log_acesso_usuario_persistencia_tentativas_incorretas_descricao}}}
   **/
  @ApiModelProperty(value = "{{{log_acesso_usuario_persistencia_tentativas_incorretas_descricao}}}")
  public Long getTentativasIncorretas() {
    return tentativasIncorretas;
  }
  public void setTentativasIncorretas(Long tentativasIncorretas) {
    this.tentativasIncorretas = tentativasIncorretas;
  }

  
  /**
   * {{{log_acesso_usuario_persistencia_id_plataforma_descricao}}}
   **/
  @ApiModelProperty(value = "{{{log_acesso_usuario_persistencia_id_plataforma_descricao}}}")
  public Long getIdPlataforma() {
    return idPlataforma;
  }
  public void setIdPlataforma(Long idPlataforma) {
    this.idPlataforma = idPlataforma;
  }

  
  /**
   * {{{log_acesso_usuario_persistencia_status_log_acesso}}}
   **/
  @ApiModelProperty(value = "{{{log_acesso_usuario_persistencia_status_log_acesso}}}")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogAcessoUsuarioPersistencia {\n");
    
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


