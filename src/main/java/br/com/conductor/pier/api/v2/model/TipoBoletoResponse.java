package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Invoice
 **/
@ApiModel(description = "Invoice")
public class TipoBoletoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("banco")
  private Long banco = null;
  @SerializedName("faixaNossoNumero")
  private Integer faixaNossoNumero = null;
  @SerializedName("minNossoNumero")
  private BigDecimal minNossoNumero = null;
  @SerializedName("maxNossoNumero")
  private BigDecimal maxNossoNumero = null;
  @SerializedName("tamNossoNumero")
  private Integer tamNossoNumero = null;
  @SerializedName("ultimoNossoNumero")
  private BigDecimal ultimoNossoNumero = null;

  
  /**
   * Identifier code of the bank slip type
   **/
  @ApiModelProperty(value = "Identifier code of the bank slip type")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Description of the bank slip type
   **/
  @ApiModelProperty(value = "Description of the bank slip type")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Identifier Code of the bank
   **/
  @ApiModelProperty(value = "Identifier Code of the bank")
  public Long getBanco() {
    return banco;
  }
  public void setBanco(Long banco) {
    this.banco = banco;
  }

  
  /**
   * Allowed range for the creation of our number
   **/
  @ApiModelProperty(value = "Allowed range for the creation of our number")
  public Integer getFaixaNossoNumero() {
    return faixaNossoNumero;
  }
  public void setFaixaNossoNumero(Integer faixaNossoNumero) {
    this.faixaNossoNumero = faixaNossoNumero;
  }

  
  /**
   * Minimum number for our number
   **/
  @ApiModelProperty(value = "Minimum number for our number")
  public BigDecimal getMinNossoNumero() {
    return minNossoNumero;
  }
  public void setMinNossoNumero(BigDecimal minNossoNumero) {
    this.minNossoNumero = minNossoNumero;
  }

  
  /**
   * Maximum number for our number
   **/
  @ApiModelProperty(value = "Maximum number for our number")
  public BigDecimal getMaxNossoNumero() {
    return maxNossoNumero;
  }
  public void setMaxNossoNumero(BigDecimal maxNossoNumero) {
    this.maxNossoNumero = maxNossoNumero;
  }

  
  /**
   * size of our number
   **/
  @ApiModelProperty(value = "size of our number")
  public Integer getTamNossoNumero() {
    return tamNossoNumero;
  }
  public void setTamNossoNumero(Integer tamNossoNumero) {
    this.tamNossoNumero = tamNossoNumero;
  }

  
  /**
   * Last number used
   **/
  @ApiModelProperty(value = "Last number used")
  public BigDecimal getUltimoNossoNumero() {
    return ultimoNossoNumero;
  }
  public void setUltimoNossoNumero(BigDecimal ultimoNossoNumero) {
    this.ultimoNossoNumero = ultimoNossoNumero;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoBoletoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  banco: ").append(banco).append("\n");
    sb.append("  faixaNossoNumero: ").append(faixaNossoNumero).append("\n");
    sb.append("  minNossoNumero: ").append(minNossoNumero).append("\n");
    sb.append("  maxNossoNumero: ").append(maxNossoNumero).append("\n");
    sb.append("  tamNossoNumero: ").append(tamNossoNumero).append("\n");
    sb.append("  ultimoNossoNumero: ").append(ultimoNossoNumero).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
