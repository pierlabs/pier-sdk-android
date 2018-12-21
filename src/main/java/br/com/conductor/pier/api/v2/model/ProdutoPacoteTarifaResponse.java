package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Resource response listing product tariff packages
 **/
@ApiModel(description = "Resource response listing product tariff packages")
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
   * Default flag
   **/
  @ApiModelProperty(value = "Default flag")
  public Boolean getFlagDefault() {
    return flagDefault;
  }
  public void setFlagDefault(Boolean flagDefault) {
    this.flagDefault = flagDefault;
  }

  
  /**
   * Rate Package Product Id
   **/
  @ApiModelProperty(value = "Rate Package Product Id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Rate Package Id
   **/
  @ApiModelProperty(value = "Rate Package Id")
  public Long getIdPacoteTarifa() {
    return idPacoteTarifa;
  }
  public void setIdPacoteTarifa(Long idPacoteTarifa) {
    this.idPacoteTarifa = idPacoteTarifa;
  }

  
  /**
   * Product id
   **/
  @ApiModelProperty(value = "Product id")
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
