package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Fatura Consignada
 **/
@ApiModel(description = "Fatura Consignada")
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
   * C\u00C3\u00B3digo identificador da fatura.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo identificador da fatura.")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00C3\u00B3digo identificador da conta (id).
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo identificador da conta (id).")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00C3\u00B3digo identificador da conta a qual a fatura se refere.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo identificador da conta a qual a fatura se refere.")
  public Integer getFlagEmiteFatura() {
    return flagEmiteFatura;
  }
  public void setFlagEmiteFatura(Integer flagEmiteFatura) {
    this.flagEmiteFatura = flagEmiteFatura;
  }

  
  /**
   * Data de vencimento da fatura.
   **/
  @ApiModelProperty(value = "Data de vencimento da fatura.")
  public String getDataVencimentoFatura() {
    return dataVencimentoFatura;
  }
  public void setDataVencimentoFatura(String dataVencimentoFatura) {
    this.dataVencimentoFatura = dataVencimentoFatura;
  }

  
  /**
   * Valor para pagamento total da fatura.
   **/
  @ApiModelProperty(value = "Valor para pagamento total da fatura.")
  public BigDecimal getValorTotalFatura() {
    return valorTotalFatura;
  }
  public void setValorTotalFatura(BigDecimal valorTotalFatura) {
    this.valorTotalFatura = valorTotalFatura;
  }

  
  /**
   * Valor total da fatura anterior.
   **/
  @ApiModelProperty(value = "Valor total da fatura anterior.")
  public BigDecimal getValorFaturaAnterior() {
    return valorFaturaAnterior;
  }
  public void setValorFaturaAnterior(BigDecimal valorFaturaAnterior) {
    this.valorFaturaAnterior = valorFaturaAnterior;
  }

  
  /**
   * Valor m\u00C3\u00ADnimo para pagamento da fatura.
   **/
  @ApiModelProperty(value = "Valor m\u00C3\u00ADnimo para pagamento da fatura.")
  public BigDecimal getValorPagamentoMinimo() {
    return valorPagamentoMinimo;
  }
  public void setValorPagamentoMinimo(BigDecimal valorPagamentoMinimo) {
    this.valorPagamentoMinimo = valorPagamentoMinimo;
  }

  
  /**
   * Valor da fatura pago atrav\u00C3\u00A9s de desconto em folha.
   **/
  @ApiModelProperty(value = "Valor da fatura pago atrav\u00C3\u00A9s de desconto em folha.")
  public BigDecimal getValorPagamentoConsignado() {
    return valorPagamentoConsignado;
  }
  public void setValorPagamentoConsignado(BigDecimal valorPagamentoConsignado) {
    this.valorPagamentoConsignado = valorPagamentoConsignado;
  }

  
  /**
   * Valor complementar para considerar o pagamento m\u00C3\u00ADnimo da fatura.
   **/
  @ApiModelProperty(value = "Valor complementar para considerar o pagamento m\u00C3\u00ADnimo da fatura.")
  public BigDecimal getValorPagamentoComplementar() {
    return valorPagamentoComplementar;
  }
  public void setValorPagamentoComplementar(BigDecimal valorPagamentoComplementar) {
    this.valorPagamentoComplementar = valorPagamentoComplementar;
  }

  
  /**
   * Valor total das compras nacionais lan\u00C3\u00A7adas na fatura.
   **/
  @ApiModelProperty(value = "Valor total das compras nacionais lan\u00C3\u00A7adas na fatura.")
  public BigDecimal getTotalComprasNacionais() {
    return totalComprasNacionais;
  }
  public void setTotalComprasNacionais(BigDecimal totalComprasNacionais) {
    this.totalComprasNacionais = totalComprasNacionais;
  }

  
  /**
   * Valor total das compras internacionais lan\u00C3\u00A7adas na fatura.
   **/
  @ApiModelProperty(value = "Valor total das compras internacionais lan\u00C3\u00A7adas na fatura.")
  public BigDecimal getTotalComprasInternacionas() {
    return totalComprasInternacionas;
  }
  public void setTotalComprasInternacionas(BigDecimal totalComprasInternacionas) {
    this.totalComprasInternacionas = totalComprasInternacionas;
  }

  
  /**
   * Valor total dos saques nacionais lan\u00C3\u00A7ados na fatura.
   **/
  @ApiModelProperty(value = "Valor total dos saques nacionais lan\u00C3\u00A7ados na fatura.")
  public BigDecimal getTotalSaquesNacionais() {
    return totalSaquesNacionais;
  }
  public void setTotalSaquesNacionais(BigDecimal totalSaquesNacionais) {
    this.totalSaquesNacionais = totalSaquesNacionais;
  }

  
  /**
   * Valor total dos saques internacionais lan\u00C3\u00A7ados na fatura.
   **/
  @ApiModelProperty(value = "Valor total dos saques internacionais lan\u00C3\u00A7ados na fatura.")
  public BigDecimal getTotalSaquesInternacionais() {
    return totalSaquesInternacionais;
  }
  public void setTotalSaquesInternacionais(BigDecimal totalSaquesInternacionais) {
    this.totalSaquesInternacionais = totalSaquesInternacionais;
  }

  
  /**
   * Valor total dos d\u00C3\u00A9bitos nacionais lan\u00C3\u00A7ados na fatura.
   **/
  @ApiModelProperty(value = "Valor total dos d\u00C3\u00A9bitos nacionais lan\u00C3\u00A7ados na fatura.")
  public BigDecimal getTotalDebitosNacionais() {
    return totalDebitosNacionais;
  }
  public void setTotalDebitosNacionais(BigDecimal totalDebitosNacionais) {
    this.totalDebitosNacionais = totalDebitosNacionais;
  }

  
  /**
   * Valor total dos d\u00C3\u00A9bitos recorrentes lan\u00C3\u00A7ados na fatura.
   **/
  @ApiModelProperty(value = "Valor total dos d\u00C3\u00A9bitos recorrentes lan\u00C3\u00A7ados na fatura.")
  public BigDecimal getTotalDebitosRecorrentes() {
    return totalDebitosRecorrentes;
  }
  public void setTotalDebitosRecorrentes(BigDecimal totalDebitosRecorrentes) {
    this.totalDebitosRecorrentes = totalDebitosRecorrentes;
  }

  
  /**
   * Valor total dos d\u00C3\u00A9bitos internacionais lan\u00C3\u00A7ados na fatura.
   **/
  @ApiModelProperty(value = "Valor total dos d\u00C3\u00A9bitos internacionais lan\u00C3\u00A7ados na fatura.")
  public BigDecimal getTotalDebitosInternacionais() {
    return totalDebitosInternacionais;
  }
  public void setTotalDebitosInternacionais(BigDecimal totalDebitosInternacionais) {
    this.totalDebitosInternacionais = totalDebitosInternacionais;
  }

  
  /**
   * Valor total dos d\u00C3\u00A9bitos diversos nacionais lan\u00C3\u00A7ados na fatura.
   **/
  @ApiModelProperty(value = "Valor total dos d\u00C3\u00A9bitos diversos nacionais lan\u00C3\u00A7ados na fatura.")
  public BigDecimal getTotalDebitosDiversosNacionais() {
    return totalDebitosDiversosNacionais;
  }
  public void setTotalDebitosDiversosNacionais(BigDecimal totalDebitosDiversosNacionais) {
    this.totalDebitosDiversosNacionais = totalDebitosDiversosNacionais;
  }

  
  /**
   * Valor total dos d\u00C3\u00A9bitos diversos opcionais lan\u00C3\u00A7ados na fatura.
   **/
  @ApiModelProperty(value = "Valor total dos d\u00C3\u00A9bitos diversos opcionais lan\u00C3\u00A7ados na fatura.")
  public BigDecimal getTotalDebitosOpcionais() {
    return totalDebitosOpcionais;
  }
  public void setTotalDebitosOpcionais(BigDecimal totalDebitosOpcionais) {
    this.totalDebitosOpcionais = totalDebitosOpcionais;
  }

  
  /**
   * Valor total dos pagamentos lan\u00C3\u00A7ados na fatura.
   **/
  @ApiModelProperty(value = "Valor total dos pagamentos lan\u00C3\u00A7ados na fatura.")
  public BigDecimal getTotalPagamentos() {
    return totalPagamentos;
  }
  public void setTotalPagamentos(BigDecimal totalPagamentos) {
    this.totalPagamentos = totalPagamentos;
  }

  
  /**
   * Valor total dos cr\u00C3\u00A9ditos nacionais lan\u00C3\u00A7ados na fatura.
   **/
  @ApiModelProperty(value = "Valor total dos cr\u00C3\u00A9ditos nacionais lan\u00C3\u00A7ados na fatura.")
  public BigDecimal getTotalCreditosNacionais() {
    return totalCreditosNacionais;
  }
  public void setTotalCreditosNacionais(BigDecimal totalCreditosNacionais) {
    this.totalCreditosNacionais = totalCreditosNacionais;
  }

  
  /**
   * Valor total dos ajustes lan\u00C3\u00A7ados na fatura.
   **/
  @ApiModelProperty(value = "Valor total dos ajustes lan\u00C3\u00A7ados na fatura.")
  public BigDecimal getTotalAjustes() {
    return totalAjustes;
  }
  public void setTotalAjustes(BigDecimal totalAjustes) {
    this.totalAjustes = totalAjustes;
  }

  
  /**
   * Valor total das tarifas lan\u00C3\u00A7adas na fatura.
   **/
  @ApiModelProperty(value = "Valor total das tarifas lan\u00C3\u00A7adas na fatura.")
  public BigDecimal getTotalTarifas() {
    return totalTarifas;
  }
  public void setTotalTarifas(BigDecimal totalTarifas) {
    this.totalTarifas = totalTarifas;
  }

  
  /**
   * Valor total da multa lan\u00C3\u00A7ada na fatura.
   **/
  @ApiModelProperty(value = "Valor total da multa lan\u00C3\u00A7ada na fatura.")
  public BigDecimal getTotalMulta() {
    return totalMulta;
  }
  public void setTotalMulta(BigDecimal totalMulta) {
    this.totalMulta = totalMulta;
  }

  
  /**
   * Valor total dos juros de mora lan\u00C3\u00A7ados na fatura.
   **/
  @ApiModelProperty(value = "Valor total dos juros de mora lan\u00C3\u00A7ados na fatura.")
  public BigDecimal getTotalJuros() {
    return totalJuros;
  }
  public void setTotalJuros(BigDecimal totalJuros) {
    this.totalJuros = totalJuros;
  }

  
  /**
   * Valor percentual da taxa de juros rotativos.
   **/
  @ApiModelProperty(value = "Valor percentual da taxa de juros rotativos.")
  public BigDecimal getTaxaRotativo() {
    return taxaRotativo;
  }
  public void setTaxaRotativo(BigDecimal taxaRotativo) {
    this.taxaRotativo = taxaRotativo;
  }

  
  /**
   * Valor percentual da taxa de saque.
   **/
  @ApiModelProperty(value = "Valor percentual da taxa de saque.")
  public BigDecimal getTaxaSaque() {
    return taxaSaque;
  }
  public void setTaxaSaque(BigDecimal taxaSaque) {
    this.taxaSaque = taxaSaque;
  }

  
  /**
   * Valor m\u00C3\u00A1ximo percentual da taxa de encargos para o pr\u00C3\u00B3ximo per\u00C3\u00ADodo.
   **/
  @ApiModelProperty(value = "Valor m\u00C3\u00A1ximo percentual da taxa de encargos para o pr\u00C3\u00B3ximo per\u00C3\u00ADodo.")
  public BigDecimal getTaxaMaximaProximoPeriodo() {
    return taxaMaximaProximoPeriodo;
  }
  public void setTaxaMaximaProximoPeriodo(BigDecimal taxaMaximaProximoPeriodo) {
    this.taxaMaximaProximoPeriodo = taxaMaximaProximoPeriodo;
  }

  
  /**
   * Apresenta a soma de todos os seguros cobrados na fatura do cliente.
   **/
  @ApiModelProperty(required = true, value = "Apresenta a soma de todos os seguros cobrados na fatura do cliente.")
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


