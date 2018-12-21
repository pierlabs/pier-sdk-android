package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representation Object Response for Payment Benefit
 **/
@ApiModel(description = "Representation Object Response for Payment Benefit")
public class BeneficioPagamentoAtrasoResponse  {
  
  @SerializedName("dataBeneficio")
  private String dataBeneficio = null;

  
  /**
   * Deadline ofr payment of the invoice dealy to recieve benefit of total exemption in the penalty payment, encharge, extra interest and IOF
   **/
  @ApiModelProperty(value = "Deadline ofr payment of the invoice dealy to recieve benefit of total exemption in the penalty payment, encharge, extra interest and IOF")
  public String getDataBeneficio() {
    return dataBeneficio;
  }
  public void setDataBeneficio(String dataBeneficio) {
    this.dataBeneficio = dataBeneficio;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeneficioPagamentoAtrasoResponse {\n");
    
    sb.append("  dataBeneficio: ").append(dataBeneficio).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
