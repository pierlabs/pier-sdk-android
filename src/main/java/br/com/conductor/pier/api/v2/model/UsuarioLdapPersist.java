package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.ReferenciaIdPersist;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{usuario_persist_object_description}}}
 **/
@ApiModel(description = "{{{usuario_persist_object_description}}}")
public class UsuarioLdapPersist  {
  
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("login")
  private String login = null;
  @SerializedName("cpf")
  private String cpf = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("perfis")
  private List<ReferenciaIdPersist> perfis = null;

  
  /**
   * {{{usuario_persist_nome_value}}}
   **/
  @ApiModelProperty(value = "{{{usuario_persist_nome_value}}}")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{usuario_persist_login_value}}}
   **/
  @ApiModelProperty(value = "{{{usuario_persist_login_value}}}")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }

  
  /**
   * {{{usuario_persist_cpf_value}}}
   **/
  @ApiModelProperty(value = "{{{usuario_persist_cpf_value}}}")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * {{{usuario_persist_email_value}}}
   **/
  @ApiModelProperty(value = "{{{usuario_persist_email_value}}}")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * {{{usuario_persist_perfis_value}}}
   **/
  @ApiModelProperty(value = "{{{usuario_persist_perfis_value}}}")
  public List<ReferenciaIdPersist> getPerfis() {
    return perfis;
  }
  public void setPerfis(List<ReferenciaIdPersist> perfis) {
    this.perfis = perfis;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsuarioLdapPersist {\n");
    
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  login: ").append(login).append("\n");
    sb.append("  cpf: ").append(cpf).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  perfis: ").append(perfis).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


