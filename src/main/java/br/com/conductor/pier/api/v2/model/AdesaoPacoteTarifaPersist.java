package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de persit\u00EAncia para Ades\u00E3o Pacote Tarifa
 **/
@ApiModel(description = "Objeto de persit\u00EAncia para Ades\u00E3o Pacote Tarifa")
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
   * Id do pacote de tarifa
   **/
  @ApiModelProperty(required = true, value = "Id do pacote de tarifa")
  public Long getIdPacoteTarifa() {
    return idPacoteTarifa;
  }
  public void setIdPacoteTarifa(Long idPacoteTarifa) {
    this.idPacoteTarifa = idPacoteTarifa;
  }

  
  /**
   * Ciclo mensal de cobran\u00E7a
   **/
  @ApiModelProperty(value = "Ciclo mensal de cobran\u00E7a")
  public Integer getCiclo() {
    return ciclo;
  }
  public void setCiclo(Integer ciclo) {
    this.ciclo = ciclo;
  }

  
  /**
   * Data da ativa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Data da ativa\u00E7\u00E3o")
  public String getDataHoraAtivacao() {
    return dataHoraAtivacao;
  }
  public void setDataHoraAtivacao(String dataHoraAtivacao) {
    this.dataHoraAtivacao = dataHoraAtivacao;
  }

  
  /**
   * Data da desativa\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Data da desativa\u00E7\u00E3o")
  public String getDataHoraDesativacao() {
    return dataHoraDesativacao;
  }
  public void setDataHoraDesativacao(String dataHoraDesativacao) {
    this.dataHoraDesativacao = dataHoraDesativacao;
  }

  
  /**
   * Data fim do ciclo
   **/
  @ApiModelProperty(value = "Data fim do ciclo")
  public String getDataFimCiclo() {
    return dataFimCiclo;
  }
  public void setDataFimCiclo(String dataFimCiclo) {
    this.dataFimCiclo = dataFimCiclo;
  }

  
  /**
   * Recarga de celular utilizado
   **/
  @ApiModelProperty(required = true, value = "Recarga de celular utilizado")
  public Integer getRecargaCelularUtilizado() {
    return recargaCelularUtilizado;
  }
  public void setRecargaCelularUtilizado(Integer recargaCelularUtilizado) {
    this.recargaCelularUtilizado = recargaCelularUtilizado;
  }

  
  /**
   * Bilhete \u00FAnico Utilizado
   **/
  @ApiModelProperty(required = true, value = "Bilhete \u00FAnico Utilizado")
  public Integer getBilheteUnicoUtilizado() {
    return bilheteUnicoUtilizado;
  }
  public void setBilheteUnicoUtilizado(Integer bilheteUnicoUtilizado) {
    this.bilheteUnicoUtilizado = bilheteUnicoUtilizado;
  }

  
  /**
   * Pagamento Conta Utilizado
   **/
  @ApiModelProperty(required = true, value = "Pagamento Conta Utilizado")
  public Integer getPagamentoContaUtilizado() {
    return pagamentoContaUtilizado;
  }
  public void setPagamentoContaUtilizado(Integer pagamentoContaUtilizado) {
    this.pagamentoContaUtilizado = pagamentoContaUtilizado;
  }

  
  /**
   * Saque utilizado
   **/
  @ApiModelProperty(required = true, value = "Saque utilizado")
  public Integer getSaqueUtilizado() {
    return saqueUtilizado;
  }
  public void setSaqueUtilizado(Integer saqueUtilizado) {
    this.saqueUtilizado = saqueUtilizado;
  }

  
  /**
   * Transfer\u00EAncia utilizado
   **/
  @ApiModelProperty(required = true, value = "Transfer\u00EAncia utilizado")
  public Integer getTransferenciaUtilizado() {
    return transferenciaUtilizado;
  }
  public void setTransferenciaUtilizado(Integer transferenciaUtilizado) {
    this.transferenciaUtilizado = transferenciaUtilizado;
  }

  
  /**
   * Boleto utilizado
   **/
  @ApiModelProperty(required = true, value = "Boleto utilizado")
  public Integer getBoletoUtilizado() {
    return boletoUtilizado;
  }
  public void setBoletoUtilizado(Integer boletoUtilizado) {
    this.boletoUtilizado = boletoUtilizado;
  }

  
  /**
   * Aplica\u00E7\u00E3o utilizado
   **/
  @ApiModelProperty(required = true, value = "Aplica\u00E7\u00E3o utilizado")
  public Integer getAplicacaoUtilizado() {
    return aplicacaoUtilizado;
  }
  public void setAplicacaoUtilizado(Integer aplicacaoUtilizado) {
    this.aplicacaoUtilizado = aplicacaoUtilizado;
  }

  
  /**
   * Tarifa de manuten\u00E7\u00E3o cobrada
   **/
  @ApiModelProperty(value = "Tarifa de manuten\u00E7\u00E3o cobrada")
  public Boolean getTarifaManutencaoCobrada() {
    return tarifaManutencaoCobrada;
  }
  public void setTarifaManutencaoCobrada(Boolean tarifaManutencaoCobrada) {
    this.tarifaManutencaoCobrada = tarifaManutencaoCobrada;
  }

  
  /**
   * Cobra tarifa
   **/
  @ApiModelProperty(value = "Cobra tarifa")
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
