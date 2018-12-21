package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Histotic Card Printing
 **/
@ApiModel(description = "Histotic Card Printing")
public class HistoricoImpressaoCartaoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("idStatusImpressaoCartao")
  private Long idStatusImpressaoCartao = null;
  @SerializedName("mensagemHistorico")
  private String mensagemHistorico = null;
  @SerializedName("dataHistorico")
  private String dataHistorico = null;

  
  /**
   * Identification Code of the Printing Card Historic (id)
   **/
  @ApiModelProperty(required = true, value = "Identification Code of the Printing Card Historic (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identification Code of the Card (id)
   **/
  @ApiModelProperty(required = true, value = "Identification Code of the Card (id)")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Identification Code of the Printing Card Status (id)
   **/
  @ApiModelProperty(required = true, value = "Identification Code of the Printing Card Status (id)")
  public Long getIdStatusImpressaoCartao() {
    return idStatusImpressaoCartao;
  }
  public void setIdStatusImpressaoCartao(Long idStatusImpressaoCartao) {
    this.idStatusImpressaoCartao = idStatusImpressaoCartao;
  }

  
  /**
   * Show a message that describes the stage of the printing card process that was made
   **/
  @ApiModelProperty(value = "Show a message that describes the stage of the printing card process that was made")
  public String getMensagemHistorico() {
    return mensagemHistorico;
  }
  public void setMensagemHistorico(String mensagemHistorico) {
    this.mensagemHistorico = mensagemHistorico;
  }

  
  /**
   * Show the date that the historic register of the Printing of a Card was inserted
   **/
  @ApiModelProperty(value = "Show the date that the historic register of the Printing of a Card was inserted")
  public String getDataHistorico() {
    return dataHistorico;
  }
  public void setDataHistorico(String dataHistorico) {
    this.dataHistorico = dataHistorico;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricoImpressaoCartaoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  idStatusImpressaoCartao: ").append(idStatusImpressaoCartao).append("\n");
    sb.append("  mensagemHistorico: ").append(mensagemHistorico).append("\n");
    sb.append("  dataHistorico: ").append(dataHistorico).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
