package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{controle_vencimento_response_description}}}
 **/
@ApiModel(description = "{{{controle_vencimento_response_description}}}")
public class ControleVencimentoResponse  {
  
  @SerializedName("dataVencimento")
  private String dataVencimento = null;
  @SerializedName("dataPrevistaCorte")
  private String dataPrevistaCorte = null;
  @SerializedName("dataHoraRealizacaoCorte")
  private String dataHoraRealizacaoCorte = null;
  @SerializedName("dataPrevistaFaturamento")
  private String dataPrevistaFaturamento = null;
  @SerializedName("dataHoraRealizacaoFaturamento")
  private String dataHoraRealizacaoFaturamento = null;
  @SerializedName("dataRealVencimento")
  private String dataRealVencimento = null;

  
  /**
   * {{{controle_vencimento_response_data_vencimento_value}}}
   **/
  @ApiModelProperty(value = "{{{controle_vencimento_response_data_vencimento_value}}}")
  public String getDataVencimento() {
    return dataVencimento;
  }
  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  
  /**
   * {{{controle_vencimento_response_data_prevista_corte_value}}}
   **/
  @ApiModelProperty(value = "{{{controle_vencimento_response_data_prevista_corte_value}}}")
  public String getDataPrevistaCorte() {
    return dataPrevistaCorte;
  }
  public void setDataPrevistaCorte(String dataPrevistaCorte) {
    this.dataPrevistaCorte = dataPrevistaCorte;
  }

  
  /**
   * {{{controle_vencimento_response_data_hora_realizacao_corte_value}}}
   **/
  @ApiModelProperty(value = "{{{controle_vencimento_response_data_hora_realizacao_corte_value}}}")
  public String getDataHoraRealizacaoCorte() {
    return dataHoraRealizacaoCorte;
  }
  public void setDataHoraRealizacaoCorte(String dataHoraRealizacaoCorte) {
    this.dataHoraRealizacaoCorte = dataHoraRealizacaoCorte;
  }

  
  /**
   * {{{controle_vencimento_response_data_prevista_faturamento_value}}}
   **/
  @ApiModelProperty(value = "{{{controle_vencimento_response_data_prevista_faturamento_value}}}")
  public String getDataPrevistaFaturamento() {
    return dataPrevistaFaturamento;
  }
  public void setDataPrevistaFaturamento(String dataPrevistaFaturamento) {
    this.dataPrevistaFaturamento = dataPrevistaFaturamento;
  }

  
  /**
   * {{{controle_vencimento_response_data_hora_realizacao_faturamento_value}}}
   **/
  @ApiModelProperty(value = "{{{controle_vencimento_response_data_hora_realizacao_faturamento_value}}}")
  public String getDataHoraRealizacaoFaturamento() {
    return dataHoraRealizacaoFaturamento;
  }
  public void setDataHoraRealizacaoFaturamento(String dataHoraRealizacaoFaturamento) {
    this.dataHoraRealizacaoFaturamento = dataHoraRealizacaoFaturamento;
  }

  
  /**
   * {{{controle_vencimento_response_data_real_vencimento_value}}}
   **/
  @ApiModelProperty(value = "{{{controle_vencimento_response_data_real_vencimento_value}}}")
  public String getDataRealVencimento() {
    return dataRealVencimento;
  }
  public void setDataRealVencimento(String dataRealVencimento) {
    this.dataRealVencimento = dataRealVencimento;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControleVencimentoResponse {\n");
    
    sb.append("  dataVencimento: ").append(dataVencimento).append("\n");
    sb.append("  dataPrevistaCorte: ").append(dataPrevistaCorte).append("\n");
    sb.append("  dataHoraRealizacaoCorte: ").append(dataHoraRealizacaoCorte).append("\n");
    sb.append("  dataPrevistaFaturamento: ").append(dataPrevistaFaturamento).append("\n");
    sb.append("  dataHoraRealizacaoFaturamento: ").append(dataHoraRealizacaoFaturamento).append("\n");
    sb.append("  dataRealVencimento: ").append(dataRealVencimento).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
