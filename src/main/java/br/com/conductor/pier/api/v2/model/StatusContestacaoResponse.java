package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Retorno da lista de status de contestacao
 **/
@ApiModel(description = "Retorno da lista de status de contestacao")
public class StatusContestacaoResponse  {
  
  @SerializedName("idStatusContestacao")
  private Long idStatusContestacao = null;
  @SerializedName("descricao")
  private String descricao = null;

  
  /**
   * Id status da contesta\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Id status da contesta\u00E7\u00E3o")
  public Long getIdStatusContestacao() {
    return idStatusContestacao;
  }
  public void setIdStatusContestacao(Long idStatusContestacao) {
    this.idStatusContestacao = idStatusContestacao;
  }

  
  /**
   * Descri\u00E7\u00E3o da Constenta\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o da Constenta\u00E7\u00E3o")
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
