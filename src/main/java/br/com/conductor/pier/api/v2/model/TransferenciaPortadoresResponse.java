package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de resposta de uma transfer\u00EAncia de cr\u00E9ditos entre portadores
 **/
@ApiModel(description = "Objeto de resposta de uma transfer\u00EAncia de cr\u00E9ditos entre portadores")
public class TransferenciaPortadoresResponse  {
  
  @SerializedName("idAjusteCredito")
  private Long idAjusteCredito = null;
  @SerializedName("idAjusteDebito")
  private Long idAjusteDebito = null;

  
  /**
   * C\u00F3digo identificador do ajuste de cr\u00E9dito
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador do ajuste de cr\u00E9dito")
  public Long getIdAjusteCredito() {
    return idAjusteCredito;
  }
  public void setIdAjusteCredito(Long idAjusteCredito) {
    this.idAjusteCredito = idAjusteCredito;
  }

  
  /**
   * C\u00F3digo identificador do ajuste de d\u00E9bito
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador do ajuste de d\u00E9bito")
  public Long getIdAjusteDebito() {
    return idAjusteDebito;
  }
  public void setIdAjusteDebito(Long idAjusteDebito) {
    this.idAjusteDebito = idAjusteDebito;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferenciaPortadoresResponse {\n");
    
    sb.append("  idAjusteCredito: ").append(idAjusteCredito).append("\n");
    sb.append("  idAjusteDebito: ").append(idAjusteDebito).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
