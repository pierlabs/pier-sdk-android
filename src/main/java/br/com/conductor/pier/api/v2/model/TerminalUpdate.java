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
   * Flag indicating if the terminal allows to retrieve the bank statement, being: (true: yes), (false: No))
   **/
  @ApiModelProperty(required = true, value = "Flag indicating if the terminal allows to retrieve the bank statement, being: (true: yes), (false: No))")
  public Boolean getFlagConsultaExtrato() {
    return flagConsultaExtrato;
  }
  public void setFlagConsultaExtrato(Boolean flagConsultaExtrato) {
    this.flagConsultaExtrato = flagConsultaExtrato;
  }

  
  /**
   * Flag indicating if the termina is physical or virtual, being: (true: Yes), (false: No))
   **/
  @ApiModelProperty(required = true, value = "Flag indicating if the termina is physical or virtual, being: (true: Yes), (false: No))")
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
