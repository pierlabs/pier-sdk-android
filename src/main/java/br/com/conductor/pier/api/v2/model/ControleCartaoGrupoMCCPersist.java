package br.com.conductor.pier.api.v2.model;

import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto para persist\u00EAncia de Controle de Cartao por mcc.
 **/
@ApiModel(description = "Objeto para persist\u00EAncia de Controle de Cartao por mcc.")
public class ControleCartaoGrupoMCCPersist  {
  
  @SerializedName("idsGruposMCC")
  private List<Long> idsGruposMCC = null;

  
  /**
   * idGrupoMCC
   **/
  @ApiModelProperty(required = true, value = "idGrupoMCC")
  public List<Long> getIdsGruposMCC() {
    return idsGruposMCC;
  }
  public void setIdsGruposMCC(List<Long> idsGruposMCC) {
    this.idsGruposMCC = idsGruposMCC;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControleCartaoGrupoMCCPersist {\n");
    
    sb.append("  idsGruposMCC: ").append(idsGruposMCC).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
