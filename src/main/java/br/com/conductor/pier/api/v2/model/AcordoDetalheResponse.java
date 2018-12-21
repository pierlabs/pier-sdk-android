package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object Detailed Agreement
 **/
@ApiModel(description = "Object Detailed Agreement")
public class AcordoDetalheResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("statusAcordo")
  private Long statusAcordo = null;
  @SerializedName("valorAcordo")
  private BigDecimal valorAcordo = null;
  @SerializedName("dataAcordo")
  private String dataAcordo = null;
  @SerializedName("quantidadeParcelas")
  private Integer quantidadeParcelas = null;
  @SerializedName("saldoAtualFinal")
  private BigDecimal saldoAtualFinal = null;
  @SerializedName("diasEmAtraso")
  private Integer diasEmAtraso = null;
  @SerializedName("statusConta")
  private Long statusConta = null;
  @SerializedName("assessoriaAtual")
  private String assessoriaAtual = null;
  @SerializedName("totalPagamentos")
  private BigDecimal totalPagamentos = null;
  @SerializedName("dataVencimentoCobranca")
  private String dataVencimentoCobranca = null;
  @SerializedName("dataQuebraAcordo")
  private String dataQuebraAcordo = null;
  @SerializedName("valorParcela1")
  private BigDecimal valorParcela1 = null;
  @SerializedName("valorParcelaN")
  private BigDecimal valorParcelaN = null;
  @SerializedName("parcelaPedida")
  private Integer parcelaPedida = null;
  @SerializedName("vencimentoParcelaPedida")
  private String vencimentoParcelaPedida = null;

  
  /**
   * Identification Code of the agreement (id)
   **/
  @ApiModelProperty(value = "Identification Code of the agreement (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identification Code of the account
   **/
  @ApiModelProperty(value = "Identification Code of the account")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Status of the agreement
   **/
  @ApiModelProperty(value = "Status of the agreement")
  public Long getStatusAcordo() {
    return statusAcordo;
  }
  public void setStatusAcordo(Long statusAcordo) {
    this.statusAcordo = statusAcordo;
  }

  
  /**
   * Value of the Agreement
   **/
  @ApiModelProperty(value = "Value of the Agreement")
  public BigDecimal getValorAcordo() {
    return valorAcordo;
  }
  public void setValorAcordo(BigDecimal valorAcordo) {
    this.valorAcordo = valorAcordo;
  }

  
  /**
   * Date and time of the agreement
   **/
  @ApiModelProperty(value = "Date and time of the agreement")
  public String getDataAcordo() {
    return dataAcordo;
  }
  public void setDataAcordo(String dataAcordo) {
    this.dataAcordo = dataAcordo;
  }

  
  /**
   * Quantity of parcels of the agreement
   **/
  @ApiModelProperty(value = "Quantity of parcels of the agreement")
  public Integer getQuantidadeParcelas() {
    return quantidadeParcelas;
  }
  public void setQuantidadeParcelas(Integer quantidadeParcelas) {
    this.quantidadeParcelas = quantidadeParcelas;
  }

  
  /**
   * Current final balance
   **/
  @ApiModelProperty(value = "Current final balance")
  public BigDecimal getSaldoAtualFinal() {
    return saldoAtualFinal;
  }
  public void setSaldoAtualFinal(BigDecimal saldoAtualFinal) {
    this.saldoAtualFinal = saldoAtualFinal;
  }

  
  /**
   * Days in Arrears
   **/
  @ApiModelProperty(value = "Days in Arrears")
  public Integer getDiasEmAtraso() {
    return diasEmAtraso;
  }
  public void setDiasEmAtraso(Integer diasEmAtraso) {
    this.diasEmAtraso = diasEmAtraso;
  }

  
  /**
   * Status of the account
   **/
  @ApiModelProperty(value = "Status of the account")
  public Long getStatusConta() {
    return statusConta;
  }
  public void setStatusConta(Long statusConta) {
    this.statusConta = statusConta;
  }

  
  /**
   * Current Advisory
   **/
  @ApiModelProperty(value = "Current Advisory")
  public String getAssessoriaAtual() {
    return assessoriaAtual;
  }
  public void setAssessoriaAtual(String assessoriaAtual) {
    this.assessoriaAtual = assessoriaAtual;
  }

  
  /**
   * Total of the payments
   **/
  @ApiModelProperty(value = "Total of the payments")
  public BigDecimal getTotalPagamentos() {
    return totalPagamentos;
  }
  public void setTotalPagamentos(BigDecimal totalPagamentos) {
    this.totalPagamentos = totalPagamentos;
  }

  
  /**
   * Expiration date of the Collection
   **/
  @ApiModelProperty(value = "Expiration date of the Collection")
  public String getDataVencimentoCobranca() {
    return dataVencimentoCobranca;
  }
  public void setDataVencimentoCobranca(String dataVencimentoCobranca) {
    this.dataVencimentoCobranca = dataVencimentoCobranca;
  }

  
  /**
   * Date of the Breach agreement
   **/
  @ApiModelProperty(value = "Date of the Breach agreement")
  public String getDataQuebraAcordo() {
    return dataQuebraAcordo;
  }
  public void setDataQuebraAcordo(String dataQuebraAcordo) {
    this.dataQuebraAcordo = dataQuebraAcordo;
  }

  
  /**
   * Value of the parcel 1
   **/
  @ApiModelProperty(value = "Value of the parcel 1")
  public BigDecimal getValorParcela1() {
    return valorParcela1;
  }
  public void setValorParcela1(BigDecimal valorParcela1) {
    this.valorParcela1 = valorParcela1;
  }

  
  /**
   * Value of the parcel N
   **/
  @ApiModelProperty(value = "Value of the parcel N")
  public BigDecimal getValorParcelaN() {
    return valorParcelaN;
  }
  public void setValorParcelaN(BigDecimal valorParcelaN) {
    this.valorParcelaN = valorParcelaN;
  }

  
  /**
   * Lost parcel
   **/
  @ApiModelProperty(value = "Lost parcel")
  public Integer getParcelaPedida() {
    return parcelaPedida;
  }
  public void setParcelaPedida(Integer parcelaPedida) {
    this.parcelaPedida = parcelaPedida;
  }

  
  /**
   * Expiration date of the lost parcel
   **/
  @ApiModelProperty(value = "Expiration date of the lost parcel")
  public String getVencimentoParcelaPedida() {
    return vencimentoParcelaPedida;
  }
  public void setVencimentoParcelaPedida(String vencimentoParcelaPedida) {
    this.vencimentoParcelaPedida = vencimentoParcelaPedida;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcordoDetalheResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  statusAcordo: ").append(statusAcordo).append("\n");
    sb.append("  valorAcordo: ").append(valorAcordo).append("\n");
    sb.append("  dataAcordo: ").append(dataAcordo).append("\n");
    sb.append("  quantidadeParcelas: ").append(quantidadeParcelas).append("\n");
    sb.append("  saldoAtualFinal: ").append(saldoAtualFinal).append("\n");
    sb.append("  diasEmAtraso: ").append(diasEmAtraso).append("\n");
    sb.append("  statusConta: ").append(statusConta).append("\n");
    sb.append("  assessoriaAtual: ").append(assessoriaAtual).append("\n");
    sb.append("  totalPagamentos: ").append(totalPagamentos).append("\n");
    sb.append("  dataVencimentoCobranca: ").append(dataVencimentoCobranca).append("\n");
    sb.append("  dataQuebraAcordo: ").append(dataQuebraAcordo).append("\n");
    sb.append("  valorParcela1: ").append(valorParcela1).append("\n");
    sb.append("  valorParcelaN: ").append(valorParcelaN).append("\n");
    sb.append("  parcelaPedida: ").append(parcelaPedida).append("\n");
    sb.append("  vencimentoParcelaPedida: ").append(vencimentoParcelaPedida).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
