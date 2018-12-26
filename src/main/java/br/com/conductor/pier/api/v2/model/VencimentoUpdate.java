package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa Objeto de atualiza\u00E7\u00E3o de Vencimento
 **/
@ApiModel(description = "Representa Objeto de atualiza\u00E7\u00E3o de Vencimento")
public class VencimentoUpdate  {
  
  @SerializedName("dataPrevistaCorte")
  private String dataPrevistaCorte = null;

  
  /**
   * Data prevista para Vencimento
   **/
  @ApiModelProperty(value = "Data prevista para Vencimento")
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
