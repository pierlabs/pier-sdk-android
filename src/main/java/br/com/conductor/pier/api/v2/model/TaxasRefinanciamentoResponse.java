package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de resposta para a valida\u00C3\u00A7\u00C3\u00A3o das Taxas de Refinanciamento
 **/
@ApiModel(description = "Objeto de resposta para a valida\u00C3\u00A7\u00C3\u00A3o das Taxas de Refinanciamento")
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
   * ID das taxas
   **/
  @ApiModelProperty(value = "ID das taxas")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * ID da conta
   **/
  @ApiModelProperty(value = "ID da conta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * ID do produto
   **/
  @ApiModelProperty(value = "ID do produto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * ID do plano de contas
   **/
  @ApiModelProperty(value = "ID do plano de contas")
  public Long getIdPlanoConta() {
    return idPlanoConta;
  }
  public void setIdPlanoConta(Long idPlanoConta) {
    this.idPlanoConta = idPlanoConta;
  }

  
  /**
   * ID do plano PCT
   **/
  @ApiModelProperty(value = "ID do plano PCT")
  public Long getIdPlanoPct() {
    return idPlanoPct;
  }
  public void setIdPlanoPct(Long idPlanoPct) {
    this.idPlanoPct = idPlanoPct;
  }

  
  /**
   * ID do plano credito taxa
   **/
  @ApiModelProperty(value = "ID do plano credito taxa")
  public Long getIdPlanoCreditoTaxa() {
    return idPlanoCreditoTaxa;
  }
  public void setIdPlanoCreditoTaxa(Long idPlanoCreditoTaxa) {
    this.idPlanoCreditoTaxa = idPlanoCreditoTaxa;
  }

  
  /**
   * Data de entrada
   **/
  @ApiModelProperty(value = "Data de entrada")
  public String getDataEntrada() {
    return dataEntrada;
  }
  public void setDataEntrada(String dataEntrada) {
    this.dataEntrada = dataEntrada;
  }

  
  /**
   * Vencimento das taxas
   **/
  @ApiModelProperty(value = "Vencimento das taxas")
  public String getVencimento() {
    return vencimento;
  }
  public void setVencimento(String vencimento) {
    this.vencimento = vencimento;
  }

  
  /**
   * Recupera\u00C3\u00A7\u00C3\u00A3o de encargos financeiro
   **/
  @ApiModelProperty(value = "Recupera\u00C3\u00A7\u00C3\u00A3o de encargos financeiro")
  public BigDecimal getRecuperacaoEncargosFinanceiros() {
    return recuperacaoEncargosFinanceiros;
  }
  public void setRecuperacaoEncargosFinanceiros(BigDecimal recuperacaoEncargosFinanceiros) {
    this.recuperacaoEncargosFinanceiros = recuperacaoEncargosFinanceiros;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o da comiss\u00C3\u00A3o de garantia
   **/
  @ApiModelProperty(value = "Descri\u00C3\u00A7\u00C3\u00A3o da comiss\u00C3\u00A3o de garantia")
  public BigDecimal getComissaoGarantia() {
    return comissaoGarantia;
  }
  public void setComissaoGarantia(BigDecimal comissaoGarantia) {
    this.comissaoGarantia = comissaoGarantia;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do agenciamento
   **/
  @ApiModelProperty(value = "Descri\u00C3\u00A7\u00C3\u00A3o do agenciamento")
  public BigDecimal getAgenciamento() {
    return agenciamento;
  }
  public void setAgenciamento(BigDecimal agenciamento) {
    this.agenciamento = agenciamento;
  }

  
  /**
   * Taxa m\u00C3\u00A1xima do proximo per\u00C3\u00ADodo
   **/
  @ApiModelProperty(value = "Taxa m\u00C3\u00A1xima do proximo per\u00C3\u00ADodo")
  public BigDecimal getTaxaMaximaProximoPeriodo() {
    return taxaMaximaProximoPeriodo;
  }
  public void setTaxaMaximaProximoPeriodo(BigDecimal taxaMaximaProximoPeriodo) {
    this.taxaMaximaProximoPeriodo = taxaMaximaProximoPeriodo;
  }

  
  /**
   * Taxa de encargos do financiamento
   **/
  @ApiModelProperty(value = "Taxa de encargos do financiamento")
  public BigDecimal getTaxaEncargosFinanciamento() {
    return taxaEncargosFinanciamento;
  }
  public void setTaxaEncargosFinanciamento(BigDecimal taxaEncargosFinanciamento) {
    this.taxaEncargosFinanciamento = taxaEncargosFinanciamento;
  }

  
  /**
   * Taxa m\u00C3\u00A1xima de saque
   **/
  @ApiModelProperty(value = "Taxa m\u00C3\u00A1xima de saque")
  public BigDecimal getTaxaMaximaSaque() {
    return taxaMaximaSaque;
  }
  public void setTaxaMaximaSaque(BigDecimal taxaMaximaSaque) {
    this.taxaMaximaSaque = taxaMaximaSaque;
  }

  
  /**
   * Taxa de saque
   **/
  @ApiModelProperty(value = "Taxa de saque")
  public BigDecimal getTaxaSaque() {
    return taxaSaque;
  }
  public void setTaxaSaque(BigDecimal taxaSaque) {
    this.taxaSaque = taxaSaque;
  }

  
  /**
   * Taxa m\u00C3\u00A1xima de compras juros
   **/
  @ApiModelProperty(value = "Taxa m\u00C3\u00A1xima de compras juros")
  public BigDecimal getTaxaMaximaCompraJuros() {
    return taxaMaximaCompraJuros;
  }
  public void setTaxaMaximaCompraJuros(BigDecimal taxaMaximaCompraJuros) {
    this.taxaMaximaCompraJuros = taxaMaximaCompraJuros;
  }

  
  /**
   * Taxa de juros compra
   **/
  @ApiModelProperty(value = "Taxa de juros compra")
  public BigDecimal getTaxaCompraJuros() {
    return taxaCompraJuros;
  }
  public void setTaxaCompraJuros(BigDecimal taxaCompraJuros) {
    this.taxaCompraJuros = taxaCompraJuros;
  }

  
  /**
   * Taxa de permanencia
   **/
  @ApiModelProperty(value = "Taxa de permanencia")
  public BigDecimal getTaxaPermanencia() {
    return taxaPermanencia;
  }
  public void setTaxaPermanencia(BigDecimal taxaPermanencia) {
    this.taxaPermanencia = taxaPermanencia;
  }

  
  /**
   * Taxa de permanencia
   **/
  @ApiModelProperty(value = "Taxa de permanencia")
  public BigDecimal getTaxaRefinanciamento() {
    return taxaRefinanciamento;
  }
  public void setTaxaRefinanciamento(BigDecimal taxaRefinanciamento) {
    this.taxaRefinanciamento = taxaRefinanciamento;
  }

  
  /**
   * Taxa de permanencia
   **/
  @ApiModelProperty(value = "Taxa de permanencia")
  public BigDecimal getTaxaRecuperacaoRefinanciamento() {
    return taxaRecuperacaoRefinanciamento;
  }
  public void setTaxaRecuperacaoRefinanciamento(BigDecimal taxaRecuperacaoRefinanciamento) {
    this.taxaRecuperacaoRefinanciamento = taxaRecuperacaoRefinanciamento;
  }

  
  /**
   * Taxa Percelamento pagamento minimo
   **/
  @ApiModelProperty(value = "Taxa Percelamento pagamento minimo")
  public BigDecimal getTaxaPercCalcPagamentoMinimo() {
    return taxaPercCalcPagamentoMinimo;
  }
  public void setTaxaPercCalcPagamentoMinimo(BigDecimal taxaPercCalcPagamentoMinimo) {
    this.taxaPercCalcPagamentoMinimo = taxaPercCalcPagamentoMinimo;
  }

  
  /**
   * Plano de taxa padr\u00C3\u00A3o
   **/
  @ApiModelProperty(value = "Plano de taxa padr\u00C3\u00A3o")
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
