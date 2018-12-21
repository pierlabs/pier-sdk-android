package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Agreement Object
 **/
@ApiModel(description = "Agreement Object")
public class AcordoResponse  {
  
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcordoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  statusAcordo: ").append(statusAcordo).append("\n");
    sb.append("  valorAcordo: ").append(valorAcordo).append("\n");
    sb.append("  dataAcordo: ").append(dataAcordo).append("\n");
    sb.append("  quantidadeParcelas: ").append(quantidadeParcelas).append("\n");
    sb.append("  saldoAtualFinal: ").append(saldoAtualFinal).append("\n");
    sb.append("  diasEmAtraso: ").append(diasEmAtraso).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
