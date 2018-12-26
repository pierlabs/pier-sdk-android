package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o do recurso Usuario Conta
 **/
@ApiModel(description = "Representa\u00E7\u00E3o do recurso Usuario Conta")
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
   * Id do usu\u00E1rio conta
   **/
  @ApiModelProperty(value = "Id do usu\u00E1rio conta")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Id da conta vinculada ao usu\u00E1rio
   **/
  @ApiModelProperty(value = "Id da conta vinculada ao usu\u00E1rio")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Id da pessoa
   **/
  @ApiModelProperty(value = "Id da pessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * Id do usu\u00E1rio vinculado a conta
   **/
  @ApiModelProperty(value = "Id do usu\u00E1rio vinculado a conta")
  public Long getIdUsuario() {
    return idUsuario;
  }
  public void setIdUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
  }

  
  /**
   * N\u00EDvel de ACesso
   **/
  @ApiModelProperty(value = "N\u00EDvel de ACesso")
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
