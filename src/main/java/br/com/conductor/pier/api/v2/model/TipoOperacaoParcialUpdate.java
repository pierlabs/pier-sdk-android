package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{tipo_operacao_persist_description}}}
 **/
@ApiModel(description = "{{{tipo_operacao_persist_description}}}")
public class TipoOperacaoParcialUpdate  {
  
  @SerializedName("flagManterTaxaJurosNoRotativo")
  private Boolean flagManterTaxaJurosNoRotativo = null;

  
  /**
   * {{{tipo_operacao_persist_flag_manter_taxa_juros_no_rotativo_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_operacao_persist_flag_manter_taxa_juros_no_rotativo_value}}}")
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
