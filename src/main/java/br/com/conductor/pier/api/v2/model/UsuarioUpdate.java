package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto Usuario
 **/
@ApiModel(description = "Objeto Usuario")
public class UsuarioUpdate  {
  
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
   * Apresenta o nome do usu\u00E1rio
   **/
  @ApiModelProperty(value = "Apresenta o nome do usu\u00E1rio")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Apresenta o login do usu\u00E1rio
   **/
  @ApiModelProperty(required = true, value = "Apresenta o login do usu\u00E1rio")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }

  
  /**
   * CPF
   **/
  @ApiModelProperty(value = "CPF")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * Apresenta o email do usu\u00E1rio
   **/
  @ApiModelProperty(required = true, value = "Apresenta o email do usu\u00E1rio")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Status
   **/
  @ApiModelProperty(value = "Status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * Indica se o acesso ao aplicativo do usu\u00E1rio est\u00E1 bloqueado
   **/
  @ApiModelProperty(value = "Indica se o acesso ao aplicativo do usu\u00E1rio est\u00E1 bloqueado")
  public Boolean getBloquearAcesso() {
    return bloquearAcesso;
  }
  public void setBloquearAcesso(Boolean bloquearAcesso) {
    this.bloquearAcesso = bloquearAcesso;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsuarioUpdate {\n");
    
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
