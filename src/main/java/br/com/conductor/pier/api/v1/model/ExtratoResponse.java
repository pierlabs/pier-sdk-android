package br.com.conductor.pier.api.v1.model;

import java.util.Date;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class ExtratoResponse  {
  
  @SerializedName("cartao")
  private String cartao = null;
  @SerializedName("chip")
  private String chip = null;
  @SerializedName("cidadeUFPais")
  private String cidadeUFPais = null;
  @SerializedName("codigoAutorizacao")
  private String codigoAutorizacao = null;
  @SerializedName("codigoMoeda")
  private String codigoMoeda = null;
  @SerializedName("codigoMoedaDestino")
  private String codigoMoedaDestino = null;
  @SerializedName("cotacaoDolar")
  private Double cotacaoDolar = null;
  @SerializedName("credito")
  private Double credito = null;
  @SerializedName("dataCompra")
  private String dataCompra = null;
  @SerializedName("dataCotacaoDolar")
  private Date dataCotacaoDolar = null;
  @SerializedName("dataEntradaCompra")
  private String dataEntradaCompra = null;
  @SerializedName("dataTransacaoUTC")
  private String dataTransacaoUTC = null;
  @SerializedName("debito")
  private Double debito = null;
  @SerializedName("descricaoModoEntrada")
  private String descricaoModoEntrada = null;
  @SerializedName("descricaoTransacao")
  private String descricaoTransacao = null;
  @SerializedName("encargosFinanceiros")
  private Double encargosFinanceiros = null;
  @SerializedName("historico")
  private String historico = null;
  @SerializedName("idEventoExterno")
  private Integer idEventoExterno = null;
  @SerializedName("idTipoTransacao")
  private Integer idTipoTransacao = null;
  @SerializedName("idTransacao")
  private Integer idTransacao = null;
  @SerializedName("mcc")
  private Integer mcc = null;
  @SerializedName("nomeEstabVisa")
  private String nomeEstabVisa = null;
  @SerializedName("nomePlastico")
  private String nomePlastico = null;
  @SerializedName("numeroEstabelecimento")
  private Integer numeroEstabelecimento = null;
  @SerializedName("origem")
  private String origem = null;
  @SerializedName("taxaEmbarque")
  private Double taxaEmbarque = null;
  @SerializedName("tipoEvento")
  private String tipoEvento = null;
  @SerializedName("valorDolar")
  private Double valorDolar = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getCartao() {
    return cartao;
  }
  public void setCartao(String cartao) {
    this.cartao = cartao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getChip() {
    return chip;
  }
  public void setChip(String chip) {
    this.chip = chip;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getCidadeUFPais() {
    return cidadeUFPais;
  }
  public void setCidadeUFPais(String cidadeUFPais) {
    this.cidadeUFPais = cidadeUFPais;
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
  public String getCodigoMoeda() {
    return codigoMoeda;
  }
  public void setCodigoMoeda(String codigoMoeda) {
    this.codigoMoeda = codigoMoeda;
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
  public Double getCotacaoDolar() {
    return cotacaoDolar;
  }
  public void setCotacaoDolar(Double cotacaoDolar) {
    this.cotacaoDolar = cotacaoDolar;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getCredito() {
    return credito;
  }
  public void setCredito(Double credito) {
    this.credito = credito;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDataCompra() {
    return dataCompra;
  }
  public void setDataCompra(String dataCompra) {
    this.dataCompra = dataCompra;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Date getDataCotacaoDolar() {
    return dataCotacaoDolar;
  }
  public void setDataCotacaoDolar(Date dataCotacaoDolar) {
    this.dataCotacaoDolar = dataCotacaoDolar;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDataEntradaCompra() {
    return dataEntradaCompra;
  }
  public void setDataEntradaCompra(String dataEntradaCompra) {
    this.dataEntradaCompra = dataEntradaCompra;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDataTransacaoUTC() {
    return dataTransacaoUTC;
  }
  public void setDataTransacaoUTC(String dataTransacaoUTC) {
    this.dataTransacaoUTC = dataTransacaoUTC;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getDebito() {
    return debito;
  }
  public void setDebito(Double debito) {
    this.debito = debito;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescricaoModoEntrada() {
    return descricaoModoEntrada;
  }
  public void setDescricaoModoEntrada(String descricaoModoEntrada) {
    this.descricaoModoEntrada = descricaoModoEntrada;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescricaoTransacao() {
    return descricaoTransacao;
  }
  public void setDescricaoTransacao(String descricaoTransacao) {
    this.descricaoTransacao = descricaoTransacao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getEncargosFinanceiros() {
    return encargosFinanceiros;
  }
  public void setEncargosFinanceiros(Double encargosFinanceiros) {
    this.encargosFinanceiros = encargosFinanceiros;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getHistorico() {
    return historico;
  }
  public void setHistorico(String historico) {
    this.historico = historico;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getIdEventoExterno() {
    return idEventoExterno;
  }
  public void setIdEventoExterno(Integer idEventoExterno) {
    this.idEventoExterno = idEventoExterno;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getIdTipoTransacao() {
    return idTipoTransacao;
  }
  public void setIdTipoTransacao(Integer idTipoTransacao) {
    this.idTipoTransacao = idTipoTransacao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getIdTransacao() {
    return idTransacao;
  }
  public void setIdTransacao(Integer idTransacao) {
    this.idTransacao = idTransacao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getMcc() {
    return mcc;
  }
  public void setMcc(Integer mcc) {
    this.mcc = mcc;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getNomeEstabVisa() {
    return nomeEstabVisa;
  }
  public void setNomeEstabVisa(String nomeEstabVisa) {
    this.nomeEstabVisa = nomeEstabVisa;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getNomePlastico() {
    return nomePlastico;
  }
  public void setNomePlastico(String nomePlastico) {
    this.nomePlastico = nomePlastico;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getNumeroEstabelecimento() {
    return numeroEstabelecimento;
  }
  public void setNumeroEstabelecimento(Integer numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getOrigem() {
    return origem;
  }
  public void setOrigem(String origem) {
    this.origem = origem;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getTaxaEmbarque() {
    return taxaEmbarque;
  }
  public void setTaxaEmbarque(Double taxaEmbarque) {
    this.taxaEmbarque = taxaEmbarque;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getTipoEvento() {
    return tipoEvento;
  }
  public void setTipoEvento(String tipoEvento) {
    this.tipoEvento = tipoEvento;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getValorDolar() {
    return valorDolar;
  }
  public void setValorDolar(Double valorDolar) {
    this.valorDolar = valorDolar;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtratoResponse {\n");
    
    sb.append("  cartao: ").append(cartao).append("\n");
    sb.append("  chip: ").append(chip).append("\n");
    sb.append("  cidadeUFPais: ").append(cidadeUFPais).append("\n");
    sb.append("  codigoAutorizacao: ").append(codigoAutorizacao).append("\n");
    sb.append("  codigoMoeda: ").append(codigoMoeda).append("\n");
    sb.append("  codigoMoedaDestino: ").append(codigoMoedaDestino).append("\n");
    sb.append("  cotacaoDolar: ").append(cotacaoDolar).append("\n");
    sb.append("  credito: ").append(credito).append("\n");
    sb.append("  dataCompra: ").append(dataCompra).append("\n");
    sb.append("  dataCotacaoDolar: ").append(dataCotacaoDolar).append("\n");
    sb.append("  dataEntradaCompra: ").append(dataEntradaCompra).append("\n");
    sb.append("  dataTransacaoUTC: ").append(dataTransacaoUTC).append("\n");
    sb.append("  debito: ").append(debito).append("\n");
    sb.append("  descricaoModoEntrada: ").append(descricaoModoEntrada).append("\n");
    sb.append("  descricaoTransacao: ").append(descricaoTransacao).append("\n");
    sb.append("  encargosFinanceiros: ").append(encargosFinanceiros).append("\n");
    sb.append("  historico: ").append(historico).append("\n");
    sb.append("  idEventoExterno: ").append(idEventoExterno).append("\n");
    sb.append("  idTipoTransacao: ").append(idTipoTransacao).append("\n");
    sb.append("  idTransacao: ").append(idTransacao).append("\n");
    sb.append("  mcc: ").append(mcc).append("\n");
    sb.append("  nomeEstabVisa: ").append(nomeEstabVisa).append("\n");
    sb.append("  nomePlastico: ").append(nomePlastico).append("\n");
    sb.append("  numeroEstabelecimento: ").append(numeroEstabelecimento).append("\n");
    sb.append("  origem: ").append(origem).append("\n");
    sb.append("  taxaEmbarque: ").append(taxaEmbarque).append("\n");
    sb.append("  tipoEvento: ").append(tipoEvento).append("\n");
    sb.append("  valorDolar: ").append(valorDolar).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


