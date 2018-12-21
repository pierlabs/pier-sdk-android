package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representation of the User Account feature
 **/
@ApiModel(description = "Representation of the User Account feature")
public class UsuarioContasResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idPessoa")
  private Long idPessoa = null;
  @SerializedName("idUsuario")
  private Long idUsuario = null;
  @SerializedName("nivelAcesso")
  private Integer nivelAcesso = null;

  
  /**
   * Account User Id
   **/
  @ApiModelProperty(value = "Account User Id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * User-linked account id
   **/
  @ApiModelProperty(value = "User-linked account id")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Person ID
   **/
  @ApiModelProperty(value = "Person ID")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * Account Id Linked to Account
   **/
  @ApiModelProperty(value = "Account Id Linked to Account")
  public Long getIdUsuario() {
    return idUsuario;
  }
  public void setIdUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
  }

  
  /**
   * User Accounts Description
   **/
  @ApiModelProperty(value = "User Accounts Description")
  public Integer getNivelAcesso() {
    return nivelAcesso;
  }
  public void setNivelAcesso(Integer nivelAcesso) {
    this.nivelAcesso = nivelAcesso;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsuarioContasResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  idUsuario: ").append(idUsuario).append("\n");
    sb.append("  nivelAcesso: ").append(nivelAcesso).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
