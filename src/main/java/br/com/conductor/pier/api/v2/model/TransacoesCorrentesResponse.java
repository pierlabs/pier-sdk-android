package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{transacoes_correntes_response_description}}}
 **/
@ApiModel(description = "{{{transacoes_correntes_response_description}}}")
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
   * {{{transacoes_correntes_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{transacoes_correntes_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{transacoes_correntes_response_id_tipo_transacao_value}}}
   **/
  @ApiModelProperty(value = "{{{transacoes_correntes_response_id_tipo_transacao_value}}}")
  public Long getIdTipoTransacao() {
    return idTipoTransacao;
  }
  public void setIdTipoTransacao(Long idTipoTransacao) {
    this.idTipoTransacao = idTipoTransacao;
  }

  
  /**
   * {{{transacoes_correntes_response_descricao_abreviada_value}}}
   **/
  @ApiModelProperty(value = "{{{transacoes_correntes_response_descricao_abreviada_value}}}")
  public String getDescricaoAbreviada() {
    return descricaoAbreviada;
  }
  public void setDescricaoAbreviada(String descricaoAbreviada) {
    this.descricaoAbreviada = descricaoAbreviada;
  }

  
  /**
   * {{{transacoes_correntes_response_status_transacao_value}}}
   **/
  @ApiModelProperty(value = "{{{transacoes_correntes_response_status_transacao_value}}}")
  public String getStatusTransacao() {
    return statusTransacao;
  }
  public void setStatusTransacao(String statusTransacao) {
    this.statusTransacao = statusTransacao;
  }

  
  /**
   * {{{transacoes_correntes_response_id_evento_value}}}
   **/
  @ApiModelProperty(value = "{{{transacoes_correntes_response_id_evento_value}}}")
  public Long getIdEvento() {
    return idEvento;
  }
  public void setIdEvento(Long idEvento) {
    this.idEvento = idEvento;
  }

  
  /**
   * {{{transacoes_correntes_response_tipo_evento_value}}}
   **/
  @ApiModelProperty(value = "{{{transacoes_correntes_response_tipo_evento_value}}}")
  public String getTipoEvento() {
    return tipoEvento;
  }
  public void setTipoEvento(String tipoEvento) {
    this.tipoEvento = tipoEvento;
  }

  
  /**
   * {{{transacoes_correntes_response_id_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{transacoes_correntes_response_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{transacoes_correntes_response_cartao_mascarado_value}}}
   **/
  @ApiModelProperty(value = "{{{transacoes_correntes_response_cartao_mascarado_value}}}")
  public String getCartaoMascarado() {
    return cartaoMascarado;
  }
  public void setCartaoMascarado(String cartaoMascarado) {
    this.cartaoMascarado = cartaoMascarado;
  }

  
  /**
   * {{{transacoes_correntes_response_nome_portador_value}}}
   **/
  @ApiModelProperty(value = "{{{transacoes_correntes_response_nome_portador_value}}}")
  public String getNomePortador() {
    return nomePortador;
  }
  public void setNomePortador(String nomePortador) {
    this.nomePortador = nomePortador;
  }

  
  /**
   * {{{transacoes_correntes_response_data_transacao_value}}}
   **/
  @ApiModelProperty(value = "{{{transacoes_correntes_response_data_transacao_value}}}")
  public String getDataTransacao() {
    return dataTransacao;
  }
  public void setDataTransacao(String dataTransacao) {
    this.dataTransacao = dataTransacao;
  }

  
  /**
   * {{{transacoes_correntes_response_data_faturamento_value}}}
   **/
  @ApiModelProperty(value = "{{{transacoes_correntes_response_data_faturamento_value}}}")
  public String getDataFaturamento() {
    return dataFaturamento;
  }
  public void setDataFaturamento(String dataFaturamento) {
    this.dataFaturamento = dataFaturamento;
  }

  
  /**
   * {{{transacoes_correntes_response_data_vencimento_value}}}
   **/
  @ApiModelProperty(value = "{{{transacoes_correntes_response_data_vencimento_value}}}")
  public String getDataVencimento() {
    return dataVencimento;
  }
  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  
  /**
   * {{{transacoes_correntes_response_modo_entrada_transacao_value}}}
   **/
  @ApiModelProperty(value = "{{{transacoes_correntes_response_modo_entrada_transacao_value}}}")
  public String getModoEntradaTransacao() {
    return modoEntradaTransacao;
  }
  public void setModoEntradaTransacao(String modoEntradaTransacao) {
    this.modoEntradaTransacao = modoEntradaTransacao;
  }

  
  /**
   * {{{transacoes_correntes_response_valor_taxa_embarque_value}}}
   **/
  @ApiModelProperty(value = "{{{transacoes_correntes_response_valor_taxa_embarque_value}}}")
  public BigDecimal getValorTaxaEmbarque() {
    return valorTaxaEmbarque;
  }
  public void setValorTaxaEmbarque(BigDecimal valorTaxaEmbarque) {
    this.valorTaxaEmbarque = valorTaxaEmbarque;
  }

  
  /**
   * {{{transacoes_correntes_response_valor_entrada_value}}}
   **/
  @ApiModelProperty(value = "{{{transacoes_correntes_response_valor_entrada_value}}}")
  public BigDecimal getValorEntrada() {
    return valorEntrada;
  }
  public void setValorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
  }

  
  /**
   * {{{transacoes_correntes_response_valor_b_r_l_value}}}
   **/
  @ApiModelProperty(value = "{{{transacoes_correntes_response_valor_b_r_l_value}}}")
  public BigDecimal getValorBRL() {
    return valorBRL;
  }
  public void setValorBRL(BigDecimal valorBRL) {
    this.valorBRL = valorBRL;
  }

  
  /**
   * {{{transacoes_correntes_response_valor_u_s_d_value}}}
   **/
  @ApiModelProperty(value = "{{{transacoes_correntes_response_valor_u_s_d_value}}}")
  public BigDecimal getValorUSD() {
    return valorUSD;
  }
  public void setValorUSD(BigDecimal valorUSD) {
    this.valorUSD = valorUSD;
  }

  
  /**
   * {{{transacoes_correntes_response_cotacao_u_s_d_value}}}
   **/
  @ApiModelProperty(value = "{{{transacoes_correntes_response_cotacao_u_s_d_value}}}")
  public BigDecimal getCotacaoUSD() {
    return cotacaoUSD;
  }
  public void setCotacaoUSD(BigDecimal cotacaoUSD) {
    this.cotacaoUSD = cotacaoUSD;
  }

  
  /**
   * {{{transacoes_correntes_response_data_cotacao_u_s_d_value}}}
   **/
  @ApiModelProperty(value = "{{{transacoes_correntes_response_data_cotacao_u_s_d_value}}}")
  public String getDataCotacaoUSD() {
    return dataCotacaoUSD;
  }
  public void setDataCotacaoUSD(String dataCotacaoUSD) {
    this.dataCotacaoUSD = dataCotacaoUSD;
  }

  
  /**
   * {{{transacoes_correntes_response_codigo_moeda_origem_value}}}
   **/
  @ApiModelProperty(value = "{{{transacoes_correntes_response_codigo_moeda_origem_value}}}")
  public String getCodigoMoedaOrigem() {
    return codigoMoedaOrigem;
  }
  public void setCodigoMoedaOrigem(String codigoMoedaOrigem) {
    this.codigoMoedaOrigem = codigoMoedaOrigem;
  }

  
  /**
   * {{{transacoes_correntes_response_codigo_moeda_destino_value}}}
   **/
  @ApiModelProperty(value = "{{{transacoes_correntes_response_codigo_moeda_destino_value}}}")
  public String getCodigoMoedaDestino() {
    return codigoMoedaDestino;
  }
  public void setCodigoMoedaDestino(String codigoMoedaDestino) {
    this.codigoMoedaDestino = codigoMoedaDestino;
  }

  
  /**
   * {{{transacoes_correntes_response_codigo_autorizacao_value}}}
   **/
  @ApiModelProperty(value = "{{{transacoes_correntes_response_codigo_autorizacao_value}}}")
  public String getCodigoAutorizacao() {
    return codigoAutorizacao;
  }
  public void setCodigoAutorizacao(String codigoAutorizacao) {
    this.codigoAutorizacao = codigoAutorizacao;
  }

  
  /**
   * {{{transacoes_correntes_response_codigo_referencia_value}}}
   **/
  @ApiModelProperty(value = "{{{transacoes_correntes_response_codigo_referencia_value}}}")
  public String getCodigoReferencia() {
    return codigoReferencia;
  }
  public void setCodigoReferencia(String codigoReferencia) {
    this.codigoReferencia = codigoReferencia;
  }

  
  /**
   * {{{transacoes_correntes_response_codigo_terminal_value}}}
   **/
  @ApiModelProperty(value = "{{{transacoes_correntes_response_codigo_terminal_value}}}")
  public String getCodigoTerminal() {
    return codigoTerminal;
  }
  public void setCodigoTerminal(String codigoTerminal) {
    this.codigoTerminal = codigoTerminal;
  }

  
  /**
   * {{{transacoes_correntes_response_codigo_m_c_c_value}}}
   **/
  @ApiModelProperty(value = "{{{transacoes_correntes_response_codigo_m_c_c_value}}}")
  public Long getCodigoMCC() {
    return codigoMCC;
  }
  public void setCodigoMCC(Long codigoMCC) {
    this.codigoMCC = codigoMCC;
  }

  
  /**
   * {{{transacoes_correntes_response_grupo_m_c_c_value}}}
   **/
  @ApiModelProperty(value = "{{{transacoes_correntes_response_grupo_m_c_c_value}}}")
  public Long getGrupoMCC() {
    return grupoMCC;
  }
  public void setGrupoMCC(Long grupoMCC) {
    this.grupoMCC = grupoMCC;
  }

  
  /**
   * {{{transacoes_correntes_response_grupo_descricao_m_c_c_value}}}
   **/
  @ApiModelProperty(value = "{{{transacoes_correntes_response_grupo_descricao_m_c_c_value}}}")
  public String getGrupoDescricaoMCC() {
    return grupoDescricaoMCC;
  }
  public void setGrupoDescricaoMCC(String grupoDescricaoMCC) {
    this.grupoDescricaoMCC = grupoDescricaoMCC;
  }

  
  /**
   * {{{transacoes_correntes_response_id_estabelecimento_value}}}
   **/
  @ApiModelProperty(value = "{{{transacoes_correntes_response_id_estabelecimento_value}}}")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * {{{transacoes_correntes_response_nome_estabelecimento_value}}}
   **/
  @ApiModelProperty(value = "{{{transacoes_correntes_response_nome_estabelecimento_value}}}")
  public String getNomeEstabelecimento() {
    return nomeEstabelecimento;
  }
  public void setNomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
  }

  
  /**
   * {{{transacoes_correntes_response_nome_fantasia_estabelecimento_value}}}
   **/
  @ApiModelProperty(value = "{{{transacoes_correntes_response_nome_fantasia_estabelecimento_value}}}")
  public String getNomeFantasiaEstabelecimento() {
    return nomeFantasiaEstabelecimento;
  }
  public void setNomeFantasiaEstabelecimento(String nomeFantasiaEstabelecimento) {
    this.nomeFantasiaEstabelecimento = nomeFantasiaEstabelecimento;
  }

  
  /**
   * {{{transacoes_correntes_response_localidade_estabelecimento_value}}}
   **/
  @ApiModelProperty(value = "{{{transacoes_correntes_response_localidade_estabelecimento_value}}}")
  public String getLocalidadeEstabelecimento() {
    return localidadeEstabelecimento;
  }
  public void setLocalidadeEstabelecimento(String localidadeEstabelecimento) {
    this.localidadeEstabelecimento = localidadeEstabelecimento;
  }

  
  /**
   * {{{transacoes_correntes_response_plano_parcelamento_value}}}
   **/
  @ApiModelProperty(value = "{{{transacoes_correntes_response_plano_parcelamento_value}}}")
  public Long getPlanoParcelamento() {
    return planoParcelamento;
  }
  public void setPlanoParcelamento(Long planoParcelamento) {
    this.planoParcelamento = planoParcelamento;
  }

  
  /**
   * {{{transacoes_correntes_response_numero_parcela_value}}}
   **/
  @ApiModelProperty(value = "{{{transacoes_correntes_response_numero_parcela_value}}}")
  public Long getNumeroParcela() {
    return numeroParcela;
  }
  public void setNumeroParcela(Long numeroParcela) {
    this.numeroParcela = numeroParcela;
  }

  
  /**
   * {{{transacoes_correntes_response_detalhes_transacao_value}}}
   **/
  @ApiModelProperty(value = "{{{transacoes_correntes_response_detalhes_transacao_value}}}")
  public String getDetalhesTransacao() {
    return detalhesTransacao;
  }
  public void setDetalhesTransacao(String detalhesTransacao) {
    this.detalhesTransacao = detalhesTransacao;
  }

  
  /**
   * {{{transacoes_correntes_response_flag_credito_value}}}
   **/
  @ApiModelProperty(value = "{{{transacoes_correntes_response_flag_credito_value}}}")
  public Integer getFlagCredito() {
    return flagCredito;
  }
  public void setFlagCredito(Integer flagCredito) {
    this.flagCredito = flagCredito;
  }

  
  /**
   * {{{transacoes_correntes_response_flag_faturado_value}}}
   **/
  @ApiModelProperty(value = "{{{transacoes_correntes_response_flag_faturado_value}}}")
  public Integer getFlagFaturado() {
    return flagFaturado;
  }
  public void setFlagFaturado(Integer flagFaturado) {
    this.flagFaturado = flagFaturado;
  }

  
  /**
   * {{{transacoes_correntes_response_flag_estorno_value}}}
   **/
  @ApiModelProperty(value = "{{{transacoes_correntes_response_flag_estorno_value}}}")
  public Integer getFlagEstorno() {
    return flagEstorno;
  }
  public void setFlagEstorno(Integer flagEstorno) {
    this.flagEstorno = flagEstorno;
  }

  
  /**
   * {{{transacoes_correntes_response_id_transacao_estorno_value}}}
   **/
  @ApiModelProperty(value = "{{{transacoes_correntes_response_id_transacao_estorno_value}}}")
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
