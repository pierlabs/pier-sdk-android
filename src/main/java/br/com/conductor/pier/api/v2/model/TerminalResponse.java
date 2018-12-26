package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * ObjetoTerminal
 **/
@ApiModel(description = "ObjetoTerminal")
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
   * C\u00F3digo de Identifica\u00E7\u00E3o do Terminal (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o do Terminal (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * N\u00FAmero \u00FAnico do terminal
   **/
  @ApiModelProperty(value = "N\u00FAmero \u00FAnico do terminal")
  public String getTerminal() {
    return terminal;
  }
  public void setTerminal(String terminal) {
    this.terminal = terminal;
  }

  
  /**
   * N\u00FAmero do estabelecimento a qual o terminal pertence
   **/
  @ApiModelProperty(value = "N\u00FAmero do estabelecimento a qual o terminal pertence")
  public Long getNumeroEstabelecimento() {
    return numeroEstabelecimento;
  }
  public void setNumeroEstabelecimento(Long numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
  }

  
  /**
   * N\u00FAmero de identifica\u00E7\u00E3o do estabelecimento a qual o terminal pertence
   **/
  @ApiModelProperty(value = "N\u00FAmero de identifica\u00E7\u00E3o do estabelecimento a qual o terminal pertence")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * Flag indicando se o terminal \u00E9 f\u00EDsico ou virtual, sendo: (true: Sim), (false: N\u00E3o))
   **/
  @ApiModelProperty(value = "Flag indicando se o terminal \u00E9 f\u00EDsico ou virtual, sendo: (true: Sim), (false: N\u00E3o))")
  public Boolean getFlagConsultaExtrato() {
    return flagConsultaExtrato;
  }
  public void setFlagConsultaExtrato(Boolean flagConsultaExtrato) {
    this.flagConsultaExtrato = flagConsultaExtrato;
  }

  
  /**
   * Flag indicando se o terminal permite consultar extrato, sendo: (true: Sim), (false: N\u00E3o))
   **/
  @ApiModelProperty(value = "Flag indicando se o terminal permite consultar extrato, sendo: (true: Sim), (false: N\u00E3o))")
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
