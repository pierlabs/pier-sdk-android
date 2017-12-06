package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Transfer\u00C3\u00AAncia de cr\u00C3\u00A9dito para contas banc\u00C3\u00A1rias
 **/
@ApiModel(description = "Transfer\u00C3\u00AAncia de cr\u00C3\u00A9dito para contas banc\u00C3\u00A1rias")
public class TransferenciaCreditoContaBancariaResponse  {
  
  @SerializedName("idTransferencia")
  private Long idTransferencia = null;
  @SerializedName("valorCET")
  private BigDecimal valorCET = null;
  @SerializedName("idAutorizacao")
  private Long idAutorizacao = null;
  @SerializedName("codigoAutorizacao")
  private String codigoAutorizacao = null;
  @SerializedName("nsuOrigem")
  private Long nsuOrigem = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("idOperacao")
  private Long idOperacao = null;
  @SerializedName("valorCompra")
  private BigDecimal valorCompra = null;
  @SerializedName("valorParcela")
  private BigDecimal valorParcela = null;
  @SerializedName("valorContrato")
  private BigDecimal valorContrato = null;
  @SerializedName("numeroParcelas")
  private Integer numeroParcelas = null;
  @SerializedName("valorIOF")
  private BigDecimal valorIOF = null;
  @SerializedName("valorTAC")
  private BigDecimal valorTAC = null;
  @SerializedName("valorTaxaSaque")
  private BigDecimal valorTaxaSaque = null;
  @SerializedName("taxaJuros")
  private BigDecimal taxaJuros = null;
  @SerializedName("dataCompra")
  private String dataCompra = null;
  @SerializedName("dataMovimento")
  private String dataMovimento = null;
  @SerializedName("dataVencimentoReal")
  private String dataVencimentoReal = null;
  @SerializedName("dataVencimentoPadrao")
  private String dataVencimentoPadrao = null;
  @SerializedName("dataAutorizacao")
  private String dataAutorizacao = null;
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
  private Boolean flagContaPoupanca = null;
  @SerializedName("documentoFavorecido")
  private String documentoFavorecido = null;
  @SerializedName("nomeFavorecido")
  private String nomeFavorecido = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("statusProcessamento")
  private String statusProcessamento = null;

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da transferencia.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da transferencia.")
  public Long getIdTransferencia() {
    return idTransferencia;
  }
  public void setIdTransferencia(Long idTransferencia) {
    this.idTransferencia = idTransferencia;
  }

  
  /**
   * Taxa de custo efetivo total.
   **/
  @ApiModelProperty(value = "Taxa de custo efetivo total.")
  public BigDecimal getValorCET() {
    return valorCET;
  }
  public void setValorCET(BigDecimal valorCET) {
    this.valorCET = valorCET;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da autoriza\u00C3\u00A7\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da autoriza\u00C3\u00A7\u00C3\u00A3o.")
  public Long getIdAutorizacao() {
    return idAutorizacao;
  }
  public void setIdAutorizacao(Long idAutorizacao) {
    this.idAutorizacao = idAutorizacao;
  }

  
  /**
   * C\u00C3\u00B3digo da autoriza\u00C3\u00A7\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo da autoriza\u00C3\u00A7\u00C3\u00A3o.")
  public String getCodigoAutorizacao() {
    return codigoAutorizacao;
  }
  public void setCodigoAutorizacao(String codigoAutorizacao) {
    this.codigoAutorizacao = codigoAutorizacao;
  }

  
  /**
   * NSU de origem.
   **/
  @ApiModelProperty(value = "NSU de origem.")
  public Long getNsuOrigem() {
    return nsuOrigem;
  }
  public void setNsuOrigem(Long nsuOrigem) {
    this.nsuOrigem = nsuOrigem;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta.")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do cart\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do cart\u00C3\u00A3o.")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do tipo de opera\u00C3\u00A7\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do tipo de opera\u00C3\u00A7\u00C3\u00A3o.")
  public Long getIdOperacao() {
    return idOperacao;
  }
  public void setIdOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
  }

  
  /**
   * Valor da transfer\u00C3\u00AAncia.
   **/
  @ApiModelProperty(value = "Valor da transfer\u00C3\u00AAncia.")
  public BigDecimal getValorCompra() {
    return valorCompra;
  }
  public void setValorCompra(BigDecimal valorCompra) {
    this.valorCompra = valorCompra;
  }

  
  /**
   * Valor da parcela.
   **/
  @ApiModelProperty(value = "Valor da parcela.")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   * Valor da transfer\u00C3\u00AAncia acrescido do valor da tarifa de saque se houver tarifa de saque.
   **/
  @ApiModelProperty(value = "Valor da transfer\u00C3\u00AAncia acrescido do valor da tarifa de saque se houver tarifa de saque.")
  public BigDecimal getValorContrato() {
    return valorContrato;
  }
  public void setValorContrato(BigDecimal valorContrato) {
    this.valorContrato = valorContrato;
  }

  
  /**
   * N\u00C3\u00BAmero de parcelas.
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero de parcelas.")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * Valor do IOF.
   **/
  @ApiModelProperty(value = "Valor do IOF.")
  public BigDecimal getValorIOF() {
    return valorIOF;
  }
  public void setValorIOF(BigDecimal valorIOF) {
    this.valorIOF = valorIOF;
  }

  
  /**
   * Valor da TAC.
   **/
  @ApiModelProperty(value = "Valor da TAC.")
  public BigDecimal getValorTAC() {
    return valorTAC;
  }
  public void setValorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
  }

  
  /**
   * Valor da taxa saque.
   **/
  @ApiModelProperty(value = "Valor da taxa saque.")
  public BigDecimal getValorTaxaSaque() {
    return valorTaxaSaque;
  }
  public void setValorTaxaSaque(BigDecimal valorTaxaSaque) {
    this.valorTaxaSaque = valorTaxaSaque;
  }

  
  /**
   * Percentual de juros.
   **/
  @ApiModelProperty(value = "Percentual de juros.")
  public BigDecimal getTaxaJuros() {
    return taxaJuros;
  }
  public void setTaxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
  }

  
  /**
   * Data da transfer\u00C3\u00AAncia.
   **/
  @ApiModelProperty(value = "Data da transfer\u00C3\u00AAncia.")
  public String getDataCompra() {
    return dataCompra;
  }
  public void setDataCompra(String dataCompra) {
    this.dataCompra = dataCompra;
  }

  
  /**
   * Data do movimento.
   **/
  @ApiModelProperty(value = "Data do movimento.")
  public String getDataMovimento() {
    return dataMovimento;
  }
  public void setDataMovimento(String dataMovimento) {
    this.dataMovimento = dataMovimento;
  }

  
  /**
   * Data do vencimento real da fatura.
   **/
  @ApiModelProperty(value = "Data do vencimento real da fatura.")
  public String getDataVencimentoReal() {
    return dataVencimentoReal;
  }
  public void setDataVencimentoReal(String dataVencimentoReal) {
    this.dataVencimentoReal = dataVencimentoReal;
  }

  
  /**
   * Dia do vencimento padr\u00C3\u00A3o da fatura.
   **/
  @ApiModelProperty(value = "Dia do vencimento padr\u00C3\u00A3o da fatura.")
  public String getDataVencimentoPadrao() {
    return dataVencimentoPadrao;
  }
  public void setDataVencimentoPadrao(String dataVencimentoPadrao) {
    this.dataVencimentoPadrao = dataVencimentoPadrao;
  }

  
  /**
   * Data da autoriza\u00C3\u00A7\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "Data da autoriza\u00C3\u00A7\u00C3\u00A3o.")
  public String getDataAutorizacao() {
    return dataAutorizacao;
  }
  public void setDataAutorizacao(String dataAutorizacao) {
    this.dataAutorizacao = dataAutorizacao;
  }

  
  /**
   * C\u00C3\u00B3digo do Banco.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo do Banco.")
  public Long getBanco() {
    return banco;
  }
  public void setBanco(Long banco) {
    this.banco = banco;
  }

  
  /**
   * N\u00C3\u00BAmero da Ag\u00C3\u00AAncia.
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero da Ag\u00C3\u00AAncia.")
  public String getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(String numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * D\u00C3\u00ADgito da Ag\u00C3\u00AAncia.
   **/
  @ApiModelProperty(value = "D\u00C3\u00ADgito da Ag\u00C3\u00AAncia.")
  public String getDigitoAgencia() {
    return digitoAgencia;
  }
  public void setDigitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
  }

  
  /**
   * N\u00C3\u00BAmero da Conta.
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero da Conta.")
  public String getNumeroConta() {
    return numeroConta;
  }
  public void setNumeroConta(String numeroConta) {
    this.numeroConta = numeroConta;
  }

  
  /**
   * D\u00C3\u00ADgito da Conta.
   **/
  @ApiModelProperty(value = "D\u00C3\u00ADgito da Conta.")
  public String getDigitoConta() {
    return digitoConta;
  }
  public void setDigitoConta(String digitoConta) {
    this.digitoConta = digitoConta;
  }

  
  /**
   * Tipo da Conta.
   **/
  @ApiModelProperty(value = "Tipo da Conta.")
  public Boolean getFlagContaPoupanca() {
    return flagContaPoupanca;
  }
  public void setFlagContaPoupanca(Boolean flagContaPoupanca) {
    this.flagContaPoupanca = flagContaPoupanca;
  }

  
  /**
   * Documento do Favorecido.
   **/
  @ApiModelProperty(value = "Documento do Favorecido.")
  public String getDocumentoFavorecido() {
    return documentoFavorecido;
  }
  public void setDocumentoFavorecido(String documentoFavorecido) {
    this.documentoFavorecido = documentoFavorecido;
  }

  
  /**
   * Nome do Favorecido.
   **/
  @ApiModelProperty(value = "Nome do Favorecido.")
  public String getNomeFavorecido() {
    return nomeFavorecido;
  }
  public void setNomeFavorecido(String nomeFavorecido) {
    this.nomeFavorecido = nomeFavorecido;
  }

  
  /**
   * C\u00C3\u00B3digo do Status
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo do Status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * Status Processamento.
   **/
  @ApiModelProperty(value = "Status Processamento.")
  public String getStatusProcessamento() {
    return statusProcessamento;
  }
  public void setStatusProcessamento(String statusProcessamento) {
    this.statusProcessamento = statusProcessamento;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferenciaCreditoContaBancariaResponse {\n");
    
    sb.append("  idTransferencia: ").append(idTransferencia).append("\n");
    sb.append("  valorCET: ").append(valorCET).append("\n");
    sb.append("  idAutorizacao: ").append(idAutorizacao).append("\n");
    sb.append("  codigoAutorizacao: ").append(codigoAutorizacao).append("\n");
    sb.append("  nsuOrigem: ").append(nsuOrigem).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  idOperacao: ").append(idOperacao).append("\n");
    sb.append("  valorCompra: ").append(valorCompra).append("\n");
    sb.append("  valorParcela: ").append(valorParcela).append("\n");
    sb.append("  valorContrato: ").append(valorContrato).append("\n");
    sb.append("  numeroParcelas: ").append(numeroParcelas).append("\n");
    sb.append("  valorIOF: ").append(valorIOF).append("\n");
    sb.append("  valorTAC: ").append(valorTAC).append("\n");
    sb.append("  valorTaxaSaque: ").append(valorTaxaSaque).append("\n");
    sb.append("  taxaJuros: ").append(taxaJuros).append("\n");
    sb.append("  dataCompra: ").append(dataCompra).append("\n");
    sb.append("  dataMovimento: ").append(dataMovimento).append("\n");
    sb.append("  dataVencimentoReal: ").append(dataVencimentoReal).append("\n");
    sb.append("  dataVencimentoPadrao: ").append(dataVencimentoPadrao).append("\n");
    sb.append("  dataAutorizacao: ").append(dataAutorizacao).append("\n");
    sb.append("  banco: ").append(banco).append("\n");
    sb.append("  numeroAgencia: ").append(numeroAgencia).append("\n");
    sb.append("  digitoAgencia: ").append(digitoAgencia).append("\n");
    sb.append("  numeroConta: ").append(numeroConta).append("\n");
    sb.append("  digitoConta: ").append(digitoConta).append("\n");
    sb.append("  flagContaPoupanca: ").append(flagContaPoupanca).append("\n");
    sb.append("  documentoFavorecido: ").append(documentoFavorecido).append("\n");
    sb.append("  nomeFavorecido: ").append(nomeFavorecido).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  statusProcessamento: ").append(statusProcessamento).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


