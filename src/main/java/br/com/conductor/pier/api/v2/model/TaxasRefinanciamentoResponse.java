package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object of response for the validation of the refinancing taxes
 **/
@ApiModel(description = "Object of response for the validation of the refinancing taxes")
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
   * ID of the taxes
   **/
  @ApiModelProperty(value = "ID of the taxes")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * ID of the account
   **/
  @ApiModelProperty(value = "ID of the account")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * ID of the product
   **/
  @ApiModelProperty(value = "ID of the product")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * ID of the account plan
   **/
  @ApiModelProperty(value = "ID of the account plan")
  public Long getIdPlanoConta() {
    return idPlanoConta;
  }
  public void setIdPlanoConta(Long idPlanoConta) {
    this.idPlanoConta = idPlanoConta;
  }

  
  /**
   * ID of the PCT plan
   **/
  @ApiModelProperty(value = "ID of the PCT plan")
  public Long getIdPlanoPct() {
    return idPlanoPct;
  }
  public void setIdPlanoPct(Long idPlanoPct) {
    this.idPlanoPct = idPlanoPct;
  }

  
  /**
   * ID plan taxe credit
   **/
  @ApiModelProperty(value = "ID plan taxe credit")
  public Long getIdPlanoCreditoTaxa() {
    return idPlanoCreditoTaxa;
  }
  public void setIdPlanoCreditoTaxa(Long idPlanoCreditoTaxa) {
    this.idPlanoCreditoTaxa = idPlanoCreditoTaxa;
  }

  
  /**
   * Entrance date
   **/
  @ApiModelProperty(value = "Entrance date")
  public String getDataEntrada() {
    return dataEntrada;
  }
  public void setDataEntrada(String dataEntrada) {
    this.dataEntrada = dataEntrada;
  }

  
  /**
   * Expiration of the taxes
   **/
  @ApiModelProperty(value = "Expiration of the taxes")
  public String getVencimento() {
    return vencimento;
  }
  public void setVencimento(String vencimento) {
    this.vencimento = vencimento;
  }

  
  /**
   * Retrieve of the financial charges
   **/
  @ApiModelProperty(value = "Retrieve of the financial charges")
  public BigDecimal getRecuperacaoEncargosFinanceiros() {
    return recuperacaoEncargosFinanceiros;
  }
  public void setRecuperacaoEncargosFinanceiros(BigDecimal recuperacaoEncargosFinanceiros) {
    this.recuperacaoEncargosFinanceiros = recuperacaoEncargosFinanceiros;
  }

  
  /**
   * Description of the guarantee commission
   **/
  @ApiModelProperty(value = "Description of the guarantee commission")
  public BigDecimal getComissaoGarantia() {
    return comissaoGarantia;
  }
  public void setComissaoGarantia(BigDecimal comissaoGarantia) {
    this.comissaoGarantia = comissaoGarantia;
  }

  
  /**
   * Description of the management
   **/
  @ApiModelProperty(value = "Description of the management")
  public BigDecimal getAgenciamento() {
    return agenciamento;
  }
  public void setAgenciamento(BigDecimal agenciamento) {
    this.agenciamento = agenciamento;
  }

  
  /**
   * Maximum taxe of the next period
   **/
  @ApiModelProperty(value = "Maximum taxe of the next period")
  public BigDecimal getTaxaMaximaProximoPeriodo() {
    return taxaMaximaProximoPeriodo;
  }
  public void setTaxaMaximaProximoPeriodo(BigDecimal taxaMaximaProximoPeriodo) {
    this.taxaMaximaProximoPeriodo = taxaMaximaProximoPeriodo;
  }

  
  /**
   * Taxe of the financing charges
   **/
  @ApiModelProperty(value = "Taxe of the financing charges")
  public BigDecimal getTaxaEncargosFinanciamento() {
    return taxaEncargosFinanciamento;
  }
  public void setTaxaEncargosFinanciamento(BigDecimal taxaEncargosFinanciamento) {
    this.taxaEncargosFinanciamento = taxaEncargosFinanciamento;
  }

  
  /**
   * Maximum taxe of the withdrawal
   **/
  @ApiModelProperty(value = "Maximum taxe of the withdrawal")
  public BigDecimal getTaxaMaximaSaque() {
    return taxaMaximaSaque;
  }
  public void setTaxaMaximaSaque(BigDecimal taxaMaximaSaque) {
    this.taxaMaximaSaque = taxaMaximaSaque;
  }

  
  /**
   * Withdrawal taxe
   **/
  @ApiModelProperty(value = "Withdrawal taxe")
  public BigDecimal getTaxaSaque() {
    return taxaSaque;
  }
  public void setTaxaSaque(BigDecimal taxaSaque) {
    this.taxaSaque = taxaSaque;
  }

  
  /**
   * Maximum taxe of shop interest
   **/
  @ApiModelProperty(value = "Maximum taxe of shop interest")
  public BigDecimal getTaxaMaximaCompraJuros() {
    return taxaMaximaCompraJuros;
  }
  public void setTaxaMaximaCompraJuros(BigDecimal taxaMaximaCompraJuros) {
    this.taxaMaximaCompraJuros = taxaMaximaCompraJuros;
  }

  
  /**
   * Shop interest taxes
   **/
  @ApiModelProperty(value = "Shop interest taxes")
  public BigDecimal getTaxaCompraJuros() {
    return taxaCompraJuros;
  }
  public void setTaxaCompraJuros(BigDecimal taxaCompraJuros) {
    this.taxaCompraJuros = taxaCompraJuros;
  }

  
  /**
   * Remaining Taxe
   **/
  @ApiModelProperty(value = "Remaining Taxe")
  public BigDecimal getTaxaPermanencia() {
    return taxaPermanencia;
  }
  public void setTaxaPermanencia(BigDecimal taxaPermanencia) {
    this.taxaPermanencia = taxaPermanencia;
  }

  
  /**
   * Remaining taxe
   **/
  @ApiModelProperty(value = "Remaining taxe")
  public BigDecimal getTaxaRefinanciamento() {
    return taxaRefinanciamento;
  }
  public void setTaxaRefinanciamento(BigDecimal taxaRefinanciamento) {
    this.taxaRefinanciamento = taxaRefinanciamento;
  }

  
  /**
   * Taxe of remaining
   **/
  @ApiModelProperty(value = "Taxe of remaining")
  public BigDecimal getTaxaRecuperacaoRefinanciamento() {
    return taxaRecuperacaoRefinanciamento;
  }
  public void setTaxaRecuperacaoRefinanciamento(BigDecimal taxaRecuperacaoRefinanciamento) {
    this.taxaRecuperacaoRefinanciamento = taxaRecuperacaoRefinanciamento;
  }

  
  /**
   * Taxe of Installment for Minimum payment
   **/
  @ApiModelProperty(value = "Taxe of Installment for Minimum payment")
  public BigDecimal getTaxaPercCalcPagamentoMinimo() {
    return taxaPercCalcPagamentoMinimo;
  }
  public void setTaxaPercCalcPagamentoMinimo(BigDecimal taxaPercCalcPagamentoMinimo) {
    this.taxaPercCalcPagamentoMinimo = taxaPercCalcPagamentoMinimo;
  }

  
  /**
   * Plan of the standard taxe
   **/
  @ApiModelProperty(value = "Plan of the standard taxe")
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
