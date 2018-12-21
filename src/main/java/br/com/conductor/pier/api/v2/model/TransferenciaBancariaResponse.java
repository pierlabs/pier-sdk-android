package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Bank transfer
 **/
@ApiModel(description = "Bank transfer")
public class TransferenciaBancariaResponse  {
  
  @SerializedName("nsuorigem")
  private Long nsuorigem = null;
  @SerializedName("idAutorizacao")
  private Long idAutorizacao = null;
  @SerializedName("idTransferencia")
  private Long idTransferencia = null;
  @SerializedName("codigoAutorizacao")
  private String codigoAutorizacao = null;
  @SerializedName("dataAutorizacao")
  private String dataAutorizacao = null;
  @SerializedName("origem")
  private String origem = null;
  @SerializedName("valor")
  private BigDecimal valor = null;
  @SerializedName("idOperacao")
  private Long idOperacao = null;
  @SerializedName("terminal")
  private String terminal = null;
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("dataCompra")
  private String dataCompra = null;
  @SerializedName("valorCompra")
  private BigDecimal valorCompra = null;
  @SerializedName("numeroParcelas")
  private Integer numeroParcelas = null;
  @SerializedName("valorParcela")
  private BigDecimal valorParcela = null;
  @SerializedName("idEstabelecimento")
  private Long idEstabelecimento = null;
  @SerializedName("dataMovimento")
  private String dataMovimento = null;
  @SerializedName("valorContrato")
  private BigDecimal valorContrato = null;
  @SerializedName("taxaJuros")
  private BigDecimal taxaJuros = null;
  @SerializedName("valorIOF")
  private BigDecimal valorIOF = null;
  @SerializedName("valorTAC")
  private BigDecimal valorTAC = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("valorEntrada")
  private BigDecimal valorEntrada = null;
  @SerializedName("dataVencimentoReal")
  private String dataVencimentoReal = null;
  @SerializedName("dataVencimentoPadrao")
  private String dataVencimentoPadrao = null;
  @SerializedName("idContaPortador")
  private Long idContaPortador = null;
  @SerializedName("numeroEstabelecimento")
  private Long numeroEstabelecimento = null;
  @SerializedName("valorTaxaSaque")
  private BigDecimal valorTaxaSaque = null;
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
  @SerializedName("documentoFavorecido")
  private String documentoFavorecido = null;
  @SerializedName("nomeFavorecido")
  private String nomeFavorecido = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getNsuorigem() {
    return nsuorigem;
  }
  public void setNsuorigem(Long nsuorigem) {
    this.nsuorigem = nsuorigem;
  }

  
  /**
   * Identification Code of the Authorization (id)
   **/
  @ApiModelProperty(value = "Identification Code of the Authorization (id)")
  public Long getIdAutorizacao() {
    return idAutorizacao;
  }
  public void setIdAutorizacao(Long idAutorizacao) {
    this.idAutorizacao = idAutorizacao;
  }

  
  /**
   * Identification Code of the transfer (id)
   **/
  @ApiModelProperty(value = "Identification Code of the transfer (id)")
  public Long getIdTransferencia() {
    return idTransferencia;
  }
  public void setIdTransferencia(Long idTransferencia) {
    this.idTransferencia = idTransferencia;
  }

  
  /**
   * Authorization Code
   **/
  @ApiModelProperty(value = "Authorization Code")
  public String getCodigoAutorizacao() {
    return codigoAutorizacao;
  }
  public void setCodigoAutorizacao(String codigoAutorizacao) {
    this.codigoAutorizacao = codigoAutorizacao;
  }

  
  /**
   * Date of the authorization
   **/
  @ApiModelProperty(value = "Date of the authorization")
  public String getDataAutorizacao() {
    return dataAutorizacao;
  }
  public void setDataAutorizacao(String dataAutorizacao) {
    this.dataAutorizacao = dataAutorizacao;
  }

  
  /**
   * Origin
   **/
  @ApiModelProperty(value = "Origin")
  public String getOrigem() {
    return origem;
  }
  public void setOrigem(String origem) {
    this.origem = origem;
  }

  
  /**
   * Value
   **/
  @ApiModelProperty(value = "Value")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * Identification type of the operation type (id)
   **/
  @ApiModelProperty(value = "Identification type of the operation type (id)")
  public Long getIdOperacao() {
    return idOperacao;
  }
  public void setIdOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
  }

  
  /**
   * Terminal
   **/
  @ApiModelProperty(value = "Terminal")
  public String getTerminal() {
    return terminal;
  }
  public void setTerminal(String terminal) {
    this.terminal = terminal;
  }

  
  /**
   * Identification code of the card (id)
   **/
  @ApiModelProperty(value = "Identification code of the card (id)")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Date of the transfer
   **/
  @ApiModelProperty(value = "Date of the transfer")
  public String getDataCompra() {
    return dataCompra;
  }
  public void setDataCompra(String dataCompra) {
    this.dataCompra = dataCompra;
  }

  
  /**
   * Value of the transfer
   **/
  @ApiModelProperty(value = "Value of the transfer")
  public BigDecimal getValorCompra() {
    return valorCompra;
  }
  public void setValorCompra(BigDecimal valorCompra) {
    this.valorCompra = valorCompra;
  }

  
  /**
   * Number of parcels
   **/
  @ApiModelProperty(value = "Number of parcels")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * Value of the parcel
   **/
  @ApiModelProperty(value = "Value of the parcel")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
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
   * Date of the movement
   **/
  @ApiModelProperty(value = "Date of the movement")
  public String getDataMovimento() {
    return dataMovimento;
  }
  public void setDataMovimento(String dataMovimento) {
    this.dataMovimento = dataMovimento;
  }

  
  /**
   * Transfer value added to the withdrawal rate value if there is withdrawal rate
   **/
  @ApiModelProperty(value = "Transfer value added to the withdrawal rate value if there is withdrawal rate")
  public BigDecimal getValorContrato() {
    return valorContrato;
  }
  public void setValorContrato(BigDecimal valorContrato) {
    this.valorContrato = valorContrato;
  }

  
  /**
   * Percentage of interest
   **/
  @ApiModelProperty(value = "Percentage of interest")
  public BigDecimal getTaxaJuros() {
    return taxaJuros;
  }
  public void setTaxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
  }

  
  /**
   * Value of the IOF
   **/
  @ApiModelProperty(value = "Value of the IOF")
  public BigDecimal getValorIOF() {
    return valorIOF;
  }
  public void setValorIOF(BigDecimal valorIOF) {
    this.valorIOF = valorIOF;
  }

  
  /**
   * Value of the TAC
   **/
  @ApiModelProperty(value = "Value of the TAC")
  public BigDecimal getValorTAC() {
    return valorTAC;
  }
  public void setValorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
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
   * Value of the entrance (first parcel)
   **/
  @ApiModelProperty(value = "Value of the entrance (first parcel)")
  public BigDecimal getValorEntrada() {
    return valorEntrada;
  }
  public void setValorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
  }

  
  /**
   * Real expiration date of the invoice
   **/
  @ApiModelProperty(value = "Real expiration date of the invoice")
  public String getDataVencimentoReal() {
    return dataVencimentoReal;
  }
  public void setDataVencimentoReal(String dataVencimentoReal) {
    this.dataVencimentoReal = dataVencimentoReal;
  }

  
  /**
   * Expiration date of the invoice
   **/
  @ApiModelProperty(value = "Expiration date of the invoice")
  public String getDataVencimentoPadrao() {
    return dataVencimentoPadrao;
  }
  public void setDataVencimentoPadrao(String dataVencimentoPadrao) {
    this.dataVencimentoPadrao = dataVencimentoPadrao;
  }

  
  /**
   * Identification Code of the destination bank account (id)
   **/
  @ApiModelProperty(value = "Identification Code of the destination bank account (id)")
  public Long getIdContaPortador() {
    return idContaPortador;
  }
  public void setIdContaPortador(Long idContaPortador) {
    this.idContaPortador = idContaPortador;
  }

  
  /**
   * Attributed that represent the number of the merchant
   **/
  @ApiModelProperty(value = "Attributed that represent the number of the merchant")
  public Long getNumeroEstabelecimento() {
    return numeroEstabelecimento;
  }
  public void setNumeroEstabelecimento(Long numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
  }

  
  /**
   * Value of the withdrawal taxe
   **/
  @ApiModelProperty(value = "Value of the withdrawal taxe")
  public BigDecimal getValorTaxaSaque() {
    return valorTaxaSaque;
  }
  public void setValorTaxaSaque(BigDecimal valorTaxaSaque) {
    this.valorTaxaSaque = valorTaxaSaque;
  }

  
  /**
   * Bank code
   **/
  @ApiModelProperty(value = "Bank code")
  public Long getBanco() {
    return banco;
  }
  public void setBanco(Long banco) {
    this.banco = banco;
  }

  
  /**
   * Agency number
   **/
  @ApiModelProperty(value = "Agency number")
  public String getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(String numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * Digit of the agency
   **/
  @ApiModelProperty(value = "Digit of the agency")
  public String getDigitoAgencia() {
    return digitoAgencia;
  }
  public void setDigitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
  }

  
  /**
   * Number of the account
   **/
  @ApiModelProperty(value = "Number of the account")
  public String getNumeroConta() {
    return numeroConta;
  }
  public void setNumeroConta(String numeroConta) {
    this.numeroConta = numeroConta;
  }

  
  /**
   * Digit of the account
   **/
  @ApiModelProperty(value = "Digit of the account")
  public String getDigitoConta() {
    return digitoConta;
  }
  public void setDigitoConta(String digitoConta) {
    this.digitoConta = digitoConta;
  }

  
  /**
   * Type of the account
   **/
  @ApiModelProperty(value = "Type of the account")
  public Integer getFlagContaPoupanca() {
    return flagContaPoupanca;
  }
  public void setFlagContaPoupanca(Integer flagContaPoupanca) {
    this.flagContaPoupanca = flagContaPoupanca;
  }

  
  /**
   * Document of the favored
   **/
  @ApiModelProperty(value = "Document of the favored")
  public String getDocumentoFavorecido() {
    return documentoFavorecido;
  }
  public void setDocumentoFavorecido(String documentoFavorecido) {
    this.documentoFavorecido = documentoFavorecido;
  }

  
  /**
   * Name of the favored
   **/
  @ApiModelProperty(value = "Name of the favored")
  public String getNomeFavorecido() {
    return nomeFavorecido;
  }
  public void setNomeFavorecido(String nomeFavorecido) {
    this.nomeFavorecido = nomeFavorecido;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferenciaBancariaResponse {\n");
    
    sb.append("  nsuorigem: ").append(nsuorigem).append("\n");
    sb.append("  idAutorizacao: ").append(idAutorizacao).append("\n");
    sb.append("  idTransferencia: ").append(idTransferencia).append("\n");
    sb.append("  codigoAutorizacao: ").append(codigoAutorizacao).append("\n");
    sb.append("  dataAutorizacao: ").append(dataAutorizacao).append("\n");
    sb.append("  origem: ").append(origem).append("\n");
    sb.append("  valor: ").append(valor).append("\n");
    sb.append("  idOperacao: ").append(idOperacao).append("\n");
    sb.append("  terminal: ").append(terminal).append("\n");
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  dataCompra: ").append(dataCompra).append("\n");
    sb.append("  valorCompra: ").append(valorCompra).append("\n");
    sb.append("  numeroParcelas: ").append(numeroParcelas).append("\n");
    sb.append("  valorParcela: ").append(valorParcela).append("\n");
    sb.append("  idEstabelecimento: ").append(idEstabelecimento).append("\n");
    sb.append("  dataMovimento: ").append(dataMovimento).append("\n");
    sb.append("  valorContrato: ").append(valorContrato).append("\n");
    sb.append("  taxaJuros: ").append(taxaJuros).append("\n");
    sb.append("  valorIOF: ").append(valorIOF).append("\n");
    sb.append("  valorTAC: ").append(valorTAC).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  valorEntrada: ").append(valorEntrada).append("\n");
    sb.append("  dataVencimentoReal: ").append(dataVencimentoReal).append("\n");
    sb.append("  dataVencimentoPadrao: ").append(dataVencimentoPadrao).append("\n");
    sb.append("  idContaPortador: ").append(idContaPortador).append("\n");
    sb.append("  numeroEstabelecimento: ").append(numeroEstabelecimento).append("\n");
    sb.append("  valorTaxaSaque: ").append(valorTaxaSaque).append("\n");
    sb.append("  banco: ").append(banco).append("\n");
    sb.append("  numeroAgencia: ").append(numeroAgencia).append("\n");
    sb.append("  digitoAgencia: ").append(digitoAgencia).append("\n");
    sb.append("  numeroConta: ").append(numeroConta).append("\n");
    sb.append("  digitoConta: ").append(digitoConta).append("\n");
    sb.append("  flagContaPoupanca: ").append(flagContaPoupanca).append("\n");
    sb.append("  documentoFavorecido: ").append(documentoFavorecido).append("\n");
    sb.append("  nomeFavorecido: ").append(nomeFavorecido).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
