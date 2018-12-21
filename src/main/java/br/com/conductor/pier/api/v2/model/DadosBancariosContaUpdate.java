package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Parameters for updating bank account data
 **/
@ApiModel(description = "Parameters for updating bank account data")
public class DadosBancariosContaUpdate  {
  
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("codigoBanco")
  private Long codigoBanco = null;
  @SerializedName("numeroAgencia")
  private Long numeroAgencia = null;
  @SerializedName("numeroContaCorrente")
  private String numeroContaCorrente = null;
  @SerializedName("idTipoContaBancaria")
  private Long idTipoContaBancaria = null;

  
  /**
   * Identification Code of the account (id)
   **/
  @ApiModelProperty(value = "Identification Code of the account (id)")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Bank number
   **/
  @ApiModelProperty(value = "Bank number")
  public Long getCodigoBanco() {
    return codigoBanco;
  }
  public void setCodigoBanco(Long codigoBanco) {
    this.codigoBanco = codigoBanco;
  }

  
  /**
   * Agency number
   **/
  @ApiModelProperty(value = "Agency number")
  public Long getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Long numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * Account number
   **/
  @ApiModelProperty(value = "Account number")
  public String getNumeroContaCorrente() {
    return numeroContaCorrente;
  }
  public void setNumeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
  }

  
  /**
   * Identification Code of the register bank account type (id)
   **/
  @ApiModelProperty(value = "Identification Code of the register bank account type (id)")
  public Long getIdTipoContaBancaria() {
    return idTipoContaBancaria;
  }
  public void setIdTipoContaBancaria(Long idTipoContaBancaria) {
    this.idTipoContaBancaria = idTipoContaBancaria;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosBancariosContaUpdate {\n");
    
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  codigoBanco: ").append(codigoBanco).append("\n");
    sb.append("  numeroAgencia: ").append(numeroAgencia).append("\n");
    sb.append("  numeroContaCorrente: ").append(numeroContaCorrente).append("\n");
    sb.append("  idTipoContaBancaria: ").append(idTipoContaBancaria).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
