package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object of request for simulation of an agreement
 **/
@ApiModel(description = "Object of request for simulation of an agreement")
public class PlanInstallmentAgreementRequest  {
  
  @SerializedName("saldoDevedor")
  private BigDecimal saldoDevedor = null;
  @SerializedName("numeroParcelas")
  private Integer numeroParcelas = null;
  @SerializedName("diasAtraso")
  private Integer diasAtraso = null;

  
  /**
   * Debtor balance
   **/
  @ApiModelProperty(required = true, value = "Debtor balance")
  public BigDecimal getSaldoDevedor() {
    return saldoDevedor;
  }
  public void setSaldoDevedor(BigDecimal saldoDevedor) {
    this.saldoDevedor = saldoDevedor;
  }

  
  /**
   * Number of parcels requested for the agreement
   **/
  @ApiModelProperty(required = true, value = "Number of parcels requested for the agreement")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * Days of delay of debt
   **/
  @ApiModelProperty(required = true, value = "Days of delay of debt")
  public Integer getDiasAtraso() {
    return diasAtraso;
  }
  public void setDiasAtraso(Integer diasAtraso) {
    this.diasAtraso = diasAtraso;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanInstallmentAgreementRequest {\n");
    
    sb.append("  saldoDevedor: ").append(saldoDevedor).append("\n");
    sb.append("  numeroParcelas: ").append(numeroParcelas).append("\n");
    sb.append("  diasAtraso: ").append(diasAtraso).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
