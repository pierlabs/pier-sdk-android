package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * ObjectTerminal
 **/
@ApiModel(description = "ObjectTerminal")
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
   * Identification Code of the Terminal (id)
   **/
  @ApiModelProperty(value = "Identification Code of the Terminal (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Unique number of the terminal
   **/
  @ApiModelProperty(value = "Unique number of the terminal")
  public String getTerminal() {
    return terminal;
  }
  public void setTerminal(String terminal) {
    this.terminal = terminal;
  }

  
  /**
   * Merchant Number which the terminal belongs
   **/
  @ApiModelProperty(value = "Merchant Number which the terminal belongs")
  public Long getNumeroEstabelecimento() {
    return numeroEstabelecimento;
  }
  public void setNumeroEstabelecimento(Long numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
  }

  
  /**
   * Identification number of the Merchant which the terminal belongs
   **/
  @ApiModelProperty(value = "Identification number of the Merchant which the terminal belongs")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * Flag indicating if the terminal is physical or virtual, being: (true: Yes), (false: No))
   **/
  @ApiModelProperty(value = "Flag indicating if the terminal is physical or virtual, being: (true: Yes), (false: No))")
  public Boolean getFlagConsultaExtrato() {
    return flagConsultaExtrato;
  }
  public void setFlagConsultaExtrato(Boolean flagConsultaExtrato) {
    this.flagConsultaExtrato = flagConsultaExtrato;
  }

  
  /**
   * Flag indicating if the terminal allows to retrieve the bank statement, being: (true: Yes), (false: No)
   **/
  @ApiModelProperty(value = "Flag indicating if the terminal allows to retrieve the bank statement, being: (true: Yes), (false: No)")
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
