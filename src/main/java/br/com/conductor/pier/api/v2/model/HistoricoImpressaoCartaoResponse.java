package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Hist\u00F3rico Impress\u00E3o Cart\u00E3o
 **/
@ApiModel(description = "Hist\u00F3rico Impress\u00E3o Cart\u00E3o")
public class HistoricoImpressaoCartaoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("idStatusImpressaoCartao")
  private Long idStatusImpressaoCartao = null;
  @SerializedName("mensagemHistorico")
  private String mensagemHistorico = null;
  @SerializedName("dataHistorico")
  private String dataHistorico = null;

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Hist\u00F3rico de Impress\u00E3o Avulsa de Cart\u00F5es (id).
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo de Identifica\u00E7\u00E3o do Hist\u00F3rico de Impress\u00E3o Avulsa de Cart\u00F5es (id).")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Cart\u00E3o (id).
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo de Identifica\u00E7\u00E3o do Cart\u00E3o (id).")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Status de Impress\u00E3o do Cart\u00E3o (id).
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo de Identifica\u00E7\u00E3o do Status de Impress\u00E3o do Cart\u00E3o (id).")
  public Long getIdStatusImpressaoCartao() {
    return idStatusImpressaoCartao;
  }
  public void setIdStatusImpressaoCartao(Long idStatusImpressaoCartao) {
    this.idStatusImpressaoCartao = idStatusImpressaoCartao;
  }

  
  /**
   * Apresenta uma mensagem que descreve a etapa do processo de impress\u00E3o do cart\u00E3o que fora realizado.
   **/
  @ApiModelProperty(value = "Apresenta uma mensagem que descreve a etapa do processo de impress\u00E3o do cart\u00E3o que fora realizado.")
  public String getMensagemHistorico() {
    return mensagemHistorico;
  }
  public void setMensagemHistorico(String mensagemHistorico) {
    this.mensagemHistorico = mensagemHistorico;
  }

  
  /**
   * Apresenta a data que o registro de Hist\u00F3rico de Impress\u00E3o de um Cart\u00E3o fora inserido.
   **/
  @ApiModelProperty(value = "Apresenta a data que o registro de Hist\u00F3rico de Impress\u00E3o de um Cart\u00E3o fora inserido.")
  public String getDataHistorico() {
    return dataHistorico;
  }
  public void setDataHistorico(String dataHistorico) {
    this.dataHistorico = dataHistorico;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricoImpressaoCartaoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  idStatusImpressaoCartao: ").append(idStatusImpressaoCartao).append("\n");
    sb.append("  mensagemHistorico: ").append(mensagemHistorico).append("\n");
    sb.append("  dataHistorico: ").append(dataHistorico).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
