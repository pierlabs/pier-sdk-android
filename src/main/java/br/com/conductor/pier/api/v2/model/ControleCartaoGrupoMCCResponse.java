package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o para resposta de dados de Controle de cart\u00E3o por Grupo MCC.
 **/
@ApiModel(description = "Representa\u00E7\u00E3o para resposta de dados de Controle de cart\u00E3o por Grupo MCC.")
public class ControleCartaoGrupoMCCResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("idGrupoMCC")
  private Long idGrupoMCC = null;

  
  /**
   * C\u00F3digo Identificador do controle do cart\u00E3o na base (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo Identificador do controle do cart\u00E3o na base (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo Identificador do cart\u00E3o na base.
   **/
  @ApiModelProperty(value = "C\u00F3digo Identificador do cart\u00E3o na base.")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * C\u00F3digo Identificador do grupo mcc na base.
   **/
  @ApiModelProperty(value = "C\u00F3digo Identificador do grupo mcc na base.")
  public Long getIdGrupoMCC() {
    return idGrupoMCC;
  }
  public void setIdGrupoMCC(Long idGrupoMCC) {
    this.idGrupoMCC = idGrupoMCC;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControleCartaoGrupoMCCResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  idGrupoMCC: ").append(idGrupoMCC).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
