package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Return of the contested status list
 **/
@ApiModel(description = "Return of the contested status list")
public class StatusContestacaoResponse  {
  
  @SerializedName("idStatusContestacao")
  private Long idStatusContestacao = null;
  @SerializedName("descricao")
  private String descricao = null;

  
  /**
   * Id of status contestation
   **/
  @ApiModelProperty(value = "Id of status contestation")
  public Long getIdStatusContestacao() {
    return idStatusContestacao;
  }
  public void setIdStatusContestacao(Long idStatusContestacao) {
    this.idStatusContestacao = idStatusContestacao;
  }

  
  /**
   * Contested Status description
   **/
  @ApiModelProperty(value = "Contested Status description")
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
