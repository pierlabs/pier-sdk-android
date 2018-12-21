package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object User
 **/
@ApiModel(description = "Object User")
public class UserUpdate  {
  
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
   * Present the username
   **/
  @ApiModelProperty(value = "Present the username")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Show the user login
   **/
  @ApiModelProperty(required = true, value = "Show the user login")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }

  
  /**
   * User CPF
   **/
  @ApiModelProperty(value = "User CPF")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * Show the email of the user
   **/
  @ApiModelProperty(required = true, value = "Show the email of the user")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * User Status
   **/
  @ApiModelProperty(value = "User Status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * Indicates if the access to the app of the user is blocked
   **/
  @ApiModelProperty(value = "Indicates if the access to the app of the user is blocked")
  public Boolean getBloquearAcesso() {
    return bloquearAcesso;
  }
  public void setBloquearAcesso(Boolean bloquearAcesso) {
    this.bloquearAcesso = bloquearAcesso;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserUpdate {\n");
    
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
