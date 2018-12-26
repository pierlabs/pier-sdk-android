package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto tipo opera\u00E7\u00E3o com campos pass\u00EDveis de altera\u00E7\u00E3o
 **/
@ApiModel(description = "Objeto tipo opera\u00E7\u00E3o com campos pass\u00EDveis de altera\u00E7\u00E3o")
public class TipoOperacaoParcialUpdate  {
  
  @SerializedName("flagManterTaxaJurosNoRotativo")
  private Boolean flagManterTaxaJurosNoRotativo = null;

  
  /**
   * Flag que indica que a opera\u00E7\u00E3o deve utilizar a taxa da compra como taxa do rotativo para transa\u00E7\u00F5es desse tipo opera\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Flag que indica que a opera\u00E7\u00E3o deve utilizar a taxa da compra como taxa do rotativo para transa\u00E7\u00F5es desse tipo opera\u00E7\u00E3o")
  public Boolean getFlagManterTaxaJurosNoRotativo() {
    return flagManterTaxaJurosNoRotativo;
  }
  public void setFlagManterTaxaJurosNoRotativo(Boolean flagManterTaxaJurosNoRotativo) {
    this.flagManterTaxaJurosNoRotativo = flagManterTaxaJurosNoRotativo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoOperacaoParcialUpdate {\n");
    
    sb.append("  flagManterTaxaJurosNoRotativo: ").append(flagManterTaxaJurosNoRotativo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
