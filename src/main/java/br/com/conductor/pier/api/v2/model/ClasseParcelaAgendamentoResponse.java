package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * ParcelaAgendamentoResponse
 **/
@ApiModel(description = "ParcelaAgendamentoResponse")
public class ClasseParcelaAgendamentoResponse  {
  
  @SerializedName("idParcela")
  private Long idParcela = null;
  @SerializedName("idAgendamento")
  private Integer idAgendamento = null;
  @SerializedName("dataAgendada")
  private String dataAgendada = null;
  @SerializedName("dataEfetivacao")
  private String dataEfetivacao = null;
  @SerializedName("status")
  private Integer status = null;
  @SerializedName("observacao")
  private String observacao = null;

  
  /**
   * ID da Parcela agendada
   **/
  @ApiModelProperty(value = "ID da Parcela agendada")
  public Long getIdParcela() {
    return idParcela;
  }
  public void setIdParcela(Long idParcela) {
    this.idParcela = idParcela;
  }

  
  /**
   * ID do Agendamento que a parcela pertence
   **/
  @ApiModelProperty(value = "ID do Agendamento que a parcela pertence")
  public Integer getIdAgendamento() {
    return idAgendamento;
  }
  public void setIdAgendamento(Integer idAgendamento) {
    this.idAgendamento = idAgendamento;
  }

  
  /**
   * Data que ser\u00E1 realizada a recarga
   **/
  @ApiModelProperty(value = "Data que ser\u00E1 realizada a recarga")
  public String getDataAgendada() {
    return dataAgendada;
  }
  public void setDataAgendada(String dataAgendada) {
    this.dataAgendada = dataAgendada;
  }

  
  /**
   * Data que foi realizada a recarga
   **/
  @ApiModelProperty(value = "Data que foi realizada a recarga")
  public String getDataEfetivacao() {
    return dataEfetivacao;
  }
  public void setDataEfetivacao(String dataEfetivacao) {
    this.dataEfetivacao = dataEfetivacao;
  }

  
  /**
   * Status da parcela 
   **/
  @ApiModelProperty(value = "Status da parcela ")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * Observacoes caso ocorra alteracao do status
   **/
  @ApiModelProperty(value = "Observacoes caso ocorra alteracao do status")
  public String getObservacao() {
    return observacao;
  }
  public void setObservacao(String observacao) {
    this.observacao = observacao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClasseParcelaAgendamentoResponse {\n");
    
    sb.append("  idParcela: ").append(idParcela).append("\n");
    sb.append("  idAgendamento: ").append(idAgendamento).append("\n");
    sb.append("  dataAgendada: ").append(dataAgendada).append("\n");
    sb.append("  dataEfetivacao: ").append(dataEfetivacao).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  observacao: ").append(observacao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
