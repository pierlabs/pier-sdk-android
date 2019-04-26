package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de Resposta  de um  Pacote de Tarifa
 **/
@ApiModel(description = "Objeto de Resposta  de um  Pacote de Tarifa")
public class ProdutoPacoteTarifaResponse  {
  
  @SerializedName("flagDefault")
  private Boolean flagDefault = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idPacoteTarifa")
  private Long idPacoteTarifa = null;
  @SerializedName("idProduto")
  private Long idProduto = null;

  
  /**
   * Sinaliza se \u00E9 Padr\u00E3o
   **/
  @ApiModelProperty(value = "Sinaliza se \u00E9 Padr\u00E3o")
  public Boolean getFlagDefault() {
    return flagDefault;
  }
  public void setFlagDefault(Boolean flagDefault) {
    this.flagDefault = flagDefault;
  }

  
  /**
   * Identificador do Produto de Pacote de  Tarifa
   **/
  @ApiModelProperty(value = "Identificador do Produto de Pacote de  Tarifa")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identificador do Pacote de Tarfica
   **/
  @ApiModelProperty(value = "Identificador do Pacote de Tarfica")
  public Long getIdPacoteTarifa() {
    return idPacoteTarifa;
  }
  public void setIdPacoteTarifa(Long idPacoteTarifa) {
    this.idPacoteTarifa = idPacoteTarifa;
  }

  
  /**
   * Identificador do Produto
   **/
  @ApiModelProperty(value = "Identificador do Produto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProdutoPacoteTarifaResponse {\n");
    
    sb.append("  flagDefault: ").append(flagDefault).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idPacoteTarifa: ").append(idPacoteTarifa).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
