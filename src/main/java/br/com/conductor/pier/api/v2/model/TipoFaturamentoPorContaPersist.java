package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * TipoFaturamentoPorContaPersist
 **/
@ApiModel(description = "TipoFaturamentoPorContaPersist")
public class TipoFaturamentoPorContaPersist  {
  
  @SerializedName("status")
  private Boolean status = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idTipoFaturamento")
  private Long idTipoFaturamento = null;
  @SerializedName("dataHoraInclusao")
  private String dataHoraInclusao = null;
  @SerializedName("dataHoraCancelamento")
  private String dataHoraCancelamento = null;
  @SerializedName("modificadoPor")
  private String modificadoPor = null;

  
  /**
   * Representa se a configura\u00E7\u00E3o est\u00E1 ativada ou desativada para a conta.
   **/
  @ApiModelProperty(required = true, value = "Representa se a configura\u00E7\u00E3o est\u00E1 ativada ou desativada para a conta.")
  public Boolean getStatus() {
    return status;
  }
  public void setStatus(Boolean status) {
    this.status = status;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da conta relacionada.
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo de identifica\u00E7\u00E3o da conta relacionada.")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do tipo de faturamento relacionada.
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo de identifica\u00E7\u00E3o do tipo de faturamento relacionada.")
  public Long getIdTipoFaturamento() {
    return idTipoFaturamento;
  }
  public void setIdTipoFaturamento(Long idTipoFaturamento) {
    this.idTipoFaturamento = idTipoFaturamento;
  }

  
  /**
   * Data da inclus\u00E3o da configura\u00E7\u00E3o, deve ser informada no formato yyyy-MM-dd'T'HH:mm:ss.SSS'Z'.
   **/
  @ApiModelProperty(value = "Data da inclus\u00E3o da configura\u00E7\u00E3o, deve ser informada no formato yyyy-MM-dd'T'HH:mm:ss.SSS'Z'.")
  public String getDataHoraInclusao() {
    return dataHoraInclusao;
  }
  public void setDataHoraInclusao(String dataHoraInclusao) {
    this.dataHoraInclusao = dataHoraInclusao;
  }

  
  /**
   * Data do cancelamento da configura\u00E7\u00E3o, deve ser informada no formato yyyy-MM-dd'T'HH:mm:ss.SSS'Z'.
   **/
  @ApiModelProperty(value = "Data do cancelamento da configura\u00E7\u00E3o, deve ser informada no formato yyyy-MM-dd'T'HH:mm:ss.SSS'Z'.")
  public String getDataHoraCancelamento() {
    return dataHoraCancelamento;
  }
  public void setDataHoraCancelamento(String dataHoraCancelamento) {
    this.dataHoraCancelamento = dataHoraCancelamento;
  }

  
  /**
   * Identificador do respons\u00E1vel pela modifica\u00E7\u00E3o do registro.
   **/
  @ApiModelProperty(required = true, value = "Identificador do respons\u00E1vel pela modifica\u00E7\u00E3o do registro.")
  public String getModificadoPor() {
    return modificadoPor;
  }
  public void setModificadoPor(String modificadoPor) {
    this.modificadoPor = modificadoPor;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoFaturamentoPorContaPersist {\n");
    
    sb.append("  status: ").append(status).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idTipoFaturamento: ").append(idTipoFaturamento).append("\n");
    sb.append("  dataHoraInclusao: ").append(dataHoraInclusao).append("\n");
    sb.append("  dataHoraCancelamento: ").append(dataHoraCancelamento).append("\n");
    sb.append("  modificadoPor: ").append(modificadoPor).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
