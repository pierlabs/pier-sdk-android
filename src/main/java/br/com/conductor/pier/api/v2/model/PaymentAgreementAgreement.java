package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object of response to the installment agreement
 **/
@ApiModel(description = "Object of response to the installment agreement")
public class PaymentAgreementAgreement  {
  
  @SerializedName("percentualEntrada")
  private BigDecimal percentualEntrada = null;
  @SerializedName("percentualDesconto")
  private BigDecimal percentualDesconto = null;
  @SerializedName("valorDesconto")
  private BigDecimal valorDesconto = null;
  @SerializedName("valorLiquido")
  private BigDecimal valorLiquido = null;
  @SerializedName("valorEntrada")
  private BigDecimal valorEntrada = null;
  @SerializedName("valorParcela")
  private BigDecimal valorParcela = null;
  @SerializedName("valorPrimeiraParcela")
  private BigDecimal valorPrimeiraParcela = null;

  
  /**
   * Value of the entry percentage of the agreement
   **/
  @ApiModelProperty(value = "Value of the entry percentage of the agreement")
  public BigDecimal getPercentualEntrada() {
    return percentualEntrada;
  }
  public void setPercentualEntrada(BigDecimal percentualEntrada) {
    this.percentualEntrada = percentualEntrada;
  }

  
  /**
   * Value of the discount percentage of the agreement
   **/
  @ApiModelProperty(value = "Value of the discount percentage of the agreement")
  public BigDecimal getPercentualDesconto() {
    return percentualDesconto;
  }
  public void setPercentualDesconto(BigDecimal percentualDesconto) {
    this.percentualDesconto = percentualDesconto;
  }

  
  /**
   * Amount discount amount
   **/
  @ApiModelProperty(value = "Amount discount amount")
  public BigDecimal getValorDesconto() {
    return valorDesconto;
  }
  public void setValorDesconto(BigDecimal valorDesconto) {
    this.valorDesconto = valorDesconto;
  }

  
  /**
   * Net value of the agreement
   **/
  @ApiModelProperty(value = "Net value of the agreement")
  public BigDecimal getValorLiquido() {
    return valorLiquido;
  }
  public void setValorLiquido(BigDecimal valorLiquido) {
    this.valorLiquido = valorLiquido;
  }

  
  /**
   * Value of agreement
   **/
  @ApiModelProperty(value = "Value of agreement")
  public BigDecimal getValorEntrada() {
    return valorEntrada;
  }
  public void setValorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
  }

  
  /**
   * Amount of the agreement
   **/
  @ApiModelProperty(value = "Amount of the agreement")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   * Value of the first installment of the agreement
   **/
  @ApiModelProperty(value = "Value of the first installment of the agreement")
  public BigDecimal getValorPrimeiraParcela() {
    return valorPrimeiraParcela;
  }
  public void setValorPrimeiraParcela(BigDecimal valorPrimeiraParcela) {
    this.valorPrimeiraParcela = valorPrimeiraParcela;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentAgreementAgreement {\n");
    
    sb.append("  percentualEntrada: ").append(percentualEntrada).append("\n");
    sb.append("  percentualDesconto: ").append(percentualDesconto).append("\n");
    sb.append("  valorDesconto: ").append(valorDesconto).append("\n");
    sb.append("  valorLiquido: ").append(valorLiquido).append("\n");
    sb.append("  valorEntrada: ").append(valorEntrada).append("\n");
    sb.append("  valorParcela: ").append(valorParcela).append("\n");
    sb.append("  valorPrimeiraParcela: ").append(valorPrimeiraParcela).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
