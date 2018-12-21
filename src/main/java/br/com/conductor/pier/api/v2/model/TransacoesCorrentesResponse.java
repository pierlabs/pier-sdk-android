package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object current transactions
 **/
@ApiModel(description = "Object current transactions")
public class TransacoesCorrentesResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idTipoTransacao")
  private Long idTipoTransacao = null;
  @SerializedName("descricaoAbreviada")
  private String descricaoAbreviada = null;
  @SerializedName("statusTransacao")
  private String statusTransacao = null;
  @SerializedName("idEvento")
  private Long idEvento = null;
  @SerializedName("tipoEvento")
  private String tipoEvento = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("cartaoMascarado")
  private String cartaoMascarado = null;
  @SerializedName("nomePortador")
  private String nomePortador = null;
  @SerializedName("dataTransacao")
  private String dataTransacao = null;
  @SerializedName("dataFaturamento")
  private String dataFaturamento = null;
  @SerializedName("dataVencimento")
  private String dataVencimento = null;
  @SerializedName("modoEntradaTransacao")
  private String modoEntradaTransacao = null;
  @SerializedName("valorTaxaEmbarque")
  private BigDecimal valorTaxaEmbarque = null;
  @SerializedName("valorEntrada")
  private BigDecimal valorEntrada = null;
  @SerializedName("valorBRL")
  private BigDecimal valorBRL = null;
  @SerializedName("valorUSD")
  private BigDecimal valorUSD = null;
  @SerializedName("cotacaoUSD")
  private BigDecimal cotacaoUSD = null;
  @SerializedName("dataCotacaoUSD")
  private String dataCotacaoUSD = null;
  @SerializedName("codigoMoedaOrigem")
  private String codigoMoedaOrigem = null;
  @SerializedName("codigoMoedaDestino")
  private String codigoMoedaDestino = null;
  @SerializedName("codigoAutorizacao")
  private String codigoAutorizacao = null;
  @SerializedName("codigoReferencia")
  private String codigoReferencia = null;
  @SerializedName("codigoTerminal")
  private String codigoTerminal = null;
  @SerializedName("codigoMCC")
  private Long codigoMCC = null;
  @SerializedName("grupoMCC")
  private Long grupoMCC = null;
  @SerializedName("grupoDescricaoMCC")
  private String grupoDescricaoMCC = null;
  @SerializedName("idEstabelecimento")
  private Long idEstabelecimento = null;
  @SerializedName("nomeEstabelecimento")
  private String nomeEstabelecimento = null;
  @SerializedName("nomeFantasiaEstabelecimento")
  private String nomeFantasiaEstabelecimento = null;
  @SerializedName("localidadeEstabelecimento")
  private String localidadeEstabelecimento = null;
  @SerializedName("planoParcelamento")
  private Long planoParcelamento = null;
  @SerializedName("numeroParcela")
  private Long numeroParcela = null;
  @SerializedName("detalhesTransacao")
  private String detalhesTransacao = null;
  @SerializedName("flagCredito")
  private Integer flagCredito = null;
  @SerializedName("flagFaturado")
  private Integer flagFaturado = null;
  @SerializedName("flagEstorno")
  private Integer flagEstorno = null;
  @SerializedName("idTransacaoEstorno")
  private Long idTransacaoEstorno = null;

  
  /**
   * Indentification Code of the transfer (id)
   **/
  @ApiModelProperty(value = "Indentification Code of the transfer (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identification Code of the Transaction Type
   **/
  @ApiModelProperty(value = "Identification Code of the Transaction Type")
  public Long getIdTipoTransacao() {
    return idTipoTransacao;
  }
  public void setIdTipoTransacao(Long idTipoTransacao) {
    this.idTipoTransacao = idTipoTransacao;
  }

  
  /**
   * Abbreviated description of the transaction
   **/
  @ApiModelProperty(value = "Abbreviated description of the transaction")
  public String getDescricaoAbreviada() {
    return descricaoAbreviada;
  }
  public void setDescricaoAbreviada(String descricaoAbreviada) {
    this.descricaoAbreviada = descricaoAbreviada;
  }

  
  /**
   * Processing Status of the Transaction
   **/
  @ApiModelProperty(value = "Processing Status of the Transaction")
  public String getStatusTransacao() {
    return statusTransacao;
  }
  public void setStatusTransacao(String statusTransacao) {
    this.statusTransacao = statusTransacao;
  }

  
  /**
   * Identification Code of the Event that originated the transaction (id)
   **/
  @ApiModelProperty(value = "Identification Code of the Event that originated the transaction (id)")
  public Long getIdEvento() {
    return idEvento;
  }
  public void setIdEvento(Long idEvento) {
    this.idEvento = idEvento;
  }

  
  /**
   * Description of the Event that represents the transaction
   **/
  @ApiModelProperty(value = "Description of the Event that represents the transaction")
  public String getTipoEvento() {
    return tipoEvento;
  }
  public void setTipoEvento(String tipoEvento) {
    this.tipoEvento = tipoEvento;
  }

  
  /**
   * Identifcation Code of the Account (id)
   **/
  @ApiModelProperty(value = "Identifcation Code of the Account (id)")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Number of the card in format 0000XXXXXXXX0000
   **/
  @ApiModelProperty(value = "Number of the card in format 0000XXXXXXXX0000")
  public String getCartaoMascarado() {
    return cartaoMascarado;
  }
  public void setCartaoMascarado(String cartaoMascarado) {
    this.cartaoMascarado = cartaoMascarado;
  }

  
  /**
   * Full name of the card holder
   **/
  @ApiModelProperty(value = "Full name of the card holder")
  public String getNomePortador() {
    return nomePortador;
  }
  public void setNomePortador(String nomePortador) {
    this.nomePortador = nomePortador;
  }

  
  /**
   * Date which the transaction was made
   **/
  @ApiModelProperty(value = "Date which the transaction was made")
  public String getDataTransacao() {
    return dataTransacao;
  }
  public void setDataTransacao(String dataTransacao) {
    this.dataTransacao = dataTransacao;
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
   * Expiration date of the invoice
   **/
  @ApiModelProperty(value = "Expiration date of the invoice")
  public String getDataVencimento() {
    return dataVencimento;
  }
  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  
  /**
   * Describe the mode used to do the card dates reading to make the transaction
   **/
  @ApiModelProperty(value = "Describe the mode used to do the card dates reading to make the transaction")
  public String getModoEntradaTransacao() {
    return modoEntradaTransacao;
  }
  public void setModoEntradaTransacao(String modoEntradaTransacao) {
    this.modoEntradaTransacao = modoEntradaTransacao;
  }

  
  /**
   * Value of the Boarding fee in Real (BRL) when the transaction is related to a purchase of airline tickets
   **/
  @ApiModelProperty(value = "Value of the Boarding fee in Real (BRL) when the transaction is related to a purchase of airline tickets")
  public BigDecimal getValorTaxaEmbarque() {
    return valorTaxaEmbarque;
  }
  public void setValorTaxaEmbarque(BigDecimal valorTaxaEmbarque) {
    this.valorTaxaEmbarque = valorTaxaEmbarque;
  }

  
  /**
   * Value of the entrance in Real (BRL) when the transaction if the transaction is the installment type with the payment of an entrance value
   **/
  @ApiModelProperty(value = "Value of the entrance in Real (BRL) when the transaction if the transaction is the installment type with the payment of an entrance value")
  public BigDecimal getValorEntrada() {
    return valorEntrada;
  }
  public void setValorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
  }

  
  /**
   * Value of the Transaction in Real (BRL)
   **/
  @ApiModelProperty(value = "Value of the Transaction in Real (BRL)")
  public BigDecimal getValorBRL() {
    return valorBRL;
  }
  public void setValorBRL(BigDecimal valorBRL) {
    this.valorBRL = valorBRL;
  }

  
  /**
   * Value of the transaction in American Dollar (USD)
   **/
  @ApiModelProperty(value = "Value of the transaction in American Dollar (USD)")
  public BigDecimal getValorUSD() {
    return valorUSD;
  }
  public void setValorUSD(BigDecimal valorUSD) {
    this.valorUSD = valorUSD;
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
   * Closing date quotation of the American Dollar (USD)
   **/
  @ApiModelProperty(value = "Closing date quotation of the American Dollar (USD)")
  public String getDataCotacaoUSD() {
    return dataCotacaoUSD;
  }
  public void setDataCotacaoUSD(String dataCotacaoUSD) {
    this.dataCotacaoUSD = dataCotacaoUSD;
  }

  
  /**
   * Identification Code of the currency used in the transaction, following the standard ISO 4217
   **/
  @ApiModelProperty(value = "Identification Code of the currency used in the transaction, following the standard ISO 4217")
  public String getCodigoMoedaOrigem() {
    return codigoMoedaOrigem;
  }
  public void setCodigoMoedaOrigem(String codigoMoedaOrigem) {
    this.codigoMoedaOrigem = codigoMoedaOrigem;
  }

  
  /**
   * Identification Code of the transaction currency after the conversion, sollowing the standard ISO 4217
   **/
  @ApiModelProperty(value = "Identification Code of the transaction currency after the conversion, sollowing the standard ISO 4217")
  public String getCodigoMoedaDestino() {
    return codigoMoedaDestino;
  }
  public void setCodigoMoedaDestino(String codigoMoedaDestino) {
    this.codigoMoedaDestino = codigoMoedaDestino;
  }

  
  /**
   * Authorization Code of the Transaction
   **/
  @ApiModelProperty(value = "Authorization Code of the Transaction")
  public String getCodigoAutorizacao() {
    return codigoAutorizacao;
  }
  public void setCodigoAutorizacao(String codigoAutorizacao) {
    this.codigoAutorizacao = codigoAutorizacao;
  }

  
  /**
   * Reference Code of the Transaction when it is used a Flagged Card
   **/
  @ApiModelProperty(value = "Reference Code of the Transaction when it is used a Flagged Card")
  public String getCodigoReferencia() {
    return codigoReferencia;
  }
  public void setCodigoReferencia(String codigoReferencia) {
    this.codigoReferencia = codigoReferencia;
  }

  
  /**
   * Identification Code of the transaction capture source
   **/
  @ApiModelProperty(value = "Identification Code of the transaction capture source")
  public String getCodigoTerminal() {
    return codigoTerminal;
  }
  public void setCodigoTerminal(String codigoTerminal) {
    this.codigoTerminal = codigoTerminal;
  }

  
  /**
   * Identification Code of the Merchant category
   **/
  @ApiModelProperty(value = "Identification Code of the Merchant category")
  public Long getCodigoMCC() {
    return codigoMCC;
  }
  public void setCodigoMCC(Long codigoMCC) {
    this.codigoMCC = codigoMCC;
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
   * Merchant name
   **/
  @ApiModelProperty(value = "Merchant name")
  public String getNomeEstabelecimento() {
    return nomeEstabelecimento;
  }
  public void setNomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
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
   * Merchant Location
   **/
  @ApiModelProperty(value = "Merchant Location")
  public String getLocalidadeEstabelecimento() {
    return localidadeEstabelecimento;
  }
  public void setLocalidadeEstabelecimento(String localidadeEstabelecimento) {
    this.localidadeEstabelecimento = localidadeEstabelecimento;
  }

  
  /**
   * When the transaction is the installment type, show the total number of the parcels
   **/
  @ApiModelProperty(value = "When the transaction is the installment type, show the total number of the parcels")
  public Long getPlanoParcelamento() {
    return planoParcelamento;
  }
  public void setPlanoParcelamento(Long planoParcelamento) {
    this.planoParcelamento = planoParcelamento;
  }

  
  /**
   * When the transaction is the istallment type, show the number of Parcels
   **/
  @ApiModelProperty(value = "When the transaction is the istallment type, show the number of Parcels")
  public Long getNumeroParcela() {
    return numeroParcela;
  }
  public void setNumeroParcela(Long numeroParcela) {
    this.numeroParcela = numeroParcela;
  }

  
  /**
   * Complementary details regard to the transaction
   **/
  @ApiModelProperty(value = "Complementary details regard to the transaction")
  public String getDetalhesTransacao() {
    return detalhesTransacao;
  }
  public void setDetalhesTransacao(String detalhesTransacao) {
    this.detalhesTransacao = detalhesTransacao;
  }

  
  /**
   * When it is activate, indicate that the transaction is the 'Credit' type
   **/
  @ApiModelProperty(value = "When it is activate, indicate that the transaction is the 'Credit' type")
  public Integer getFlagCredito() {
    return flagCredito;
  }
  public void setFlagCredito(Integer flagCredito) {
    this.flagCredito = flagCredito;
  }

  
  /**
   * When it is activate, indicate that the transaction was consolidated in an invoice
   **/
  @ApiModelProperty(value = "When it is activate, indicate that the transaction was consolidated in an invoice")
  public Integer getFlagFaturado() {
    return flagFaturado;
  }
  public void setFlagFaturado(Integer flagFaturado) {
    this.flagFaturado = flagFaturado;
  }

  
  /**
   * When it is activate, indicates that the transaction was reversed
   **/
  @ApiModelProperty(value = "When it is activate, indicates that the transaction was reversed")
  public Integer getFlagEstorno() {
    return flagEstorno;
  }
  public void setFlagEstorno(Integer flagEstorno) {
    this.flagEstorno = flagEstorno;
  }

  
  /**
   * Identification Code of the transaction (id) that generated the reversal
   **/
  @ApiModelProperty(value = "Identification Code of the transaction (id) that generated the reversal")
  public Long getIdTransacaoEstorno() {
    return idTransacaoEstorno;
  }
  public void setIdTransacaoEstorno(Long idTransacaoEstorno) {
    this.idTransacaoEstorno = idTransacaoEstorno;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransacoesCorrentesResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idTipoTransacao: ").append(idTipoTransacao).append("\n");
    sb.append("  descricaoAbreviada: ").append(descricaoAbreviada).append("\n");
    sb.append("  statusTransacao: ").append(statusTransacao).append("\n");
    sb.append("  idEvento: ").append(idEvento).append("\n");
    sb.append("  tipoEvento: ").append(tipoEvento).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  cartaoMascarado: ").append(cartaoMascarado).append("\n");
    sb.append("  nomePortador: ").append(nomePortador).append("\n");
    sb.append("  dataTransacao: ").append(dataTransacao).append("\n");
    sb.append("  dataFaturamento: ").append(dataFaturamento).append("\n");
    sb.append("  dataVencimento: ").append(dataVencimento).append("\n");
    sb.append("  modoEntradaTransacao: ").append(modoEntradaTransacao).append("\n");
    sb.append("  valorTaxaEmbarque: ").append(valorTaxaEmbarque).append("\n");
    sb.append("  valorEntrada: ").append(valorEntrada).append("\n");
    sb.append("  valorBRL: ").append(valorBRL).append("\n");
    sb.append("  valorUSD: ").append(valorUSD).append("\n");
    sb.append("  cotacaoUSD: ").append(cotacaoUSD).append("\n");
    sb.append("  dataCotacaoUSD: ").append(dataCotacaoUSD).append("\n");
    sb.append("  codigoMoedaOrigem: ").append(codigoMoedaOrigem).append("\n");
    sb.append("  codigoMoedaDestino: ").append(codigoMoedaDestino).append("\n");
    sb.append("  codigoAutorizacao: ").append(codigoAutorizacao).append("\n");
    sb.append("  codigoReferencia: ").append(codigoReferencia).append("\n");
    sb.append("  codigoTerminal: ").append(codigoTerminal).append("\n");
    sb.append("  codigoMCC: ").append(codigoMCC).append("\n");
    sb.append("  grupoMCC: ").append(grupoMCC).append("\n");
    sb.append("  grupoDescricaoMCC: ").append(grupoDescricaoMCC).append("\n");
    sb.append("  idEstabelecimento: ").append(idEstabelecimento).append("\n");
    sb.append("  nomeEstabelecimento: ").append(nomeEstabelecimento).append("\n");
    sb.append("  nomeFantasiaEstabelecimento: ").append(nomeFantasiaEstabelecimento).append("\n");
    sb.append("  localidadeEstabelecimento: ").append(localidadeEstabelecimento).append("\n");
    sb.append("  planoParcelamento: ").append(planoParcelamento).append("\n");
    sb.append("  numeroParcela: ").append(numeroParcela).append("\n");
    sb.append("  detalhesTransacao: ").append(detalhesTransacao).append("\n");
    sb.append("  flagCredito: ").append(flagCredito).append("\n");
    sb.append("  flagFaturado: ").append(flagFaturado).append("\n");
    sb.append("  flagEstorno: ").append(flagEstorno).append("\n");
    sb.append("  idTransacaoEstorno: ").append(idTransacaoEstorno).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
