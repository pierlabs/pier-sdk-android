package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.ReferenciaIdPersist;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class UsuarioLdapPersist  {
  
  @SerializedName("cpf")
  private String cpf = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("idEmissor")
  private Long idEmissor = null;
  @SerializedName("login")
  private String login = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("perfis")
  private List<ReferenciaIdPersist> perfis = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
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
    
    sb.append("  cpf: ").append(cpf).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  idEmissor: ").append(idEmissor).append("\n");
    sb.append("  login: ").append(login).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  perfis: ").append(perfis).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
