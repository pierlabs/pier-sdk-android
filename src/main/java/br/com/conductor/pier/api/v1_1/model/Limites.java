package br.com.conductor.pier.api.v1_1.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Limites
 **/
@ApiModel(description = "Limites")
public class Limites  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("limiteCompra")
  private Double limiteCompra = null;
  @SerializedName("limiteConsignado")
  private Double limiteConsignado = null;
  @SerializedName("limiteExterno")
  private Double limiteExterno = null;
  @SerializedName("limiteExtra")
  private Double limiteExtra = null;
  @SerializedName("limiteGlobal")
  private Double limiteGlobal = null;
  @SerializedName("limiteInternacionalCompra")
  private Double limiteInternacionalCompra = null;
  @SerializedName("limiteInternacionalParcelado")
  private Double limiteInternacionalParcelado = null;
  @SerializedName("limiteInternacionalParcelas")
  private Double limiteInternacionalParcelas = null;
  @SerializedName("limiteInternacionalSaqueGlobal")
  private Double limiteInternacionalSaqueGlobal = null;
  @SerializedName("limiteInternacionalSaquePeriodo")
  private Double limiteInternacionalSaquePeriodo = null;
  @SerializedName("limiteMensal")
  private Double limiteMensal = null;
  @SerializedName("limiteParcelado")
  private Double limiteParcelado = null;
  @SerializedName("limiteParcelas")
  private Double limiteParcelas = null;
  @SerializedName("limiteSaqueGlobal")
  private Double limiteSaqueGlobal = null;
  @SerializedName("limiteSaquePeriodo")
  private Double limiteSaquePeriodo = null;

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Limite Disponibilidade (id).
   **/
  @ApiModelProperty(required = true, value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Limite Disponibilidade (id).")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getLimiteCompra() {
    return limiteCompra;
  }
  public void setLimiteCompra(Double limiteCompra) {
    this.limiteCompra = limiteCompra;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getLimiteConsignado() {
    return limiteConsignado;
  }
  public void setLimiteConsignado(Double limiteConsignado) {
    this.limiteConsignado = limiteConsignado;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getLimiteExterno() {
    return limiteExterno;
  }
  public void setLimiteExterno(Double limiteExterno) {
    this.limiteExterno = limiteExterno;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getLimiteExtra() {
    return limiteExtra;
  }
  public void setLimiteExtra(Double limiteExtra) {
    this.limiteExtra = limiteExtra;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(Double limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getLimiteInternacionalCompra() {
    return limiteInternacionalCompra;
  }
  public void setLimiteInternacionalCompra(Double limiteInternacionalCompra) {
    this.limiteInternacionalCompra = limiteInternacionalCompra;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getLimiteInternacionalParcelado() {
    return limiteInternacionalParcelado;
  }
  public void setLimiteInternacionalParcelado(Double limiteInternacionalParcelado) {
    this.limiteInternacionalParcelado = limiteInternacionalParcelado;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getLimiteInternacionalParcelas() {
    return limiteInternacionalParcelas;
  }
  public void setLimiteInternacionalParcelas(Double limiteInternacionalParcelas) {
    this.limiteInternacionalParcelas = limiteInternacionalParcelas;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getLimiteInternacionalSaqueGlobal() {
    return limiteInternacionalSaqueGlobal;
  }
  public void setLimiteInternacionalSaqueGlobal(Double limiteInternacionalSaqueGlobal) {
    this.limiteInternacionalSaqueGlobal = limiteInternacionalSaqueGlobal;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getLimiteInternacionalSaquePeriodo() {
    return limiteInternacionalSaquePeriodo;
  }
  public void setLimiteInternacionalSaquePeriodo(Double limiteInternacionalSaquePeriodo) {
    this.limiteInternacionalSaquePeriodo = limiteInternacionalSaquePeriodo;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getLimiteMensal() {
    return limiteMensal;
  }
  public void setLimiteMensal(Double limiteMensal) {
    this.limiteMensal = limiteMensal;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getLimiteParcelado() {
    return limiteParcelado;
  }
  public void setLimiteParcelado(Double limiteParcelado) {
    this.limiteParcelado = limiteParcelado;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getLimiteParcelas() {
    return limiteParcelas;
  }
  public void setLimiteParcelas(Double limiteParcelas) {
    this.limiteParcelas = limiteParcelas;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getLimiteSaqueGlobal() {
    return limiteSaqueGlobal;
  }
  public void setLimiteSaqueGlobal(Double limiteSaqueGlobal) {
    this.limiteSaqueGlobal = limiteSaqueGlobal;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getLimiteSaquePeriodo() {
    return limiteSaquePeriodo;
  }
  public void setLimiteSaquePeriodo(Double limiteSaquePeriodo) {
    this.limiteSaquePeriodo = limiteSaquePeriodo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Limites {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  limiteCompra: ").append(limiteCompra).append("\n");
    sb.append("  limiteConsignado: ").append(limiteConsignado).append("\n");
    sb.append("  limiteExterno: ").append(limiteExterno).append("\n");
    sb.append("  limiteExtra: ").append(limiteExtra).append("\n");
    sb.append("  limiteGlobal: ").append(limiteGlobal).append("\n");
    sb.append("  limiteInternacionalCompra: ").append(limiteInternacionalCompra).append("\n");
    sb.append("  limiteInternacionalParcelado: ").append(limiteInternacionalParcelado).append("\n");
    sb.append("  limiteInternacionalParcelas: ").append(limiteInternacionalParcelas).append("\n");
    sb.append("  limiteInternacionalSaqueGlobal: ").append(limiteInternacionalSaqueGlobal).append("\n");
    sb.append("  limiteInternacionalSaquePeriodo: ").append(limiteInternacionalSaquePeriodo).append("\n");
    sb.append("  limiteMensal: ").append(limiteMensal).append("\n");
    sb.append("  limiteParcelado: ").append(limiteParcelado).append("\n");
    sb.append("  limiteParcelas: ").append(limiteParcelas).append("\n");
    sb.append("  limiteSaqueGlobal: ").append(limiteSaqueGlobal).append("\n");
    sb.append("  limiteSaquePeriodo: ").append(limiteSaquePeriodo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


