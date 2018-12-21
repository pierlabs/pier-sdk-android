package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Future Invoice
 **/
@ApiModel(description = "Future Invoice")
public class LancamentoFaturaResponse  {
  
  @SerializedName("idTransacao")
  private Long idTransacao = null;
  @SerializedName("descricaoTipoTransacao")
  private String descricaoTipoTransacao = null;
  @SerializedName("idTipoEvento")
  private Long idTipoEvento = null;
  @SerializedName("descricaoTipoEvento")
  private String descricaoTipoEvento = null;
  @SerializedName("idEvento")
  private Long idEvento = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("complemento")
  private String complemento = null;
  @SerializedName("valorBRL")
  private BigDecimal valorBRL = null;
  @SerializedName("valorUSD")
  private BigDecimal valorUSD = null;
  @SerializedName("numeroParcela")
  private Integer numeroParcela = null;
  @SerializedName("quantidadeParcelas")
  private Integer quantidadeParcelas = null;
  @SerializedName("dataHoraTransacao")
  private String dataHoraTransacao = null;
  @SerializedName("nomeEstabelecimento")
  private String nomeEstabelecimento = null;
  @SerializedName("descricaoEstabelecimento")
  private String descricaoEstabelecimento = null;
  @SerializedName("nomeFantasiaEstabelecimento")
  private String nomeFantasiaEstabelecimento = null;
  @SerializedName("flagCredito")
  private Boolean flagCredito = null;
  @SerializedName("idMCC")
  private Long idMCC = null;
  @SerializedName("idGrupoMCC")
  private Long idGrupoMCC = null;
  @SerializedName("descricaoGrupoMCC")
  private String descricaoGrupoMCC = null;
  @SerializedName("titular")
  private Boolean titular = null;
  @SerializedName("nomePortador")
  private String nomePortador = null;
  @SerializedName("numeroCartaoMascarado")
  private String numeroCartaoMascarado = null;
  @SerializedName("flagSolicitouContestacao")
  private Boolean flagSolicitouContestacao = null;
  @SerializedName("valorTaxaEmbarque")
  private BigDecimal valorTaxaEmbarque = null;
  @SerializedName("descricaoAbreviada")
  private String descricaoAbreviada = null;

  
  /**
   * Identification Code of the transaction
   **/
  @ApiModelProperty(value = "Identification Code of the transaction")
  public Long getIdTransacao() {
    return idTransacao;
  }
  public void setIdTransacao(Long idTransacao) {
    this.idTransacao = idTransacao;
  }

  
  /**
   * Description of the transaction type
   **/
  @ApiModelProperty(value = "Description of the transaction type")
  public String getDescricaoTipoTransacao() {
    return descricaoTipoTransacao;
  }
  public void setDescricaoTipoTransacao(String descricaoTipoTransacao) {
    this.descricaoTipoTransacao = descricaoTipoTransacao;
  }

  
  /**
   * Identifier Code of the event type
   **/
  @ApiModelProperty(value = "Identifier Code of the event type")
  public Long getIdTipoEvento() {
    return idTipoEvento;
  }
  public void setIdTipoEvento(Long idTipoEvento) {
    this.idTipoEvento = idTipoEvento;
  }

  
  /**
   * Description of the event type
   **/
  @ApiModelProperty(value = "Description of the event type")
  public String getDescricaoTipoEvento() {
    return descricaoTipoEvento;
  }
  public void setDescricaoTipoEvento(String descricaoTipoEvento) {
    this.descricaoTipoEvento = descricaoTipoEvento;
  }

  
  /**
   * Identifier Code of the event
   **/
  @ApiModelProperty(value = "Identifier Code of the event")
  public Long getIdEvento() {
    return idEvento;
  }
  public void setIdEvento(Long idEvento) {
    this.idEvento = idEvento;
  }

  
  /**
   * Identification Code of the Account
   **/
  @ApiModelProperty(value = "Identification Code of the Account")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Complementary Description of the event
   **/
  @ApiModelProperty(value = "Complementary Description of the event")
  public String getComplemento() {
    return complemento;
  }
  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  
  /**
   * Value in reais
   **/
  @ApiModelProperty(value = "Value in reais")
  public BigDecimal getValorBRL() {
    return valorBRL;
  }
  public void setValorBRL(BigDecimal valorBRL) {
    this.valorBRL = valorBRL;
  }

  
  /**
   * value in dollar
   **/
  @ApiModelProperty(value = "value in dollar")
  public BigDecimal getValorUSD() {
    return valorUSD;
  }
  public void setValorUSD(BigDecimal valorUSD) {
    this.valorUSD = valorUSD;
  }

  
  /**
   * Number of the parcels
   **/
  @ApiModelProperty(value = "Number of the parcels")
  public Integer getNumeroParcela() {
    return numeroParcela;
  }
  public void setNumeroParcela(Integer numeroParcela) {
    this.numeroParcela = numeroParcela;
  }

  
  /**
   * Quantity of parcels
   **/
  @ApiModelProperty(value = "Quantity of parcels")
  public Integer getQuantidadeParcelas() {
    return quantidadeParcelas;
  }
  public void setQuantidadeParcelas(Integer quantidadeParcelas) {
    this.quantidadeParcelas = quantidadeParcelas;
  }

  
  /**
   * Transaction date
   **/
  @ApiModelProperty(value = "Transaction date")
  public String getDataHoraTransacao() {
    return dataHoraTransacao;
  }
  public void setDataHoraTransacao(String dataHoraTransacao) {
    this.dataHoraTransacao = dataHoraTransacao;
  }

  
  /**
   * Merchant Name
   **/
  @ApiModelProperty(value = "Merchant Name")
  public String getNomeEstabelecimento() {
    return nomeEstabelecimento;
  }
  public void setNomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
  }

  
  /**
   * Merchant Description
   **/
  @ApiModelProperty(value = "Merchant Description")
  public String getDescricaoEstabelecimento() {
    return descricaoEstabelecimento;
  }
  public void setDescricaoEstabelecimento(String descricaoEstabelecimento) {
    this.descricaoEstabelecimento = descricaoEstabelecimento;
  }

  
  /**
   * Fantasy Name of the Merchant
   **/
  @ApiModelProperty(value = "Fantasy Name of the Merchant")
  public String getNomeFantasiaEstabelecimento() {
    return nomeFantasiaEstabelecimento;
  }
  public void setNomeFantasiaEstabelecimento(String nomeFantasiaEstabelecimento) {
    this.nomeFantasiaEstabelecimento = nomeFantasiaEstabelecimento;
  }

  
  /**
   * Flag that indicates if the launch is of credit
   **/
  @ApiModelProperty(value = "Flag that indicates if the launch is of credit")
  public Boolean getFlagCredito() {
    return flagCredito;
  }
  public void setFlagCredito(Boolean flagCredito) {
    this.flagCredito = flagCredito;
  }

  
  /**
   * Identifier Code of the MCC (Merchant Category Codes)
   **/
  @ApiModelProperty(value = "Identifier Code of the MCC (Merchant Category Codes)")
  public Long getIdMCC() {
    return idMCC;
  }
  public void setIdMCC(Long idMCC) {
    this.idMCC = idMCC;
  }

  
  /**
   * Identifier Code of the Group MCC
   **/
  @ApiModelProperty(value = "Identifier Code of the Group MCC")
  public Long getIdGrupoMCC() {
    return idGrupoMCC;
  }
  public void setIdGrupoMCC(Long idGrupoMCC) {
    this.idGrupoMCC = idGrupoMCC;
  }

  
  /**
   * Description of the group MCC
   **/
  @ApiModelProperty(value = "Description of the group MCC")
  public String getDescricaoGrupoMCC() {
    return descricaoGrupoMCC;
  }
  public void setDescricaoGrupoMCC(String descricaoGrupoMCC) {
    this.descricaoGrupoMCC = descricaoGrupoMCC;
  }

  
  /**
   * Indicate if the the cardholder is the holder of the account
   **/
  @ApiModelProperty(value = "Indicate if the the cardholder is the holder of the account")
  public Boolean getTitular() {
    return titular;
  }
  public void setTitular(Boolean titular) {
    this.titular = titular;
  }

  
  /**
   * Printed name on the card
   **/
  @ApiModelProperty(value = "Printed name on the card")
  public String getNomePortador() {
    return nomePortador;
  }
  public void setNomePortador(String nomePortador) {
    this.nomePortador = nomePortador;
  }

  
  /**
   * Card number masked
   **/
  @ApiModelProperty(value = "Card number masked")
  public String getNumeroCartaoMascarado() {
    return numeroCartaoMascarado;
  }
  public void setNumeroCartaoMascarado(String numeroCartaoMascarado) {
    this.numeroCartaoMascarado = numeroCartaoMascarado;
  }

  
  /**
   * Flag that indicates if the client requested the contest of the transaction
   **/
  @ApiModelProperty(value = "Flag that indicates if the client requested the contest of the transaction")
  public Boolean getFlagSolicitouContestacao() {
    return flagSolicitouContestacao;
  }
  public void setFlagSolicitouContestacao(Boolean flagSolicitouContestacao) {
    this.flagSolicitouContestacao = flagSolicitouContestacao;
  }

  
  /**
   * Value of the Boarding taxe
   **/
  @ApiModelProperty(value = "Value of the Boarding taxe")
  public BigDecimal getValorTaxaEmbarque() {
    return valorTaxaEmbarque;
  }
  public void setValorTaxaEmbarque(BigDecimal valorTaxaEmbarque) {
    this.valorTaxaEmbarque = valorTaxaEmbarque;
  }

  
  /**
   * Description abbreviated of the transaction
   **/
  @ApiModelProperty(value = "Description abbreviated of the transaction")
  public String getDescricaoAbreviada() {
    return descricaoAbreviada;
  }
  public void setDescricaoAbreviada(String descricaoAbreviada) {
    this.descricaoAbreviada = descricaoAbreviada;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LancamentoFaturaResponse {\n");
    
    sb.append("  idTransacao: ").append(idTransacao).append("\n");
    sb.append("  descricaoTipoTransacao: ").append(descricaoTipoTransacao).append("\n");
    sb.append("  idTipoEvento: ").append(idTipoEvento).append("\n");
    sb.append("  descricaoTipoEvento: ").append(descricaoTipoEvento).append("\n");
    sb.append("  idEvento: ").append(idEvento).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  complemento: ").append(complemento).append("\n");
    sb.append("  valorBRL: ").append(valorBRL).append("\n");
    sb.append("  valorUSD: ").append(valorUSD).append("\n");
    sb.append("  numeroParcela: ").append(numeroParcela).append("\n");
    sb.append("  quantidadeParcelas: ").append(quantidadeParcelas).append("\n");
    sb.append("  dataHoraTransacao: ").append(dataHoraTransacao).append("\n");
    sb.append("  nomeEstabelecimento: ").append(nomeEstabelecimento).append("\n");
    sb.append("  descricaoEstabelecimento: ").append(descricaoEstabelecimento).append("\n");
    sb.append("  nomeFantasiaEstabelecimento: ").append(nomeFantasiaEstabelecimento).append("\n");
    sb.append("  flagCredito: ").append(flagCredito).append("\n");
    sb.append("  idMCC: ").append(idMCC).append("\n");
    sb.append("  idGrupoMCC: ").append(idGrupoMCC).append("\n");
    sb.append("  descricaoGrupoMCC: ").append(descricaoGrupoMCC).append("\n");
    sb.append("  titular: ").append(titular).append("\n");
    sb.append("  nomePortador: ").append(nomePortador).append("\n");
    sb.append("  numeroCartaoMascarado: ").append(numeroCartaoMascarado).append("\n");
    sb.append("  flagSolicitouContestacao: ").append(flagSolicitouContestacao).append("\n");
    sb.append("  valorTaxaEmbarque: ").append(valorTaxaEmbarque).append("\n");
    sb.append("  descricaoAbreviada: ").append(descricaoAbreviada).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
