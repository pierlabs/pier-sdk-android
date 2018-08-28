package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{historico_atraso_fatura_response_description}}}
 **/
@ApiModel(description = "{{{historico_atraso_fatura_response_description}}}")
public class HistoricoAtrasoFaturaResponse  {
  
  @SerializedName("dataVencimento")
  private String dataVencimento = null;
  @SerializedName("diasPagamentoAposVencimento")
  private Long diasPagamentoAposVencimento = null;

  
  /**
   * {{{historico_atraso_fatura_response_data_vencimento_value}}}
   **/
  @ApiModelProperty(value = "{{{historico_atraso_fatura_response_data_vencimento_value}}}")
  public String getDataVencimento() {
    return dataVencimento;
  }
  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  
  /**
   * {{{historico_atraso_fatura_response_dias_pagamento_apos_vencimento_value}}}
   **/
  @ApiModelProperty(value = "{{{historico_atraso_fatura_response_dias_pagamento_apos_vencimento_value}}}")
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
