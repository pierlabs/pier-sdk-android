package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Parameters for persisting bank account data
 **/
@ApiModel(description = "Parameters for persisting bank account data")
public class DadosBancariosContaPersist  {
  
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("numeroAgencia")
  private Long numeroAgencia = null;
  @SerializedName("numeroContaCorrente")
  private String numeroContaCorrente = null;
  @SerializedName("codigoBanco")
  private Long codigoBanco = null;
  @SerializedName("idTipoContaBancaria")
  private Long idTipoContaBancaria = null;
  @SerializedName("dvContaCorrente")
  private String dvContaCorrente = null;
  @SerializedName("dvAgencia")
  private Integer dvAgencia = null;

  
  /**
   * Identification Code of the account
   **/
  @ApiModelProperty(value = "Identification Code of the account")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Displays the number of the Agency
   **/
  @ApiModelProperty(value = "Displays the number of the Agency")
  public Long getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Long numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * Displays the number of the Account
   **/
  @ApiModelProperty(value = "Displays the number of the Account")
  public String getNumeroContaCorrente() {
    return numeroContaCorrente;
  }
  public void setNumeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
  }

  
  /**
   * Displays the number representing the code of the bank
   **/
  @ApiModelProperty(value = "Displays the number representing the code of the bank")
  public Long getCodigoBanco() {
    return codigoBanco;
  }
  public void setCodigoBanco(Long codigoBanco) {
    this.codigoBanco = codigoBanco;
  }

  
  /**
   * Identification Code of the bank account type (id)
   **/
  @ApiModelProperty(value = "Identification Code of the bank account type (id)")
  public Long getIdTipoContaBancaria() {
    return idTipoContaBancaria;
  }
  public void setIdTipoContaBancaria(Long idTipoContaBancaria) {
    this.idTipoContaBancaria = idTipoContaBancaria;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDvContaCorrente() {
    return dvContaCorrente;
  }
  public void setDvContaCorrente(String dvContaCorrente) {
    this.dvContaCorrente = dvContaCorrente;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getDvAgencia() {
    return dvAgencia;
  }
  public void setDvAgencia(Integer dvAgencia) {
    this.dvAgencia = dvAgencia;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosBancariosContaPersist {\n");
    
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  numeroAgencia: ").append(numeroAgencia).append("\n");
    sb.append("  numeroContaCorrente: ").append(numeroContaCorrente).append("\n");
    sb.append("  codigoBanco: ").append(codigoBanco).append("\n");
    sb.append("  idTipoContaBancaria: ").append(idTipoContaBancaria).append("\n");
    sb.append("  dvContaCorrente: ").append(dvContaCorrente).append("\n");
    sb.append("  dvAgencia: ").append(dvAgencia).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
