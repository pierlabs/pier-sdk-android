package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{transferencia_bancaria_response_description}}}
 **/
@ApiModel(description = "{{{transferencia_bancaria_response_description}}}")
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
   * {{{transferencia_bancaria_response_id_autorizacao_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_bancaria_response_id_autorizacao_value}}}")
  public Long getIdAutorizacao() {
    return idAutorizacao;
  }
  public void setIdAutorizacao(Long idAutorizacao) {
    this.idAutorizacao = idAutorizacao;
  }

  
  /**
   * {{{transferencia_bancaria_response_id_transferencia_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_bancaria_response_id_transferencia_value}}}")
  public Long getIdTransferencia() {
    return idTransferencia;
  }
  public void setIdTransferencia(Long idTransferencia) {
    this.idTransferencia = idTransferencia;
  }

  
  /**
   * {{{transferencia_bancaria_response_codigo_autorizacao_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_bancaria_response_codigo_autorizacao_value}}}")
  public String getCodigoAutorizacao() {
    return codigoAutorizacao;
  }
  public void setCodigoAutorizacao(String codigoAutorizacao) {
    this.codigoAutorizacao = codigoAutorizacao;
  }

  
  /**
   * {{{transferencia_bancaria_response_data_autorizacao_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_bancaria_response_data_autorizacao_value}}}")
  public String getDataAutorizacao() {
    return dataAutorizacao;
  }
  public void setDataAutorizacao(String dataAutorizacao) {
    this.dataAutorizacao = dataAutorizacao;
  }

  
  /**
   * {{{transferencia_bancaria_response_origem_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_bancaria_response_origem_value}}}")
  public String getOrigem() {
    return origem;
  }
  public void setOrigem(String origem) {
    this.origem = origem;
  }

  
  /**
   * {{{transferencia_bancaria_response_valor_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_bancaria_response_valor_value}}}")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * {{{transferencia_bancaria_response_id_operacao_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_bancaria_response_id_operacao_value}}}")
  public Long getIdOperacao() {
    return idOperacao;
  }
  public void setIdOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
  }

  
  /**
   * {{{transferencia_bancaria_response_terminal_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_bancaria_response_terminal_value}}}")
  public String getTerminal() {
    return terminal;
  }
  public void setTerminal(String terminal) {
    this.terminal = terminal;
  }

  
  /**
   * {{{transferencia_bancaria_response_id_cartao_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_bancaria_response_id_cartao_value}}}")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * {{{transferencia_bancaria_response_data_compra_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_bancaria_response_data_compra_value}}}")
  public String getDataCompra() {
    return dataCompra;
  }
  public void setDataCompra(String dataCompra) {
    this.dataCompra = dataCompra;
  }

  
  /**
   * {{{transferencia_bancaria_response_valor_compra_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_bancaria_response_valor_compra_value}}}")
  public BigDecimal getValorCompra() {
    return valorCompra;
  }
  public void setValorCompra(BigDecimal valorCompra) {
    this.valorCompra = valorCompra;
  }

  
  /**
   * {{{transferencia_bancaria_response_numero_parcelas_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_bancaria_response_numero_parcelas_value}}}")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * {{{transferencia_bancaria_response_valor_parcela_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_bancaria_response_valor_parcela_value}}}")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   * {{{transferencia_bancaria_response_id_estabelecimento_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_bancaria_response_id_estabelecimento_value}}}")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * {{{transferencia_bancaria_response_data_movimento_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_bancaria_response_data_movimento_value}}}")
  public String getDataMovimento() {
    return dataMovimento;
  }
  public void setDataMovimento(String dataMovimento) {
    this.dataMovimento = dataMovimento;
  }

  
  /**
   * {{{transferencia_bancaria_response_valor_contrato_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_bancaria_response_valor_contrato_value}}}")
  public BigDecimal getValorContrato() {
    return valorContrato;
  }
  public void setValorContrato(BigDecimal valorContrato) {
    this.valorContrato = valorContrato;
  }

  
  /**
   * {{{transferencia_bancaria_response_taxa_juros_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_bancaria_response_taxa_juros_value}}}")
  public BigDecimal getTaxaJuros() {
    return taxaJuros;
  }
  public void setTaxaJuros(BigDecimal taxaJuros) {
    this.taxaJuros = taxaJuros;
  }

  
  /**
   * {{{transferencia_bancaria_response_valor_i_o_f_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_bancaria_response_valor_i_o_f_value}}}")
  public BigDecimal getValorIOF() {
    return valorIOF;
  }
  public void setValorIOF(BigDecimal valorIOF) {
    this.valorIOF = valorIOF;
  }

  
  /**
   * {{{transferencia_bancaria_response_valor_t_a_c_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_bancaria_response_valor_t_a_c_value}}}")
  public BigDecimal getValorTAC() {
    return valorTAC;
  }
  public void setValorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
  }

  
  /**
   * {{{transferencia_bancaria_response_id_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_bancaria_response_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{transferencia_bancaria_response_valor_entrada_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_bancaria_response_valor_entrada_value}}}")
  public BigDecimal getValorEntrada() {
    return valorEntrada;
  }
  public void setValorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
  }

  
  /**
   * {{{transferencia_bancaria_response_data_vencimento_real_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_bancaria_response_data_vencimento_real_value}}}")
  public String getDataVencimentoReal() {
    return dataVencimentoReal;
  }
  public void setDataVencimentoReal(String dataVencimentoReal) {
    this.dataVencimentoReal = dataVencimentoReal;
  }

  
  /**
   * {{{transferencia_bancaria_response_data_vencimento_padrao_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_bancaria_response_data_vencimento_padrao_value}}}")
  public String getDataVencimentoPadrao() {
    return dataVencimentoPadrao;
  }
  public void setDataVencimentoPadrao(String dataVencimentoPadrao) {
    this.dataVencimentoPadrao = dataVencimentoPadrao;
  }

  
  /**
   * {{{transferencia_bancaria_response_id_conta_portador_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_bancaria_response_id_conta_portador_value}}}")
  public Long getIdContaPortador() {
    return idContaPortador;
  }
  public void setIdContaPortador(Long idContaPortador) {
    this.idContaPortador = idContaPortador;
  }

  
  /**
   * {{{transferencia_bancaria_response_numero_estabelecimento_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_bancaria_response_numero_estabelecimento_value}}}")
  public Long getNumeroEstabelecimento() {
    return numeroEstabelecimento;
  }
  public void setNumeroEstabelecimento(Long numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
  }

  
  /**
   * {{{transferencia_bancaria_response_valor_taxa_saque_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_bancaria_response_valor_taxa_saque_value}}}")
  public BigDecimal getValorTaxaSaque() {
    return valorTaxaSaque;
  }
  public void setValorTaxaSaque(BigDecimal valorTaxaSaque) {
    this.valorTaxaSaque = valorTaxaSaque;
  }

  
  /**
   * {{{transferencia_bancaria_response_banco_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_bancaria_response_banco_value}}}")
  public Long getBanco() {
    return banco;
  }
  public void setBanco(Long banco) {
    this.banco = banco;
  }

  
  /**
   * {{{transferencia_bancaria_response_numero_agencia_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_bancaria_response_numero_agencia_value}}}")
  public String getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(String numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * {{{transferencia_bancaria_response_digito_agencia_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_bancaria_response_digito_agencia_value}}}")
  public String getDigitoAgencia() {
    return digitoAgencia;
  }
  public void setDigitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
  }

  
  /**
   * {{{transferencia_bancaria_response_numero_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_bancaria_response_numero_conta_value}}}")
  public String getNumeroConta() {
    return numeroConta;
  }
  public void setNumeroConta(String numeroConta) {
    this.numeroConta = numeroConta;
  }

  
  /**
   * {{{transferencia_bancaria_response_digito_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_bancaria_response_digito_conta_value}}}")
  public String getDigitoConta() {
    return digitoConta;
  }
  public void setDigitoConta(String digitoConta) {
    this.digitoConta = digitoConta;
  }

  
  /**
   * {{{transferencia_bancaria_response_flag_conta_poupanca_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_bancaria_response_flag_conta_poupanca_value}}}")
  public Integer getFlagContaPoupanca() {
    return flagContaPoupanca;
  }
  public void setFlagContaPoupanca(Integer flagContaPoupanca) {
    this.flagContaPoupanca = flagContaPoupanca;
  }

  
  /**
   * {{{transferencia_bancaria_response_documento_favorecido_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_bancaria_response_documento_favorecido_value}}}")
  public String getDocumentoFavorecido() {
    return documentoFavorecido;
  }
  public void setDocumentoFavorecido(String documentoFavorecido) {
    this.documentoFavorecido = documentoFavorecido;
  }

  
  /**
   * {{{transferencia_bancaria_response_nome_favorecido_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_bancaria_response_nome_favorecido_value}}}")
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
