package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * User object persist
 **/
@ApiModel(description = "User object persist")
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
  @SerializedName("dataValidade")
  private String dataValidade = null;
  @SerializedName("idPlataforma")
  private Long idPlataforma = null;

  
  /**
   * Present the name of the user
   **/
  @ApiModelProperty(value = "Present the name of the user")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Show the login of the user
   **/
  @ApiModelProperty(required = true, value = "Show the login of the user")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }

  
  /**
   * User cpf
   **/
  @ApiModelProperty(value = "User cpf")
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
   * Show the password of the user
   **/
  @ApiModelProperty(required = true, value = "Show the password of the user")
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }

  
  /**
   * Expering Date
   **/
  @ApiModelProperty(value = "Expering Date")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * Platform identification code
   **/
  @ApiModelProperty(value = "Platform identification code")
  public Long getIdPlataforma() {
    return idPlataforma;
  }
  public void setIdPlataforma(Long idPlataforma) {
    this.idPlataforma = idPlataforma;
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
    sb.append("  dataValidade: ").append(dataValidade).append("\n");
    sb.append("  idPlataforma: ").append(idPlataforma).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
