package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.PacoteTarifaResponse;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representation of the Accession Fee Package Tariff
 **/
@ApiModel(description = "Representation of the Accession Fee Package Tariff")
public class AdesaoPacoteTarifaResponse  {
  
  @SerializedName("aplicacaoUtilizado")
  private Integer aplicacaoUtilizado = null;
  @SerializedName("bilheteUnicoUtilizado")
  private Integer bilheteUnicoUtilizado = null;
  @SerializedName("boletoUtilizado")
  private Integer boletoUtilizado = null;
  @SerializedName("ciclo")
  private Integer ciclo = null;
  @SerializedName("cobraTarifa")
  private Boolean cobraTarifa = null;
  @SerializedName("dataFimCiclo")
  private String dataFimCiclo = null;
  @SerializedName("dataHoraAtivacao")
  private String dataHoraAtivacao = null;
  @SerializedName("dataHoraDesativacao")
  private String dataHoraDesativacao = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("pacoteTarifa")
  private PacoteTarifaResponse pacoteTarifa = null;
  @SerializedName("pagamentoContaUtilizado")
  private Integer pagamentoContaUtilizado = null;
  @SerializedName("recargaCelularUtilizado")
  private Integer recargaCelularUtilizado = null;
  @SerializedName("saqueUtilizado")
  private Integer saqueUtilizado = null;
  @SerializedName("tarifaManutencaoCobrada")
  private Boolean tarifaManutencaoCobrada = null;
  @SerializedName("transferenciaUtilizado")
  private Integer transferenciaUtilizado = null;

  
  /**
   * application used
   **/
  @ApiModelProperty(value = "application used")
  public Integer getAplicacaoUtilizado() {
    return aplicacaoUtilizado;
  }
  public void setAplicacaoUtilizado(Integer aplicacaoUtilizado) {
    this.aplicacaoUtilizado = aplicacaoUtilizado;
  }

  
  /**
   * single ticket used
   **/
  @ApiModelProperty(value = "single ticket used")
  public Integer getBilheteUnicoUtilizado() {
    return bilheteUnicoUtilizado;
  }
  public void setBilheteUnicoUtilizado(Integer bilheteUnicoUtilizado) {
    this.bilheteUnicoUtilizado = bilheteUnicoUtilizado;
  }

  
  /**
   * ticket used
   **/
  @ApiModelProperty(value = "ticket used")
  public Integer getBoletoUtilizado() {
    return boletoUtilizado;
  }
  public void setBoletoUtilizado(Integer boletoUtilizado) {
    this.boletoUtilizado = boletoUtilizado;
  }

  
  /**
   * adhesion cycle
   **/
  @ApiModelProperty(value = "adhesion cycle")
  public Integer getCiclo() {
    return ciclo;
  }
  public void setCiclo(Integer ciclo) {
    this.ciclo = ciclo;
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
   * Adhesion id
   **/
  @ApiModelProperty(value = "Adhesion id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * account id
   **/
  @ApiModelProperty(value = "account id")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Rate package
   **/
  @ApiModelProperty(value = "Rate package")
  public PacoteTarifaResponse getPacoteTarifa() {
    return pacoteTarifa;
  }
  public void setPacoteTarifa(PacoteTarifaResponse pacoteTarifa) {
    this.pacoteTarifa = pacoteTarifa;
  }

  
  /**
   * payment for the account used
   **/
  @ApiModelProperty(value = "payment for the account used")
  public Integer getPagamentoContaUtilizado() {
    return pagamentoContaUtilizado;
  }
  public void setPagamentoContaUtilizado(Integer pagamentoContaUtilizado) {
    this.pagamentoContaUtilizado = pagamentoContaUtilizado;
  }

  
  /**
   * used cellular recharge
   **/
  @ApiModelProperty(value = "used cellular recharge")
  public Integer getRecargaCelularUtilizado() {
    return recargaCelularUtilizado;
  }
  public void setRecargaCelularUtilizado(Integer recargaCelularUtilizado) {
    this.recargaCelularUtilizado = recargaCelularUtilizado;
  }

  
  /**
   * used service
   **/
  @ApiModelProperty(value = "used service")
  public Integer getSaqueUtilizado() {
    return saqueUtilizado;
  }
  public void setSaqueUtilizado(Integer saqueUtilizado) {
    this.saqueUtilizado = saqueUtilizado;
  }

  
  /**
   * maintenance charge charged
   **/
  @ApiModelProperty(value = "maintenance charge charged")
  public Boolean getTarifaManutencaoCobrada() {
    return tarifaManutencaoCobrada;
  }
  public void setTarifaManutencaoCobrada(Boolean tarifaManutencaoCobrada) {
    this.tarifaManutencaoCobrada = tarifaManutencaoCobrada;
  }

  
  /**
   * used transfer
   **/
  @ApiModelProperty(value = "used transfer")
  public Integer getTransferenciaUtilizado() {
    return transferenciaUtilizado;
  }
  public void setTransferenciaUtilizado(Integer transferenciaUtilizado) {
    this.transferenciaUtilizado = transferenciaUtilizado;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdesaoPacoteTarifaResponse {\n");
    
    sb.append("  aplicacaoUtilizado: ").append(aplicacaoUtilizado).append("\n");
    sb.append("  bilheteUnicoUtilizado: ").append(bilheteUnicoUtilizado).append("\n");
    sb.append("  boletoUtilizado: ").append(boletoUtilizado).append("\n");
    sb.append("  ciclo: ").append(ciclo).append("\n");
    sb.append("  cobraTarifa: ").append(cobraTarifa).append("\n");
    sb.append("  dataFimCiclo: ").append(dataFimCiclo).append("\n");
    sb.append("  dataHoraAtivacao: ").append(dataHoraAtivacao).append("\n");
    sb.append("  dataHoraDesativacao: ").append(dataHoraDesativacao).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  pacoteTarifa: ").append(pacoteTarifa).append("\n");
    sb.append("  pagamentoContaUtilizado: ").append(pagamentoContaUtilizado).append("\n");
    sb.append("  recargaCelularUtilizado: ").append(recargaCelularUtilizado).append("\n");
    sb.append("  saqueUtilizado: ").append(saqueUtilizado).append("\n");
    sb.append("  tarifaManutencaoCobrada: ").append(tarifaManutencaoCobrada).append("\n");
    sb.append("  transferenciaUtilizado: ").append(transferenciaUtilizado).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
