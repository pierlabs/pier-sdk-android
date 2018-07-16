package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class CdtTipoResolucaoContestacao  {
  
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("idTipoResolucaoContestacao")
  private Long idTipoResolucaoContestacao = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getIdTipoResolucaoContestacao() {
    return idTipoResolucaoContestacao;
  }
  public void setIdTipoResolucaoContestacao(Long idTipoResolucaoContestacao) {
    this.idTipoResolucaoContestacao = idTipoResolucaoContestacao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CdtTipoResolucaoContestacao {\n");
    
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  idTipoResolucaoContestacao: ").append(idTipoResolucaoContestacao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


