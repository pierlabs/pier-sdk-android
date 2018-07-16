package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{beneficio_pagamento_atraso_response_description}}}
 **/
@ApiModel(description = "{{{beneficio_pagamento_atraso_response_description}}}")
public class BeneficioPagamentoAtrasoResponse  {
  
  @SerializedName("dataBeneficio")
  private String dataBeneficio = null;

  
  /**
   * {{{beneficio_pagamento_atraso_response_data_beneficio_value}}}
   **/
  @ApiModelProperty(value = "{{{beneficio_pagamento_atraso_response_data_beneficio_value}}}")
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


