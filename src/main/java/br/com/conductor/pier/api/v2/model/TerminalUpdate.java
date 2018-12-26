package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * TerminalUpdate
 **/
@ApiModel(description = "TerminalUpdate")
public class TerminalUpdate  {
  
  @SerializedName("flagConsultaExtrato")
  private Boolean flagConsultaExtrato = null;
  @SerializedName("flagTerminalVirtual")
  private Boolean flagTerminalVirtual = null;

  
  /**
   * Flag indicando se o terminal permite consultar extrato, sendo: (true: Sim), (false: N\u00E3o))
   **/
  @ApiModelProperty(required = true, value = "Flag indicando se o terminal permite consultar extrato, sendo: (true: Sim), (false: N\u00E3o))")
  public Boolean getFlagConsultaExtrato() {
    return flagConsultaExtrato;
  }
  public void setFlagConsultaExtrato(Boolean flagConsultaExtrato) {
    this.flagConsultaExtrato = flagConsultaExtrato;
  }

  
  /**
   * Flag indicando se o terminal \u00E9 f\u00EDsico ou virtual, sendo: (true: Sim), (false: N\u00E3o))
   **/
  @ApiModelProperty(required = true, value = "Flag indicando se o terminal \u00E9 f\u00EDsico ou virtual, sendo: (true: Sim), (false: N\u00E3o))")
  public Boolean getFlagTerminalVirtual() {
    return flagTerminalVirtual;
  }
  public void setFlagTerminalVirtual(Boolean flagTerminalVirtual) {
    this.flagTerminalVirtual = flagTerminalVirtual;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerminalUpdate {\n");
    
    sb.append("  flagConsultaExtrato: ").append(flagConsultaExtrato).append("\n");
    sb.append("  flagTerminalVirtual: ").append(flagTerminalVirtual).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
