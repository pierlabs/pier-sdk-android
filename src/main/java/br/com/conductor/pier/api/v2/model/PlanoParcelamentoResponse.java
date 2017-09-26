package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso de planos de parcelamento
 **/
@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso de planos de parcelamento")
public class PlanoParcelamentoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("dataFechamentoFatura")
  private String dataFechamentoFatura = null;
  @SerializedName("dataVencimentoPadrao")
  private String dataVencimentoPadrao = null;
  @SerializedName("valorTotalFatura")
  private BigDecimal valorTotalFatura = null;
  @SerializedName("quantidadeParcelas")
  private Integer quantidadeParcelas = null;
  @SerializedName("valorParcela")
  private BigDecimal valorParcela = null;
  @SerializedName("valorEntrada")
  private BigDecimal valorEntrada = null;
  @SerializedName("taxaRefinanciamento")
  private BigDecimal taxaRefinanciamento = null;
  @SerializedName("custoEfetivoTotal")
  private BigDecimal custoEfetivoTotal = null;
  @SerializedName("valorTotalRefinanciamento")
  private BigDecimal valorTotalRefinanciamento = null;
  @SerializedName("valorIOF")
  private BigDecimal valorIOF = null;
  @SerializedName("valorTAC")
  private BigDecimal valorTAC = null;
  @SerializedName("statusAdesao")
  private Integer statusAdesao = null;
  @SerializedName("dataInclusao")
  private String dataInclusao = null;
  @SerializedName("dataProcessamentoAdesao")
  private String dataProcessamentoAdesao = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("descricaoServicoTipo")
  private String descricaoServicoTipo = null;
  @SerializedName("comEntrada")
  private Boolean comEntrada = null;
  @SerializedName("nomeCampanha")
  private String nomeCampanha = null;

  
  /**
   * Identificador do parcelamento
   **/
  @ApiModelProperty(value = "Identificador do parcelamento")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Data de fechamento da fatura
   **/
  @ApiModelProperty(value = "Data de fechamento da fatura")
  public String getDataFechamentoFatura() {
    return dataFechamentoFatura;
  }
  public void setDataFechamentoFatura(String dataFechamentoFatura) {
    this.dataFechamentoFatura = dataFechamentoFatura;
  }

  
  /**
   * Data de vencimento padr\u00C3\u00A3o
   **/
  @ApiModelProperty(value = "Data de vencimento padr\u00C3\u00A3o")
  public String getDataVencimentoPadrao() {
    return dataVencimentoPadrao;
  }
  public void setDataVencimentoPadrao(String dataVencimentoPadrao) {
    this.dataVencimentoPadrao = dataVencimentoPadrao;
  }

  
  /**
   * Valor total da fatura
   **/
  @ApiModelProperty(value = "Valor total da fatura")
  public BigDecimal getValorTotalFatura() {
    return valorTotalFatura;
  }
  public void setValorTotalFatura(BigDecimal valorTotalFatura) {
    this.valorTotalFatura = valorTotalFatura;
  }

  
  /**
   * Quantidade de parcelas
   **/
  @ApiModelProperty(value = "Quantidade de parcelas")
  public Integer getQuantidadeParcelas() {
    return quantidadeParcelas;
  }
  public void setQuantidadeParcelas(Integer quantidadeParcelas) {
    this.quantidadeParcelas = quantidadeParcelas;
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
   * Valor de entrada
   **/
  @ApiModelProperty(value = "Valor de entrada")
  public BigDecimal getValorEntrada() {
    return valorEntrada;
  }
  public void setValorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
  }

  
  /**
   * Taxa de refinanciamento
   **/
  @ApiModelProperty(value = "Taxa de refinanciamento")
  public BigDecimal getTaxaRefinanciamento() {
    return taxaRefinanciamento;
  }
  public void setTaxaRefinanciamento(BigDecimal taxaRefinanciamento) {
    this.taxaRefinanciamento = taxaRefinanciamento;
  }

  
  /**
   * Custo efetivo total
   **/
  @ApiModelProperty(value = "Custo efetivo total")
  public BigDecimal getCustoEfetivoTotal() {
    return custoEfetivoTotal;
  }
  public void setCustoEfetivoTotal(BigDecimal custoEfetivoTotal) {
    this.custoEfetivoTotal = custoEfetivoTotal;
  }

  
  /**
   * Valor total de refinanciamento
   **/
  @ApiModelProperty(value = "Valor total de refinanciamento")
  public BigDecimal getValorTotalRefinanciamento() {
    return valorTotalRefinanciamento;
  }
  public void setValorTotalRefinanciamento(BigDecimal valorTotalRefinanciamento) {
    this.valorTotalRefinanciamento = valorTotalRefinanciamento;
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
   * Valor do TAC
   **/
  @ApiModelProperty(value = "Valor do TAC")
  public BigDecimal getValorTAC() {
    return valorTAC;
  }
  public void setValorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
  }

  
  /**
   * Status da ades\u00C3\u00A3o
   **/
  @ApiModelProperty(value = "Status da ades\u00C3\u00A3o")
  public Integer getStatusAdesao() {
    return statusAdesao;
  }
  public void setStatusAdesao(Integer statusAdesao) {
    this.statusAdesao = statusAdesao;
  }

  
  /**
   * Data de inclus\u00C3\u00A3o
   **/
  @ApiModelProperty(value = "Data de inclus\u00C3\u00A3o")
  public String getDataInclusao() {
    return dataInclusao;
  }
  public void setDataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
  }

  
  /**
   * Data de processamento da ades\u00C3\u00A3o
   **/
  @ApiModelProperty(value = "Data de processamento da ades\u00C3\u00A3o")
  public String getDataProcessamentoAdesao() {
    return dataProcessamentoAdesao;
  }
  public void setDataProcessamentoAdesao(String dataProcessamentoAdesao) {
    this.dataProcessamentoAdesao = dataProcessamentoAdesao;
  }

  
  /**
   * Identificador da conta
   **/
  @ApiModelProperty(value = "Identificador da conta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do tipo de servi\u00C3\u00A7o
   **/
  @ApiModelProperty(value = "Descri\u00C3\u00A7\u00C3\u00A3o do tipo de servi\u00C3\u00A7o")
  public String getDescricaoServicoTipo() {
    return descricaoServicoTipo;
  }
  public void setDescricaoServicoTipo(String descricaoServicoTipo) {
    this.descricaoServicoTipo = descricaoServicoTipo;
  }

  
  /**
   * Indica se a fatura foi com entrada
   **/
  @ApiModelProperty(value = "Indica se a fatura foi com entrada")
  public Boolean getComEntrada() {
    return comEntrada;
  }
  public void setComEntrada(Boolean comEntrada) {
    this.comEntrada = comEntrada;
  }

  
  /**
   * Nome da campanha
   **/
  @ApiModelProperty(value = "Nome da campanha")
  public String getNomeCampanha() {
    return nomeCampanha;
  }
  public void setNomeCampanha(String nomeCampanha) {
    this.nomeCampanha = nomeCampanha;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanoParcelamentoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  dataFechamentoFatura: ").append(dataFechamentoFatura).append("\n");
    sb.append("  dataVencimentoPadrao: ").append(dataVencimentoPadrao).append("\n");
    sb.append("  valorTotalFatura: ").append(valorTotalFatura).append("\n");
    sb.append("  quantidadeParcelas: ").append(quantidadeParcelas).append("\n");
    sb.append("  valorParcela: ").append(valorParcela).append("\n");
    sb.append("  valorEntrada: ").append(valorEntrada).append("\n");
    sb.append("  taxaRefinanciamento: ").append(taxaRefinanciamento).append("\n");
    sb.append("  custoEfetivoTotal: ").append(custoEfetivoTotal).append("\n");
    sb.append("  valorTotalRefinanciamento: ").append(valorTotalRefinanciamento).append("\n");
    sb.append("  valorIOF: ").append(valorIOF).append("\n");
    sb.append("  valorTAC: ").append(valorTAC).append("\n");
    sb.append("  statusAdesao: ").append(statusAdesao).append("\n");
    sb.append("  dataInclusao: ").append(dataInclusao).append("\n");
    sb.append("  dataProcessamentoAdesao: ").append(dataProcessamentoAdesao).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  descricaoServicoTipo: ").append(descricaoServicoTipo).append("\n");
    sb.append("  comEntrada: ").append(comEntrada).append("\n");
    sb.append("  nomeCampanha: ").append(nomeCampanha).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


