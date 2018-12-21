package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representation of the proposal response
 **/
@ApiModel(description = "Representation of the proposal response")
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
   * Proposal Identification Code (id)
   **/
  @ApiModelProperty(value = "Proposal Identification Code (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Proposal Status
   **/
  @ApiModelProperty(value = "Proposal Status")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * Date of registration of the proposal
   **/
  @ApiModelProperty(value = "Date of registration of the proposal")
  public String getDataCadastramento() {
    return dataCadastramento;
  }
  public void setDataCadastramento(String dataCadastramento) {
    this.dataCadastramento = dataCadastramento;
  }

  
  /**
   * Proposal update date
   **/
  @ApiModelProperty(value = "Proposal update date")
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
