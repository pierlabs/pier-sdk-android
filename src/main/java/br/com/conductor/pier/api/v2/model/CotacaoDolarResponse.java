package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Lista Cota\u00E7\u00F5es Dolar
 **/
@ApiModel(description = "Lista Cota\u00E7\u00F5es Dolar")
public class CotacaoDolarResponse  {
  
  @SerializedName("dataFechamento")
  private String dataFechamento = null;
  @SerializedName("taxaPtax")
  private BigDecimal taxaPtax = null;
  @SerializedName("taxaSpread")
  private BigDecimal taxaSpread = null;
  @SerializedName("taxaCartao")
  private BigDecimal taxaCartao = null;

  
  /**
   * Data de fechamento
   **/
  @ApiModelProperty(value = "Data de fechamento")
  public String getDataFechamento() {
    return dataFechamento;
  }
  public void setDataFechamento(String dataFechamento) {
    this.dataFechamento = dataFechamento;
  }

  
  /**
   * Taxa PTAX
   **/
  @ApiModelProperty(value = "Taxa PTAX")
  public BigDecimal getTaxaPtax() {
    return taxaPtax;
  }
  public void setTaxaPtax(BigDecimal taxaPtax) {
    this.taxaPtax = taxaPtax;
  }

  
  /**
   * Taxa de Spreead
   **/
  @ApiModelProperty(value = "Taxa de Spreead")
  public BigDecimal getTaxaSpread() {
    return taxaSpread;
  }
  public void setTaxaSpread(BigDecimal taxaSpread) {
    this.taxaSpread = taxaSpread;
  }

  
  /**
   * Taxa de convers\u00E3o de Dollar para Real
   **/
  @ApiModelProperty(value = "Taxa de convers\u00E3o de Dollar para Real")
  public BigDecimal getTaxaCartao() {
    return taxaCartao;
  }
  public void setTaxaCartao(BigDecimal taxaCartao) {
    this.taxaCartao = taxaCartao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CotacaoDolarResponse {\n");
    
    sb.append("  dataFechamento: ").append(dataFechamento).append("\n");
    sb.append("  taxaPtax: ").append(taxaPtax).append("\n");
    sb.append("  taxaSpread: ").append(taxaSpread).append("\n");
    sb.append("  taxaCartao: ").append(taxaCartao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
