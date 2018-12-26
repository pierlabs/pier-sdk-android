package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{vencimento_update_description}}}
 **/
@ApiModel(description = "{{{vencimento_update_description}}}")
public class VencimentoUpdate  {
  
  @SerializedName("dataPrevistaCorte")
  private String dataPrevistaCorte = null;

  
  /**
   * {{{vencimento_update_data_prevista_corte_value}}}
   **/
  @ApiModelProperty(value = "{{{vencimento_update_data_prevista_corte_value}}}")
  public String getDataPrevistaCorte() {
    return dataPrevistaCorte;
  }
  public void setDataPrevistaCorte(String dataPrevistaCorte) {
    this.dataPrevistaCorte = dataPrevistaCorte;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VencimentoUpdate {\n");
    
    sb.append("  dataPrevistaCorte: ").append(dataPrevistaCorte).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
