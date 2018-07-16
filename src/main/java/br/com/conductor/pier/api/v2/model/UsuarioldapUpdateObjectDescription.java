package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.ReferenciaIdPersist;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{usuarioldap_update_object_description}}}
 **/
@ApiModel(description = "{{{usuarioldap_update_object_description}}}")
public class UsuarioldapUpdateObjectDescription  {
  
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
  @SerializedName("status")
  private String status = null;

  
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
   * {{{usuario_persist_email_value}}}
   **/
  @ApiModelProperty(value = "{{{usuario_persist_email_value}}}")
  public List<ReferenciaIdPersist> getPerfis() {
    return perfis;
  }
  public void setPerfis(List<ReferenciaIdPersist> perfis) {
    this.perfis = perfis;
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsuarioldapUpdateObjectDescription {\n");
    
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  login: ").append(login).append("\n");
    sb.append("  cpf: ").append(cpf).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  perfis: ").append(perfis).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


