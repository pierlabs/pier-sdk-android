package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Historic Payment Invoice Delay
 **/
@ApiModel(description = "Historic Payment Invoice Delay")
public class HistoricoAtrasoFaturaResponse  {
  
  @SerializedName("dataVencimento")
  private String dataVencimento = null;
  @SerializedName("diasPagamentoAposVencimento")
  private Long diasPagamentoAposVencimento = null;

  
  /**
   * Expiration date of the invoice
   **/
  @ApiModelProperty(value = "Expiration date of the invoice")
  public String getDataVencimento() {
    return dataVencimento;
  }
  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  
  /**
   * Quantity of day in delay
   **/
  @ApiModelProperty(value = "Quantity of day in delay")
  public Long getDiasPagamentoAposVencimento() {
    return diasPagamentoAposVencimento;
  }
  public void setDiasPagamentoAposVencimento(Long diasPagamentoAposVencimento) {
    this.diasPagamentoAposVencimento = diasPagamentoAposVencimento;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricoAtrasoFaturaResponse {\n");
    
    sb.append("  dataVencimento: ").append(dataVencimento).append("\n");
    sb.append("  diasPagamentoAposVencimento: ").append(diasPagamentoAposVencimento).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
