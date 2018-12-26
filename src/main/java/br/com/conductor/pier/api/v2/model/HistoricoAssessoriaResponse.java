package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o da resposta do {@link HistoricoAssessoriaResponse}
 **/
@ApiModel(description = "Representa\u00E7\u00E3o da resposta do {@link HistoricoAssessoriaResponse}")
public class HistoricoAssessoriaResponse  {
  
  @SerializedName("dataHoraHistorico")
  private String dataHoraHistorico = null;
  @SerializedName("tipoHistorico")
  private String tipoHistorico = null;
  @SerializedName("nomeAssessoria")
  private String nomeAssessoria = null;

  
  /**
   * Apresenta a data e hora do hist\u00F3rico
   **/
  @ApiModelProperty(value = "Apresenta a data e hora do hist\u00F3rico")
  public String getDataHoraHistorico() {
    return dataHoraHistorico;
  }
  public void setDataHoraHistorico(String dataHoraHistorico) {
    this.dataHoraHistorico = dataHoraHistorico;
  }

  
  /**
   * Apresenta o tipo do hist\u00F3rico podendo ser ENTRADA ou SAIDA
   **/
  @ApiModelProperty(value = "Apresenta o tipo do hist\u00F3rico podendo ser ENTRADA ou SAIDA")
  public String getTipoHistorico() {
    return tipoHistorico;
  }
  public void setTipoHistorico(String tipoHistorico) {
    this.tipoHistorico = tipoHistorico;
  }

  
  /**
   * Apresenta o nome da Assessoria de Cobran\u00E7a relacionada ao hist\u00F3rico
   **/
  @ApiModelProperty(value = "Apresenta o nome da Assessoria de Cobran\u00E7a relacionada ao hist\u00F3rico")
  public String getNomeAssessoria() {
    return nomeAssessoria;
  }
  public void setNomeAssessoria(String nomeAssessoria) {
    this.nomeAssessoria = nomeAssessoria;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricoAssessoriaResponse {\n");
    
    sb.append("  dataHoraHistorico: ").append(dataHoraHistorico).append("\n");
    sb.append("  tipoHistorico: ").append(tipoHistorico).append("\n");
    sb.append("  nomeAssessoria: ").append(nomeAssessoria).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
