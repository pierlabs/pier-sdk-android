package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representation of the object that abstract the historic of the events
 **/
@ApiModel(description = "Representation of the object that abstract the historic of the events")
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
   * Identifier Code of the event
   **/
  @ApiModelProperty(required = true, value = "Identifier Code of the event")
  public Long getIdHistorico() {
    return idHistorico;
  }
  public void setIdHistorico(Long idHistorico) {
    this.idHistorico = idHistorico;
  }

  
  /**
   * Date of the event
   **/
  @ApiModelProperty(required = true, value = "Date of the event")
  public String getDataHistorico() {
    return dataHistorico;
  }
  public void setDataHistorico(String dataHistorico) {
    this.dataHistorico = dataHistorico;
  }

  
  /**
   * Name of the updated field
   **/
  @ApiModelProperty(required = true, value = "Name of the updated field")
  public String getTipoHistorico() {
    return tipoHistorico;
  }
  public void setTipoHistorico(String tipoHistorico) {
    this.tipoHistorico = tipoHistorico;
  }

  
  /**
   * Previous value to the modification
   **/
  @ApiModelProperty(value = "Previous value to the modification")
  public String getValorAnterior() {
    return valorAnterior;
  }
  public void setValorAnterior(String valorAnterior) {
    this.valorAnterior = valorAnterior;
  }

  
  /**
   * Value attributed in the modification
   **/
  @ApiModelProperty(required = true, value = "Value attributed in the modification")
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
