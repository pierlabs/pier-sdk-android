package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{historico_eventos_response_description}}}
 **/
@ApiModel(description = "{{{historico_eventos_response_description}}}")
public class HistoricoEventosResponse  {
  
  @SerializedName("idHistorico")
  private Long idHistorico = null;
  @SerializedName("dataHistorico")
  private String dataHistorico = null;
  @SerializedName("tipoHistorico")
  private String tipoHistorico = null;
  @SerializedName("valorAnterior")
  private String valorAnterior = null;
  @SerializedName("valorAtribuido")
  private String valorAtribuido = null;

  
  /**
   * {{{historico_eventos_response_id_historico_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{historico_eventos_response_id_historico_value}}}")
  public Long getIdHistorico() {
    return idHistorico;
  }
  public void setIdHistorico(Long idHistorico) {
    this.idHistorico = idHistorico;
  }

  
  /**
   * {{{historico_eventos_response_data_historico_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{historico_eventos_response_data_historico_value}}}")
  public String getDataHistorico() {
    return dataHistorico;
  }
  public void setDataHistorico(String dataHistorico) {
    this.dataHistorico = dataHistorico;
  }

  
  /**
   * {{{historico_eventos_response_tipo_historico_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{historico_eventos_response_tipo_historico_value}}}")
  public String getTipoHistorico() {
    return tipoHistorico;
  }
  public void setTipoHistorico(String tipoHistorico) {
    this.tipoHistorico = tipoHistorico;
  }

  
  /**
   * {{{historico_eventos_response_valor_anterior_value}}}
   **/
  @ApiModelProperty(value = "{{{historico_eventos_response_valor_anterior_value}}}")
  public String getValorAnterior() {
    return valorAnterior;
  }
  public void setValorAnterior(String valorAnterior) {
    this.valorAnterior = valorAnterior;
  }

  
  /**
   * {{{historico_eventos_response_valor_atribuido_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{historico_eventos_response_valor_atribuido_value}}}")
  public String getValorAtribuido() {
    return valorAtribuido;
  }
  public void setValorAtribuido(String valorAtribuido) {
    this.valorAtribuido = valorAtribuido;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricoEventosResponse {\n");
    
    sb.append("  idHistorico: ").append(idHistorico).append("\n");
    sb.append("  dataHistorico: ").append(dataHistorico).append("\n");
    sb.append("  tipoHistorico: ").append(tipoHistorico).append("\n");
    sb.append("  valorAnterior: ").append(valorAnterior).append("\n");
    sb.append("  valorAtribuido: ").append(valorAtribuido).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


