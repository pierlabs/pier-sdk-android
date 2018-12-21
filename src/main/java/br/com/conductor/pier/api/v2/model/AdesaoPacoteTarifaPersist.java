package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Persistence object for Membership Package Tariff
 **/
@ApiModel(description = "Persistence object for Membership Package Tariff")
public class AdesaoPacoteTarifaPersist  {
  
  @SerializedName("idPacoteTarifa")
  private Long idPacoteTarifa = null;
  @SerializedName("ciclo")
  private Integer ciclo = null;
  @SerializedName("dataHoraAtivacao")
  private String dataHoraAtivacao = null;
  @SerializedName("dataHoraDesativacao")
  private String dataHoraDesativacao = null;
  @SerializedName("dataFimCiclo")
  private String dataFimCiclo = null;
  @SerializedName("recargaCelularUtilizado")
  private Integer recargaCelularUtilizado = null;
  @SerializedName("bilheteUnicoUtilizado")
  private Integer bilheteUnicoUtilizado = null;
  @SerializedName("pagamentoContaUtilizado")
  private Integer pagamentoContaUtilizado = null;
  @SerializedName("saqueUtilizado")
  private Integer saqueUtilizado = null;
  @SerializedName("transferenciaUtilizado")
  private Integer transferenciaUtilizado = null;
  @SerializedName("boletoUtilizado")
  private Integer boletoUtilizado = null;
  @SerializedName("aplicacaoUtilizado")
  private Integer aplicacaoUtilizado = null;
  @SerializedName("tarifaManutencaoCobrada")
  private Boolean tarifaManutencaoCobrada = null;
  @SerializedName("cobraTarifa")
  private Boolean cobraTarifa = null;

  
  /**
   * rate pack id
   **/
  @ApiModelProperty(required = true, value = "rate pack id")
  public Long getIdPacoteTarifa() {
    return idPacoteTarifa;
  }
  public void setIdPacoteTarifa(Long idPacoteTarifa) {
    this.idPacoteTarifa = idPacoteTarifa;
  }

  
  /**
   * accession cycle
   **/
  @ApiModelProperty(value = "accession cycle")
  public Integer getCiclo() {
    return ciclo;
  }
  public void setCiclo(Integer ciclo) {
    this.ciclo = ciclo;
  }

  
  /**
   * date of activation
   **/
  @ApiModelProperty(value = "date of activation")
  public String getDataHoraAtivacao() {
    return dataHoraAtivacao;
  }
  public void setDataHoraAtivacao(String dataHoraAtivacao) {
    this.dataHoraAtivacao = dataHoraAtivacao;
  }

  
  /**
   * date of deactivation
   **/
  @ApiModelProperty(value = "date of deactivation")
  public String getDataHoraDesativacao() {
    return dataHoraDesativacao;
  }
  public void setDataHoraDesativacao(String dataHoraDesativacao) {
    this.dataHoraDesativacao = dataHoraDesativacao;
  }

  
  /**
   * end date of the cycle
   **/
  @ApiModelProperty(value = "end date of the cycle")
  public String getDataFimCiclo() {
    return dataFimCiclo;
  }
  public void setDataFimCiclo(String dataFimCiclo) {
    this.dataFimCiclo = dataFimCiclo;
  }

  
  /**
   * used cellular recharge
   **/
  @ApiModelProperty(required = true, value = "used cellular recharge")
  public Integer getRecargaCelularUtilizado() {
    return recargaCelularUtilizado;
  }
  public void setRecargaCelularUtilizado(Integer recargaCelularUtilizado) {
    this.recargaCelularUtilizado = recargaCelularUtilizado;
  }

  
  /**
   * Single Ticket Used
   **/
  @ApiModelProperty(required = true, value = "Single Ticket Used")
  public Integer getBilheteUnicoUtilizado() {
    return bilheteUnicoUtilizado;
  }
  public void setBilheteUnicoUtilizado(Integer bilheteUnicoUtilizado) {
    this.bilheteUnicoUtilizado = bilheteUnicoUtilizado;
  }

  
  /**
   * payment Used Account
   **/
  @ApiModelProperty(required = true, value = "payment Used Account")
  public Integer getPagamentoContaUtilizado() {
    return pagamentoContaUtilizado;
  }
  public void setPagamentoContaUtilizado(Integer pagamentoContaUtilizado) {
    this.pagamentoContaUtilizado = pagamentoContaUtilizado;
  }

  
  /**
   * serve used
   **/
  @ApiModelProperty(required = true, value = "serve used")
  public Integer getSaqueUtilizado() {
    return saqueUtilizado;
  }
  public void setSaqueUtilizado(Integer saqueUtilizado) {
    this.saqueUtilizado = saqueUtilizado;
  }

  
  /**
   * used transfer
   **/
  @ApiModelProperty(required = true, value = "used transfer")
  public Integer getTransferenciaUtilizado() {
    return transferenciaUtilizado;
  }
  public void setTransferenciaUtilizado(Integer transferenciaUtilizado) {
    this.transferenciaUtilizado = transferenciaUtilizado;
  }

  
  /**
   * used ticket
   **/
  @ApiModelProperty(required = true, value = "used ticket")
  public Integer getBoletoUtilizado() {
    return boletoUtilizado;
  }
  public void setBoletoUtilizado(Integer boletoUtilizado) {
    this.boletoUtilizado = boletoUtilizado;
  }

  
  /**
   * application Used
   **/
  @ApiModelProperty(required = true, value = "application Used")
  public Integer getAplicacaoUtilizado() {
    return aplicacaoUtilizado;
  }
  public void setAplicacaoUtilizado(Integer aplicacaoUtilizado) {
    this.aplicacaoUtilizado = aplicacaoUtilizado;
  }

  
  /**
   * Rate Maintenance Charged
   **/
  @ApiModelProperty(value = "Rate Maintenance Charged")
  public Boolean getTarifaManutencaoCobrada() {
    return tarifaManutencaoCobrada;
  }
  public void setTarifaManutencaoCobrada(Boolean tarifaManutencaoCobrada) {
    this.tarifaManutencaoCobrada = tarifaManutencaoCobrada;
  }

  
  /**
   * tariff charged
   **/
  @ApiModelProperty(value = "tariff charged")
  public Boolean getCobraTarifa() {
    return cobraTarifa;
  }
  public void setCobraTarifa(Boolean cobraTarifa) {
    this.cobraTarifa = cobraTarifa;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdesaoPacoteTarifaPersist {\n");
    
    sb.append("  idPacoteTarifa: ").append(idPacoteTarifa).append("\n");
    sb.append("  ciclo: ").append(ciclo).append("\n");
    sb.append("  dataHoraAtivacao: ").append(dataHoraAtivacao).append("\n");
    sb.append("  dataHoraDesativacao: ").append(dataHoraDesativacao).append("\n");
    sb.append("  dataFimCiclo: ").append(dataFimCiclo).append("\n");
    sb.append("  recargaCelularUtilizado: ").append(recargaCelularUtilizado).append("\n");
    sb.append("  bilheteUnicoUtilizado: ").append(bilheteUnicoUtilizado).append("\n");
    sb.append("  pagamentoContaUtilizado: ").append(pagamentoContaUtilizado).append("\n");
    sb.append("  saqueUtilizado: ").append(saqueUtilizado).append("\n");
    sb.append("  transferenciaUtilizado: ").append(transferenciaUtilizado).append("\n");
    sb.append("  boletoUtilizado: ").append(boletoUtilizado).append("\n");
    sb.append("  aplicacaoUtilizado: ").append(aplicacaoUtilizado).append("\n");
    sb.append("  tarifaManutencaoCobrada: ").append(tarifaManutencaoCobrada).append("\n");
    sb.append("  cobraTarifa: ").append(cobraTarifa).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
