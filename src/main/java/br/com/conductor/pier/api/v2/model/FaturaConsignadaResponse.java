package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{fatura_consignada_response_description}}}
 **/
@ApiModel(description = "{{{fatura_consignada_response_description}}}")
public class FaturaConsignadaResponse  {
  
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
  @SerializedName("valorPagamentoConsignado")
  private BigDecimal valorPagamentoConsignado = null;
  @SerializedName("valorPagamentoComplementar")
  private BigDecimal valorPagamentoComplementar = null;
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

  
  /**
   * {{{fatura_consignada_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_consignada_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{fatura_consignada_response_id_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_consignada_response_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{fatura_consignada_response_flag_emite_fatura_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_consignada_response_flag_emite_fatura_value}}}")
  public Integer getFlagEmiteFatura() {
    return flagEmiteFatura;
  }
  public void setFlagEmiteFatura(Integer flagEmiteFatura) {
    this.flagEmiteFatura = flagEmiteFatura;
  }

  
  /**
   * {{{fatura_consignada_response_data_vencimento_fatura_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_consignada_response_data_vencimento_fatura_value}}}")
  public String getDataVencimentoFatura() {
    return dataVencimentoFatura;
  }
  public void setDataVencimentoFatura(String dataVencimentoFatura) {
    this.dataVencimentoFatura = dataVencimentoFatura;
  }

  
  /**
   * {{{fatura_consignada_response_valor_total_fatura_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_consignada_response_valor_total_fatura_value}}}")
  public BigDecimal getValorTotalFatura() {
    return valorTotalFatura;
  }
  public void setValorTotalFatura(BigDecimal valorTotalFatura) {
    this.valorTotalFatura = valorTotalFatura;
  }

  
  /**
   * {{{fatura_consignada_response_valor_fatura_anterior_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_consignada_response_valor_fatura_anterior_value}}}")
  public BigDecimal getValorFaturaAnterior() {
    return valorFaturaAnterior;
  }
  public void setValorFaturaAnterior(BigDecimal valorFaturaAnterior) {
    this.valorFaturaAnterior = valorFaturaAnterior;
  }

  
  /**
   * {{{fatura_consignada_response_valor_pagamento_minimo_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_consignada_response_valor_pagamento_minimo_value}}}")
  public BigDecimal getValorPagamentoMinimo() {
    return valorPagamentoMinimo;
  }
  public void setValorPagamentoMinimo(BigDecimal valorPagamentoMinimo) {
    this.valorPagamentoMinimo = valorPagamentoMinimo;
  }

  
  /**
   * {{{fatura_consignada_response_valor_pagamento_consignado_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_consignada_response_valor_pagamento_consignado_value}}}")
  public BigDecimal getValorPagamentoConsignado() {
    return valorPagamentoConsignado;
  }
  public void setValorPagamentoConsignado(BigDecimal valorPagamentoConsignado) {
    this.valorPagamentoConsignado = valorPagamentoConsignado;
  }

  
  /**
   * {{{fatura_consignada_response_valor_pagamento_complementar_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_consignada_response_valor_pagamento_complementar_value}}}")
  public BigDecimal getValorPagamentoComplementar() {
    return valorPagamentoComplementar;
  }
  public void setValorPagamentoComplementar(BigDecimal valorPagamentoComplementar) {
    this.valorPagamentoComplementar = valorPagamentoComplementar;
  }

  
  /**
   * {{{fatura_consignada_response_total_compras_nacionais_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_consignada_response_total_compras_nacionais_value}}}")
  public BigDecimal getTotalComprasNacionais() {
    return totalComprasNacionais;
  }
  public void setTotalComprasNacionais(BigDecimal totalComprasNacionais) {
    this.totalComprasNacionais = totalComprasNacionais;
  }

  
  /**
   * {{{fatura_consignada_response_total_compras_internacionas_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_consignada_response_total_compras_internacionas_value}}}")
  public BigDecimal getTotalComprasInternacionas() {
    return totalComprasInternacionas;
  }
  public void setTotalComprasInternacionas(BigDecimal totalComprasInternacionas) {
    this.totalComprasInternacionas = totalComprasInternacionas;
  }

  
  /**
   * {{{fatura_consignada_response_total_saques_nacionais_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_consignada_response_total_saques_nacionais_value}}}")
  public BigDecimal getTotalSaquesNacionais() {
    return totalSaquesNacionais;
  }
  public void setTotalSaquesNacionais(BigDecimal totalSaquesNacionais) {
    this.totalSaquesNacionais = totalSaquesNacionais;
  }

  
  /**
   * {{{fatura_consignada_response_total_saques_internacionais_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_consignada_response_total_saques_internacionais_value}}}")
  public BigDecimal getTotalSaquesInternacionais() {
    return totalSaquesInternacionais;
  }
  public void setTotalSaquesInternacionais(BigDecimal totalSaquesInternacionais) {
    this.totalSaquesInternacionais = totalSaquesInternacionais;
  }

  
  /**
   * {{{fatura_consignada_response_total_debitos_nacionais_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_consignada_response_total_debitos_nacionais_value}}}")
  public BigDecimal getTotalDebitosNacionais() {
    return totalDebitosNacionais;
  }
  public void setTotalDebitosNacionais(BigDecimal totalDebitosNacionais) {
    this.totalDebitosNacionais = totalDebitosNacionais;
  }

  
  /**
   * {{{fatura_consignada_response_total_debitos_recorrentes_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_consignada_response_total_debitos_recorrentes_value}}}")
  public BigDecimal getTotalDebitosRecorrentes() {
    return totalDebitosRecorrentes;
  }
  public void setTotalDebitosRecorrentes(BigDecimal totalDebitosRecorrentes) {
    this.totalDebitosRecorrentes = totalDebitosRecorrentes;
  }

  
  /**
   * {{{fatura_consignada_response_total_debitos_internacionais_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_consignada_response_total_debitos_internacionais_value}}}")
  public BigDecimal getTotalDebitosInternacionais() {
    return totalDebitosInternacionais;
  }
  public void setTotalDebitosInternacionais(BigDecimal totalDebitosInternacionais) {
    this.totalDebitosInternacionais = totalDebitosInternacionais;
  }

  
  /**
   * {{{fatura_consignada_response_total_debitos_diversos_nacionais_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_consignada_response_total_debitos_diversos_nacionais_value}}}")
  public BigDecimal getTotalDebitosDiversosNacionais() {
    return totalDebitosDiversosNacionais;
  }
  public void setTotalDebitosDiversosNacionais(BigDecimal totalDebitosDiversosNacionais) {
    this.totalDebitosDiversosNacionais = totalDebitosDiversosNacionais;
  }

  
  /**
   * {{{fatura_consignada_response_total_debitos_opcionais_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_consignada_response_total_debitos_opcionais_value}}}")
  public BigDecimal getTotalDebitosOpcionais() {
    return totalDebitosOpcionais;
  }
  public void setTotalDebitosOpcionais(BigDecimal totalDebitosOpcionais) {
    this.totalDebitosOpcionais = totalDebitosOpcionais;
  }

  
  /**
   * {{{fatura_consignada_response_total_pagamentos_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_consignada_response_total_pagamentos_value}}}")
  public BigDecimal getTotalPagamentos() {
    return totalPagamentos;
  }
  public void setTotalPagamentos(BigDecimal totalPagamentos) {
    this.totalPagamentos = totalPagamentos;
  }

  
  /**
   * {{{fatura_consignada_response_total_creditos_nacionais_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_consignada_response_total_creditos_nacionais_value}}}")
  public BigDecimal getTotalCreditosNacionais() {
    return totalCreditosNacionais;
  }
  public void setTotalCreditosNacionais(BigDecimal totalCreditosNacionais) {
    this.totalCreditosNacionais = totalCreditosNacionais;
  }

  
  /**
   * {{{fatura_consignada_response_total_ajustes_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_consignada_response_total_ajustes_value}}}")
  public BigDecimal getTotalAjustes() {
    return totalAjustes;
  }
  public void setTotalAjustes(BigDecimal totalAjustes) {
    this.totalAjustes = totalAjustes;
  }

  
  /**
   * {{{fatura_consignada_response_total_tarifas_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_consignada_response_total_tarifas_value}}}")
  public BigDecimal getTotalTarifas() {
    return totalTarifas;
  }
  public void setTotalTarifas(BigDecimal totalTarifas) {
    this.totalTarifas = totalTarifas;
  }

  
  /**
   * {{{fatura_consignada_response_total_multa_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_consignada_response_total_multa_value}}}")
  public BigDecimal getTotalMulta() {
    return totalMulta;
  }
  public void setTotalMulta(BigDecimal totalMulta) {
    this.totalMulta = totalMulta;
  }

  
  /**
   * {{{fatura_consignada_response_total_juros_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_consignada_response_total_juros_value}}}")
  public BigDecimal getTotalJuros() {
    return totalJuros;
  }
  public void setTotalJuros(BigDecimal totalJuros) {
    this.totalJuros = totalJuros;
  }

  
  /**
   * {{{fatura_consignada_response_taxa_rotativo_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_consignada_response_taxa_rotativo_value}}}")
  public BigDecimal getTaxaRotativo() {
    return taxaRotativo;
  }
  public void setTaxaRotativo(BigDecimal taxaRotativo) {
    this.taxaRotativo = taxaRotativo;
  }

  
  /**
   * {{{fatura_consignada_response_taxa_saque_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_consignada_response_taxa_saque_value}}}")
  public BigDecimal getTaxaSaque() {
    return taxaSaque;
  }
  public void setTaxaSaque(BigDecimal taxaSaque) {
    this.taxaSaque = taxaSaque;
  }

  
  /**
   * {{{fatura_consignada_response_taxa_maxima_proximo_periodo_value}}}
   **/
  @ApiModelProperty(value = "{{{fatura_consignada_response_taxa_maxima_proximo_periodo_value}}}")
  public BigDecimal getTaxaMaximaProximoPeriodo() {
    return taxaMaximaProximoPeriodo;
  }
  public void setTaxaMaximaProximoPeriodo(BigDecimal taxaMaximaProximoPeriodo) {
    this.taxaMaximaProximoPeriodo = taxaMaximaProximoPeriodo;
  }

  
  /**
   * {{{fatura_consignada_response_total_servicos_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{fatura_consignada_response_total_servicos_value}}}")
  public BigDecimal getTotalServicos() {
    return totalServicos;
  }
  public void setTotalServicos(BigDecimal totalServicos) {
    this.totalServicos = totalServicos;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaturaConsignadaResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  flagEmiteFatura: ").append(flagEmiteFatura).append("\n");
    sb.append("  dataVencimentoFatura: ").append(dataVencimentoFatura).append("\n");
    sb.append("  valorTotalFatura: ").append(valorTotalFatura).append("\n");
    sb.append("  valorFaturaAnterior: ").append(valorFaturaAnterior).append("\n");
    sb.append("  valorPagamentoMinimo: ").append(valorPagamentoMinimo).append("\n");
    sb.append("  valorPagamentoConsignado: ").append(valorPagamentoConsignado).append("\n");
    sb.append("  valorPagamentoComplementar: ").append(valorPagamentoComplementar).append("\n");
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
    sb.append("}\n");
    return sb.toString();
  }
}


