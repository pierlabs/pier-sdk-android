package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representation Object Update for Expirations
 **/
@ApiModel(description = "Representation Object Update for Expirations")
public class VencimentoUpdate  {
  
  @SerializedName("dataPrevistaCorte")
  private String dataPrevistaCorte = null;

  
  /**
   * expected expiring date
   **/
  @ApiModelProperty(value = "expected expiring date")
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
