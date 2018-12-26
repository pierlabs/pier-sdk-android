package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{produto_pacote_tarifa_response_descricao}}}
 **/
@ApiModel(description = "{{{produto_pacote_tarifa_response_descricao}}}")
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
   * {{{produto_pacote_tarifa_response_flag_default_descricao}}}
   **/
  @ApiModelProperty(value = "{{{produto_pacote_tarifa_response_flag_default_descricao}}}")
  public Boolean getFlagDefault() {
    return flagDefault;
  }
  public void setFlagDefault(Boolean flagDefault) {
    this.flagDefault = flagDefault;
  }

  
  /**
   * {{{produto_pacote_tarifa_response_id_descricao}}}
   **/
  @ApiModelProperty(value = "{{{produto_pacote_tarifa_response_id_descricao}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{produto_pacote_tarifa_response_id_pacote_tarifa_descricao}}}
   **/
  @ApiModelProperty(value = "{{{produto_pacote_tarifa_response_id_pacote_tarifa_descricao}}}")
  public Long getIdPacoteTarifa() {
    return idPacoteTarifa;
  }
  public void setIdPacoteTarifa(Long idPacoteTarifa) {
    this.idPacoteTarifa = idPacoteTarifa;
  }

  
  /**
   * {{{produto_pacote_tarifa_response_id_produto_descricao}}}
   **/
  @ApiModelProperty(value = "{{{produto_pacote_tarifa_response_id_produto_descricao}}}")
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
