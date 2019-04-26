package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto response dos detalhes do extrato de tarifas
 **/
@ApiModel(description = "Objeto response dos detalhes do extrato de tarifas")
public class DetalhesExtratoTarifasResponse  {
  
  @SerializedName("dataVencimentoPadrao")
  private String dataVencimentoPadrao = null;
  @SerializedName("iof")
  private BigDecimal iof = null;
  @SerializedName("juros")
  private BigDecimal juros = null;
  @SerializedName("tarifas")
  private BigDecimal tarifas = null;
  @SerializedName("multas")
  private BigDecimal multas = null;
  @SerializedName("mora")
  private BigDecimal mora = null;
  @SerializedName("total")
  private BigDecimal total = null;

  
  /**
   * Data de vencimento padr\u00E3o da fatura
   **/
  @ApiModelProperty(value = "Data de vencimento padr\u00E3o da fatura")
  public String getDataVencimentoPadrao() {
    return dataVencimentoPadrao;
  }
  public void setDataVencimentoPadrao(String dataVencimentoPadrao) {
    this.dataVencimentoPadrao = dataVencimentoPadrao;
  }

  
  /**
   * Valor do IOF pago na fatura
   **/
  @ApiModelProperty(value = "Valor do IOF pago na fatura")
  public BigDecimal getIof() {
    return iof;
  }
  public void setIof(BigDecimal iof) {
    this.iof = iof;
  }

  
  /**
   * Valor de juros pago na fatura
   **/
  @ApiModelProperty(value = "Valor de juros pago na fatura")
  public BigDecimal getJuros() {
    return juros;
  }
  public void setJuros(BigDecimal juros) {
    this.juros = juros;
  }

  
  /**
   * Valor de tarifas pago na fatura
   **/
  @ApiModelProperty(value = "Valor de tarifas pago na fatura")
  public BigDecimal getTarifas() {
    return tarifas;
  }
  public void setTarifas(BigDecimal tarifas) {
    this.tarifas = tarifas;
  }

  
  /**
   * Valor de multas pago na fatura
   **/
  @ApiModelProperty(value = "Valor de multas pago na fatura")
  public BigDecimal getMultas() {
    return multas;
  }
  public void setMultas(BigDecimal multas) {
    this.multas = multas;
  }

  
  /**
   * Valor de mora pago na fatura
   **/
  @ApiModelProperty(value = "Valor de mora pago na fatura")
  public BigDecimal getMora() {
    return mora;
  }
  public void setMora(BigDecimal mora) {
    this.mora = mora;
  }

  
  /**
   * Valor total de taxas pagas na fatura
   **/
  @ApiModelProperty(value = "Valor total de taxas pagas na fatura")
  public BigDecimal getTotal() {
    return total;
  }
  public void setTotal(BigDecimal total) {
    this.total = total;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetalhesExtratoTarifasResponse {\n");
    
    sb.append("  dataVencimentoPadrao: ").append(dataVencimentoPadrao).append("\n");
    sb.append("  iof: ").append(iof).append("\n");
    sb.append("  juros: ").append(juros).append("\n");
    sb.append("  tarifas: ").append(tarifas).append("\n");
    sb.append("  multas: ").append(multas).append("\n");
    sb.append("  mora: ").append(mora).append("\n");
    sb.append("  total: ").append(total).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
