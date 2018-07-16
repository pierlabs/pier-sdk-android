package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{status_contestacao_response_description}}}
 **/
@ApiModel(description = "{{{status_contestacao_response_description}}}")
public class StatusContestacaoResponse  {
  
  @SerializedName("idStatusContestacao")
  private Long idStatusContestacao = null;
  @SerializedName("descricao")
  private String descricao = null;

  
  /**
   * {{{status_contestacao_request_idstatuscontestacao_value}}}
   **/
  @ApiModelProperty(value = "{{{status_contestacao_request_idstatuscontestacao_value}}}")
  public Long getIdStatusContestacao() {
    return idStatusContestacao;
  }
  public void setIdStatusContestacao(Long idStatusContestacao) {
    this.idStatusContestacao = idStatusContestacao;
  }

  
  /**
   * {{{status_contestacao_response_descricao_value}}}
   **/
  @ApiModelProperty(value = "{{{status_contestacao_response_descricao_value}}}")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusContestacaoResponse {\n");
    
    sb.append("  idStatusContestacao: ").append(idStatusContestacao).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


