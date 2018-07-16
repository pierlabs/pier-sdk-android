package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{transacao_nao_processada_response_description}}}
 **/
@ApiModel(description = "{{{transacao_nao_processada_response_description}}}")
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
   * {{{transacao_nao_processada_response_cartao_mascarado_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_nao_processada_response_cartao_mascarado_value}}}")
  public String getCartaoMascarado() {
    return cartaoMascarado;
  }
  public void setCartaoMascarado(String cartaoMascarado) {
    this.cartaoMascarado = cartaoMascarado;
  }

  
  /**
   * {{{transacao_nao_processada_response_codigo_autorizacao_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_nao_processada_response_codigo_autorizacao_value}}}")
  public String getCodigoAutorizacao() {
    return codigoAutorizacao;
  }
  public void setCodigoAutorizacao(String codigoAutorizacao) {
    this.codigoAutorizacao = codigoAutorizacao;
  }

  
  /**
   * {{{transacao_nao_processada_response_codigo_mcc_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_nao_processada_response_codigo_mcc_value}}}")
  public Long getCodigoMCC() {
    return codigoMCC;
  }
  public void setCodigoMCC(Long codigoMCC) {
    this.codigoMCC = codigoMCC;
  }

  
  /**
   * {{{transacao_nao_processada_response_codigo_moeda_destino_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_nao_processada_response_codigo_moeda_destino_value}}}")
  public String getCodigoMoedaDestino() {
    return codigoMoedaDestino;
  }
  public void setCodigoMoedaDestino(String codigoMoedaDestino) {
    this.codigoMoedaDestino = codigoMoedaDestino;
  }

  
  /**
   * {{{transacao_nao_processada_response_codigo_moeda_origem_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_nao_processada_response_codigo_moeda_origem_value}}}")
  public String getCodigoMoedaOrigem() {
    return codigoMoedaOrigem;
  }
  public void setCodigoMoedaOrigem(String codigoMoedaOrigem) {
    this.codigoMoedaOrigem = codigoMoedaOrigem;
  }

  
  /**
   * {{{transacao_nao_processada_response_codigo_referencia_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_nao_processada_response_codigo_referencia_value}}}")
  public String getCodigoReferencia() {
    return codigoReferencia;
  }
  public void setCodigoReferencia(String codigoReferencia) {
    this.codigoReferencia = codigoReferencia;
  }

  
  /**
   * {{{transacao_nao_processada_response_codigo_terminal_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_nao_processada_response_codigo_terminal_value}}}")
  public String getCodigoTerminal() {
    return codigoTerminal;
  }
  public void setCodigoTerminal(String codigoTerminal) {
    this.codigoTerminal = codigoTerminal;
  }

  
  /**
   * {{{transacao_nao_processada_response_cotacao_usd_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_nao_processada_response_cotacao_usd_value}}}")
  public BigDecimal getCotacaoUSD() {
    return cotacaoUSD;
  }
  public void setCotacaoUSD(BigDecimal cotacaoUSD) {
    this.cotacaoUSD = cotacaoUSD;
  }

  
  /**
   * {{{transacao_nao_processada_response_data_cotacao_usd_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_nao_processada_response_data_cotacao_usd_value}}}")
  public String getDataCotacaoUSD() {
    return dataCotacaoUSD;
  }
  public void setDataCotacaoUSD(String dataCotacaoUSD) {
    this.dataCotacaoUSD = dataCotacaoUSD;
  }

  
  /**
   * {{{transacao_nao_processada_response_data_faturamento_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_nao_processada_response_data_faturamento_value}}}")
  public String getDataFaturamento() {
    return dataFaturamento;
  }
  public void setDataFaturamento(String dataFaturamento) {
    this.dataFaturamento = dataFaturamento;
  }

  
  /**
   * {{{transacao_nao_processada_response_data_origem_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_nao_processada_response_data_origem_value}}}")
  public String getDataOrigem() {
    return dataOrigem;
  }
  public void setDataOrigem(String dataOrigem) {
    this.dataOrigem = dataOrigem;
  }

  
  /**
   * {{{transacao_nao_processada_response_data_vencimento_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_nao_processada_response_data_vencimento_value}}}")
  public String getDataVencimentoReal() {
    return dataVencimentoReal;
  }
  public void setDataVencimentoReal(String dataVencimentoReal) {
    this.dataVencimentoReal = dataVencimentoReal;
  }

  
  /**
   * {{{transacao_nao_processada_response_descricao_abreviada_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_nao_processada_response_descricao_abreviada_value}}}")
  public String getDescricaoAbreviada() {
    return descricaoAbreviada;
  }
  public void setDescricaoAbreviada(String descricaoAbreviada) {
    this.descricaoAbreviada = descricaoAbreviada;
  }

  
  /**
   * {{{transacao_nao_processada_response_descricao_tipo_transacao_nao_processada_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_nao_processada_response_descricao_tipo_transacao_nao_processada_value}}}")
  public String getDescricaoTipoTransacaoNaoProcessada() {
    return descricaoTipoTransacaoNaoProcessada;
  }
  public void setDescricaoTipoTransacaoNaoProcessada(String descricaoTipoTransacaoNaoProcessada) {
    this.descricaoTipoTransacaoNaoProcessada = descricaoTipoTransacaoNaoProcessada;
  }

  
  /**
   * {{{transacao_nao_processada_response_detalhes_transacao_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_nao_processada_response_detalhes_transacao_value}}}")
  public String getDetalhesTransacao() {
    return detalhesTransacao;
  }
  public void setDetalhesTransacao(String detalhesTransacao) {
    this.detalhesTransacao = detalhesTransacao;
  }

  
  /**
   * {{{transacao_nao_processada_response_flag_credito_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_nao_processada_response_flag_credito_value}}}")
  public Integer getFlagCredito() {
    return flagCredito;
  }
  public void setFlagCredito(Integer flagCredito) {
    this.flagCredito = flagCredito;
  }

  
  /**
   * {{{transacao_nao_processada_response_flag_faturado_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_nao_processada_response_flag_faturado_value}}}")
  public Integer getFlagFaturado() {
    return flagFaturado;
  }
  public void setFlagFaturado(Integer flagFaturado) {
    this.flagFaturado = flagFaturado;
  }

  
  /**
   * {{{transacao_nao_processada_response_grupo_descricao_mcc_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_nao_processada_response_grupo_descricao_mcc_value}}}")
  public String getGrupoDescricaoMCC() {
    return grupoDescricaoMCC;
  }
  public void setGrupoDescricaoMCC(String grupoDescricaoMCC) {
    this.grupoDescricaoMCC = grupoDescricaoMCC;
  }

  
  /**
   * {{{transacao_nao_processada_response_grupo_mcc_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_nao_processada_response_grupo_mcc_value}}}")
  public Long getGrupoMCC() {
    return grupoMCC;
  }
  public void setGrupoMCC(Long grupoMCC) {
    this.grupoMCC = grupoMCC;
  }

  
  /**
   * {{{transacao_nao_processada_response_id_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_nao_processada_response_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{transacao_nao_processada_response_id_estabelecimento_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_nao_processada_response_id_estabelecimento_value}}}")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * {{{transacao_nao_processada_response_id_tipo_transacao_nao_processada_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_nao_processada_response_id_tipo_transacao_nao_processada_value}}}")
  public Long getIdTipoTransacaoNaoProcessada() {
    return idTipoTransacaoNaoProcessada;
  }
  public void setIdTipoTransacaoNaoProcessada(Long idTipoTransacaoNaoProcessada) {
    this.idTipoTransacaoNaoProcessada = idTipoTransacaoNaoProcessada;
  }

  
  /**
   * {{{transacao_nao_processada_response_id_transacao_estorno_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_nao_processada_response_id_transacao_estorno_value}}}")
  public Long getIdTransacaoEstorno() {
    return idTransacaoEstorno;
  }
  public void setIdTransacaoEstorno(Long idTransacaoEstorno) {
    this.idTransacaoEstorno = idTransacaoEstorno;
  }

  
  /**
   * {{{transacao_nao_processada_response_localidade_estabelecimento_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_nao_processada_response_localidade_estabelecimento_value}}}")
  public String getLocalidadeEstabelecimento() {
    return localidadeEstabelecimento;
  }
  public void setLocalidadeEstabelecimento(String localidadeEstabelecimento) {
    this.localidadeEstabelecimento = localidadeEstabelecimento;
  }

  
  /**
   * {{{transacao_nao_processada_response_modo_entrada_transacao_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_nao_processada_response_modo_entrada_transacao_value}}}")
  public String getModoEntradaTransacao() {
    return modoEntradaTransacao;
  }
  public void setModoEntradaTransacao(String modoEntradaTransacao) {
    this.modoEntradaTransacao = modoEntradaTransacao;
  }

  
  /**
   * {{{transacao_nao_processada_response_nome_estabelecimento_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_nao_processada_response_nome_estabelecimento_value}}}")
  public String getNomeEstabelecimento() {
    return nomeEstabelecimento;
  }
  public void setNomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
  }

  
  /**
   * {{{transacao_nao_processada_response_nome_fantasia_estabelecimento_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_nao_processada_response_nome_fantasia_estabelecimento_value}}}")
  public String getNomeFantasiaEstabelecimento() {
    return nomeFantasiaEstabelecimento;
  }
  public void setNomeFantasiaEstabelecimento(String nomeFantasiaEstabelecimento) {
    this.nomeFantasiaEstabelecimento = nomeFantasiaEstabelecimento;
  }

  
  /**
   * {{{transacao_nao_processada_response_nome_portador_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_nao_processada_response_nome_portador_value}}}")
  public String getNomePortador() {
    return nomePortador;
  }
  public void setNomePortador(String nomePortador) {
    this.nomePortador = nomePortador;
  }

  
  /**
   * {{{transacao_nao_processada_response_numero_parcela_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_nao_processada_response_numero_parcela_value}}}")
  public Long getParcela() {
    return parcela;
  }
  public void setParcela(Long parcela) {
    this.parcela = parcela;
  }

  
  /**
   * {{{transacao_nao_processada_response_plano_parcelamento_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_nao_processada_response_plano_parcelamento_value}}}")
  public Long getPlano() {
    return plano;
  }
  public void setPlano(Long plano) {
    this.plano = plano;
  }

  
  /**
   * {{{transacao_nao_processada_response_status_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_nao_processada_response_status_value}}}")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * {{{transacao_nao_processada_response_valor_taxa_embarque_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_nao_processada_response_valor_taxa_embarque_value}}}")
  public BigDecimal getTaxaEmbarque() {
    return taxaEmbarque;
  }
  public void setTaxaEmbarque(BigDecimal taxaEmbarque) {
    this.taxaEmbarque = taxaEmbarque;
  }

  
  /**
   * {{{transacao_nao_processada_response_valor_brl_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_nao_processada_response_valor_brl_value}}}")
  public BigDecimal getValorBRL() {
    return valorBRL;
  }
  public void setValorBRL(BigDecimal valorBRL) {
    this.valorBRL = valorBRL;
  }

  
  /**
   * {{{transacao_nao_processada_response_valor_entrada_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_nao_processada_response_valor_entrada_value}}}")
  public BigDecimal getValorEntrada() {
    return valorEntrada;
  }
  public void setValorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
  }

  
  /**
   * {{{transacao_nao_processada_response_valor_usd_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_nao_processada_response_valor_usd_value}}}")
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


