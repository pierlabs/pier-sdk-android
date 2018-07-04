package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{usuario_update_description}}}
 **/
@ApiModel(description = "{{{usuario_update_description}}}")
public class UsuarioUpdateValue  {
  
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("login")
  private String login = null;
  @SerializedName("cpf")
  private String cpf = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("bloquearAcesso")
  private Boolean bloquearAcesso = null;

  
  /**
   * {{{usuario_update_nome_value}}}
   **/
  @ApiModelProperty(value = "{{{usuario_update_nome_value}}}")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{usuario_update_login_value}}}
   **/
  @ApiModelProperty(value = "{{{usuario_update_login_value}}}")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }

  
  /**
   * {{{usuario_update_cpf_value}}}
   **/
  @ApiModelProperty(value = "{{{usuario_update_cpf_value}}}")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * {{{usuario_update_email_value}}}
   **/
  @ApiModelProperty(value = "{{{usuario_update_email_value}}}")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * {{{usuario_update_status_value}}}
   **/
  @ApiModelProperty(value = "{{{usuario_update_status_value}}}")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * {{{usuario_update_bloquear_acesso_descricao}}}
   **/
  @ApiModelProperty(value = "{{{usuario_update_bloquear_acesso_descricao}}}")
  public Boolean getBloquearAcesso() {
    return bloquearAcesso;
  }
  public void setBloquearAcesso(Boolean bloquearAcesso) {
    this.bloquearAcesso = bloquearAcesso;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsuarioUpdateValue {\n");
    
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  login: ").append(login).append("\n");
    sb.append("  cpf: ").append(cpf).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  bloquearAcesso: ").append(bloquearAcesso).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


