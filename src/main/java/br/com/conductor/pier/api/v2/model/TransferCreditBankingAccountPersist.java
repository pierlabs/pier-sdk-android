package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Credit Transfer for the bank account
 **/
@ApiModel(description = "Credit Transfer for the bank account")
public class TransferCreditBankingAccountPersist  {
  
  @SerializedName("nsuOrigem")
  private Long nsuOrigem = null;
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("idContaBancaria")
  private Long idContaBancaria = null;
  @SerializedName("valor")
  private BigDecimal valor = null;
  @SerializedName("numeroParcelas")
  private Long numeroParcelas = null;
  @SerializedName("numeroMesesCarencia")
  private Integer numeroMesesCarencia = null;
  @SerializedName("dataHoraTerminal")
  private String dataHoraTerminal = null;
  @SerializedName("terminalRequisitante")
  private String terminalRequisitante = null;
  @SerializedName("numeroEstabelecimento")
  private String numeroEstabelecimento = null;

  
  /**
   * Represent the Unique Sequel Number that identifies the transaction in the system which has created it
   **/
  @ApiModelProperty(required = true, value = "Represent the Unique Sequel Number that identifies the transaction in the system which has created it")
  public Long getNsuOrigem() {
    return nsuOrigem;
  }
  public void setNsuOrigem(Long nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
  }

  
  /**
   * Represent the Card Identifier
   **/
  @ApiModelProperty(required = true, value = "Represent the Card Identifier")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Represent the Banking account identifier
   **/
  @ApiModelProperty(required = true, value = "Represent the Banking account identifier")
  public Long getIdContaBancaria() {
    return idContaBancaria;
  }
  public void setIdContaBancaria(Long idContaBancaria) {
    this.idContaBancaria = idContaBancaria;
  }

  
  /**
   * Represent the value of the transfer
   **/
  @ApiModelProperty(required = true, value = "Represent the value of the transfer")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * Represent the number of parcels which the value of the transfer will be divided
   **/
  @ApiModelProperty(required = true, value = "Represent the number of parcels which the value of the transfer will be divided")
  public Long getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Long numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * Represent the number of months given as a lack
   **/
  @ApiModelProperty(required = true, value = "Represent the number of months given as a lack")
  public Integer getNumeroMesesCarencia() {
    return numeroMesesCarencia;
  }
  public void setNumeroMesesCarencia(Integer numeroMesesCarencia) {
    this.numeroMesesCarencia = numeroMesesCarencia;
  }

  
  /**
   * Represent the date and the time of the terminal requestor
   **/
  @ApiModelProperty(required = true, value = "Represent the date and the time of the terminal requestor")
  public String getDataHoraTerminal() {
    return dataHoraTerminal;
  }
  public void setDataHoraTerminal(String dataHoraTerminal) {
    this.dataHoraTerminal = dataHoraTerminal;
  }

  
  /**
   * Represent the identification of the terminal acquirer
   **/
  @ApiModelProperty(required = true, value = "Represent the identification of the terminal acquirer")
  public String getTerminalRequisitante() {
    return terminalRequisitante;
  }
  public void setTerminalRequisitante(String terminalRequisitante) {
    this.terminalRequisitante = terminalRequisitante;
  }

  
  /**
   * Represent the Merchant Identification Number
   **/
  @ApiModelProperty(required = true, value = "Represent the Merchant Identification Number")
  public String getNumeroEstabelecimento() {
    return numeroEstabelecimento;
  }
  public void setNumeroEstabelecimento(String numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferCreditBankingAccountPersist {\n");
    
    sb.append("  nsuOrigem: ").append(nsuOrigem).append("\n");
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  idContaBancaria: ").append(idContaBancaria).append("\n");
    sb.append("  valor: ").append(valor).append("\n");
    sb.append("  numeroParcelas: ").append(numeroParcelas).append("\n");
    sb.append("  numeroMesesCarencia: ").append(numeroMesesCarencia).append("\n");
    sb.append("  dataHoraTerminal: ").append(dataHoraTerminal).append("\n");
    sb.append("  terminalRequisitante: ").append(terminalRequisitante).append("\n");
    sb.append("  numeroEstabelecimento: ").append(numeroEstabelecimento).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
