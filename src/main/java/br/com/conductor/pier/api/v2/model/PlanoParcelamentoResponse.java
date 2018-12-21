package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Response Representa??o of the installment plan resource
 **/
@ApiModel(description = "Response Representa??o of the installment plan resource")
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
  @SerializedName("idServicoTipo")
  private Long idServicoTipo = null;
  @SerializedName("descricaoServicoTipo")
  private String descricaoServicoTipo = null;
  @SerializedName("comEntrada")
  private Boolean comEntrada = null;
  @SerializedName("nomeCampanha")
  private String nomeCampanha = null;

  
  /**
   * Identifier of the Installment
   **/
  @ApiModelProperty(value = "Identifier of the Installment")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * date of the Closing invoice
   **/
  @ApiModelProperty(value = "date of the Closing invoice")
  public String getDataFechamentoFatura() {
    return dataFechamentoFatura;
  }
  public void setDataFechamentoFatura(String dataFechamentoFatura) {
    this.dataFechamentoFatura = dataFechamentoFatura;
  }

  
  /**
   * Standard Expiration Date
   **/
  @ApiModelProperty(value = "Standard Expiration Date")
  public String getDataVencimentoPadrao() {
    return dataVencimentoPadrao;
  }
  public void setDataVencimentoPadrao(String dataVencimentoPadrao) {
    this.dataVencimentoPadrao = dataVencimentoPadrao;
  }

  
  /**
   * Total value of the invoice
   **/
  @ApiModelProperty(value = "Total value of the invoice")
  public BigDecimal getValorTotalFatura() {
    return valorTotalFatura;
  }
  public void setValorTotalFatura(BigDecimal valorTotalFatura) {
    this.valorTotalFatura = valorTotalFatura;
  }

  
  /**
   * Quantity of parcels
   **/
  @ApiModelProperty(value = "Quantity of parcels")
  public Integer getQuantidadeParcelas() {
    return quantidadeParcelas;
  }
  public void setQuantidadeParcelas(Integer quantidadeParcelas) {
    this.quantidadeParcelas = quantidadeParcelas;
  }

  
  /**
   * Parcel Value
   **/
  @ApiModelProperty(value = "Parcel Value")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   * entrance value
   **/
  @ApiModelProperty(value = "entrance value")
  public BigDecimal getValorEntrada() {
    return valorEntrada;
  }
  public void setValorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
  }

  
  /**
   * Refinancing Taxes
   **/
  @ApiModelProperty(value = "Refinancing Taxes")
  public BigDecimal getTaxaRefinanciamento() {
    return taxaRefinanciamento;
  }
  public void setTaxaRefinanciamento(BigDecimal taxaRefinanciamento) {
    this.taxaRefinanciamento = taxaRefinanciamento;
  }

  
  /**
   * Total acquisition cost
   **/
  @ApiModelProperty(value = "Total acquisition cost")
  public BigDecimal getCustoEfetivoTotal() {
    return custoEfetivoTotal;
  }
  public void setCustoEfetivoTotal(BigDecimal custoEfetivoTotal) {
    this.custoEfetivoTotal = custoEfetivoTotal;
  }

  
  /**
   * Total value of the refinancing
   **/
  @ApiModelProperty(value = "Total value of the refinancing")
  public BigDecimal getValorTotalRefinanciamento() {
    return valorTotalRefinanciamento;
  }
  public void setValorTotalRefinanciamento(BigDecimal valorTotalRefinanciamento) {
    this.valorTotalRefinanciamento = valorTotalRefinanciamento;
  }

  
  /**
   * Value of the IOF
   **/
  @ApiModelProperty(value = "Value of the IOF")
  public BigDecimal getValorIOF() {
    return valorIOF;
  }
  public void setValorIOF(BigDecimal valorIOF) {
    this.valorIOF = valorIOF;
  }

  
  /**
   * TAC value
   **/
  @ApiModelProperty(value = "TAC value")
  public BigDecimal getValorTAC() {
    return valorTAC;
  }
  public void setValorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
  }

  
  /**
   * Status of the Accession
   **/
  @ApiModelProperty(value = "Status of the Accession")
  public Integer getStatusAdesao() {
    return statusAdesao;
  }
  public void setStatusAdesao(Integer statusAdesao) {
    this.statusAdesao = statusAdesao;
  }

  
  /**
   * Inclusion date
   **/
  @ApiModelProperty(value = "Inclusion date")
  public String getDataInclusao() {
    return dataInclusao;
  }
  public void setDataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
  }

  
  /**
   * Processing date of the Accession
   **/
  @ApiModelProperty(value = "Processing date of the Accession")
  public String getDataProcessamentoAdesao() {
    return dataProcessamentoAdesao;
  }
  public void setDataProcessamentoAdesao(String dataProcessamentoAdesao) {
    this.dataProcessamentoAdesao = dataProcessamentoAdesao;
  }

  
  /**
   * Identifier of the Account
   **/
  @ApiModelProperty(value = "Identifier of the Account")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Identification Code of the Service type
   **/
  @ApiModelProperty(value = "Identification Code of the Service type")
  public Long getIdServicoTipo() {
    return idServicoTipo;
  }
  public void setIdServicoTipo(Long idServicoTipo) {
    this.idServicoTipo = idServicoTipo;
  }

  
  /**
   * Description of the service type
   **/
  @ApiModelProperty(value = "Description of the service type")
  public String getDescricaoServicoTipo() {
    return descricaoServicoTipo;
  }
  public void setDescricaoServicoTipo(String descricaoServicoTipo) {
    this.descricaoServicoTipo = descricaoServicoTipo;
  }

  
  /**
   * Indicate if the invoice was with an entrance
   **/
  @ApiModelProperty(value = "Indicate if the invoice was with an entrance")
  public Boolean getComEntrada() {
    return comEntrada;
  }
  public void setComEntrada(Boolean comEntrada) {
    this.comEntrada = comEntrada;
  }

  
  /**
   * Campaign Name
   **/
  @ApiModelProperty(value = "Campaign Name")
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
    sb.append("  idServicoTipo: ").append(idServicoTipo).append("\n");
    sb.append("  descricaoServicoTipo: ").append(descricaoServicoTipo).append("\n");
    sb.append("  comEntrada: ").append(comEntrada).append("\n");
    sb.append("  nomeCampanha: ").append(nomeCampanha).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
