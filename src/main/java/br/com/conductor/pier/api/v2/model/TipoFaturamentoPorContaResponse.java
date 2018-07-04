package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{tipo_faturamento_por_conta_response_description}}}
 **/
@ApiModel(description = "{{{tipo_faturamento_por_conta_response_description}}}")
public class TipoFaturamentoPorContaResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("ativo")
  private Boolean ativo = null;
  @SerializedName("idTipoFaturamento")
  private Long idTipoFaturamento = null;
  @SerializedName("dataHoraInclusao")
  private String dataHoraInclusao = null;
  @SerializedName("dataHoraCancelamento")
  private String dataHoraCancelamento = null;
  @SerializedName("modificadoPor")
  private String modificadoPor = null;

  
  /**
   * {{{tipo_faturamento_por_conta_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_faturamento_por_conta_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{tipo_faturamento_por_conta_response_id_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_faturamento_por_conta_response_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{tipo_faturamento_por_conta_response_status_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_faturamento_por_conta_response_status_value}}}")
  public Boolean getAtivo() {
    return ativo;
  }
  public void setAtivo(Boolean ativo) {
    this.ativo = ativo;
  }

  
  /**
   * {{{tipo_faturamento_por_conta_response_id_tipo_faturamento_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_faturamento_por_conta_response_id_tipo_faturamento_value}}}")
  public Long getIdTipoFaturamento() {
    return idTipoFaturamento;
  }
  public void setIdTipoFaturamento(Long idTipoFaturamento) {
    this.idTipoFaturamento = idTipoFaturamento;
  }

  
  /**
   * {{{tipo_faturamento_por_conta_response_data_hora_inclusao_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_faturamento_por_conta_response_data_hora_inclusao_value}}}")
  public String getDataHoraInclusao() {
    return dataHoraInclusao;
  }
  public void setDataHoraInclusao(String dataHoraInclusao) {
    this.dataHoraInclusao = dataHoraInclusao;
  }

  
  /**
   * {{{tipo_faturamento_por_conta_response_data_hora_cancelamento_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_faturamento_por_conta_response_data_hora_cancelamento_value}}}")
  public String getDataHoraCancelamento() {
    return dataHoraCancelamento;
  }
  public void setDataHoraCancelamento(String dataHoraCancelamento) {
    this.dataHoraCancelamento = dataHoraCancelamento;
  }

  
  /**
   * {{{tipo_faturamento_por_conta_response_modificado_por_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_faturamento_por_conta_response_modificado_por_value}}}")
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
    sb.append("  ativo: ").append(ativo).append("\n");
    sb.append("  idTipoFaturamento: ").append(idTipoFaturamento).append("\n");
    sb.append("  dataHoraInclusao: ").append(dataHoraInclusao).append("\n");
    sb.append("  dataHoraCancelamento: ").append(dataHoraCancelamento).append("\n");
    sb.append("  modificadoPor: ").append(modificadoPor).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


