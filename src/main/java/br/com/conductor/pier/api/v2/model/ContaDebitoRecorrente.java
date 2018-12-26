package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Contas D\u00E9bitos Recorrentes
 **/
@ApiModel(description = "Contas D\u00E9bitos Recorrentes")
public class ContaDebitoRecorrente  {
  
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idTipoDebitoRecorrente")
  private Long idTipoDebitoRecorrente = null;
  @SerializedName("idUsuario")
  private Long idUsuario = null;
  @SerializedName("login")
  private String login = null;
  @SerializedName("numeroParcelas")
  private Integer numeroParcelas = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da conta (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da conta (id)")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do tipo de d\u00E9bito recorrente (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do tipo de d\u00E9bito recorrente (id)")
  public Long getIdTipoDebitoRecorrente() {
    return idTipoDebitoRecorrente;
  }
  public void setIdTipoDebitoRecorrente(Long idTipoDebitoRecorrente) {
    this.idTipoDebitoRecorrente = idTipoDebitoRecorrente;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do usu\u00E1rio logado do sistema (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do usu\u00E1rio logado do sistema (id)")
  public Long getIdUsuario() {
    return idUsuario;
  }
  public void setIdUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
  }

  
  /**
   * Login logado do sistema
   **/
  @ApiModelProperty(value = "Login logado do sistema")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }

  
  /**
   * Quantidade de parcelas para o d\u00E9bito recorrente
   **/
  @ApiModelProperty(value = "Quantidade de parcelas para o d\u00E9bito recorrente")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaDebitoRecorrente {\n");
    
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idTipoDebitoRecorrente: ").append(idTipoDebitoRecorrente).append("\n");
    sb.append("  idUsuario: ").append(idUsuario).append("\n");
    sb.append("  login: ").append(login).append("\n");
    sb.append("  numeroParcelas: ").append(numeroParcelas).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
