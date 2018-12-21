package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Response Representation of the {@link HistoricAdvisoryResponse}
 **/
@ApiModel(description = "Response Representation of the {@link HistoricAdvisoryResponse}")
public class HistoricoAssessoriaResponse  {
  
  @SerializedName("dataHoraHistorico")
  private String dataHoraHistorico = null;
  @SerializedName("tipoHistorico")
  private String tipoHistorico = null;
  @SerializedName("nomeAssessoria")
  private String nomeAssessoria = null;

  
  /**
   * Show the date and time of the historic
   **/
  @ApiModelProperty(value = "Show the date and time of the historic")
  public String getDataHoraHistorico() {
    return dataHoraHistorico;
  }
  public void setDataHoraHistorico(String dataHoraHistorico) {
    this.dataHoraHistorico = dataHoraHistorico;
  }

  
  /**
   * Show the type of historic can be input or output
   **/
  @ApiModelProperty(value = "Show the type of historic can be input or output")
  public String getTipoHistorico() {
    return tipoHistorico;
  }
  public void setTipoHistorico(String tipoHistorico) {
    this.tipoHistorico = tipoHistorico;
  }

  
  /**
   * Show the name of the Collection Advisory related to the historic
   **/
  @ApiModelProperty(value = "Show the name of the Collection Advisory related to the historic")
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
