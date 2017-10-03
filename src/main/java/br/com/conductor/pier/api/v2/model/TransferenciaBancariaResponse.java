package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Transfer\u00C3\u00AAncia banc\u00C3\u00A1ria
 **/
@ApiModel(description = "Transfer\u00C3\u00AAncia banc\u00C3\u00A1ria")
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
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da autoriza\u00C3\u00A7\u00C3\u00A3o (id)
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da autoriza\u00C3\u00A7\u00C3\u00A3o (id)")
  public Long getIdAutorizacao() {
    return idAutorizacao;
  }
  public void setIdAutorizacao(Long idAutorizacao) {
    this.idAutorizacao = idAutorizacao;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da transferencia (id)
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da transferencia (id)")
  public Long getIdTransferencia() {
    return idTransferencia;
  }
  public void setIdTransferencia(Long idTransferencia) {
    this.idTransferencia = idTransferencia;
  }

  
  /**
   * C\u00C3\u00B3digo da autoriza\u00C3\u00A7\u00C3\u00A3o
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo da autoriza\u00C3\u00A7\u00C3\u00A3o")
  public String getCodigoAutorizacao() {
    return codigoAutorizacao;
  }
  public void setCodigoAutorizacao(String codigoAutorizacao) {
    this.codigoAutorizacao = codigoAutorizacao;
  }

  
  /**
   * Data da autoriza\u00C3\u00A7\u00C3\u00A3o
   **/
  @ApiModelProperty(value = "Data da autoriza\u00C3\u00A7\u00C3\u00A3o")
  public String getDataAutorizacao() {
    return dataAutorizacao;
  }
  public void setDataAutorizacao(String dataAutorizacao) {
    this.dataAutorizacao = dataAutorizacao;
  }

  
  /**
   * Origem
   **/
  @ApiModelProperty(value = "Origem")
  public String getOrigem() {
    return origem;
  }
  public void setOrigem(String origem) {
    this.origem = origem;
  }

  
  /**
   * Valor
   **/
  @ApiModelProperty(value = "Valor")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do tipo de opera\u00C3\u00A7\u00C3\u00A3o (id)
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do tipo de opera\u00C3\u00A7\u00C3\u00A3o (id)")
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
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do cart\u00C3\u00A3o (id)
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do cart\u00C3\u00A3o (id)")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Data da transfer\u00C3\u00AAncia
   **/
  @ApiModelProperty(value = "Data da transfer\u00C3\u00AAncia")
  public String getDataCompra() {
    return dataCompra;
  }
  public void setDataCompra(String dataCompra) {
    this.dataCompra = dataCompra;
  }

  
  /**
   * Valor da transfer\u00C3\u00AAncia
   **/
  @ApiModelProperty(value = "Valor da transfer\u00C3\u00AAncia")
  public BigDecimal getValorCompra() {
    return valorCompra;
  }
  public void setValorCompra(BigDecimal valorCompra) {
    this.valorCompra = valorCompra;
  }

  
  /**
   * N\u00C3\u00BAmero de parcelas
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero de parcelas")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * Valor da parcela
   **/
  @ApiModelProperty(value = "Valor da parcela")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do estabelecimento (id)
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do estabelecimento (id)")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * Data do movimento
   **/
  @ApiModelProperty(value = "Data do movimento")
  public String getDataMovimento() {
    return dataMovimento;
  }
  public void setDataMovimento(String dataMovimento) {
    this.dataMovimento = dataMovimento;
  }

  
  /**
   * Valor da transfer\u00C3\u00AAncia acrescido do valor da tarifa de saque se houver tarifa de saque
   **/
  @ApiModelProperty(value = "Valor da transfer\u00C3\u00AAncia acrescido do valor da tarifa de saque se houver tarifa de saque")
  public BigDecimal getValorContrato() {
    return valorContrato;
  }
  public void setValorContrato(BigDecimal valorContrato) {
    this.valorContrato = valorContrato;
  }

  
  /**
   * Percentual de juros
   **/
  @ApiModelProperty(value = "Percentual de juros")
  public BigDecimal getTaxaJuros() {
    return taxaJuros;
  }
  public void setTaxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
  }

  
  /**
   * Valor do IOF
   **/
  @ApiModelProperty(value = "Valor do IOF")
  public BigDecimal getValorIOF() {
    return valorIOF;
  }
  public void setValorIOF(BigDecimal valorIOF) {
    this.valorIOF = valorIOF;
  }

  
  /**
   * Valor da TAC
   **/
  @ApiModelProperty(value = "Valor da TAC")
  public BigDecimal getValorTAC() {
    return valorTAC;
  }
  public void setValorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta (id)
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta (id)")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Valor da entrada (primeira parcela)
   **/
  @ApiModelProperty(value = "Valor da entrada (primeira parcela)")
  public BigDecimal getValorEntrada() {
    return valorEntrada;
  }
  public void setValorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
  }

  
  /**
   * Data do vencimento real da fatura
   **/
  @ApiModelProperty(value = "Data do vencimento real da fatura")
  public String getDataVencimentoReal() {
    return dataVencimentoReal;
  }
  public void setDataVencimentoReal(String dataVencimentoReal) {
    this.dataVencimentoReal = dataVencimentoReal;
  }

  
  /**
   * Dia do vencimento padr\u00C3\u00A3o da fatura
   **/
  @ApiModelProperty(value = "Dia do vencimento padr\u00C3\u00A3o da fatura")
  public String getDataVencimentoPadrao() {
    return dataVencimentoPadrao;
  }
  public void setDataVencimentoPadrao(String dataVencimentoPadrao) {
    this.dataVencimentoPadrao = dataVencimentoPadrao;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta banc\u00C3\u00A1ria de destino (id)
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta banc\u00C3\u00A1ria de destino (id)")
  public Long getIdContaPortador() {
    return idContaPortador;
  }
  public void setIdContaPortador(Long idContaPortador) {
    this.idContaPortador = idContaPortador;
  }

  
  /**
   * Atributo que representa o numero do estabelecimento.
   **/
  @ApiModelProperty(value = "Atributo que representa o numero do estabelecimento.")
  public Long getNumeroEstabelecimento() {
    return numeroEstabelecimento;
  }
  public void setNumeroEstabelecimento(Long numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
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
   * C\u00C3\u00B3digo do Banco
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo do Banco")
  public Long getBanco() {
    return banco;
  }
  public void setBanco(Long banco) {
    this.banco = banco;
  }

  
  /**
   * N\u00C3\u00BAmero da Ag\u00C3\u00AAncia
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero da Ag\u00C3\u00AAncia")
  public String getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(String numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * D\u00C3\u00ADgito da Ag\u00C3\u00AAncia
   **/
  @ApiModelProperty(value = "D\u00C3\u00ADgito da Ag\u00C3\u00AAncia")
  public String getDigitoAgencia() {
    return digitoAgencia;
  }
  public void setDigitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
  }

  
  /**
   * N\u00C3\u00BAmero da Conta
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero da Conta")
  public String getNumeroConta() {
    return numeroConta;
  }
  public void setNumeroConta(String numeroConta) {
    this.numeroConta = numeroConta;
  }

  
  /**
   * D\u00C3\u00ADgito da Conta
   **/
  @ApiModelProperty(value = "D\u00C3\u00ADgito da Conta")
  public String getDigitoConta() {
    return digitoConta;
  }
  public void setDigitoConta(String digitoConta) {
    this.digitoConta = digitoConta;
  }

  
  /**
   * Tipo da Conta
   **/
  @ApiModelProperty(value = "Tipo da Conta")
  public Integer getFlagContaPoupanca() {
    return flagContaPoupanca;
  }
  public void setFlagContaPoupanca(Integer flagContaPoupanca) {
    this.flagContaPoupanca = flagContaPoupanca;
  }

  
  /**
   * Documento do Favorecido
   **/
  @ApiModelProperty(value = "Documento do Favorecido")
  public String getDocumentoFavorecido() {
    return documentoFavorecido;
  }
  public void setDocumentoFavorecido(String documentoFavorecido) {
    this.documentoFavorecido = documentoFavorecido;
  }

  
  /**
   * Nome do Favorecido
   **/
  @ApiModelProperty(value = "Nome do Favorecido")
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


