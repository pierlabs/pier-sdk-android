package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class BeneficioPagamentoAtrasoResponse  {
  
  @SerializedName("dataBeneficio")
  private String dataBeneficio = null;

  
  /**
   * Data m\u00E1xima para pagamento da fatura em atraso para receber o benef\u00EDcio de isen\u00E7\u00E3o total no pagamento de multa, encargos, mora e IOF.
   **/
  @ApiModelProperty(value = "Data m\u00E1xima para pagamento da fatura em atraso para receber o benef\u00EDcio de isen\u00E7\u00E3o total no pagamento de multa, encargos, mora e IOF.")
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
