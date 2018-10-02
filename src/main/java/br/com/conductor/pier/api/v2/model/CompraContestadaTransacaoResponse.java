package br.com.conductor.pier.api.v2.model;

import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{compra_contestada_transacao_response_description}}}
 **/
@ApiModel(description = "{{{compra_contestada_transacao_response_description}}}")
public class CompraContestadaTransacaoResponse  {
  
  @SerializedName("mcc")
  private String mcc = null;
  @SerializedName("idCompraContestada")
  private Long idCompraContestada = null;
  @SerializedName("bandeira")
  private String bandeira = null;
  @SerializedName("historico")
  private String historico = null;
  @SerializedName("dataTransacao")
  private Date dataTransacao = null;
  @SerializedName("agingCompras")
  private Long agingCompras = null;
  @SerializedName("valorContrato")
  private Double valorContrato = null;
  @SerializedName("valorCompra")
  private Double valorCompra = null;
  @SerializedName("tipoTransacao")
  private String tipoTransacao = null;
  @SerializedName("codigoAutorizacao")
  private String codigoAutorizacao = null;
  @SerializedName("codigoMoedaDestino")
  private String codigoMoedaDestino = null;
  @SerializedName("valorDestino")
  private Double valorDestino = null;
  @SerializedName("codigoEventoCompra")
  private String codigoEventoCompra = null;
  @SerializedName("codigoContestacao")
  private String codigoContestacao = null;
  @SerializedName("internacional")
  private Integer internacional = null;
  @SerializedName("modoEntrada")
  private String modoEntrada = null;
  @SerializedName("modoDeEntradaDescricao")
  private String modoDeEntradaDescricao = null;
  @SerializedName("nomeEstabelecimento")
  private String nomeEstabelecimento = null;
  @SerializedName("dataContestacao")
  private Date dataContestacao = null;
  @SerializedName("responsavelAbertuda")
  private String responsavelAbertuda = null;
  @SerializedName("agingContestacao")
  private Long agingContestacao = null;
  @SerializedName("statusContestacao")
  private String statusContestacao = null;
  @SerializedName("dataAlteracao")
  private Date dataAlteracao = null;
  @SerializedName("responsavelAlteracao")
  private String responsavelAlteracao = null;
  @SerializedName("razaoCB")
  private String razaoCB = null;
  @SerializedName("dataEnvioCB")
  private String dataEnvioCB = null;
  @SerializedName("reporteBandeira")
  private String reporteBandeira = null;
  @SerializedName("numeroControle")
  private String numeroControle = null;
  @SerializedName("referenceNumber")
  private String referenceNumber = null;
  @SerializedName("transacaoSegura")
  private String transacaoSegura = null;
  @SerializedName("motivo2Reapresentacao")
  private String motivo2Reapresentacao = null;
  @SerializedName("data2Reapresentacao")
  private String data2Reapresentacao = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getMcc() {
    return mcc;
  }
  public void setMcc(String mcc) {
    this.mcc = mcc;
  }

  
  /**
   * {{{compra_contestada_transacao_response_id_compra_contestada_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_contestada_transacao_response_id_compra_contestada_value}}}")
  public Long getIdCompraContestada() {
    return idCompraContestada;
  }
  public void setIdCompraContestada(Long idCompraContestada) {
    this.idCompraContestada = idCompraContestada;
  }

  
  /**
   * {{{compra_contestada_transacao_response_bandeira_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_contestada_transacao_response_bandeira_value}}}")
  public String getBandeira() {
    return bandeira;
  }
  public void setBandeira(String bandeira) {
    this.bandeira = bandeira;
  }

  
  /**
   * {{{compra_contestada_transacao_response_historico_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_contestada_transacao_response_historico_value}}}")
  public String getHistorico() {
    return historico;
  }
  public void setHistorico(String historico) {
    this.historico = historico;
  }

  
  /**
   * {{{compra_contestada_transacao_response_data_transacao_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_contestada_transacao_response_data_transacao_value}}}")
  public Date getDataTransacao() {
    return dataTransacao;
  }
  public void setDataTransacao(Date dataTransacao) {
    this.dataTransacao = dataTransacao;
  }

  
  /**
   * {{{compra_contestada_transacao_response_aging_compras_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_contestada_transacao_response_aging_compras_value}}}")
  public Long getAgingCompras() {
    return agingCompras;
  }
  public void setAgingCompras(Long agingCompras) {
    this.agingCompras = agingCompras;
  }

  
  /**
   * {{{compra_contestada_transacao_response_valor_contrato_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_contestada_transacao_response_valor_contrato_value}}}")
  public Double getValorContrato() {
    return valorContrato;
  }
  public void setValorContrato(Double valorContrato) {
    this.valorContrato = valorContrato;
  }

  
  /**
   * {{{compra_contestada_transacao_response_valor_compra_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_contestada_transacao_response_valor_compra_value}}}")
  public Double getValorCompra() {
    return valorCompra;
  }
  public void setValorCompra(Double valorCompra) {
    this.valorCompra = valorCompra;
  }

  
  /**
   * {{{compra_contestada_transacao_response_tipo_transacao_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_contestada_transacao_response_tipo_transacao_value}}}")
  public String getTipoTransacao() {
    return tipoTransacao;
  }
  public void setTipoTransacao(String tipoTransacao) {
    this.tipoTransacao = tipoTransacao;
  }

  
  /**
   * {{{compra_contestada_transacao_response_codigo_autorizacao_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_contestada_transacao_response_codigo_autorizacao_value}}}")
  public String getCodigoAutorizacao() {
    return codigoAutorizacao;
  }
  public void setCodigoAutorizacao(String codigoAutorizacao) {
    this.codigoAutorizacao = codigoAutorizacao;
  }

  
  /**
   * {{{compra_contestada_transacao_response_codigo_moeda_destino_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_contestada_transacao_response_codigo_moeda_destino_value}}}")
  public String getCodigoMoedaDestino() {
    return codigoMoedaDestino;
  }
  public void setCodigoMoedaDestino(String codigoMoedaDestino) {
    this.codigoMoedaDestino = codigoMoedaDestino;
  }

  
  /**
   * {{{compra_contestada_transacao_response_valor_destino_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_contestada_transacao_response_valor_destino_value}}}")
  public Double getValorDestino() {
    return valorDestino;
  }
  public void setValorDestino(Double valorDestino) {
    this.valorDestino = valorDestino;
  }

  
  /**
   * {{{compra_contestada_transacao_response_codigo_evento_compra_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_contestada_transacao_response_codigo_evento_compra_value}}}")
  public String getCodigoEventoCompra() {
    return codigoEventoCompra;
  }
  public void setCodigoEventoCompra(String codigoEventoCompra) {
    this.codigoEventoCompra = codigoEventoCompra;
  }

  
  /**
   * {{{compra_contestada_transacao_response_codigo_contestacao_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_contestada_transacao_response_codigo_contestacao_value}}}")
  public String getCodigoContestacao() {
    return codigoContestacao;
  }
  public void setCodigoContestacao(String codigoContestacao) {
    this.codigoContestacao = codigoContestacao;
  }

  
  /**
   * {{{compra_contestada_transacao_response_internacional_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_contestada_transacao_response_internacional_value}}}")
  public Integer getInternacional() {
    return internacional;
  }
  public void setInternacional(Integer internacional) {
    this.internacional = internacional;
  }

  
  /**
   * {{{compra_contestada_transacao_response_modo_entrada_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_contestada_transacao_response_modo_entrada_value}}}")
  public String getModoEntrada() {
    return modoEntrada;
  }
  public void setModoEntrada(String modoEntrada) {
    this.modoEntrada = modoEntrada;
  }

  
  /**
   * {{{compra_contestada_transacao_response_modo_deentrada_descricao_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_contestada_transacao_response_modo_deentrada_descricao_value}}}")
  public String getModoDeEntradaDescricao() {
    return modoDeEntradaDescricao;
  }
  public void setModoDeEntradaDescricao(String modoDeEntradaDescricao) {
    this.modoDeEntradaDescricao = modoDeEntradaDescricao;
  }

  
  /**
   * {{{compra_contestada_transacao_response_nome_estabelecimento_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_contestada_transacao_response_nome_estabelecimento_value}}}")
  public String getNomeEstabelecimento() {
    return nomeEstabelecimento;
  }
  public void setNomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
  }

  
  /**
   * {{{compra_contestada_transacao_response_data_contestacao_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_contestada_transacao_response_data_contestacao_value}}}")
  public Date getDataContestacao() {
    return dataContestacao;
  }
  public void setDataContestacao(Date dataContestacao) {
    this.dataContestacao = dataContestacao;
  }

  
  /**
   * {{{compra_contestada_transacao_response_responsavel_abertuda_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_contestada_transacao_response_responsavel_abertuda_value}}}")
  public String getResponsavelAbertuda() {
    return responsavelAbertuda;
  }
  public void setResponsavelAbertuda(String responsavelAbertuda) {
    this.responsavelAbertuda = responsavelAbertuda;
  }

  
  /**
   * {{{compra_contestada_transacao_response_aging_contestacao_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_contestada_transacao_response_aging_contestacao_value}}}")
  public Long getAgingContestacao() {
    return agingContestacao;
  }
  public void setAgingContestacao(Long agingContestacao) {
    this.agingContestacao = agingContestacao;
  }

  
  /**
   * {{{compra_contestada_transacao_response_status_contestacao_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_contestada_transacao_response_status_contestacao_value}}}")
  public String getStatusContestacao() {
    return statusContestacao;
  }
  public void setStatusContestacao(String statusContestacao) {
    this.statusContestacao = statusContestacao;
  }

  
  /**
   * {{{compra_contestada_transacao_response_data_alteracao_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_contestada_transacao_response_data_alteracao_value}}}")
  public Date getDataAlteracao() {
    return dataAlteracao;
  }
  public void setDataAlteracao(Date dataAlteracao) {
    this.dataAlteracao = dataAlteracao;
  }

  
  /**
   * {{{compra_contestada_transacao_response_responsavel_alteracao_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_contestada_transacao_response_responsavel_alteracao_value}}}")
  public String getResponsavelAlteracao() {
    return responsavelAlteracao;
  }
  public void setResponsavelAlteracao(String responsavelAlteracao) {
    this.responsavelAlteracao = responsavelAlteracao;
  }

  
  /**
   * {{{compra_contestada_transacao_response_razao_cb_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_contestada_transacao_response_razao_cb_value}}}")
  public String getRazaoCB() {
    return razaoCB;
  }
  public void setRazaoCB(String razaoCB) {
    this.razaoCB = razaoCB;
  }

  
  /**
   * {{{compra_contestada_transacao_response_data_envio_cb_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_contestada_transacao_response_data_envio_cb_value}}}")
  public String getDataEnvioCB() {
    return dataEnvioCB;
  }
  public void setDataEnvioCB(String dataEnvioCB) {
    this.dataEnvioCB = dataEnvioCB;
  }

  
  /**
   * {{{compra_contestada_transacao_response_reporte_bandeira_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_contestada_transacao_response_reporte_bandeira_value}}}")
  public String getReporteBandeira() {
    return reporteBandeira;
  }
  public void setReporteBandeira(String reporteBandeira) {
    this.reporteBandeira = reporteBandeira;
  }

  
  /**
   * {{{compra_contestada_transacao_response_numero_controle_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_contestada_transacao_response_numero_controle_value}}}")
  public String getNumeroControle() {
    return numeroControle;
  }
  public void setNumeroControle(String numeroControle) {
    this.numeroControle = numeroControle;
  }

  
  /**
   * {{{compra_contestada_transacao_response_reference_number_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_contestada_transacao_response_reference_number_value}}}")
  public String getReferenceNumber() {
    return referenceNumber;
  }
  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }

  
  /**
   * {{{compra_contestada_transacao_response_transacao_segura_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_contestada_transacao_response_transacao_segura_value}}}")
  public String getTransacaoSegura() {
    return transacaoSegura;
  }
  public void setTransacaoSegura(String transacaoSegura) {
    this.transacaoSegura = transacaoSegura;
  }

  
  /**
   * {{{compra_contestada_transacao_response_motivo_2_reapresentacao_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_contestada_transacao_response_motivo_2_reapresentacao_value}}}")
  public String getMotivo2Reapresentacao() {
    return motivo2Reapresentacao;
  }
  public void setMotivo2Reapresentacao(String motivo2Reapresentacao) {
    this.motivo2Reapresentacao = motivo2Reapresentacao;
  }

  
  /**
   * {{{compra_contestada_transacao_response_data_2_reapresentacao_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_contestada_transacao_response_data_2_reapresentacao_value}}}")
  public String getData2Reapresentacao() {
    return data2Reapresentacao;
  }
  public void setData2Reapresentacao(String data2Reapresentacao) {
    this.data2Reapresentacao = data2Reapresentacao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompraContestadaTransacaoResponse {\n");
    
    sb.append("  mcc: ").append(mcc).append("\n");
    sb.append("  idCompraContestada: ").append(idCompraContestada).append("\n");
    sb.append("  bandeira: ").append(bandeira).append("\n");
    sb.append("  historico: ").append(historico).append("\n");
    sb.append("  dataTransacao: ").append(dataTransacao).append("\n");
    sb.append("  agingCompras: ").append(agingCompras).append("\n");
    sb.append("  valorContrato: ").append(valorContrato).append("\n");
    sb.append("  valorCompra: ").append(valorCompra).append("\n");
    sb.append("  tipoTransacao: ").append(tipoTransacao).append("\n");
    sb.append("  codigoAutorizacao: ").append(codigoAutorizacao).append("\n");
    sb.append("  codigoMoedaDestino: ").append(codigoMoedaDestino).append("\n");
    sb.append("  valorDestino: ").append(valorDestino).append("\n");
    sb.append("  codigoEventoCompra: ").append(codigoEventoCompra).append("\n");
    sb.append("  codigoContestacao: ").append(codigoContestacao).append("\n");
    sb.append("  internacional: ").append(internacional).append("\n");
    sb.append("  modoEntrada: ").append(modoEntrada).append("\n");
    sb.append("  modoDeEntradaDescricao: ").append(modoDeEntradaDescricao).append("\n");
    sb.append("  nomeEstabelecimento: ").append(nomeEstabelecimento).append("\n");
    sb.append("  dataContestacao: ").append(dataContestacao).append("\n");
    sb.append("  responsavelAbertuda: ").append(responsavelAbertuda).append("\n");
    sb.append("  agingContestacao: ").append(agingContestacao).append("\n");
    sb.append("  statusContestacao: ").append(statusContestacao).append("\n");
    sb.append("  dataAlteracao: ").append(dataAlteracao).append("\n");
    sb.append("  responsavelAlteracao: ").append(responsavelAlteracao).append("\n");
    sb.append("  razaoCB: ").append(razaoCB).append("\n");
    sb.append("  dataEnvioCB: ").append(dataEnvioCB).append("\n");
    sb.append("  reporteBandeira: ").append(reporteBandeira).append("\n");
    sb.append("  numeroControle: ").append(numeroControle).append("\n");
    sb.append("  referenceNumber: ").append(referenceNumber).append("\n");
    sb.append("  transacaoSegura: ").append(transacaoSegura).append("\n");
    sb.append("  motivo2Reapresentacao: ").append(motivo2Reapresentacao).append("\n");
    sb.append("  data2Reapresentacao: ").append(data2Reapresentacao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
