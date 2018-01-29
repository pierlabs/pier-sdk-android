package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00C3\u00A7\u00C3\u00A3o do objeto que abstrai o hist\u00C3\u00B3rico de eventos
 **/
@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o do objeto que abstrai o hist\u00C3\u00B3rico de eventos")
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
   * C\u00C3\u00B3digo identificador do evento
   **/
  @ApiModelProperty(required = true, value = "C\u00C3\u00B3digo identificador do evento")
  public Long getIdHistorico() {
    return idHistorico;
  }
  public void setIdHistorico(Long idHistorico) {
    this.idHistorico = idHistorico;
  }

  
  /**
   * Data do evento
   **/
  @ApiModelProperty(required = true, value = "Data do evento")
  public String getDataHistorico() {
    return dataHistorico;
  }
  public void setDataHistorico(String dataHistorico) {
    this.dataHistorico = dataHistorico;
  }

  
  /**
   * Nome do campo alterado
   **/
  @ApiModelProperty(required = true, value = "Nome do campo alterado")
  public String getTipoHistorico() {
    return tipoHistorico;
  }
  public void setTipoHistorico(String tipoHistorico) {
    this.tipoHistorico = tipoHistorico;
  }

  
  /**
   * Valor anterior a modifica\u00C3\u00A7\u00C3\u00A3o
   **/
  @ApiModelProperty(value = "Valor anterior a modifica\u00C3\u00A7\u00C3\u00A3o")
  public String getValorAnterior() {
    return valorAnterior;
  }
  public void setValorAnterior(String valorAnterior) {
    this.valorAnterior = valorAnterior;
  }

  
  /**
   * Valor atribu\u00C3\u00ADdo na modifica\u00C3\u00A7\u00C3\u00A3o
   **/
  @ApiModelProperty(required = true, value = "Valor atribu\u00C3\u00ADdo na modifica\u00C3\u00A7\u00C3\u00A3o")
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
