package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Hist\u00F3rico Pagamento Fatura Atraso
 **/
@ApiModel(description = "Hist\u00F3rico Pagamento Fatura Atraso")
public class HistoricoAtrasoFaturaResponse  {
  
  @SerializedName("dataVencimento")
  private String dataVencimento = null;
  @SerializedName("diasPagamentoAposVencimento")
  private Long diasPagamentoAposVencimento = null;

  
  /**
   * Data vencimento fatura
   **/
  @ApiModelProperty(value = "Data vencimento fatura")
  public String getDataVencimento() {
    return dataVencimento;
  }
  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  
  /**
   * Quantidade de dias em atraso
   **/
  @ApiModelProperty(value = "Quantidade de dias em atraso")
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
