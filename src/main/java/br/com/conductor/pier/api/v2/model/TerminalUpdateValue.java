package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{terminal_update_description}}}
 **/
@ApiModel(description = "{{{terminal_update_description}}}")
public class TerminalUpdateValue  {
  
  @SerializedName("flagConsultaExtrato")
  private Boolean flagConsultaExtrato = null;
  @SerializedName("flagTerminalVirtual")
  private Boolean flagTerminalVirtual = null;

  
  /**
   * {{{terminal_update_flag_consulta_extrato_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{terminal_update_flag_consulta_extrato_value}}}")
  public Boolean getFlagConsultaExtrato() {
    return flagConsultaExtrato;
  }
  public void setFlagConsultaExtrato(Boolean flagConsultaExtrato) {
    this.flagConsultaExtrato = flagConsultaExtrato;
  }

  
  /**
   * {{{terminal_update_flag_terminal_virtual_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{terminal_update_flag_terminal_virtual_value}}}")
  public Boolean getFlagTerminalVirtual() {
    return flagTerminalVirtual;
  }
  public void setFlagTerminalVirtual(Boolean flagTerminalVirtual) {
    this.flagTerminalVirtual = flagTerminalVirtual;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerminalUpdateValue {\n");
    
    sb.append("  flagConsultaExtrato: ").append(flagConsultaExtrato).append("\n");
    sb.append("  flagTerminalVirtual: ").append(flagTerminalVirtual).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
