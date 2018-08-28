package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{terminal_response_description}}}
 **/
@ApiModel(description = "{{{terminal_response_description}}}")
public class TerminalResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("terminal")
  private String terminal = null;
  @SerializedName("numeroEstabelecimento")
  private Long numeroEstabelecimento = null;
  @SerializedName("idEstabelecimento")
  private Long idEstabelecimento = null;
  @SerializedName("flagConsultaExtrato")
  private Boolean flagConsultaExtrato = null;
  @SerializedName("flagTerminalVirtual")
  private Boolean flagTerminalVirtual = null;

  
  /**
   * {{{terminal_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{terminal_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{terminal_response_terminal_value}}}
   **/
  @ApiModelProperty(value = "{{{terminal_response_terminal_value}}}")
  public String getTerminal() {
    return terminal;
  }
  public void setTerminal(String terminal) {
    this.terminal = terminal;
  }

  
  /**
   * {{{terminal_response_numero_estabelecimento_value}}}
   **/
  @ApiModelProperty(value = "{{{terminal_response_numero_estabelecimento_value}}}")
  public Long getNumeroEstabelecimento() {
    return numeroEstabelecimento;
  }
  public void setNumeroEstabelecimento(Long numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
  }

  
  /**
   * {{{terminal_response_id_estabelecimento_value}}}
   **/
  @ApiModelProperty(value = "{{{terminal_response_id_estabelecimento_value}}}")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * {{{terminal_response_flag_consulta_extrato_value}}}
   **/
  @ApiModelProperty(value = "{{{terminal_response_flag_consulta_extrato_value}}}")
  public Boolean getFlagConsultaExtrato() {
    return flagConsultaExtrato;
  }
  public void setFlagConsultaExtrato(Boolean flagConsultaExtrato) {
    this.flagConsultaExtrato = flagConsultaExtrato;
  }

  
  /**
   * {{{terminal_response_flag_terminal_virtual_value}}}
   **/
  @ApiModelProperty(value = "{{{terminal_response_flag_terminal_virtual_value}}}")
  public Boolean getFlagTerminalVirtual() {
    return flagTerminalVirtual;
  }
  public void setFlagTerminalVirtual(Boolean flagTerminalVirtual) {
    this.flagTerminalVirtual = flagTerminalVirtual;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerminalResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  terminal: ").append(terminal).append("\n");
    sb.append("  numeroEstabelecimento: ").append(numeroEstabelecimento).append("\n");
    sb.append("  idEstabelecimento: ").append(idEstabelecimento).append("\n");
    sb.append("  flagConsultaExtrato: ").append(flagConsultaExtrato).append("\n");
    sb.append("  flagTerminalVirtual: ").append(flagTerminalVirtual).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
