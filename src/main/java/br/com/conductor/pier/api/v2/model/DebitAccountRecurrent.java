package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Recurrent Debit Accounts
 **/
@ApiModel(description = "Recurrent Debit Accounts")
public class DebitAccountRecurrent  {
  
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
   * Identification Code of the Account (id)
   **/
  @ApiModelProperty(value = "Identification Code of the Account (id)")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Identification Code of the Recurrent Debit Account (id)
   **/
  @ApiModelProperty(value = "Identification Code of the Recurrent Debit Account (id)")
  public Long getIdTipoDebitoRecorrente() {
    return idTipoDebitoRecorrente;
  }
  public void setIdTipoDebitoRecorrente(Long idTipoDebitoRecorrente) {
    this.idTipoDebitoRecorrente = idTipoDebitoRecorrente;
  }

  
  /**
   * Identification Code of the Logged system user (id)
   **/
  @ApiModelProperty(value = "Identification Code of the Logged system user (id)")
  public Long getIdUsuario() {
    return idUsuario;
  }
  public void setIdUsuario(Long idUsuario) {
    this.idUsuario = idUsuario;
  }

  
  /**
   * Logged Login in the system
   **/
  @ApiModelProperty(value = "Logged Login in the system")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }

  
  /**
   * Months quantity for Recurrent Debit
   **/
  @ApiModelProperty(value = "Months quantity for Recurrent Debit")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebitAccountRecurrent {\n");
    
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idTipoDebitoRecorrente: ").append(idTipoDebitoRecorrente).append("\n");
    sb.append("  idUsuario: ").append(idUsuario).append("\n");
    sb.append("  login: ").append(login).append("\n");
    sb.append("  numeroParcelas: ").append(numeroParcelas).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
