package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto Terminal
 **/
@ApiModel(description = "Objeto Terminal")
public class TerminalPersist  {
  
  @SerializedName("idEstabelecimento")
  private Long idEstabelecimento = null;
  @SerializedName("flagConsultaExtrato")
  private Boolean flagConsultaExtrato = null;
  @SerializedName("flagTerminalVirtual")
  private Boolean flagTerminalVirtual = null;

  
  /**
   * Apresenta o id do estabelecimento
   **/
  @ApiModelProperty(required = true, value = "Apresenta o id do estabelecimento")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * Flag indicando se permite consultar extrato, sendo: (true: Sim), (false: N\u00E3o))
   **/
  @ApiModelProperty(required = true, value = "Flag indicando se permite consultar extrato, sendo: (true: Sim), (false: N\u00E3o))")
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
    sb.append("class TerminalPersist {\n");
    
    sb.append("  idEstabelecimento: ").append(idEstabelecimento).append("\n");
    sb.append("  flagConsultaExtrato: ").append(flagConsultaExtrato).append("\n");
    sb.append("  flagTerminalVirtual: ").append(flagTerminalVirtual).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
