package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object of the response of the Expirations
 **/
@ApiModel(description = "Object of the response of the Expirations")
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
   * Indicate the date of expiration of the invoices
   **/
  @ApiModelProperty(value = "Indicate the date of expiration of the invoices")
  public String getDataVencimento() {
    return dataVencimento;
  }
  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  
  /**
   * Indicate the date previewed to make the cut of the invoices
   **/
  @ApiModelProperty(value = "Indicate the date previewed to make the cut of the invoices")
  public String getDataPrevistaCorte() {
    return dataPrevistaCorte;
  }
  public void setDataPrevistaCorte(String dataPrevistaCorte) {
    this.dataPrevistaCorte = dataPrevistaCorte;
  }

  
  /**
   * Indicate the date and the time that was made the Cut of the invoices
   **/
  @ApiModelProperty(value = "Indicate the date and the time that was made the Cut of the invoices")
  public String getDataHoraRealizacaoCorte() {
    return dataHoraRealizacaoCorte;
  }
  public void setDataHoraRealizacaoCorte(String dataHoraRealizacaoCorte) {
    this.dataHoraRealizacaoCorte = dataHoraRealizacaoCorte;
  }

  
  /**
   * Indicate the date previewed to make the billing
   **/
  @ApiModelProperty(value = "Indicate the date previewed to make the billing")
  public String getDataPrevistaFaturamento() {
    return dataPrevistaFaturamento;
  }
  public void setDataPrevistaFaturamento(String dataPrevistaFaturamento) {
    this.dataPrevistaFaturamento = dataPrevistaFaturamento;
  }

  
  /**
   * Indicate the date and the time that was made the billing
   **/
  @ApiModelProperty(value = "Indicate the date and the time that was made the billing")
  public String getDataHoraRealizacaoFaturamento() {
    return dataHoraRealizacaoFaturamento;
  }
  public void setDataHoraRealizacaoFaturamento(String dataHoraRealizacaoFaturamento) {
    this.dataHoraRealizacaoFaturamento = dataHoraRealizacaoFaturamento;
  }

  
  /**
   * Indicate the useful day that will be considered as the expiration date
   **/
  @ApiModelProperty(value = "Indicate the useful day that will be considered as the expiration date")
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
