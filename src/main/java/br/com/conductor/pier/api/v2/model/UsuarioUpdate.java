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

  
  /**
   * Apresenta o nome do usu\u00E1rio.
   **/
  @ApiModelProperty(value = "Apresenta o nome do usu\u00E1rio.")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Apresenta o login do usu\u00E1rio.
   **/
  @ApiModelProperty(value = "Apresenta o login do usu\u00E1rio.")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }

  
  /**
   * N\u00FAmero do CPF.
   **/
  @ApiModelProperty(value = "N\u00FAmero do CPF.")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * Apresenta o email do usu\u00E1rio.
   **/
  @ApiModelProperty(value = "Apresenta o email do usu\u00E1rio.")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Apresenta o status do usu\u00E1rio.
   **/
  @ApiModelProperty(value = "Apresenta o status do usu\u00E1rio.")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
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
    sb.append("}\n");
    return sb.toString();
  }
}
