package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{fatura_fechada_response_description}}}
 **/
@ApiModel(description = "{{{fatura_fechada_response_description}}}")
public class FaturaFechadaResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("flagEmiteFatura")
  private Integer flagEmiteFatura = null;
  @SerializedName("dataVencimentoFatura")
  private String dataVencimentoFatura = null;
  @SerializedName("valorTotalFatura")
  private BigDecimal valorTotalFatura = null;
  @SerializedName("valorFaturaAnterior")
  private BigDecimal valorFaturaAnterior = null;
  @SerializedName("valorPagamentoMinimo")
  private BigDecimal valorPagamentoMinimo = null;
  @SerializedName("totalComprasNacionais")
  private BigDecimal totalComprasNacionais = null;
  @SerializedName("totalComprasInternacionas")
  private BigDecimal totalComprasInternacionas = null;
  @SerializedName("totalSaquesNacionais")
  private BigDecimal totalSaquesNacionais = null;
  @SerializedName("totalSaquesInternacionais")
  private BigDecimal totalSaquesInternacionais = null;
  @SerializedName("totalDebitosNacionais")
  private BigDecimal totalDebitosNacionais = null;
  @SerializedName("totalDebitosRecorrentes")
  private BigDecimal totalDebitosRecorrentes = null;
  @SerializedName("totalDebitosInternacionais")
  private BigDecimal totalDebitosInternacionais = null;
  @SerializedName("totalDebitosDiversosNacionais")
  private BigDecimal totalDebitosDiversosNacionais = null;
  @SerializedName("totalDebitosOpcionais")
  private BigDecimal totalDebitosOpcionais = null;
  @SerializedName("totalPagamentos")
  private BigDecimal totalPagamentos = null;
  @SerializedName("totalCreditosNacionais")
  private BigDecimal totalCreditosNacionais = null;
  @SerializedName("totalAjustes")
  private BigDecimal totalAjustes = null;
  @SerializedName("totalTarifas")
  private BigDecimal totalTarifas = null;
  @SerializedName("totalMulta")
  private BigDecimal totalMulta = null;
  @SerializedName("totalJuros")
  private BigDecimal totalJuros = null;
  @SerializedName("taxaRotativo")
  private BigDecimal taxaRotativo = null;
  @SerializedName("taxaSaque")
  private BigDecimal taxaSaque = null;
  @SerializedName("taxaMaximaProximoPeriodo")
  private BigDecimal taxaMaximaProximoPeriodo = null;
  @SerializedName("totalServicos")
  private BigDecimal totalServicos = null;
  @SerializedName("totalParceladoNacionais")
  private BigDecimal totalParceladoNacionais = null;
  @SerializedName("totalParceladoInternacionais")
  private BigDecimal totalParceladoInternacionais = null;

  
  /**
   * {{{fatura_fechada_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_fechada_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{fatura_fechada_response_id_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_fechada_response_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{fatura_fechada_response_flag_emite_fatura_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_fechada_response_flag_emite_fatura_value}}}")
  public Integer getFlagEmiteFatura() {
    return flagEmiteFatura;
  }
  public void setFlagEmiteFatura(Integer flagEmiteFatura) {
    this.flagEmiteFatura = flagEmiteFatura;
  }

  
  /**
   * {{{fatura_fechada_response_data_vencimento_fatura_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_fechada_response_data_vencimento_fatura_value}}}")
  public String getDataVencimentoFatura() {
    return dataVencimentoFatura;
  }
  public void setDataVencimentoFatura(String dataVencimentoFatura) {
    this.dataVencimentoFatura = dataVencimentoFatura;
  }

  
  /**
   * {{{fatura_fechada_response_valor_total_fatura_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_fechada_response_valor_total_fatura_value}}}")
  public BigDecimal getValorTotalFatura() {
    return valorTotalFatura;
  }
  public void setValorTotalFatura(BigDecimal valorTotalFatura) {
    this.valorTotalFatura = valorTotalFatura;
  }

  
  /**
   * {{{fatura_fechada_response_valor_fatura_anterior_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_fechada_response_valor_fatura_anterior_value}}}")
  public BigDecimal getValorFaturaAnterior() {
    return valorFaturaAnterior;
  }
  public void setValorFaturaAnterior(BigDecimal valorFaturaAnterior) {
    this.valorFaturaAnterior = valorFaturaAnterior;
  }

  
  /**
   * {{{fatura_fechada_response_valor_pagamento_minimo_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_fechada_response_valor_pagamento_minimo_value}}}")
  public BigDecimal getValorPagamentoMinimo() {
    return valorPagamentoMinimo;
  }
  public void setValorPagamentoMinimo(BigDecimal valorPagamentoMinimo) {
    this.valorPagamentoMinimo = valorPagamentoMinimo;
  }

  
  /**
   * {{{fatura_fechada_response_total_compras_nacionais_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_fechada_response_total_compras_nacionais_value}}}")
  public BigDecimal getTotalComprasNacionais() {
    return totalComprasNacionais;
  }
  public void setTotalComprasNacionais(BigDecimal totalComprasNacionais) {
    this.totalComprasNacionais = totalComprasNacionais;
  }

  
  /**
   * {{{fatura_fechada_response_total_compras_internacionas_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_fechada_response_total_compras_internacionas_value}}}")
  public BigDecimal getTotalComprasInternacionas() {
    return totalComprasInternacionas;
  }
  public void setTotalComprasInternacionas(BigDecimal totalComprasInternacionas) {
    this.totalComprasInternacionas = totalComprasInternacionas;
  }

  
  /**
   * {{{fatura_fechada_response_total_saques_nacionais_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_fechada_response_total_saques_nacionais_value}}}")
  public BigDecimal getTotalSaquesNacionais() {
    return totalSaquesNacionais;
  }
  public void setTotalSaquesNacionais(BigDecimal totalSaquesNacionais) {
    this.totalSaquesNacionais = totalSaquesNacionais;
  }

  
  /**
   * {{{fatura_fechada_response_total_saques_internacionais_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_fechada_response_total_saques_internacionais_value}}}")
  public BigDecimal getTotalSaquesInternacionais() {
    return totalSaquesInternacionais;
  }
  public void setTotalSaquesInternacionais(BigDecimal totalSaquesInternacionais) {
    this.totalSaquesInternacionais = totalSaquesInternacionais;
  }

  
  /**
   * {{{fatura_fechada_response_total_debitos_nacionais_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_fechada_response_total_debitos_nacionais_value}}}")
  public BigDecimal getTotalDebitosNacionais() {
    return totalDebitosNacionais;
  }
  public void setTotalDebitosNacionais(BigDecimal totalDebitosNacionais) {
    this.totalDebitosNacionais = totalDebitosNacionais;
  }

  
  /**
   * {{{fatura_fechada_response_total_debitos_recorrentes_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_fechada_response_total_debitos_recorrentes_value}}}")
  public BigDecimal getTotalDebitosRecorrentes() {
    return totalDebitosRecorrentes;
  }
  public void setTotalDebitosRecorrentes(BigDecimal totalDebitosRecorrentes) {
    this.totalDebitosRecorrentes = totalDebitosRecorrentes;
  }

  
  /**
   * {{{fatura_fechada_response_total_debitos_internacionais_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_fechada_response_total_debitos_internacionais_value}}}")
  public BigDecimal getTotalDebitosInternacionais() {
    return totalDebitosInternacionais;
  }
  public void setTotalDebitosInternacionais(BigDecimal totalDebitosInternacionais) {
    this.totalDebitosInternacionais = totalDebitosInternacionais;
  }

  
  /**
   * {{{fatura_fechada_response_total_debitos_diversos_nacionais_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_fechada_response_total_debitos_diversos_nacionais_value}}}")
  public BigDecimal getTotalDebitosDiversosNacionais() {
    return totalDebitosDiversosNacionais;
  }
  public void setTotalDebitosDiversosNacionais(BigDecimal totalDebitosDiversosNacionais) {
    this.totalDebitosDiversosNacionais = totalDebitosDiversosNacionais;
  }

  
  /**
   * {{{fatura_fechada_response_total_debitos_opcionais_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_fechada_response_total_debitos_opcionais_value}}}")
  public BigDecimal getTotalDebitosOpcionais() {
    return totalDebitosOpcionais;
  }
  public void setTotalDebitosOpcionais(BigDecimal totalDebitosOpcionais) {
    this.totalDebitosOpcionais = totalDebitosOpcionais;
  }

  
  /**
   * {{{fatura_fechada_response_total_pagamentos_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_fechada_response_total_pagamentos_value}}}")
  public BigDecimal getTotalPagamentos() {
    return totalPagamentos;
  }
  public void setTotalPagamentos(BigDecimal totalPagamentos) {
    this.totalPagamentos = totalPagamentos;
  }

  
  /**
   * {{{fatura_fechada_response_total_creditos_nacionais_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_fechada_response_total_creditos_nacionais_value}}}")
  public BigDecimal getTotalCreditosNacionais() {
    return totalCreditosNacionais;
  }
  public void setTotalCreditosNacionais(BigDecimal totalCreditosNacionais) {
    this.totalCreditosNacionais = totalCreditosNacionais;
  }

  
  /**
   * {{{fatura_fechada_response_total_ajustes_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_fechada_response_total_ajustes_value}}}")
  public BigDecimal getTotalAjustes() {
    return totalAjustes;
  }
  public void setTotalAjustes(BigDecimal totalAjustes) {
    this.totalAjustes = totalAjustes;
  }

  
  /**
   * {{{fatura_fechada_response_total_tarifas_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_fechada_response_total_tarifas_value}}}")
  public BigDecimal getTotalTarifas() {
    return totalTarifas;
  }
  public void setTotalTarifas(BigDecimal totalTarifas) {
    this.totalTarifas = totalTarifas;
  }

  
  /**
   * {{{fatura_fechada_response_total_multa_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_fechada_response_total_multa_value}}}")
  public BigDecimal getTotalMulta() {
    return totalMulta;
  }
  public void setTotalMulta(BigDecimal totalMulta) {
    this.totalMulta = totalMulta;
  }

  
  /**
   * {{{fatura_fechada_response_total_juros_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_fechada_response_total_juros_value}}}")
  public BigDecimal getTotalJuros() {
    return totalJuros;
  }
  public void setTotalJuros(BigDecimal totalJuros) {
    this.totalJuros = totalJuros;
  }

  
  /**
   * {{{fatura_fechada_response_taxa_rotativo_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_fechada_response_taxa_rotativo_value}}}")
  public BigDecimal getTaxaRotativo() {
    return taxaRotativo;
  }
  public void setTaxaRotativo(BigDecimal taxaRotativo) {
    this.taxaRotativo = taxaRotativo;
  }

  
  /**
   * {{{fatura_fechada_response_taxa_saque_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_fechada_response_taxa_saque_value}}}")
  public BigDecimal getTaxaSaque() {
    return taxaSaque;
  }
  public void setTaxaSaque(BigDecimal taxaSaque) {
    this.taxaSaque = taxaSaque;
  }

  
  /**
   * {{{fatura_fechada_response_taxa_maxima_proximo_periodo_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_fechada_response_taxa_maxima_proximo_periodo_value}}}")
  public BigDecimal getTaxaMaximaProximoPeriodo() {
    return taxaMaximaProximoPeriodo;
  }
  public void setTaxaMaximaProximoPeriodo(BigDecimal taxaMaximaProximoPeriodo) {
    this.taxaMaximaProximoPeriodo = taxaMaximaProximoPeriodo;
  }

  
  /**
   * {{{fatura_fechada_response_total_servicos_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{fatura_fechada_response_total_servicos_value}}}")
  public BigDecimal getTotalServicos() {
    return totalServicos;
  }
  public void setTotalServicos(BigDecimal totalServicos) {
    this.totalServicos = totalServicos;
  }

  
  /**
   * {{{fatura_fechada_response_total_parcelado_nacionais_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{fatura_fechada_response_total_parcelado_nacionais_value}}}")
  public BigDecimal getTotalParceladoNacionais() {
    return totalParceladoNacionais;
  }
  public void setTotalParceladoNacionais(BigDecimal totalParceladoNacionais) {
    this.totalParceladoNacionais = totalParceladoNacionais;
  }

  
  /**
   * {{{fatura_fechada_response_total_parcelado_internacionais_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{fatura_fechada_response_total_parcelado_internacionais_value}}}")
  public BigDecimal getTotalParceladoInternacionais() {
    return totalParceladoInternacionais;
  }
  public void setTotalParceladoInternacionais(BigDecimal totalParceladoInternacionais) {
    this.totalParceladoInternacionais = totalParceladoInternacionais;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaturaFechadaResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  flagEmiteFatura: ").append(flagEmiteFatura).append("\n");
    sb.append("  dataVencimentoFatura: ").append(dataVencimentoFatura).append("\n");
    sb.append("  valorTotalFatura: ").append(valorTotalFatura).append("\n");
    sb.append("  valorFaturaAnterior: ").append(valorFaturaAnterior).append("\n");
    sb.append("  valorPagamentoMinimo: ").append(valorPagamentoMinimo).append("\n");
    sb.append("  totalComprasNacionais: ").append(totalComprasNacionais).append("\n");
    sb.append("  totalComprasInternacionas: ").append(totalComprasInternacionas).append("\n");
    sb.append("  totalSaquesNacionais: ").append(totalSaquesNacionais).append("\n");
    sb.append("  totalSaquesInternacionais: ").append(totalSaquesInternacionais).append("\n");
    sb.append("  totalDebitosNacionais: ").append(totalDebitosNacionais).append("\n");
    sb.append("  totalDebitosRecorrentes: ").append(totalDebitosRecorrentes).append("\n");
    sb.append("  totalDebitosInternacionais: ").append(totalDebitosInternacionais).append("\n");
    sb.append("  totalDebitosDiversosNacionais: ").append(totalDebitosDiversosNacionais).append("\n");
    sb.append("  totalDebitosOpcionais: ").append(totalDebitosOpcionais).append("\n");
    sb.append("  totalPagamentos: ").append(totalPagamentos).append("\n");
    sb.append("  totalCreditosNacionais: ").append(totalCreditosNacionais).append("\n");
    sb.append("  totalAjustes: ").append(totalAjustes).append("\n");
    sb.append("  totalTarifas: ").append(totalTarifas).append("\n");
    sb.append("  totalMulta: ").append(totalMulta).append("\n");
    sb.append("  totalJuros: ").append(totalJuros).append("\n");
    sb.append("  taxaRotativo: ").append(taxaRotativo).append("\n");
    sb.append("  taxaSaque: ").append(taxaSaque).append("\n");
    sb.append("  taxaMaximaProximoPeriodo: ").append(taxaMaximaProximoPeriodo).append("\n");
    sb.append("  totalServicos: ").append(totalServicos).append("\n");
    sb.append("  totalParceladoNacionais: ").append(totalParceladoNacionais).append("\n");
    sb.append("  totalParceladoInternacionais: ").append(totalParceladoInternacionais).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
