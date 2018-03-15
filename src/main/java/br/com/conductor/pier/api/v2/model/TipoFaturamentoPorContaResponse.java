package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto Faturamento
 **/
@ApiModel(description = "Objeto Faturamento")
public class TipoFaturamentoPorContaResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("status")
  private Boolean status = null;
  @SerializedName("idTipoFaturamento")
  private Long idTipoFaturamento = null;
  @SerializedName("dataHoraInclusao")
  private String dataHoraInclusao = null;
  @SerializedName("dataHoraCancelamento")
  private String dataHoraCancelamento = null;
  @SerializedName("modificadoPor")
  private String modificadoPor = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do tipo de faturamento por conta (id).
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do tipo de faturamento por conta (id).")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da conta relacionada ao tipo de faturamento.
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da conta relacionada ao tipo de faturamento.")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Status da configura\u00E7\u00E3o que representa que se o tipo de faturamento por conta est\u00E1 ativo ou cancelado.
   **/
  @ApiModelProperty(value = "Status da configura\u00E7\u00E3o que representa que se o tipo de faturamento por conta est\u00E1 ativo ou cancelado.")
  public Boolean getStatus() {
    return status;
  }
  public void setStatus(Boolean status) {
    this.status = status;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da tipo de faturamento referenciado.
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da tipo de faturamento referenciado.")
  public Long getIdTipoFaturamento() {
    return idTipoFaturamento;
  }
  public void setIdTipoFaturamento(Long idTipoFaturamento) {
    this.idTipoFaturamento = idTipoFaturamento;
  }

  
  /**
   * Data de inclus\u00E3o da configura\u00E7\u00E3o de tipo de faturamento por conta.
   **/
  @ApiModelProperty(value = "Data de inclus\u00E3o da configura\u00E7\u00E3o de tipo de faturamento por conta.")
  public String getDataHoraInclusao() {
    return dataHoraInclusao;
  }
  public void setDataHoraInclusao(String dataHoraInclusao) {
    this.dataHoraInclusao = dataHoraInclusao;
  }

  
  /**
   * Data de cancelamento da configura\u00E7\u00E3o de tipo de faturamento por conta.
   **/
  @ApiModelProperty(value = "Data de cancelamento da configura\u00E7\u00E3o de tipo de faturamento por conta.")
  public String getDataHoraCancelamento() {
    return dataHoraCancelamento;
  }
  public void setDataHoraCancelamento(String dataHoraCancelamento) {
    this.dataHoraCancelamento = dataHoraCancelamento;
  }

  
  /**
   * Descri\u00E7\u00E3o do respons\u00E1vel pela \u00FAltima modifica\u00E7\u00E3o da configura\u00E7\u00E3o.
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do respons\u00E1vel pela \u00FAltima modifica\u00E7\u00E3o da configura\u00E7\u00E3o.")
  public String getModificadoPor() {
    return modificadoPor;
  }
  public void setModificadoPor(String modificadoPor) {
    this.modificadoPor = modificadoPor;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoFaturamentoPorContaResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  idTipoFaturamento: ").append(idTipoFaturamento).append("\n");
    sb.append("  dataHoraInclusao: ").append(dataHoraInclusao).append("\n");
    sb.append("  dataHoraCancelamento: ").append(dataHoraCancelamento).append("\n");
    sb.append("  modificadoPor: ").append(modificadoPor).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
