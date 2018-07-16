package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{status_proposta_response_description}}}
 **/
@ApiModel(description = "{{{status_proposta_response_description}}}")
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
   * {{{status_proposta_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{status_proposta_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{status_proposta_response_status_value}}}
   **/
  @ApiModelProperty(value = "{{{status_proposta_response_status_value}}}")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * {{{status_proposta_response_descricao_value}}}
   **/
  @ApiModelProperty(value = "{{{status_proposta_response_descricao_value}}}")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * {{{status_proposta_response_flag_permite_alteracao_value}}}
   **/
  @ApiModelProperty(value = "{{{status_proposta_response_flag_permite_alteracao_value}}}")
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


