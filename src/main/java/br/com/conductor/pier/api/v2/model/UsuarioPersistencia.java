package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{usuario_persistencia_descricao}}}
 **/
@ApiModel(description = "{{{usuario_persistencia_descricao}}}")
public class UsuarioPersistencia  {
  
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
   * {{{usuario_persistencia_nome_descricao}}}
   **/
  @ApiModelProperty(value = "{{{usuario_persistencia_nome_descricao}}}")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{usuario_persistencia_login_descricao}}}
   **/
  @ApiModelProperty(required = true, value = "{{{usuario_persistencia_login_descricao}}}")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }

  
  /**
   * {{{usuario_persistencia_cpf_descricao}}}
   **/
  @ApiModelProperty(value = "{{{usuario_persistencia_cpf_descricao}}}")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * {{{usuario_persistencia_email_descricao}}}
   **/
  @ApiModelProperty(required = true, value = "{{{usuario_persistencia_email_descricao}}}")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * {{{usuario_persistencia_senha_descricao}}}
   **/
  @ApiModelProperty(required = true, value = "{{{usuario_persistencia_senha_descricao}}}")
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }

  
  /**
   * {{{usuario_persistencia_data_validade_descricao}}}
   **/
  @ApiModelProperty(value = "{{{usuario_persistencia_data_validade_descricao}}}")
  public String getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(String dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * {{{usuario_persistencia_id_plataforma_descricao}}}
   **/
  @ApiModelProperty(value = "{{{usuario_persistencia_id_plataforma_descricao}}}")
  public Long getIdPlataforma() {
    return idPlataforma;
  }
  public void setIdPlataforma(Long idPlataforma) {
    this.idPlataforma = idPlataforma;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsuarioPersistencia {\n");
    
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
