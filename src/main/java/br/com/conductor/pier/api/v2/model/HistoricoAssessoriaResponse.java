package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{historico_assessoria_response_description}}}
 **/
@ApiModel(description = "{{{historico_assessoria_response_description}}}")
public class HistoricoAssessoriaResponse  {
  
  @SerializedName("dataHoraHistorico")
  private String dataHoraHistorico = null;
  @SerializedName("tipoHistorico")
  private String tipoHistorico = null;
  @SerializedName("nomeAssessoria")
  private String nomeAssessoria = null;

  
  /**
   * {{{historico_assessoria_response_data_hora_historico_value}}}
   **/
  @ApiModelProperty(value = "{{{historico_assessoria_response_data_hora_historico_value}}}")
  public String getDataHoraHistorico() {
    return dataHoraHistorico;
  }
  public void setDataHoraHistorico(String dataHoraHistorico) {
    this.dataHoraHistorico = dataHoraHistorico;
  }

  
  /**
   * {{{historico_assessoria_response_tipo_historico_value}}}
   **/
  @ApiModelProperty(value = "{{{historico_assessoria_response_tipo_historico_value}}}")
  public String getTipoHistorico() {
    return tipoHistorico;
  }
  public void setTipoHistorico(String tipoHistorico) {
    this.tipoHistorico = tipoHistorico;
  }

  
  /**
   * {{{historico_assessoria_response_nome_assessoria_value}}}
   **/
  @ApiModelProperty(value = "{{{historico_assessoria_response_nome_assessoria_value}}}")
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
