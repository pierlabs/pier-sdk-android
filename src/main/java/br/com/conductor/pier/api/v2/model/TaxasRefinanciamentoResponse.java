package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{taxas_refinanciamento_response_description}}}
 **/
@ApiModel(description = "{{{taxas_refinanciamento_response_description}}}")
public class TaxasRefinanciamentoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("idPlanoConta")
  private Long idPlanoConta = null;
  @SerializedName("idPlanoPct")
  private Long idPlanoPct = null;
  @SerializedName("idPlanoCreditoTaxa")
  private Long idPlanoCreditoTaxa = null;
  @SerializedName("dataEntrada")
  private String dataEntrada = null;
  @SerializedName("vencimento")
  private String vencimento = null;
  @SerializedName("recuperacaoEncargosFinanceiros")
  private BigDecimal recuperacaoEncargosFinanceiros = null;
  @SerializedName("comissaoGarantia")
  private BigDecimal comissaoGarantia = null;
  @SerializedName("agenciamento")
  private BigDecimal agenciamento = null;
  @SerializedName("taxaMaximaProximoPeriodo")
  private BigDecimal taxaMaximaProximoPeriodo = null;
  @SerializedName("taxaEncargosFinanciamento")
  private BigDecimal taxaEncargosFinanciamento = null;
  @SerializedName("taxaMaximaSaque")
  private BigDecimal taxaMaximaSaque = null;
  @SerializedName("taxaSaque")
  private BigDecimal taxaSaque = null;
  @SerializedName("taxaMaximaCompraJuros")
  private BigDecimal taxaMaximaCompraJuros = null;
  @SerializedName("taxaCompraJuros")
  private BigDecimal taxaCompraJuros = null;
  @SerializedName("taxaPermanencia")
  private BigDecimal taxaPermanencia = null;
  @SerializedName("taxaRefinanciamento")
  private BigDecimal taxaRefinanciamento = null;
  @SerializedName("taxaRecuperacaoRefinanciamento")
  private BigDecimal taxaRecuperacaoRefinanciamento = null;
  @SerializedName("taxaPercCalcPagamentoMinimo")
  private BigDecimal taxaPercCalcPagamentoMinimo = null;
  @SerializedName("planoTaxaDefault")
  private Integer planoTaxaDefault = null;

  
  /**
   * {{{taxas_refinanciamento_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{taxas_refinanciamento_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{taxas_refinanciamento_response_id_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{taxas_refinanciamento_response_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{taxas_refinanciamento_response_id_produto_value}}}
   **/
  @ApiModelProperty(value = "{{{taxas_refinanciamento_response_id_produto_value}}}")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * {{{taxas_refinanciamento_response_id_plano_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{taxas_refinanciamento_response_id_plano_conta_value}}}")
  public Long getIdPlanoConta() {
    return idPlanoConta;
  }
  public void setIdPlanoConta(Long idPlanoConta) {
    this.idPlanoConta = idPlanoConta;
  }

  
  /**
   * {{{taxas_refinanciamento_response_id_plano_pct_value}}}
   **/
  @ApiModelProperty(value = "{{{taxas_refinanciamento_response_id_plano_pct_value}}}")
  public Long getIdPlanoPct() {
    return idPlanoPct;
  }
  public void setIdPlanoPct(Long idPlanoPct) {
    this.idPlanoPct = idPlanoPct;
  }

  
  /**
   * {{{taxas_refinanciamento_response_id_plano_credito_taxa_value}}}
   **/
  @ApiModelProperty(value = "{{{taxas_refinanciamento_response_id_plano_credito_taxa_value}}}")
  public Long getIdPlanoCreditoTaxa() {
    return idPlanoCreditoTaxa;
  }
  public void setIdPlanoCreditoTaxa(Long idPlanoCreditoTaxa) {
    this.idPlanoCreditoTaxa = idPlanoCreditoTaxa;
  }

  
  /**
   * {{{taxas_refinanciamento_response_data_entrada_value}}}
   **/
  @ApiModelProperty(value = "{{{taxas_refinanciamento_response_data_entrada_value}}}")
  public String getDataEntrada() {
    return dataEntrada;
  }
  public void setDataEntrada(String dataEntrada) {
    this.dataEntrada = dataEntrada;
  }

  
  /**
   * {{{taxas_refinanciamento_response_vencimento_value}}}
   **/
  @ApiModelProperty(value = "{{{taxas_refinanciamento_response_vencimento_value}}}")
  public String getVencimento() {
    return vencimento;
  }
  public void setVencimento(String vencimento) {
    this.vencimento = vencimento;
  }

  
  /**
   * {{{taxas_refinanciamento_response_recuperacao_encargos_financeiros_value}}}
   **/
  @ApiModelProperty(value = "{{{taxas_refinanciamento_response_recuperacao_encargos_financeiros_value}}}")
  public BigDecimal getRecuperacaoEncargosFinanceiros() {
    return recuperacaoEncargosFinanceiros;
  }
  public void setRecuperacaoEncargosFinanceiros(BigDecimal recuperacaoEncargosFinanceiros) {
    this.recuperacaoEncargosFinanceiros = recuperacaoEncargosFinanceiros;
  }

  
  /**
   * {{{taxas_refinanciamento_response_comissao_garantia_value}}}
   **/
  @ApiModelProperty(value = "{{{taxas_refinanciamento_response_comissao_garantia_value}}}")
  public BigDecimal getComissaoGarantia() {
    return comissaoGarantia;
  }
  public void setComissaoGarantia(BigDecimal comissaoGarantia) {
    this.comissaoGarantia = comissaoGarantia;
  }

  
  /**
   * {{{taxas_refinanciamento_response_agenciamento_value}}}
   **/
  @ApiModelProperty(value = "{{{taxas_refinanciamento_response_agenciamento_value}}}")
  public BigDecimal getAgenciamento() {
    return agenciamento;
  }
  public void setAgenciamento(BigDecimal agenciamento) {
    this.agenciamento = agenciamento;
  }

  
  /**
   * {{{taxas_refinanciamento_response_taxa_maxima_proximo_periodo_value}}}
   **/
  @ApiModelProperty(value = "{{{taxas_refinanciamento_response_taxa_maxima_proximo_periodo_value}}}")
  public BigDecimal getTaxaMaximaProximoPeriodo() {
    return taxaMaximaProximoPeriodo;
  }
  public void setTaxaMaximaProximoPeriodo(BigDecimal taxaMaximaProximoPeriodo) {
    this.taxaMaximaProximoPeriodo = taxaMaximaProximoPeriodo;
  }

  
  /**
   * {{{taxas_refinanciamento_response_taxa_encargos_financiamento_value}}}
   **/
  @ApiModelProperty(value = "{{{taxas_refinanciamento_response_taxa_encargos_financiamento_value}}}")
  public BigDecimal getTaxaEncargosFinanciamento() {
    return taxaEncargosFinanciamento;
  }
  public void setTaxaEncargosFinanciamento(BigDecimal taxaEncargosFinanciamento) {
    this.taxaEncargosFinanciamento = taxaEncargosFinanciamento;
  }

  
  /**
   * {{{taxas_refinanciamento_response_taxa_maxima_saque_value}}}
   **/
  @ApiModelProperty(value = "{{{taxas_refinanciamento_response_taxa_maxima_saque_value}}}")
  public BigDecimal getTaxaMaximaSaque() {
    return taxaMaximaSaque;
  }
  public void setTaxaMaximaSaque(BigDecimal taxaMaximaSaque) {
    this.taxaMaximaSaque = taxaMaximaSaque;
  }

  
  /**
   * {{{taxas_refinanciamento_response_taxa_saque_value}}}
   **/
  @ApiModelProperty(value = "{{{taxas_refinanciamento_response_taxa_saque_value}}}")
  public BigDecimal getTaxaSaque() {
    return taxaSaque;
  }
  public void setTaxaSaque(BigDecimal taxaSaque) {
    this.taxaSaque = taxaSaque;
  }

  
  /**
   * {{{taxas_refinanciamento_response_taxa_maxima_compra_juros_value}}}
   **/
  @ApiModelProperty(value = "{{{taxas_refinanciamento_response_taxa_maxima_compra_juros_value}}}")
  public BigDecimal getTaxaMaximaCompraJuros() {
    return taxaMaximaCompraJuros;
  }
  public void setTaxaMaximaCompraJuros(BigDecimal taxaMaximaCompraJuros) {
    this.taxaMaximaCompraJuros = taxaMaximaCompraJuros;
  }

  
  /**
   * {{{taxas_refinanciamento_response_taxa_compra_juros_value}}}
   **/
  @ApiModelProperty(value = "{{{taxas_refinanciamento_response_taxa_compra_juros_value}}}")
  public BigDecimal getTaxaCompraJuros() {
    return taxaCompraJuros;
  }
  public void setTaxaCompraJuros(BigDecimal taxaCompraJuros) {
    this.taxaCompraJuros = taxaCompraJuros;
  }

  
  /**
   * {{{taxas_refinanciamento_response_taxa_permanencia_value}}}
   **/
  @ApiModelProperty(value = "{{{taxas_refinanciamento_response_taxa_permanencia_value}}}")
  public BigDecimal getTaxaPermanencia() {
    return taxaPermanencia;
  }
  public void setTaxaPermanencia(BigDecimal taxaPermanencia) {
    this.taxaPermanencia = taxaPermanencia;
  }

  
  /**
   * {{{taxas_refinanciamento_response_taxa_refinanciamento_value}}}
   **/
  @ApiModelProperty(value = "{{{taxas_refinanciamento_response_taxa_refinanciamento_value}}}")
  public BigDecimal getTaxaRefinanciamento() {
    return taxaRefinanciamento;
  }
  public void setTaxaRefinanciamento(BigDecimal taxaRefinanciamento) {
    this.taxaRefinanciamento = taxaRefinanciamento;
  }

  
  /**
   * {{{taxas_refinanciamento_response_taxa_recuperacao_refinanciamento_value}}}
   **/
  @ApiModelProperty(value = "{{{taxas_refinanciamento_response_taxa_recuperacao_refinanciamento_value}}}")
  public BigDecimal getTaxaRecuperacaoRefinanciamento() {
    return taxaRecuperacaoRefinanciamento;
  }
  public void setTaxaRecuperacaoRefinanciamento(BigDecimal taxaRecuperacaoRefinanciamento) {
    this.taxaRecuperacaoRefinanciamento = taxaRecuperacaoRefinanciamento;
  }

  
  /**
   * {{{taxas_refinanciamento_response_taxa_perc_calc_pagamento_minimo_value}}}
   **/
  @ApiModelProperty(value = "{{{taxas_refinanciamento_response_taxa_perc_calc_pagamento_minimo_value}}}")
  public BigDecimal getTaxaPercCalcPagamentoMinimo() {
    return taxaPercCalcPagamentoMinimo;
  }
  public void setTaxaPercCalcPagamentoMinimo(BigDecimal taxaPercCalcPagamentoMinimo) {
    this.taxaPercCalcPagamentoMinimo = taxaPercCalcPagamentoMinimo;
  }

  
  /**
   * {{{taxas_refinanciamento_response_plano_taxa_default_value}}}
   **/
  @ApiModelProperty(value = "{{{taxas_refinanciamento_response_plano_taxa_default_value}}}")
  public Integer getPlanoTaxaDefault() {
    return planoTaxaDefault;
  }
  public void setPlanoTaxaDefault(Integer planoTaxaDefault) {
    this.planoTaxaDefault = planoTaxaDefault;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxasRefinanciamentoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  idPlanoConta: ").append(idPlanoConta).append("\n");
    sb.append("  idPlanoPct: ").append(idPlanoPct).append("\n");
    sb.append("  idPlanoCreditoTaxa: ").append(idPlanoCreditoTaxa).append("\n");
    sb.append("  dataEntrada: ").append(dataEntrada).append("\n");
    sb.append("  vencimento: ").append(vencimento).append("\n");
    sb.append("  recuperacaoEncargosFinanceiros: ").append(recuperacaoEncargosFinanceiros).append("\n");
    sb.append("  comissaoGarantia: ").append(comissaoGarantia).append("\n");
    sb.append("  agenciamento: ").append(agenciamento).append("\n");
    sb.append("  taxaMaximaProximoPeriodo: ").append(taxaMaximaProximoPeriodo).append("\n");
    sb.append("  taxaEncargosFinanciamento: ").append(taxaEncargosFinanciamento).append("\n");
    sb.append("  taxaMaximaSaque: ").append(taxaMaximaSaque).append("\n");
    sb.append("  taxaSaque: ").append(taxaSaque).append("\n");
    sb.append("  taxaMaximaCompraJuros: ").append(taxaMaximaCompraJuros).append("\n");
    sb.append("  taxaCompraJuros: ").append(taxaCompraJuros).append("\n");
    sb.append("  taxaPermanencia: ").append(taxaPermanencia).append("\n");
    sb.append("  taxaRefinanciamento: ").append(taxaRefinanciamento).append("\n");
    sb.append("  taxaRecuperacaoRefinanciamento: ").append(taxaRecuperacaoRefinanciamento).append("\n");
    sb.append("  taxaPercCalcPagamentoMinimo: ").append(taxaPercCalcPagamentoMinimo).append("\n");
    sb.append("  planoTaxaDefault: ").append(planoTaxaDefault).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


