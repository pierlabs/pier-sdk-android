package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{servico_conta_response_description}}}
 **/
@ApiModel(description = "{{{servico_conta_response_description}}}")
public class ServicoContaResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idTipoServico")
  private Long idTipoServico = null;
  @SerializedName("dataAtivacao")
  private String dataAtivacao = null;
  @SerializedName("idUsuarioAtivacao")
  private Long idUsuarioAtivacao = null;
  @SerializedName("idPlataformaAtivacao")
  private Long idPlataformaAtivacao = null;
  @SerializedName("dataCancelamento")
  private String dataCancelamento = null;
  @SerializedName("idUsuarioCancelamento")
  private Long idUsuarioCancelamento = null;
  @SerializedName("idPlataformaCancelamento")
  private Long idPlataformaCancelamento = null;

  
  /**
   * {{{servico_conta_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{servico_conta_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{servico_conta_response_id_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{servico_conta_response_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{servico_conta_response_id_tipo_servico_value}}}
   **/
  @ApiModelProperty(value = "{{{servico_conta_response_id_tipo_servico_value}}}")
  public Long getIdTipoServico() {
    return idTipoServico;
  }
  public void setIdTipoServico(Long idTipoServico) {
    this.idTipoServico = idTipoServico;
  }

  
  /**
   * {{{servico_conta_response_data_ativacao_value}}}
   **/
  @ApiModelProperty(value = "{{{servico_conta_response_data_ativacao_value}}}")
  public String getDataAtivacao() {
    return dataAtivacao;
  }
  public void setDataAtivacao(String dataAtivacao) {
    this.dataAtivacao = dataAtivacao;
  }

  
  /**
   * {{{servico_conta_response_id_usuario_ativou_value}}}
   **/
  @ApiModelProperty(value = "{{{servico_conta_response_id_usuario_ativou_value}}}")
  public Long getIdUsuarioAtivacao() {
    return idUsuarioAtivacao;
  }
  public void setIdUsuarioAtivacao(Long idUsuarioAtivacao) {
    this.idUsuarioAtivacao = idUsuarioAtivacao;
  }

  
  /**
   * {{{servico_conta_response_id_plataforma_ativou_value}}}
   **/
  @ApiModelProperty(value = "{{{servico_conta_response_id_plataforma_ativou_value}}}")
  public Long getIdPlataformaAtivacao() {
    return idPlataformaAtivacao;
  }
  public void setIdPlataformaAtivacao(Long idPlataformaAtivacao) {
    this.idPlataformaAtivacao = idPlataformaAtivacao;
  }

  
  /**
   * {{{servico_conta_response_data_cancelou_value}}}
   **/
  @ApiModelProperty(value = "{{{servico_conta_response_data_cancelou_value}}}")
  public String getDataCancelamento() {
    return dataCancelamento;
  }
  public void setDataCancelamento(String dataCancelamento) {
    this.dataCancelamento = dataCancelamento;
  }

  
  /**
   * {{{servico_conta_response_id_usuario_cancelou_value}}}
   **/
  @ApiModelProperty(value = "{{{servico_conta_response_id_usuario_cancelou_value}}}")
  public Long getIdUsuarioCancelamento() {
    return idUsuarioCancelamento;
  }
  public void setIdUsuarioCancelamento(Long idUsuarioCancelamento) {
    this.idUsuarioCancelamento = idUsuarioCancelamento;
  }

  
  /**
   * {{{servico_conta_response_id_plataforma_cancelou_value}}}
   **/
  @ApiModelProperty(value = "{{{servico_conta_response_id_plataforma_cancelou_value}}}")
  public Long getIdPlataformaCancelamento() {
    return idPlataformaCancelamento;
  }
  public void setIdPlataformaCancelamento(Long idPlataformaCancelamento) {
    this.idPlataformaCancelamento = idPlataformaCancelamento;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServicoContaResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idTipoServico: ").append(idTipoServico).append("\n");
    sb.append("  dataAtivacao: ").append(dataAtivacao).append("\n");
    sb.append("  idUsuarioAtivacao: ").append(idUsuarioAtivacao).append("\n");
    sb.append("  idPlataformaAtivacao: ").append(idPlataformaAtivacao).append("\n");
    sb.append("  dataCancelamento: ").append(dataCancelamento).append("\n");
    sb.append("  idUsuarioCancelamento: ").append(idUsuarioCancelamento).append("\n");
    sb.append("  idPlataformaCancelamento: ").append(idPlataformaCancelamento).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
