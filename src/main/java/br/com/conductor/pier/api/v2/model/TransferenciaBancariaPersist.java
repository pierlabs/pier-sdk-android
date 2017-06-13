package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Transfer\u00C3\u00AAncia banc\u00C3\u00A1ria
 **/
@ApiModel(description = "Transfer\u00C3\u00AAncia banc\u00C3\u00A1ria")
public class TransferenciaBancariaPersist  {
  
  @SerializedName("dataCompra")
  private String dataCompra = null;
  @SerializedName("proximoVencimentoPadrao")
  private String proximoVencimentoPadrao = null;
  @SerializedName("proximoVencimentoReal")
  private String proximoVencimentoReal = null;
  @SerializedName("valorCompra")
  private BigDecimal valorCompra = null;
  @SerializedName("nomeFavorecido")
  private String nomeFavorecido = null;
  @SerializedName("documentoFavorecido")
  private String documentoFavorecido = null;
  @SerializedName("banco")
  private Long banco = null;
  @SerializedName("numeroAgencia")
  private String numeroAgencia = null;
  @SerializedName("digitoAgencia")
  private String digitoAgencia = null;
  @SerializedName("numeroConta")
  private String numeroConta = null;
  @SerializedName("digitoConta")
  private String digitoConta = null;
  @SerializedName("flagContaPoupanca")
  private Integer flagContaPoupanca = null;

  
  /**
   * Data da transfer\u00C3\u00AAncia
   **/
  @ApiModelProperty(required = true, value = "Data da transfer\u00C3\u00AAncia")
  public String getDataCompra() {
    return dataCompra;
  }
  public void setDataCompra(String dataCompra) {
    this.dataCompra = dataCompra;
  }

  
  /**
   * Dia do vencimento padr\u00C3\u00A3o da fatura
   **/
  @ApiModelProperty(required = true, value = "Dia do vencimento padr\u00C3\u00A3o da fatura")
  public String getProximoVencimentoPadrao() {
    return proximoVencimentoPadrao;
  }
  public void setProximoVencimentoPadrao(String proximoVencimentoPadrao) {
    this.proximoVencimentoPadrao = proximoVencimentoPadrao;
  }

  
  /**
   * Data do vencimento real da fatura
   **/
  @ApiModelProperty(required = true, value = "Data do vencimento real da fatura")
  public String getProximoVencimentoReal() {
    return proximoVencimentoReal;
  }
  public void setProximoVencimentoReal(String proximoVencimentoReal) {
    this.proximoVencimentoReal = proximoVencimentoReal;
  }

  
  /**
   * Valor da transfer\u00C3\u00AAncia
   **/
  @ApiModelProperty(required = true, value = "Valor da transfer\u00C3\u00AAncia")
  public BigDecimal getValorCompra() {
    return valorCompra;
  }
  public void setValorCompra(BigDecimal valorCompra) {
    this.valorCompra = valorCompra;
  }

  
  /**
   * Apresenta o 'Nome Completo da PF' ou o 'Nome Completo da Raz\u00C3\u00A3o Social (Nome Empresarial)'.
   **/
  @ApiModelProperty(required = true, value = "Apresenta o 'Nome Completo da PF' ou o 'Nome Completo da Raz\u00C3\u00A3o Social (Nome Empresarial)'.")
  public String getNomeFavorecido() {
    return nomeFavorecido;
  }
  public void setNomeFavorecido(String nomeFavorecido) {
    this.nomeFavorecido = nomeFavorecido;
  }

  
  /**
   * N\u00C3\u00BAmero do CPF ou CNPJ.
   **/
  @ApiModelProperty(required = true, value = "N\u00C3\u00BAmero do CPF ou CNPJ.")
  public String getDocumentoFavorecido() {
    return documentoFavorecido;
  }
  public void setDocumentoFavorecido(String documentoFavorecido) {
    this.documentoFavorecido = documentoFavorecido;
  }

  
  /**
   * C\u00C3\u00B3digo do banco
   **/
  @ApiModelProperty(required = true, value = "C\u00C3\u00B3digo do banco")
  public Long getBanco() {
    return banco;
  }
  public void setBanco(Long banco) {
    this.banco = banco;
  }

  
  /**
   * N\u00C3\u00BAmero da ag\u00C3\u00AAncia
   **/
  @ApiModelProperty(required = true, value = "N\u00C3\u00BAmero da ag\u00C3\u00AAncia")
  public String getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(String numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * D\u00C3\u00ADgito da ag\u00C3\u00AAncia
   **/
  @ApiModelProperty(value = "D\u00C3\u00ADgito da ag\u00C3\u00AAncia")
  public String getDigitoAgencia() {
    return digitoAgencia;
  }
  public void setDigitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
  }

  
  /**
   * N\u00C3\u00BAmero da conta
   **/
  @ApiModelProperty(required = true, value = "N\u00C3\u00BAmero da conta")
  public String getNumeroConta() {
    return numeroConta;
  }
  public void setNumeroConta(String numeroConta) {
    this.numeroConta = numeroConta;
  }

  
  /**
   * D\u00C3\u00ADgito da conta
   **/
  @ApiModelProperty(value = "D\u00C3\u00ADgito da conta")
  public String getDigitoConta() {
    return digitoConta;
  }
  public void setDigitoConta(String digitoConta) {
    this.digitoConta = digitoConta;
  }

  
  /**
   * Sinaliza se conta banc\u00C3\u00A1ria \u00C3\u00A9 poupan\u00C3\u00A7a (1: Poupan\u00C3\u00A7a, 0: Conta corrente)
   **/
  @ApiModelProperty(required = true, value = "Sinaliza se conta banc\u00C3\u00A1ria \u00C3\u00A9 poupan\u00C3\u00A7a (1: Poupan\u00C3\u00A7a, 0: Conta corrente)")
  public Integer getFlagContaPoupanca() {
    return flagContaPoupanca;
  }
  public void setFlagContaPoupanca(Integer flagContaPoupanca) {
    this.flagContaPoupanca = flagContaPoupanca;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferenciaBancariaPersist {\n");
    
    sb.append("  dataCompra: ").append(dataCompra).append("\n");
    sb.append("  proximoVencimentoPadrao: ").append(proximoVencimentoPadrao).append("\n");
    sb.append("  proximoVencimentoReal: ").append(proximoVencimentoReal).append("\n");
    sb.append("  valorCompra: ").append(valorCompra).append("\n");
    sb.append("  nomeFavorecido: ").append(nomeFavorecido).append("\n");
    sb.append("  documentoFavorecido: ").append(documentoFavorecido).append("\n");
    sb.append("  banco: ").append(banco).append("\n");
    sb.append("  numeroAgencia: ").append(numeroAgencia).append("\n");
    sb.append("  digitoAgencia: ").append(digitoAgencia).append("\n");
    sb.append("  numeroConta: ").append(numeroConta).append("\n");
    sb.append("  digitoConta: ").append(digitoConta).append("\n");
    sb.append("  flagContaPoupanca: ").append(flagContaPoupanca).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


