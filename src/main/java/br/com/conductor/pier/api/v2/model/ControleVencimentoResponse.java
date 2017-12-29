package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de Resposta dos Vencimentos
 **/
@ApiModel(description = "Objeto de Resposta dos Vencimentos")
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
   *  Indica a data de vencimento das faturas
   **/
  @ApiModelProperty(value = " Indica a data de vencimento das faturas")
  public String getDataVencimento() {
    return dataVencimento;
  }
  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  
  /**
   *  Indica a data prevista para a realiza\u00C3\u00A7\u00C3\u00A3o do Corte das faturas
   **/
  @ApiModelProperty(value = " Indica a data prevista para a realiza\u00C3\u00A7\u00C3\u00A3o do Corte das faturas")
  public String getDataPrevistaCorte() {
    return dataPrevistaCorte;
  }
  public void setDataPrevistaCorte(String dataPrevistaCorte) {
    this.dataPrevistaCorte = dataPrevistaCorte;
  }

  
  /**
   * Indica a data e a hora que fora realizada a realiza\u00C3\u00A7\u00C3\u00A3o do Corte das faturas
   **/
  @ApiModelProperty(value = "Indica a data e a hora que fora realizada a realiza\u00C3\u00A7\u00C3\u00A3o do Corte das faturas")
  public String getDataHoraRealizacaoCorte() {
    return dataHoraRealizacaoCorte;
  }
  public void setDataHoraRealizacaoCorte(String dataHoraRealizacaoCorte) {
    this.dataHoraRealizacaoCorte = dataHoraRealizacaoCorte;
  }

  
  /**
   * Indica a data prevista para a realiza\u00C3\u00A7\u00C3\u00A3o do faturamento
   **/
  @ApiModelProperty(value = "Indica a data prevista para a realiza\u00C3\u00A7\u00C3\u00A3o do faturamento")
  public String getDataPrevistaFaturamento() {
    return dataPrevistaFaturamento;
  }
  public void setDataPrevistaFaturamento(String dataPrevistaFaturamento) {
    this.dataPrevistaFaturamento = dataPrevistaFaturamento;
  }

  
  /**
   * Indica a data e a hora que fora realizado o faturamento
   **/
  @ApiModelProperty(value = "Indica a data e a hora que fora realizado o faturamento")
  public String getDataHoraRealizacaoFaturamento() {
    return dataHoraRealizacaoFaturamento;
  }
  public void setDataHoraRealizacaoFaturamento(String dataHoraRealizacaoFaturamento) {
    this.dataHoraRealizacaoFaturamento = dataHoraRealizacaoFaturamento;
  }

  
  /**
   * Indica o dia \u00C3\u00BAtil que ser\u00C3\u00A1 considerado como a data de vencimento
   **/
  @ApiModelProperty(value = "Indica o dia \u00C3\u00BAtil que ser\u00C3\u00A1 considerado como a data de vencimento")
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
