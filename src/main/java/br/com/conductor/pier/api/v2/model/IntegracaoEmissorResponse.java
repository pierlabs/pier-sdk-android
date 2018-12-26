package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{integracao_emissor_response_description}}}
 **/
@ApiModel(description = "{{{integracao_emissor_response_description}}}")
public class IntegracaoEmissorResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idArquivo")
  private Long idArquivo = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("dataInclusao")
  private String dataInclusao = null;
  @SerializedName("dataAlteracao")
  private String dataAlteracao = null;

  
  /**
   * {{{integracao_emissor_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{integracao_emissor_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{integracao_emissor_response_id_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{integracao_emissor_response_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{integracao_emissor_response_id_arquivo_value}}}
   **/
  @ApiModelProperty(value = "{{{integracao_emissor_response_id_arquivo_value}}}")
  public Long getIdArquivo() {
    return idArquivo;
  }
  public void setIdArquivo(Long idArquivo) {
    this.idArquivo = idArquivo;
  }

  
  /**
   * {{{integracao_emissor_response_status_value}}}
   **/
  @ApiModelProperty(value = "{{{integracao_emissor_response_status_value}}}")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * {{{integracao_emissor_response_data_inclusao_value}}}
   **/
  @ApiModelProperty(value = "{{{integracao_emissor_response_data_inclusao_value}}}")
  public String getDataInclusao() {
    return dataInclusao;
  }
  public void setDataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
  }

  
  /**
   * {{{integracao_emissor_response_data_alteracao_value}}}
   **/
  @ApiModelProperty(value = "{{{integracao_emissor_response_data_alteracao_value}}}")
  public String getDataAlteracao() {
    return dataAlteracao;
  }
  public void setDataAlteracao(String dataAlteracao) {
    this.dataAlteracao = dataAlteracao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegracaoEmissorResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idArquivo: ").append(idArquivo).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  dataInclusao: ").append(dataInclusao).append("\n");
    sb.append("  dataAlteracao: ").append(dataAlteracao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
