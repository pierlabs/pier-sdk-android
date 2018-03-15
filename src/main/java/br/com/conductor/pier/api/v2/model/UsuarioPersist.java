package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto Usuario
 **/
@ApiModel(description = "Objeto Usuario")
public class UsuarioPersist  {
  
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("login")
  private String login = null;
  @SerializedName("cpf")
  private String cpf = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("senha")
  private String senha = null;

  
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
   * Apresenta a senha do usu\u00E1rio.
   **/
  @ApiModelProperty(value = "Apresenta a senha do usu\u00E1rio.")
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsuarioPersist {\n");
    
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  login: ").append(login).append("\n");
    sb.append("  cpf: ").append(cpf).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  senha: ").append(senha).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
