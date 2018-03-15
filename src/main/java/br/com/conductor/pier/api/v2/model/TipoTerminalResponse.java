package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * ObjetoTipoTerminal
 **/
@ApiModel(description = "ObjetoTipoTerminal")
public class TipoTerminalResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("descricaoTerminal")
  private String descricaoTerminal = null;

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Tipo Terminal (id).
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o do Tipo Terminal (id).")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Descri\u00E7\u00E3o do Tipo Terminal.
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do Tipo Terminal.")
  public String getDescricaoTerminal() {
    return descricaoTerminal;
  }
  public void setDescricaoTerminal(String descricaoTerminal) {
    this.descricaoTerminal = descricaoTerminal;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoTerminalResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  descricaoTerminal: ").append(descricaoTerminal).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
