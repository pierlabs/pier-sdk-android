package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Response Representation of the details of Simulated Antecipation Resource
 **/
@ApiModel(description = "Response Representation of the details of Simulated Antecipation Resource")
public class AntecipacaoSimuladaDetalhesResponse  {
  
  @SerializedName("quantidadeParcelas")
  private Integer quantidadeParcelas = null;
  @SerializedName("valorParcelas")
  private BigDecimal valorParcelas = null;
  @SerializedName("valorDesconto")
  private BigDecimal valorDesconto = null;
  @SerializedName("valorParcelasDesconto")
  private BigDecimal valorParcelasDesconto = null;

  
  /**
   * Quantity of parcel of the installment plan simulated
   **/
  @ApiModelProperty(value = "Quantity of parcel of the installment plan simulated")
  public Integer getQuantidadeParcelas() {
    return quantidadeParcelas;
  }
  public void setQuantidadeParcelas(Integer quantidadeParcelas) {
    this.quantidadeParcelas = quantidadeParcelas;
  }

  
  /**
   * Total value of the parcel
   **/
  @ApiModelProperty(value = "Total value of the parcel")
  public BigDecimal getValorParcelas() {
    return valorParcelas;
  }
  public void setValorParcelas(BigDecimal valorParcelas) {
    this.valorParcelas = valorParcelas;
  }

  
  /**
   * Value of the discount for the installment plan
   **/
  @ApiModelProperty(value = "Value of the discount for the installment plan")
  public BigDecimal getValorDesconto() {
    return valorDesconto;
  }
  public void setValorDesconto(BigDecimal valorDesconto) {
    this.valorDesconto = valorDesconto;
  }

  
  /**
   * Total value of the parcel after the discount application
   **/
  @ApiModelProperty(value = "Total value of the parcel after the discount application")
  public BigDecimal getValorParcelasDesconto() {
    return valorParcelasDesconto;
  }
  public void setValorParcelasDesconto(BigDecimal valorParcelasDesconto) {
    this.valorParcelasDesconto = valorParcelasDesconto;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AntecipacaoSimuladaDetalhesResponse {\n");
    
    sb.append("  quantidadeParcelas: ").append(quantidadeParcelas).append("\n");
    sb.append("  valorParcelas: ").append(valorParcelas).append("\n");
    sb.append("  valorDesconto: ").append(valorDesconto).append("\n");
    sb.append("  valorParcelasDesconto: ").append(valorParcelasDesconto).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
