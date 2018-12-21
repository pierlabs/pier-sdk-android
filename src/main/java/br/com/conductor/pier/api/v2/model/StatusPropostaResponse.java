package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representation of the proposal status service response
 **/
@ApiModel(description = "Representation of the proposal status service response")
public class StatusPropostaResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("status")
  private Integer status = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("flagPermiteAlteracao")
  private Boolean flagPermiteAlteracao = null;

  
  /**
   * Proposal Identification Status Code (id)
   **/
  @ApiModelProperty(value = "Proposal Identification Status Code (id)")
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
   * Description of the proposal
   **/
  @ApiModelProperty(value = "Description of the proposal")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Flag that allows you to change the status of the proposal
   **/
  @ApiModelProperty(value = "Flag that allows you to change the status of the proposal")
  public Boolean getFlagPermiteAlteracao() {
    return flagPermiteAlteracao;
  }
  public void setFlagPermiteAlteracao(Boolean flagPermiteAlteracao) {
    this.flagPermiteAlteracao = flagPermiteAlteracao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusPropostaResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  flagPermiteAlteracao: ").append(flagPermiteAlteracao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
