package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o da resposta da proposta
 **/
@ApiModel(description = "Representa\u00E7\u00E3o da resposta da proposta")
public class PropostaResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("status")
  private Integer status = null;
  @SerializedName("dataCadastramento")
  private String dataCadastramento = null;
  @SerializedName("dataAprovacaoNegacaoPendencia")
  private String dataAprovacaoNegacaoPendencia = null;

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o da Proposta (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o da Proposta (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Status da proposta
   **/
  @ApiModelProperty(value = "Status da proposta")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * Data de cadastramento da proposta
   **/
  @ApiModelProperty(value = "Data de cadastramento da proposta")
  public String getDataCadastramento() {
    return dataCadastramento;
  }
  public void setDataCadastramento(String dataCadastramento) {
    this.dataCadastramento = dataCadastramento;
  }

  
  /**
   * Data de atualizaca\u00E7\uFFFD da proposta
   **/
  @ApiModelProperty(value = "Data de atualizaca\u00E7\uFFFD da proposta")
  public String getDataAprovacaoNegacaoPendencia() {
    return dataAprovacaoNegacaoPendencia;
  }
  public void setDataAprovacaoNegacaoPendencia(String dataAprovacaoNegacaoPendencia) {
    this.dataAprovacaoNegacaoPendencia = dataAprovacaoNegacaoPendencia;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropostaResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  dataCadastramento: ").append(dataCadastramento).append("\n");
    sb.append("  dataAprovacaoNegacaoPendencia: ").append(dataAprovacaoNegacaoPendencia).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
