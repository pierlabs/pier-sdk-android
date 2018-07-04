package br.com.conductor.pier.api.v2.model;

import java.util.Date;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{codigo_chargeback_response_description}}}
 **/
@ApiModel(description = "{{{codigo_chargeback_response_description}}}")
public class CompraContestadaTransacaoResponse  {
  
  @SerializedName("agingCompras")
  private Long agingCompras = null;
  @SerializedName("agingContestacao")
  private Long agingContestacao = null;
  @SerializedName("bandeira")
  private String bandeira = null;
  @SerializedName("codigoAutorizacao")
  private String codigoAutorizacao = null;
  @SerializedName("codigoContestacao")
  private String codigoContestacao = null;
  @SerializedName("codigoEventoCompra")
  private String codigoEventoCompra = null;
  @SerializedName("codigoMoedaDestino")
  private String codigoMoedaDestino = null;
  @SerializedName("data2Reapresentacao")
  private String data2Reapresentacao = null;
  @SerializedName("dataAlteracao")
  private Date dataAlteracao = null;
  @SerializedName("dataContestacao")
  private Date dataContestacao = null;
  @SerializedName("dataEnvioCB")
  private String dataEnvioCB = null;
  @SerializedName("dataTransacao")
  private Date dataTransacao = null;
  @SerializedName("idCompraContestada")
  private Long idCompraContestada = null;
  @SerializedName("internacional")
  private Integer internacional = null;
  @SerializedName("mcc")
  private String mcc = null;
  @SerializedName("modoDeEntradaDescricao")
  private String modoDeEntradaDescricao = null;
  @SerializedName("modoEntrada")
  private String modoEntrada = null;
  @SerializedName("motivo2Reapresentacao")
  private String motivo2Reapresentacao = null;
  @SerializedName("nomeEstabelecimento")
  private String nomeEstabelecimento = null;
  @SerializedName("numeroControle")
  private String numeroControle = null;
  @SerializedName("razaoCB")
  private String razaoCB = null;
  @SerializedName("referenceNumber")
  private String referenceNumber = null;
  @SerializedName("reporteBandeira")
  private String reporteBandeira = null;
  @SerializedName("responsavelAbertuda")
  private String responsavelAbertuda = null;
  @SerializedName("responsavelAlteracao")
  private String responsavelAlteracao = null;
  @SerializedName("statusContestacao")
  private String statusContestacao = null;
  @SerializedName("texto2Reapresentacao")
  private String texto2Reapresentacao = null;
  @SerializedName("tipoTransacao")
  private String tipoTransacao = null;
  @SerializedName("transacaoSegura")
  private String transacaoSegura = null;
  @SerializedName("valorCompra")
  private Double valorCompra = null;
  @SerializedName("valorContrato")
  private Double valorContrato = null;
  @SerializedName("valorDestino")
  private Double valorDestino = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getAgingCompras() {
    return agingCompras;
  }
  public void setAgingCompras(Long agingCompras) {
    this.agingCompras = agingCompras;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getAgingContestacao() {
    return agingContestacao;
  }
  public void setAgingContestacao(Long agingContestacao) {
    this.agingContestacao = agingContestacao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getBandeira() {
    return bandeira;
  }
  public void setBandeira(String bandeira) {
    this.bandeira = bandeira;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getCodigoAutorizacao() {
    return codigoAutorizacao;
  }
  public void setCodigoAutorizacao(String codigoAutorizacao) {
    this.codigoAutorizacao = codigoAutorizacao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getCodigoContestacao() {
    return codigoContestacao;
  }
  public void setCodigoContestacao(String codigoContestacao) {
    this.codigoContestacao = codigoContestacao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getCodigoEventoCompra() {
    return codigoEventoCompra;
  }
  public void setCodigoEventoCompra(String codigoEventoCompra) {
    this.codigoEventoCompra = codigoEventoCompra;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getCodigoMoedaDestino() {
    return codigoMoedaDestino;
  }
  public void setCodigoMoedaDestino(String codigoMoedaDestino) {
    this.codigoMoedaDestino = codigoMoedaDestino;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getData2Reapresentacao() {
    return data2Reapresentacao;
  }
  public void setData2Reapresentacao(String data2Reapresentacao) {
    this.data2Reapresentacao = data2Reapresentacao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Date getDataAlteracao() {
    return dataAlteracao;
  }
  public void setDataAlteracao(Date dataAlteracao) {
    this.dataAlteracao = dataAlteracao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Date getDataContestacao() {
    return dataContestacao;
  }
  public void setDataContestacao(Date dataContestacao) {
    this.dataContestacao = dataContestacao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDataEnvioCB() {
    return dataEnvioCB;
  }
  public void setDataEnvioCB(String dataEnvioCB) {
    this.dataEnvioCB = dataEnvioCB;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Date getDataTransacao() {
    return dataTransacao;
  }
  public void setDataTransacao(Date dataTransacao) {
    this.dataTransacao = dataTransacao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getIdCompraContestada() {
    return idCompraContestada;
  }
  public void setIdCompraContestada(Long idCompraContestada) {
    this.idCompraContestada = idCompraContestada;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getInternacional() {
    return internacional;
  }
  public void setInternacional(Integer internacional) {
    this.internacional = internacional;
  }

  
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
   **/
  @ApiModelProperty(value = "")
  public String getModoDeEntradaDescricao() {
    return modoDeEntradaDescricao;
  }
  public void setModoDeEntradaDescricao(String modoDeEntradaDescricao) {
    this.modoDeEntradaDescricao = modoDeEntradaDescricao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getModoEntrada() {
    return modoEntrada;
  }
  public void setModoEntrada(String modoEntrada) {
    this.modoEntrada = modoEntrada;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getMotivo2Reapresentacao() {
    return motivo2Reapresentacao;
  }
  public void setMotivo2Reapresentacao(String motivo2Reapresentacao) {
    this.motivo2Reapresentacao = motivo2Reapresentacao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getNomeEstabelecimento() {
    return nomeEstabelecimento;
  }
  public void setNomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getNumeroControle() {
    return numeroControle;
  }
  public void setNumeroControle(String numeroControle) {
    this.numeroControle = numeroControle;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getRazaoCB() {
    return razaoCB;
  }
  public void setRazaoCB(String razaoCB) {
    this.razaoCB = razaoCB;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getReferenceNumber() {
    return referenceNumber;
  }
  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getReporteBandeira() {
    return reporteBandeira;
  }
  public void setReporteBandeira(String reporteBandeira) {
    this.reporteBandeira = reporteBandeira;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getResponsavelAbertuda() {
    return responsavelAbertuda;
  }
  public void setResponsavelAbertuda(String responsavelAbertuda) {
    this.responsavelAbertuda = responsavelAbertuda;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getResponsavelAlteracao() {
    return responsavelAlteracao;
  }
  public void setResponsavelAlteracao(String responsavelAlteracao) {
    this.responsavelAlteracao = responsavelAlteracao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getStatusContestacao() {
    return statusContestacao;
  }
  public void setStatusContestacao(String statusContestacao) {
    this.statusContestacao = statusContestacao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getTexto2Reapresentacao() {
    return texto2Reapresentacao;
  }
  public void setTexto2Reapresentacao(String texto2Reapresentacao) {
    this.texto2Reapresentacao = texto2Reapresentacao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getTipoTransacao() {
    return tipoTransacao;
  }
  public void setTipoTransacao(String tipoTransacao) {
    this.tipoTransacao = tipoTransacao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getTransacaoSegura() {
    return transacaoSegura;
  }
  public void setTransacaoSegura(String transacaoSegura) {
    this.transacaoSegura = transacaoSegura;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getValorCompra() {
    return valorCompra;
  }
  public void setValorCompra(Double valorCompra) {
    this.valorCompra = valorCompra;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getValorContrato() {
    return valorContrato;
  }
  public void setValorContrato(Double valorContrato) {
    this.valorContrato = valorContrato;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getValorDestino() {
    return valorDestino;
  }
  public void setValorDestino(Double valorDestino) {
    this.valorDestino = valorDestino;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompraContestadaTransacaoResponse {\n");
    
    sb.append("  agingCompras: ").append(agingCompras).append("\n");
    sb.append("  agingContestacao: ").append(agingContestacao).append("\n");
    sb.append("  bandeira: ").append(bandeira).append("\n");
    sb.append("  codigoAutorizacao: ").append(codigoAutorizacao).append("\n");
    sb.append("  codigoContestacao: ").append(codigoContestacao).append("\n");
    sb.append("  codigoEventoCompra: ").append(codigoEventoCompra).append("\n");
    sb.append("  codigoMoedaDestino: ").append(codigoMoedaDestino).append("\n");
    sb.append("  data2Reapresentacao: ").append(data2Reapresentacao).append("\n");
    sb.append("  dataAlteracao: ").append(dataAlteracao).append("\n");
    sb.append("  dataContestacao: ").append(dataContestacao).append("\n");
    sb.append("  dataEnvioCB: ").append(dataEnvioCB).append("\n");
    sb.append("  dataTransacao: ").append(dataTransacao).append("\n");
    sb.append("  idCompraContestada: ").append(idCompraContestada).append("\n");
    sb.append("  internacional: ").append(internacional).append("\n");
    sb.append("  mcc: ").append(mcc).append("\n");
    sb.append("  modoDeEntradaDescricao: ").append(modoDeEntradaDescricao).append("\n");
    sb.append("  modoEntrada: ").append(modoEntrada).append("\n");
    sb.append("  motivo2Reapresentacao: ").append(motivo2Reapresentacao).append("\n");
    sb.append("  nomeEstabelecimento: ").append(nomeEstabelecimento).append("\n");
    sb.append("  numeroControle: ").append(numeroControle).append("\n");
    sb.append("  razaoCB: ").append(razaoCB).append("\n");
    sb.append("  referenceNumber: ").append(referenceNumber).append("\n");
    sb.append("  reporteBandeira: ").append(reporteBandeira).append("\n");
    sb.append("  responsavelAbertuda: ").append(responsavelAbertuda).append("\n");
    sb.append("  responsavelAlteracao: ").append(responsavelAlteracao).append("\n");
    sb.append("  statusContestacao: ").append(statusContestacao).append("\n");
    sb.append("  texto2Reapresentacao: ").append(texto2Reapresentacao).append("\n");
    sb.append("  tipoTransacao: ").append(tipoTransacao).append("\n");
    sb.append("  transacaoSegura: ").append(transacaoSegura).append("\n");
    sb.append("  valorCompra: ").append(valorCompra).append("\n");
    sb.append("  valorContrato: ").append(valorContrato).append("\n");
    sb.append("  valorDestino: ").append(valorDestino).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


