package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o da resposta do servi\u00E7o de status da proposta
 **/
@ApiModel(description = "Representa\u00E7\u00E3o da resposta do servi\u00E7o de status da proposta")
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
   * C\u00F3digo de Identifica\u00E7\u00E3o do status da proposta (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o do status da proposta (id)")
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
   * Descri\u00E7\u00E3o da proposta
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o da proposta")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Flag que permite a altera\u00E7\u00E3o do status da proposta
   **/
  @ApiModelProperty(value = "Flag que permite a altera\u00E7\u00E3o do status da proposta")
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
