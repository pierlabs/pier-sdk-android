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
  @SerializedName("dataValidade")
  private String dataValidade = null;
  @SerializedName("idPlataforma")
  private Long idPlataforma = null;

  
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
   * Cpf do usu\u00E1rio
   **/
  @ApiModelProperty(value = "Cpf do usu\u00E1rio")
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
   * Apresenta a senha do usu\u00E1rio
   **/
  @ApiModelProperty(required = true, value = "Apresenta a senha do usu\u00E1rio")
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }

  
  /**
   * Data de Validade
   **/
  @ApiModelProperty(value = "Data de Validade")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * C\u00F3d. de identifica\u00E7a\u00F5 da plataforma
   **/
  @ApiModelProperty(value = "C\u00F3d. de identifica\u00E7a\u00F5 da plataforma")
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
