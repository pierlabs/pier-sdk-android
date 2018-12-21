package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object transaction not processed
 **/
@ApiModel(description = "Object transaction not processed")
public class TransacaoNaoProcessadaResponse  {
  
  @SerializedName("cartaoMascarado")
  private String cartaoMascarado = null;
  @SerializedName("codigoAutorizacao")
  private String codigoAutorizacao = null;
  @SerializedName("codigoMCC")
  private Long codigoMCC = null;
  @SerializedName("codigoMoedaDestino")
  private String codigoMoedaDestino = null;
  @SerializedName("codigoMoedaOrigem")
  private String codigoMoedaOrigem = null;
  @SerializedName("codigoReferencia")
  private String codigoReferencia = null;
  @SerializedName("codigoTerminal")
  private String codigoTerminal = null;
  @SerializedName("cotacaoUSD")
  private BigDecimal cotacaoUSD = null;
  @SerializedName("dataCotacaoUSD")
  private String dataCotacaoUSD = null;
  @SerializedName("dataFaturamento")
  private String dataFaturamento = null;
  @SerializedName("dataOrigem")
  private String dataOrigem = null;
  @SerializedName("dataVencimentoReal")
  private String dataVencimentoReal = null;
  @SerializedName("descricaoAbreviada")
  private String descricaoAbreviada = null;
  @SerializedName("descricaoTipoTransacaoNaoProcessada")
  private String descricaoTipoTransacaoNaoProcessada = null;
  @SerializedName("detalhesTransacao")
  private String detalhesTransacao = null;
  @SerializedName("flagCredito")
  private Integer flagCredito = null;
  @SerializedName("flagFaturado")
  private Integer flagFaturado = null;
  @SerializedName("grupoDescricaoMCC")
  private String grupoDescricaoMCC = null;
  @SerializedName("grupoMCC")
  private Long grupoMCC = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idEstabelecimento")
  private Long idEstabelecimento = null;
  @SerializedName("idTipoTransacaoNaoProcessada")
  private Long idTipoTransacaoNaoProcessada = null;
  @SerializedName("idTransacaoEstorno")
  private Long idTransacaoEstorno = null;
  @SerializedName("localidadeEstabelecimento")
  private String localidadeEstabelecimento = null;
  @SerializedName("modoEntradaTransacao")
  private String modoEntradaTransacao = null;
  @SerializedName("nomeEstabelecimento")
  private String nomeEstabelecimento = null;
  @SerializedName("nomeFantasiaEstabelecimento")
  private String nomeFantasiaEstabelecimento = null;
  @SerializedName("nomePortador")
  private String nomePortador = null;
  @SerializedName("parcela")
  private Long parcela = null;
  @SerializedName("plano")
  private Long plano = null;
  @SerializedName("status")
  private Integer status = null;
  @SerializedName("taxaEmbarque")
  private BigDecimal taxaEmbarque = null;
  @SerializedName("valorBRL")
  private BigDecimal valorBRL = null;
  @SerializedName("valorEntrada")
  private BigDecimal valorEntrada = null;
  @SerializedName("valorUSD")
  private BigDecimal valorUSD = null;

  
  /**
   * Card Number in format 0000XXXXXXXX0000
   **/
  @ApiModelProperty(value = "Card Number in format 0000XXXXXXXX0000")
  public String getCartaoMascarado() {
    return cartaoMascarado;
  }
  public void setCartaoMascarado(String cartaoMascarado) {
    this.cartaoMascarado = cartaoMascarado;
  }

  
  /**
   * Authorization Code of the transaction
   **/
  @ApiModelProperty(value = "Authorization Code of the transaction")
  public String getCodigoAutorizacao() {
    return codigoAutorizacao;
  }
  public void setCodigoAutorizacao(String codigoAutorizacao) {
    this.codigoAutorizacao = codigoAutorizacao;
  }

  
  /**
   * Identification Code of the Merchant Category
   **/
  @ApiModelProperty(value = "Identification Code of the Merchant Category")
  public Long getCodigoMCC() {
    return codigoMCC;
  }
  public void setCodigoMCC(Long codigoMCC) {
    this.codigoMCC = codigoMCC;
  }

  
  /**
   * Identification Code of the transaction currency after the conversion, following standard ISO 4217
   **/
  @ApiModelProperty(value = "Identification Code of the transaction currency after the conversion, following standard ISO 4217")
  public String getCodigoMoedaDestino() {
    return codigoMoedaDestino;
  }
  public void setCodigoMoedaDestino(String codigoMoedaDestino) {
    this.codigoMoedaDestino = codigoMoedaDestino;
  }

  
  /**
   * Identification Code of the Currency used in the transaction, following standard ISO 4217
   **/
  @ApiModelProperty(value = "Identification Code of the Currency used in the transaction, following standard ISO 4217")
  public String getCodigoMoedaOrigem() {
    return codigoMoedaOrigem;
  }
  public void setCodigoMoedaOrigem(String codigoMoedaOrigem) {
    this.codigoMoedaOrigem = codigoMoedaOrigem;
  }

  
  /**
   * Reference Code of the Transaction when used Flagged Card
   **/
  @ApiModelProperty(value = "Reference Code of the Transaction when used Flagged Card")
  public String getCodigoReferencia() {
    return codigoReferencia;
  }
  public void setCodigoReferencia(String codigoReferencia) {
    this.codigoReferencia = codigoReferencia;
  }

  
  /**
   * Identification Code of the Transaction Capture Source
   **/
  @ApiModelProperty(value = "Identification Code of the Transaction Capture Source")
  public String getCodigoTerminal() {
    return codigoTerminal;
  }
  public void setCodigoTerminal(String codigoTerminal) {
    this.codigoTerminal = codigoTerminal;
  }

  
  /**
   * Value of the American Dollar (USD) converted in Real (BRL)
   **/
  @ApiModelProperty(value = "Value of the American Dollar (USD) converted in Real (BRL)")
  public BigDecimal getCotacaoUSD() {
    return cotacaoUSD;
  }
  public void setCotacaoUSD(BigDecimal cotacaoUSD) {
    this.cotacaoUSD = cotacaoUSD;
  }

  
  /**
   * Closing date of quotation of the American Dollar (USD)
   **/
  @ApiModelProperty(value = "Closing date of quotation of the American Dollar (USD)")
  public String getDataCotacaoUSD() {
    return dataCotacaoUSD;
  }
  public void setDataCotacaoUSD(String dataCotacaoUSD) {
    this.dataCotacaoUSD = dataCotacaoUSD;
  }

  
  /**
   * Billing date of the transaction
   **/
  @ApiModelProperty(value = "Billing date of the transaction")
  public String getDataFaturamento() {
    return dataFaturamento;
  }
  public void setDataFaturamento(String dataFaturamento) {
    this.dataFaturamento = dataFaturamento;
  }

  
  /**
   * Date which the transaction was made
   **/
  @ApiModelProperty(value = "Date which the transaction was made")
  public String getDataOrigem() {
    return dataOrigem;
  }
  public void setDataOrigem(String dataOrigem) {
    this.dataOrigem = dataOrigem;
  }

  
  /**
   * Expiration date of the invoice
   **/
  @ApiModelProperty(value = "Expiration date of the invoice")
  public String getDataVencimentoReal() {
    return dataVencimentoReal;
  }
  public void setDataVencimentoReal(String dataVencimentoReal) {
    this.dataVencimentoReal = dataVencimentoReal;
  }

  
  /**
   * Abbreviated Description of the transactions
   **/
  @ApiModelProperty(value = "Abbreviated Description of the transactions")
  public String getDescricaoAbreviada() {
    return descricaoAbreviada;
  }
  public void setDescricaoAbreviada(String descricaoAbreviada) {
    this.descricaoAbreviada = descricaoAbreviada;
  }

  
  /**
   * Description of the transaction type not processed
   **/
  @ApiModelProperty(value = "Description of the transaction type not processed")
  public String getDescricaoTipoTransacaoNaoProcessada() {
    return descricaoTipoTransacaoNaoProcessada;
  }
  public void setDescricaoTipoTransacaoNaoProcessada(String descricaoTipoTransacaoNaoProcessada) {
    this.descricaoTipoTransacaoNaoProcessada = descricaoTipoTransacaoNaoProcessada;
  }

  
  /**
   * Complementary details regarding the transaction
   **/
  @ApiModelProperty(value = "Complementary details regarding the transaction")
  public String getDetalhesTransacao() {
    return detalhesTransacao;
  }
  public void setDetalhesTransacao(String detalhesTransacao) {
    this.detalhesTransacao = detalhesTransacao;
  }

  
  /**
   * When it is activate, indicate that the transaction is the credit type
   **/
  @ApiModelProperty(value = "When it is activate, indicate that the transaction is the credit type")
  public Integer getFlagCredito() {
    return flagCredito;
  }
  public void setFlagCredito(Integer flagCredito) {
    this.flagCredito = flagCredito;
  }

  
  /**
   * When it is activate, indicates that the transaction was consolidated in an invoice
   **/
  @ApiModelProperty(value = "When it is activate, indicates that the transaction was consolidated in an invoice")
  public Integer getFlagFaturado() {
    return flagFaturado;
  }
  public void setFlagFaturado(Integer flagFaturado) {
    this.flagFaturado = flagFaturado;
  }

  
  /**
   * Description of the Merchant Group
   **/
  @ApiModelProperty(value = "Description of the Merchant Group")
  public String getGrupoDescricaoMCC() {
    return grupoDescricaoMCC;
  }
  public void setGrupoDescricaoMCC(String grupoDescricaoMCC) {
    this.grupoDescricaoMCC = grupoDescricaoMCC;
  }

  
  /**
   * Identification Code of the Merchant Group
   **/
  @ApiModelProperty(value = "Identification Code of the Merchant Group")
  public Long getGrupoMCC() {
    return grupoMCC;
  }
  public void setGrupoMCC(Long grupoMCC) {
    this.grupoMCC = grupoMCC;
  }

  
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
   * Identification Code of the Merchant (id)
   **/
  @ApiModelProperty(value = "Identification Code of the Merchant (id)")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * Identification Code of the Transaction type
   **/
  @ApiModelProperty(value = "Identification Code of the Transaction type")
  public Long getIdTipoTransacaoNaoProcessada() {
    return idTipoTransacaoNaoProcessada;
  }
  public void setIdTipoTransacaoNaoProcessada(Long idTipoTransacaoNaoProcessada) {
    this.idTipoTransacaoNaoProcessada = idTipoTransacaoNaoProcessada;
  }

  
  /**
   * Identification Code of the Transaction (id) that generated the reversal
   **/
  @ApiModelProperty(value = "Identification Code of the Transaction (id) that generated the reversal")
  public Long getIdTransacaoEstorno() {
    return idTransacaoEstorno;
  }
  public void setIdTransacaoEstorno(Long idTransacaoEstorno) {
    this.idTransacaoEstorno = idTransacaoEstorno;
  }

  
  /**
   * Merchant location
   **/
  @ApiModelProperty(value = "Merchant location")
  public String getLocalidadeEstabelecimento() {
    return localidadeEstabelecimento;
  }
  public void setLocalidadeEstabelecimento(String localidadeEstabelecimento) {
    this.localidadeEstabelecimento = localidadeEstabelecimento;
  }

  
  /**
   * Describe the mode used to perform the card dates reading to make the transaction
   **/
  @ApiModelProperty(value = "Describe the mode used to perform the card dates reading to make the transaction")
  public String getModoEntradaTransacao() {
    return modoEntradaTransacao;
  }
  public void setModoEntradaTransacao(String modoEntradaTransacao) {
    this.modoEntradaTransacao = modoEntradaTransacao;
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
   * Fantasy name of the Merchant
   **/
  @ApiModelProperty(value = "Fantasy name of the Merchant")
  public String getNomeFantasiaEstabelecimento() {
    return nomeFantasiaEstabelecimento;
  }
  public void setNomeFantasiaEstabelecimento(String nomeFantasiaEstabelecimento) {
    this.nomeFantasiaEstabelecimento = nomeFantasiaEstabelecimento;
  }

  
  /**
   * Full name of the Cardholder
   **/
  @ApiModelProperty(value = "Full name of the Cardholder")
  public String getNomePortador() {
    return nomePortador;
  }
  public void setNomePortador(String nomePortador) {
    this.nomePortador = nomePortador;
  }

  
  /**
   * When the transaction is the installment type, show the number of the Parcels
   **/
  @ApiModelProperty(value = "When the transaction is the installment type, show the number of the Parcels")
  public Long getParcela() {
    return parcela;
  }
  public void setParcela(Long parcela) {
    this.parcela = parcela;
  }

  
  /**
   * When the transaction is the Installment type, show the total number of the parcels
   **/
  @ApiModelProperty(value = "When the transaction is the Installment type, show the total number of the parcels")
  public Long getPlano() {
    return plano;
  }
  public void setPlano(Long plano) {
    this.plano = plano;
  }

  
  /**
   * Attributed that represents the identifier code of the transaction status
   **/
  @ApiModelProperty(value = "Attributed that represents the identifier code of the transaction status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * Value of the Boarding fee in Real (BRL) when the transaction is related to the purchase of airline tickets
   **/
  @ApiModelProperty(value = "Value of the Boarding fee in Real (BRL) when the transaction is related to the purchase of airline tickets")
  public BigDecimal getTaxaEmbarque() {
    return taxaEmbarque;
  }
  public void setTaxaEmbarque(BigDecimal taxaEmbarque) {
    this.taxaEmbarque = taxaEmbarque;
  }

  
  /**
   * Transaction value in Real (BRL)
   **/
  @ApiModelProperty(value = "Transaction value in Real (BRL)")
  public BigDecimal getValorBRL() {
    return valorBRL;
  }
  public void setValorBRL(BigDecimal valorBRL) {
    this.valorBRL = valorBRL;
  }

  
  /**
   * Entrance value in Real (BRL) when the transaction is installment type with the payment of an entrance value
   **/
  @ApiModelProperty(value = "Entrance value in Real (BRL) when the transaction is installment type with the payment of an entrance value")
  public BigDecimal getValorEntrada() {
    return valorEntrada;
  }
  public void setValorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
  }

  
  /**
   * Transaction value in American Dollar (USD)
   **/
  @ApiModelProperty(value = "Transaction value in American Dollar (USD)")
  public BigDecimal getValorUSD() {
    return valorUSD;
  }
  public void setValorUSD(BigDecimal valorUSD) {
    this.valorUSD = valorUSD;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransacaoNaoProcessadaResponse {\n");
    
    sb.append("  cartaoMascarado: ").append(cartaoMascarado).append("\n");
    sb.append("  codigoAutorizacao: ").append(codigoAutorizacao).append("\n");
    sb.append("  codigoMCC: ").append(codigoMCC).append("\n");
    sb.append("  codigoMoedaDestino: ").append(codigoMoedaDestino).append("\n");
    sb.append("  codigoMoedaOrigem: ").append(codigoMoedaOrigem).append("\n");
    sb.append("  codigoReferencia: ").append(codigoReferencia).append("\n");
    sb.append("  codigoTerminal: ").append(codigoTerminal).append("\n");
    sb.append("  cotacaoUSD: ").append(cotacaoUSD).append("\n");
    sb.append("  dataCotacaoUSD: ").append(dataCotacaoUSD).append("\n");
    sb.append("  dataFaturamento: ").append(dataFaturamento).append("\n");
    sb.append("  dataOrigem: ").append(dataOrigem).append("\n");
    sb.append("  dataVencimentoReal: ").append(dataVencimentoReal).append("\n");
    sb.append("  descricaoAbreviada: ").append(descricaoAbreviada).append("\n");
    sb.append("  descricaoTipoTransacaoNaoProcessada: ").append(descricaoTipoTransacaoNaoProcessada).append("\n");
    sb.append("  detalhesTransacao: ").append(detalhesTransacao).append("\n");
    sb.append("  flagCredito: ").append(flagCredito).append("\n");
    sb.append("  flagFaturado: ").append(flagFaturado).append("\n");
    sb.append("  grupoDescricaoMCC: ").append(grupoDescricaoMCC).append("\n");
    sb.append("  grupoMCC: ").append(grupoMCC).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idEstabelecimento: ").append(idEstabelecimento).append("\n");
    sb.append("  idTipoTransacaoNaoProcessada: ").append(idTipoTransacaoNaoProcessada).append("\n");
    sb.append("  idTransacaoEstorno: ").append(idTransacaoEstorno).append("\n");
    sb.append("  localidadeEstabelecimento: ").append(localidadeEstabelecimento).append("\n");
    sb.append("  modoEntradaTransacao: ").append(modoEntradaTransacao).append("\n");
    sb.append("  nomeEstabelecimento: ").append(nomeEstabelecimento).append("\n");
    sb.append("  nomeFantasiaEstabelecimento: ").append(nomeFantasiaEstabelecimento).append("\n");
    sb.append("  nomePortador: ").append(nomePortador).append("\n");
    sb.append("  parcela: ").append(parcela).append("\n");
    sb.append("  plano: ").append(plano).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  taxaEmbarque: ").append(taxaEmbarque).append("\n");
    sb.append("  valorBRL: ").append(valorBRL).append("\n");
    sb.append("  valorEntrada: ").append(valorEntrada).append("\n");
    sb.append("  valorUSD: ").append(valorUSD).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
